package batalla;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot Kratos = new Robot("Kratos", 100, 50, 60);	
	
		
		System.out.println(Kratos);
		
		Robot Zeus = new Robot(null, 0, 0, 0);
		Zeus.setNombre("Zeus");
		Zeus.setPuntosVida(100);
		Zeus.setAtaque(30);
		Zeus.setDefensa(50);
		
		System.out.println(Zeus);
	}

}
