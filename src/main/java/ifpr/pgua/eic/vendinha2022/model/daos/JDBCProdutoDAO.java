package ifpr.pgua.eic.vendinha2022.model.daos;

import java.sql.*;
import java.util.*;
import ifpr.pgua.eic.vendinha2022.model.FabricaConexao;
//import ifpr.pgua.eic.vendinha2022.model.entities.Cliente;
import ifpr.pgua.eic.vendinha2022.model.entities.Produto;
import ifpr.pgua.eic.vendinha2022.model.results.Result;

public class JDBCProdutoDAO implements ProdutoDAO{

    private FabricaConexao fabricaConexao;

    //String x = String.valueOf(0); - teste de conversão int->String
    @Override
    public Result criar(Produto Produto) {
        try{
            
            Connection con = fabricaConexao.getConnection();

            PreparedStatement pstm = con.prepareStatement("INSERT INTO produtosoo(Id,nome,descricao,valor,quantidadeEstoque) VALUES (?,?,?,?,?)");

            pstm.setString(1, Produto.getNome());
            pstm.setInt(2, Produto.getId());
            pstm.setString(3, Produto.getDescricao());
            pstm.setDouble(4, Produto.getValor());
            pstm.setDouble(5, Produto.getQuantidadeEstoque());

            pstm.executeUpdate();

            pstm.close();
            con.close();

            return Result.success("Cliente criado com sucesso!");


        }catch(SQLException exc){
            System.out.println(exc.getMessage());
            return Result.fail(exc.getMessage());
        }
    }

    @Override
    public Result atualizar(int id, Produto produto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Produto buscarPorId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Result remover(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
