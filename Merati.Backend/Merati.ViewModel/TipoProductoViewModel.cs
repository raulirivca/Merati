using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Merati.ViewModel
{
	public class TipoProductoViewModel
	{
        public string? Cod_Tipo { get; set; }
        public string? Descripcion { get; set; }
        public int Stock { get; set; }
		public float? Precio { get; set; }
	}
}
