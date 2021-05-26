/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polyphism;

import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author huynq
 */
public class Student extends User {

    private String studentId;

    public Student(String studentId, int id, String name, String email) {
        super(id, name, email);
        this.studentId = studentId;
    }

    public Student() {
    }

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public float calculateFee() {

        return 20_000f;

    }

    @Override
    public Student createObject(ResultSet resultSet) throws SQLException {

        int id = resultSet.getInt("id");
        String name = resultSet.getString("first_name");
        String email = resultSet.getString("email");

        return new Student(id, name, email);

    }

}
