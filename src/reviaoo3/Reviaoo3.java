package reviaoo3;
/**
 *
 * @author AliraMaria
 */
public class Reviaoo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alguns países medem temperaturas em graus Celsius,
        // e outros em graus Fahrenheit. Faça um algoritmo 
        //para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit.
    
    Double grausCel, grausFah; //grauCel = Graus Celsius e grausFah = Graus Fahrenheit.
 
    System.out.println("Informe a temperatura em graus Celcius, Por favorzinho.......");
    grausCel= Double.parseDouble(JoptionPane.showInputDialog("Informe a temperatura"+ " "+ "em Graus Celcius: "));
 
    grausFah = ((grausCel * 9*160)/5);
    System.out.println("A temperatura em graus Fahrenheit é" + grausFah );

    }
    
}
