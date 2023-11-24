namespace Merati.Repository.Perfil
{
	public interface IPerfilRepository
	{
		Task<int> Create(Model.Perfil perfil);
	}
}
