package batalla;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot Kratos = new Robot();	
		Kratos.setNombre("Kratos");
		Kratos.setPuntosVida(100);
		Kratos.setAtaque(50);
		Kratos.setDefensa(60);
		
		System.out.println(Kratos);
		
		Robot Zeus = new Robot();
		Zeus.setNombre("Zeus");
		Zeus.setPuntosVida(100);
		Zeus.setAtaque(30);
		Zeus.setDefensa(50);
		
		System.out.println(Zeus);
	}

}
