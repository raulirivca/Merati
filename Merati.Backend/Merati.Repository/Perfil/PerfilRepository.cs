using Dapper;
using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Merati.Repository.Perfil
{
	public class PerfilRepository : IPerfilRepository
	{
		private readonly string _connectionString;
		public PerfilRepository(IConfiguration configuration)
		{
			_connectionString = configuration["ConnectionStrings:SQL"];
		}

		public async Task<int> Create(Model.Perfil perfil)
		{
			int result;
			var parameters = new DynamicParameters();
			parameters.Add("@nombre", perfil.nombre);
			parameters.Add("@dni", perfil.dni);
			parameters.Add("@cargo", perfil.cargo);
			parameters.Add("@ApPat", perfil.ApPat);
			parameters.Add("@Usuario", perfil.Usuario);
			parameters.Add("@Password", perfil.Password);
			parameters.Add("@ApMat", perfil.ApMat);
			parameters.Add("@Direc", perfil.Direc);
			parameters.Add("@Tipo_Us", perfil.Tipo_Us);

			using (var connection = new SqlConnection(_connectionString))
			{
				result = await connection.ExecuteAsync("[dbo].[Sp_Insert_Perfil_Usuario]", parameters, commandType: CommandType.StoredProcedure);
			}

			return result;
		}
	}
}
