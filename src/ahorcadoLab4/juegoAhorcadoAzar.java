/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadoLab4;

/**
 *
 * @author LENOVO
 */
public class juegoAhorcadoAzar extends juegoAhorcadoBase{
           
    public juegoAhorcadoAzar (String palabraSecreta, String palabraActual, int intentos) {
        super(palabraSecreta, palabraActual, intentos);
    }
    
    @Override
    public void actualizarPalabraActual(char letra) {
        char[] palabra = new char[palabraSecreta.length()];
        
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (letra == palabraSecreta.charAt(i))
                palabra[i] = letra;
            palabra[i] = '-';
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
    
}
