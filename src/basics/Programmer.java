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
public class Programmer extends Employee implements IRunner, IDancer {
    
    String[] programmingLanguages;
    
    public Programmer(String name, String address, String phoneNumber, String[] programmingLanguages) {
        
        super(name, address, phoneNumber);
        this.programmingLanguages = programmingLanguages;
    }

    
    @Override
    public void work() {
        System.out.println("I am a programmer, i code...");
    }

    @Override
    public void run() {
        System.out.println("Programmer is running");
    }

    @Override
    public void dance() {
        System.out.println("Programmer is dancing...");
    }
    
    int i = 100;
}
