package cibertec004;

public class Perro {
    private String nombre;

    // Constructor
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    // Método que imprime un ladrido
    public void ladrar() {
    	//
    	
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    // Método que hace que el perro se siente
    public void sentarse() {
    	///
        System.out.println(nombre + " se ha sentado.");
    }
    
	// Metodo que retorna el estado perro
	public String obtenerEstado() {
		
		return nombre + " esta Feliz :D";
	}
    
    
}