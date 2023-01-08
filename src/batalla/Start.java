package batalla;

public class Start {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Robot Kratos = new Robot("Kratos");	
		
		System.out.println(Kratos);
		
		Robot Zeus = new Robot("Zeus");
		
		System.out.println(Zeus);
		
		
		Kratos.batalla(Zeus);
	}

}
