package methodRiding;

public class ProjectorDriver {
	public static void main(String[] args) {
		System.out.println("Projector : ");
		Projector p=new Projector();
		p.displayQuality();
		System.out.println("Epson : ");
		Epson e=new Epson();
		e.displayQuality();
		System.out.println("BenQ : ");
		BenQ b=new BenQ();
		b.displayQuality();
	}

}
