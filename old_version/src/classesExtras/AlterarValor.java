package classesExtras;

/**
 * @author : Davidson Teixeira Filho
 * @date : 26/01/2023
 */

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterarValor {

    public double valor;
    public double novoValor;
    public String pesquisa;

    public void alterarValor(javax.swing.JComboBox item, javax.swing.JLabel jl, double valor) {

        pesquisa = (item.getSelectedItem().toString());

        try {
            //  busca e atualização de saldo na tabela ACAMPANTE
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select valor from produto where nome='" + pesquisa + "'";

            ResultSet rs = stm.executeQuery(sql);
            rs.next();

            this.valor = rs.getDouble("valor");

            this.novoValor = valor;

            String update = "update produto set valor = " + novoValor + " where nome='" + pesquisa + "'";
            PreparedStatement stmt = con.prepareStatement(update);
            int res = stmt.executeUpdate(update);

            System.out.printf("O novo total é de R$%.2f\n", novoValor);
        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
