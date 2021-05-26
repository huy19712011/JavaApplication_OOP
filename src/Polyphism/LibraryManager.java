/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polyphism;

import JdbcConnection.DatabaseConnectionManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huynq
 */
public class LibraryManager {

    private final List<User> listReaders = new ArrayList<>();

    public List<User> getReaders() {
        DatabaseConnectionManager dcm
                = new DatabaseConnectionManager("localhost:3306", "web_student_tracker", "root", "123456");

        try ( Connection connection = dcm.getConnection();  Statement statement = connection.createStatement();) {

            String sql = "SELECT * FROM student";
            try ( ResultSet resultSet = statement.executeQuery(sql);) {

                while (resultSet.next()) {

                    int type = resultSet.getByte("type");

                    if (type == 2) { // engineer

                        this.listReaders.add(new Engineer().createObject(resultSet));

                    }

                    if (type == 1) { // student

                        this.listReaders.add(new Student().createObject(resultSet));

                    }

                }

            }

        } catch (SQLException e) {
            e.printStackTrace(System.err);
        }

        return listReaders;

    }

    public float calculateSum() {

        float sum = 0.0f;

        for (User user : this.listReaders) {
            sum = sum + user.calculateFee();
        }

        return sum;
    }

}
