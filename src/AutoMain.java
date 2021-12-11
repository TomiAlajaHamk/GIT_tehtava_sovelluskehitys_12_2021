
public class AutoMain {

	public static void main(String[] args) {
	
		
	Auto auto1 = new Auto();	
	auto1.NaytaTiedot();
	
	}

}

class Auto
{
	public String merkki;
	public String malli;
	public int bensanMaara;
	

	public Auto()
	{
		merkki = "Toyota";
		malli = "Yaris";
		bensanMaara = 10;

	}
	
	public void Jarruta()
	{
		
	}
	
	public void Kiihdyta()
	{
		
	}
	
	public void NaytaTiedot()
	{
		System.out.println("Brand: " + merkki);
		System.out.println("Model: " + malli);
		System.out.println("Fuel: " + bensanMaara);
	}
	
}

