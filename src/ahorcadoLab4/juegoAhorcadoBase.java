/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadoLab4;

/**
 *
 * @author DELL
 */
public abstract class juegoAhorcadoBase {
    protected String palabraSecreta, palabraActual;
    protected int intentos;

    public juegoAhorcadoBase(String palabraSecreta, String palabraActual, int intentos) {
        this.palabraSecreta = palabraSecreta;
        this.palabraActual = palabraActual;
        this.intentos = intentos;
    }
    
    public abstract void actualizarPalabraActual(char letra);
    public abstract boolean verificarLetra(char letra);
    public abstract boolean hasGanado();
}
