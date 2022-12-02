
package pkg11.pkg16;
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
        try{
             division();
        }catch(ArithmeticException e){
            System.out.println("No se permite la divison por 0.");
             System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Has ingresado datos no validos.");
            System.out.println(e.getMessage());
        }
       
    }
    
    static void division(){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor:"));
        
        System.out.println("El resultado es:"+num1/num2);
    }
    
    
}
