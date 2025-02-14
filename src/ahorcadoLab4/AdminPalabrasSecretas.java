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
        if(palabraSecreta.size() > 0){
            Random rnd = new Random();
            int index = rnd.nextInt(palabraSecreta.size());
            System.out.println(palabraSecreta.get(index));
            return palabraSecreta.get(index);
        }
        
        return "////";
    }
}
