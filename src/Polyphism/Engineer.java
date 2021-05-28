/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polyphism;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author huynq
 */
public class Engineer extends User {

    private int duration;
    private float unitPrice = 50_000f;

    public Engineer() {

    }

    public Engineer(int duration, int id, String name, String email) {
        super(id, name, email);
        this.duration = duration;
    }

    @Override
    public float calculateFee() {
        return this.duration * this.unitPrice;
    }

//    @Override
    public static Engineer createObject(ResultSet resultSet) throws SQLException {

        int dur = resultSet.getInt("duration");
        int id = resultSet.getInt("id");
        String name = resultSet.getString("first_name");
        String email = resultSet.getString("email");

        return new Engineer(dur, id, name, email);
    }

}
