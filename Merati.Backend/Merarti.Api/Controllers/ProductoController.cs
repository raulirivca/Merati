using Merati.Queries.Producto;
using Microsoft.AspNetCore.Mvc;

namespace Merarti.Api.Controllers
{
	[Route("api/[controller]")]
	[ApiController]
	public class ProductoController : ControllerBase
	{
		private readonly IProductoQueries _productQueries;

        public ProductoController(IProductoQueries productQueries)
        {
			_productQueries = productQueries;
		}
		[HttpGet]
		public async Task<ActionResult> GetAll()
		{
			var result = await _productQueries.GetAll();
			return Ok(result);
		}
	}
}
