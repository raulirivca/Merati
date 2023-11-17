using Merati.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Merati.Queries.Producto
{
	public interface IProductoQueries
	{
		Task<ProductoViewModel>GetById(int id);
		Task<IEnumerable<ProductoViewModel>>GetAll();
	}
}
