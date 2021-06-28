/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymophism;

import java.sql.*;

/**
 *
 * @author huynq
 */
public abstract class User {

    private int id;
    private String name;
    private String email;

    public User() {
    }

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract float calculateFee();

//    public abstract User createObject(ResultSet resultSet) throws SQLException;
    public static User createObject(ResultSet resultSet) throws SQLException {
        return null;
    }
}
