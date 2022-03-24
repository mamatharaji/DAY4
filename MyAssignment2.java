import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class MyAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z1=new Zoo("WONDERZOO", 15, "NERUL");
		System.out.println(z1);
	}

}
class Zoo
{
	String nameOfZoo;
	int numberOfWorkersInZoo;
	String placeOfTheZoo;
	public Zoo(String nameOfZoo, int numberOfWorkersInZoo, String placeOfTheZoo) 
	{
		super();
		this.nameOfZoo = nameOfZoo;
		this.numberOfWorkersInZoo = numberOfWorkersInZoo;
		this.placeOfTheZoo = placeOfTheZoo;
	}
	@Override
	public String toString() {
		return "Zoo [nameOfZoo=" + nameOfZoo + ", numberOfWorkersInZoo=" + numberOfWorkersInZoo + ", placeOfTheZoo="
				+ placeOfTheZoo + "]";
	}
}

class AnimalZoo
{
	
}