package batalla;

public class Robot {
	
	String nombre;
	int puntosVida;
	int ataque;
	int defensa;
	
	public Robot(String nombre, int puntosVida, int ataque, int defensa) {
		
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.ataque = (int)(Math.random()*100);
		this.defensa = (int)(Math.random()*100);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	@Override
	public String toString() {
		return "Robot [nombre=" + nombre + ", puntosVida=" + puntosVida + ", ataque=" + ataque + ", defensa=" + defensa
				+ "]";
	}
	

	
}
