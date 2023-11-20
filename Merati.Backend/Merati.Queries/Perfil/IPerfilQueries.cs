using Merati.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Merati.Queries.Perfil
{
	public interface IPerfilQueries
	{
		Task<PerfilViewModel> AutenticarUsuario(string? usuario, string? password);
	}
}
