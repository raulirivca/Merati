using Dapper;
using Merati.ViewModel;
using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Merati.Queries.Perfil
{
	public class PerfilQueries : IPerfilQueries
	{
		private readonly string _connectionString;
		public PerfilQueries(IConfiguration configuration)
		{
			_connectionString = configuration["ConnectionStrings:SQL"];
		}
		public async Task<PerfilViewModel> AutenticarUsuario(string? usuario, string? password)
		{
			var perfilViewModel = new PerfilViewModel();
			var parameters = new DynamicParameters();
			parameters.Add("@Usuario", usuario);
			parameters.Add("@Password", password);
			using (var connection = new SqlConnection(_connectionString))
			{
				perfilViewModel = await connection.QueryFirstOrDefaultAsync<PerfilViewModel>("[dbo].[SP_Confirmar_Sesion]", parameters, commandType: CommandType.StoredProcedure);
			}

			return perfilViewModel;
		}
	}
}
