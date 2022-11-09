package ifpr.pgua.eic.vendinha2022.model.repositories;

import java.sql.*;
import java.util.*;

import ifpr.pgua.eic.vendinha2022.model.FabricaConexao;
//import ifpr.pgua.eic.vendinha2022.model.daos.ClienteDAO;
import ifpr.pgua.eic.vendinha2022.model.daos.ProdutoDAO;
//import ifpr.pgua.eic.vendinha2022.model.entities.Cliente;
import ifpr.pgua.eic.vendinha2022.model.entities.Produto;
import ifpr.pgua.eic.vendinha2022.model.results.Result;

public class ProdutoRepositorio {
    
    //private FabricaConexao fabricaConexao;

    private ProdutoDAO dao;

    //Connection con = fabricaConexao.getConnection();
    public ProdutoRepositorio(ProdutoDAO dao) {
        this.dao = dao;
    }

    public Result cadastrar(String nome, String descricao, double valor, double quantidade){

        Produto produto = new Produto(nome, descricao, valor, quantidade);
        
        return dao.criar(produto);

    }

    public Result atualizar(int id, String nome, String descricao, double valor, double quantidadeEstoque){

        Produto produto = new Produto(id, nome, descricao, valor, quantidadeEstoque);
        return dao.atualizar(id, produto);
    }

    public List<Produto> listar(){
        return dao.buscarTodos();
    }

    
}
