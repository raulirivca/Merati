using Merati.ViewModel;
using Dapper;
using Microsoft.Extensions.Configuration;
using System.Data;
using System.Data.SqlClient;

namespace Merati.Queries.Producto
{
	public class ProductoQueries : IProductoQueries
	{
		private readonly string _connectionString;
        public ProductoQueries(IConfiguration configuration)
        {
			_connectionString = configuration["ConnectionStrings:SQL"];

		}

        public async Task<IEnumerable<ProductoViewModel>> GetAll()
		{
			IEnumerable<ProductoViewModel> result = new List<ProductoViewModel>();

			using (var connection = new SqlConnection(_connectionString))
			{
				result = await connection.QueryAsync<ProductoViewModel>("[dbo].[Usp_Sel_Product]", commandType: CommandType.StoredProcedure);
			}

			return result;
		}

		public async Task<ProductoViewModel> GetById(int id)
		{
			var productByIdViewModel = new ProductoViewModel();

			var parameters = new DynamicParameters();
			parameters.Add("@Id", id);

			using (var connection = new SqlConnection(_connectionString))
			{
				productByIdViewModel = await connection.QueryFirstOrDefaultAsync<ProductoViewModel>("[dbo].[Usp_Sel_Product_ById]", parameters, commandType: CommandType.StoredProcedure);
			}

			return productByIdViewModel;
		}
	}
}
