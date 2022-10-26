package ifpr.pgua.eic.vendinha2022.model.repositories;



import ifpr.pgua.eic.vendinha2022.model.daos.ClienteDAO;
import ifpr.pgua.eic.vendinha2022.model.entities.Cliente;

public class ClienteRepositorio {



    private ClienteDAO dao;

    public ClienteRepositorio(ClienteDAO dao) {
        this.dao=dao;
    }


    Public Result cadastrar(String nome, String cpf, String email, String telefone){
        Cliente cliente = new Cliente(nome, cpf, email, telefone);


        return dao.criar(cliente);
    }

    public Result atualizar(int id, String novoEmail, String novoTelefone){
        Cliente cliente = new Cliente(nome, cpf, novoEmail, novoTelefone);

        return dao.atualizar(id, cliente);
    }


}
