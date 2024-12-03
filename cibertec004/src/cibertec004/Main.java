package cibertec004;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro miperro=new Perro("Fido");
		//Tipo void que no devuelve nada
		miperro.ladrar();
		miperro.sentarse();
		
		// Metodo retorno sin parametros
		String miestado="";		
		miestado=miperro.obtenerEstado();
		System.out.println("mi estado es :"+ miestado);
		
	

	}

}
