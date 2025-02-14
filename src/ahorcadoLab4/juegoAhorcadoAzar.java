/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadoLab4;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class juegoAhorcadoAzar extends juegoAhorcadoBase{
    protected AdminPalabrasSecretas APS = new AdminPalabrasSecretas();
      
    @Override
    public void actualizarPalabraActual(char letra) {
        char[] palabra = new char[palabraSecreta.length()];
        
        for (int i = 0; i < palabraSecreta.length(); i++ ) {
            if (palabraSecreta.charAt(i) == letra ){ 
                palabra[i] = letra;
            }else if(palabraActual.charAt(i) != '-'){
                palabra[i] = palabraActual.charAt(i);}
            else{
                palabra[i] = '-';}
        }
        
        palabraActual = new String(palabra);
    }

    @Override
    public boolean verificarLetra(char letra) {
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (letra == palabraSecreta.charAt(i))
                return true;
        }
        intentos -= 1;
        return false;
    }

    @Override
    public boolean hasGanado() {
        return palabraSecreta.equals(palabraActual);
    }
    
    @Override
    public void inicializarPalabraSecreta() {
        palabraSecreta = APS.palabraRnd();
        palabraActual = "_".repeat(palabraSecreta.length()); 
    }

    @Override
    public void jugar() {
        inicializarPalabraSecreta();
        if (!palabraSecreta.equals("////")){
            while (intentos > 0 && !hasGanado()) {
                String input = JOptionPane.showInputDialog("Palabra: " + palabraActual +
                        "\nIntentos restantes: " + intentos +
                        "\nIngresa una letra:");

                if (input != null && input.length() == 1 && verificarLetra(input.charAt(0)) == true) {
                    actualizarPalabraActual(input.charAt(0));
                }
            }
            if (hasGanado()) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado. La palabra era: " + palabraSecreta);
            } else {
                JOptionPane.showMessageDialog(null, "¡Perdiste! La palabra era: " + palabraSecreta);
            }
            intentos = 5;
    }
}

 
}
