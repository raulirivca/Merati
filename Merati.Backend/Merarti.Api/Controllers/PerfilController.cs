using Merati.Queries.Perfil;
using Merati.Queries.Producto;
using Microsoft.AspNetCore.Mvc;

namespace Merarti.Api.Controllers
{
	[Route("api/[controller]")]
	[ApiController]
	public class PerfilController : ControllerBase
	{
		private readonly IPerfilQueries _perfilQueries;
        public PerfilController(IPerfilQueries perfilQueries)
        {
			_perfilQueries = perfilQueries;
		}

		[HttpGet]
		[Route("AutenticarUsuario")]
		public async Task<ActionResult> AutenticarUsuario([FromQuery] string? usuario, [FromQuery] string? password)
		{
			var result = await _perfilQueries.AutenticarUsuario(usuario, password);

			return Ok(result);
		}
	}
}
