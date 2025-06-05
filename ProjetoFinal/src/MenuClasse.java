import java.util.ArrayList;

public class MenuClasse {
    public void Cadastrar() {
        ArrayList<CadastrarCliente> clientes = new ArrayList<>();
        CadastrarCliente cadastro = new CadastrarCliente();
        CadastrarCliente.cadastrar();
        clientes.add(cadastro);
    }

    public void ListarRegistros() {
        ListaClientes listar = new ListaClientes();
        listar.ListarClientes();
    }

    public void BuscarRegistroid() {
        BuscarClienteId clienteid = new BuscarClienteId();
        clienteid.BuscarClienteid();
    }

    public void EditarRegistro() {
        EditarCliente editarCliente = new EditarCliente();
        editarCliente.Editar();
    }

    public void ExcluirRegistro() {
        ExcluirCliente excluirCliente = new ExcluirCliente();
        excluirCliente.Excluir();
    }

}
