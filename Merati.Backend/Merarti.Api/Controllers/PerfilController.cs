using Merati.Queries.Perfil;
using Merati.Queries.Producto;
using Merati.Repository.Perfil;
using Microsoft.AspNetCore.Mvc;
using System.Reflection;

namespace Merarti.Api.Controllers
{
	[Route("api/[controller]")]
	[ApiController]
	public class PerfilController : ControllerBase
	{
		private readonly IPerfilQueries _perfilQueries;
		private readonly IPerfilRepository _perfilRepository;
		public PerfilController(IPerfilQueries perfilQueries, IPerfilRepository perfilRepository)
		{
			_perfilQueries = perfilQueries;
			_perfilRepository = perfilRepository;
		}

		[HttpGet]
		[Route("AutenticarUsuario")]
		public async Task<ActionResult> AutenticarUsuario([FromQuery] string? usuario, [FromQuery] string? password)
		{
			var result = await _perfilQueries.AutenticarUsuario(usuario, password);

			return Ok(result);
		}

		[HttpPost]
		[Route("CrearUsuario")]
		public async Task<ActionResult> Create([FromBody] Merati.Model.Perfil perfil)
		{
			var result = await _perfilRepository.Create(perfil);

			return Ok(result);
		}
	}
}
