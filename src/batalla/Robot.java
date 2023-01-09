package batalla;

public class Robot {
	
	String nombre;
	int puntosVida;
	int ataque;
	int defensa;
	
	public Robot(String nombre) {
		
		this.nombre = nombre;
		this.puntosVida = 100;
		this.ataque = (int)(Math.random()*21);
		this.defensa = (int)(Math.random()*101);
	}
	
	public Robot batalla(Robot Kratos)throws InterruptedException {
		
		while (this.puntosVida > 0 && Kratos.puntosVida > 0) {
			
			int numeroInicio = (int) (Math.random() * 101);
			if (numeroInicio > Kratos.defensa && Kratos.puntosVida > 0 && this.puntosVida > 0) {
				
				System.out.println(this.nombre+" ha golpeado a "+ Kratos.nombre+" y le quita "+this.ataque+" puntos de vida.");
				
				if (Kratos.puntosVida < this.ataque) {

					this.ataque = Kratos.puntosVida;
				}
				
				Kratos.puntosVida -= this.ataque;	
				
				System.out.println(Kratos.nombre+" queda con "+Kratos.puntosVida+" puntos de vida.");
				
			}
			if (numeroInicio <= Kratos.defensa && Kratos.puntosVida > 0 && this.puntosVida > 0) {
				
				System.out.println(Kratos.nombre+" ha esquivado el ataque de"+ this.nombre);

								
			}
			
			int numeroInicio2 = (int) (Math.random() * 101);
			
			if (numeroInicio2 > this.defensa && this.puntosVida > 0 && Kratos.puntosVida > 0) {
				
				System.out.println(Kratos.nombre+" ha golpeado a "+ this.nombre+" y le quita "+Kratos.ataque+" puntos de vida.");

				
				if (Kratos.ataque > this.puntosVida) {
					
					Kratos.ataque = this.puntosVida;					
				}
				this.puntosVida -= Kratos.ataque;
				
				System.out.println(this.nombre+" queda con "+this.puntosVida+" puntos de vida.");
			}
			
			if (numeroInicio2 <= this.defensa && this.puntosVida > 0 && Kratos.puntosVida > 0) {
				
				System.out.println(this.nombre+" ha esquivado el ataque de"+ Kratos.nombre);
			}
		}
		if (this.puntosVida <= 0) {
			
			System.out.println(this.nombre+" ha quedado fuera de combate.");
			
		}
		if (Kratos.puntosVida <= 0) {
			
			System.out.println(Kratos.nombre+" ha quedado fuera de combate.");
			
		}
		if(this.vida<=0) {
			return Kratos;
		}
		else return this;
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
