/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcadoLab4;

/**
 *
 * @author DELL
 */
public abstract class juegoAhorcadoBase implements juegoAhorcado {
    protected String palabraSecreta, palabraActual;
    protected int intentos;

    public juegoAhorcadoBase() {
        this.intentos = 5;
    }
    
    public abstract void actualizarPalabraActual(char letra);
    public abstract boolean verificarLetra(char letra);
    public abstract boolean hasGanado();
}
