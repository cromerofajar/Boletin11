package boletin11;


import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Instante {
    public Instante(){}
    
    public void Programa(){
        long inicio, fin;
        String fraseEscribir, fraseEscrita;
        fraseEscribir="A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.";
        inicio=System.currentTimeMillis();
        fraseEscrita=JOptionPane.showInputDialog(null, "Escriba la siguiente frase"+"\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
        while(fraseEscribir.equals(fraseEscrita)!=true){
        fraseEscrita=JOptionPane.showInputDialog(null, "Escriba la siguiente frase"+"\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática."); 
        }
        fin=System.currentTimeMillis();
        long total=fin-inicio;
        JOptionPane.showMessageDialog(null,"Tardaches "+(total/1000)+" segundos en escribir a frase");
        
    }
}
