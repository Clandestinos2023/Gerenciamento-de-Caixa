package classesExtras;

/**
 * @author : Davidson Teixeira Filho
 * @date : 26/01/2023
 */

import database.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.telasInterativas.DepositoAcampante;

public class ListarLideres {
    
    public void pesquisar(javax.swing.JComboBox lid) {
        lid.removeAllItems();
        lid.addItem("------");
        
        try {
            Connection con = new Conexao().getConnection();
            Statement stm = con.createStatement();

            String sql = "select nome from lideranca";

            ResultSet rs = (ResultSet) stm.executeQuery(sql);

            while (rs.next()) {
                lid.addItem(rs.getString("nome"));
            }

        } catch (SQLException ex) {
            System.err.println("Ocorreu um erro ao carregar o ComboBox");
        } catch (Exception ex) {
            Logger.getLogger(DepositoAcampante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
