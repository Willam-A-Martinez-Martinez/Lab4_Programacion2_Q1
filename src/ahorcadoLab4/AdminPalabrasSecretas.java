package ahorcadoLab4;

import java.util.ArrayList;
import java.util.Random;

public class AdminPalabrasSecretas {
    protected ArrayList<String> palabraSecreta;
    
    public AdminPalabrasSecretas() {
        this.palabraSecreta = new ArrayList<>();
    }
    
    public void agregarPalabra(String palabra){
        palabraSecreta.add(palabra);
    }
    
    public String palabraRnd(){
        Random rnd = new Random();
        int index = rnd.nextInt(palabraSecreta.size());
        return palabraSecreta.get(index);
    }
}
