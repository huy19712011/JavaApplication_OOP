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
//        p1.run(); // invalid
        
        
        Employee m1 = new Manager("Mike", "Address 2", "Phone 2", 4);
        m1.work();
        
        IRunner r1 = new Programmer("Mary", "Address 3", "Phone 3", new String[] {"Java", "PHP"});
//        r1.work(); // invalid
        r1.run();
        
        r1 = new Carpenter();
        r1.run();
        
        IDancer d1 = new Programmer("Mike", "Address 4", "Phone 4", new String[] {"Java", "PHP"});
        d1.dance();
        
        IRunner d2 = new Programmer("Mike", "Address 5", "Phone 5", new String[] {"Java", "PHP"});
        d2.show();
        System.out.println(d2.i);
        
    }
    
}
