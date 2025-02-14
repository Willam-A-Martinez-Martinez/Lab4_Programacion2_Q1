/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadoLab4;
import javax.swing.JOptionPane;

/**
 *
 * @author laraj
 */
public class JuegoAhorcadoFijo extends juegoAhorcadoBase {
    
    
    @Override
    public void inicializarPalabraSecreta(){
        palabraSecreta = JOptionPane.showInputDialog("Ingrese la palabra a adivinar");
        palabraActual = "_".repeat(palabraSecreta.length()); 
    }
    
     @Override
    public void actualizarPalabraActual(char letra) {  
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                StringBuilder sb = new StringBuilder(palabraActual);
                sb.setCharAt(i, letra);
                palabraActual = sb.toString();
            }
        }
    }
    @Override
    public boolean verificarLetra(char letra){
        letra=Character.toUpperCase(letra);
        if(palabraSecreta.contains(String.valueOf(letra))){
            actualizarPalabraActual(letra);
            return true;
        }else{
            intentos--;
            return false;
        }
    }
    @Override
    public boolean hasGanado(){
        return palabraActual.equals(palabraSecreta);
    }
    
    @Override
    public void jugar() {
        inicializarPalabraSecreta();
        while (intentos > 0 && !hasGanado()) {
            String input = JOptionPane.showInputDialog("Palabra: " + palabraActual +
                    "\nIntentos restantes: " + intentos +
                    "\nIngresa una letra:");

            if (input != null && input.length() == 1) {
                verificarLetra(input.charAt(0));
            }
        }
        if (hasGanado()) {
            JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado. La palabra era: " + palabraSecreta);
        } else {
            JOptionPane.showMessageDialog(null, "¡Perdiste! La palabra era: " + palabraSecreta);
        }
    }
}
