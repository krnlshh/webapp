package org.mycompany.myname;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class create_table {

    private static final String CREATE_TABLE_SQL="CREATE TABLE actor("
            + "actor_id INT NOT NULL,"
            + "lastname VARCHAR(45) NOT NULL,"
            + "firstname VARCHAR(45) NOT NULL,"
            + "DOB DATE NOT NULL,"
            + "EMAIL VARCHAR(45) NOT NULL,"
            + "PRIMARY KEY (actor_id))";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String jdbcUrl = "jdbc:postgresql://localhost:5432/Data";
        String username = "postgres";
        String password = "admin";

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = DriverManager.getConnection(jdbcUrl, username, password);
            stmt = conn.createStatement();

            stmt.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Table created");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close connection
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}