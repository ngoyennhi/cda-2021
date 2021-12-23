package tp5;

public class Refacto {
	public String status;
	public int speed;
	public float temperature;
	
	public void checkTemperature() {
		if (temperature > 660) 
		{status = "retour au bercail";
		speed = 5;
		}
	}
	
	public void showAttributes() {
		 System.out.println("Statut : " + status);
		 System.out.println("Vitesse : " + speed);
		 System.out.println("Température : " + temperature);
		 }
	}
