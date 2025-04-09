/**
 * 
 */
package br.com.leo.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.leo.domain.Produto;

/**
 * 
 */
public class ProdutoFactory {


    public static Produto convert(ResultSet rs) throws SQLException {
        Produto prod = new Produto();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setCodigo(rs.getString("CODIGO"));
        prod.setNome(rs.getString("NOME"));
        prod.setDescricao(rs.getString("DESCRICAO"));
        prod.setFornecedores(rs.getString("FORNECEDOR"));
        prod.setValor(rs.getBigDecimal("VALOR"));
        return prod;
    }
}