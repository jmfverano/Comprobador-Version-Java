/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage1;

import javax.swing.JOptionPane;

/**
 *
 * @author xhaman
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
            JOptionPane.showMessageDialog(null, "Versión de Java: " + System.getProperty("java.vendor") + " " + System.getProperty("java.version"));
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }

    }
}
