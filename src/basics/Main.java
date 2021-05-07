/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author huynq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello Inheritance");
        Employee p1 = new Programmer("John", "Address 1", "Phone 1", new String[] {"Java", "PHP"});
        p1.work();
        
        Employee m1 = new Manager("Mike", "Address 2", "Phone 2", 4);
        m1.work();
    }
    
}
