
public class AutoMain {

	public static void main(String[] args) {
	
	Auto auto = new Auto();	
		
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
		NaytaTiedot();
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
