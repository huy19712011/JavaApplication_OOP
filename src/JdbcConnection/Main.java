/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcConnection;

import java.sql.*;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hello JDBC");

        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "demo", "root", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM employees";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
            }

        } catch (SQLException e) {

            e.printStackTrace(System.err);

        } finally {

            close(connection, statement, resultSet);
        }

    }

    private static void close(Connection connection, Statement statement, ResultSet resultSet) {
        try {

            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }
    }
}
