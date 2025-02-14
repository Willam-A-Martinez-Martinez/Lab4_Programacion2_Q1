package ahorcadoLab4;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Gui {
    JFrame frame = new JFrame("Ahorcado");
    JLabel titulo = new JLabel("Ahorcado", SwingConstants.CENTER);
    JButton jugarFijo = new JButton("Jugar Fijo");
    JButton jugarAzar = new JButton("Jugar al Azar");
    JButton admin = new JButton("Administrar");
    JButton salirProgram = new JButton("Salir");
    
    juegoAhorcadoBase juegoAhorcadoAzar;
    juegoAhorcadoBase juegoAhorcadoFijo;
    
    public Gui() {
        juegoAhorcadoAzar = new juegoAhorcadoAzar();
        juegoAhorcadoFijo = new JuegoAhorcadoFijo();
        
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        
        titulo.setBounds(150, 50, 200, 50);
        titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));

        
        jugarFijo.setBounds(150, 150, 200, 50);
        jugarAzar.setBounds(150, 220, 200, 50);
        admin.setBounds(150, 290, 200, 50);
        salirProgram.setBounds(150, 360, 200, 50);

        
        frame.add(titulo);
        frame.add(jugarFijo);
        frame.add(jugarAzar);
        frame.add(admin);
        frame.add(salirProgram);

        frame.setVisible(true);
        
        jugarFijo.addActionListener((ActionEvent e) -> {
            juegoAhorcadoFijo.jugar();
        });
        
        jugarAzar.addActionListener((ActionEvent e) -> {
            juegoAhorcadoAzar.jugar();
        });
        
        admin.addActionListener((ActionEvent e) -> {
            String palabraAgregar = JOptionPane.showInputDialog(null, "Agrege palabra: ");
            juegoAhorcadoAzar temp = (juegoAhorcadoAzar) juegoAhorcadoAzar;
            temp.APS.agregarPalabra(palabraAgregar);
        });
        salirProgram.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        new Gui();
    }
}
