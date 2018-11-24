/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameter;

/**
 *
 * @author Rey
 */
public class Parameter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stored_procedure("Bambang");
    }
    
    public static void stored_procedure(String param)
    {
        System.out.println(param);
    }
}
