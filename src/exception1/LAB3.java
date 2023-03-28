/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

import java.nio.channels.AcceptPendingException;

public class LAB3 {
    public static void main(String[] args) {
        try {
            System.out.println("statement1");
            throw new ArithmeticException();

        }
        catch (AcceptPendingException e){

        }
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
