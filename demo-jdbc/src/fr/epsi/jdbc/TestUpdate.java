package fr.epsi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/compta", "root", "");
            Statement st = connection.createStatement();
            int nb = st.executeUpdate("UPDATE fournisseur SET NOM = 'La Maison des Peintures' WHERE NOM = 'La Maison de la Peinture'");
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
