package fr.epsi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta", "root", "");
            Statement st = connection.createStatement();
            int nb = st.executeUpdate("DELETE FROM fournisseur WHERE NOM = 'La Maison des Peintures'");
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
