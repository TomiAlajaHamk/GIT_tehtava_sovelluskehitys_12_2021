
public class AutoMain {

	public static void main(String[] args) {
	
		
	Auto auto1 = new Auto();	
	auto1.NaytaTiedot();
//	auto1.Kiihdyta();
//	auto1.NaytaTiedot();
//	auto1.tankkaa(8);
	
	Auto auto2 = new Auto("Honda", "Jazz", 13);
	
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
	
	public Auto(String autonMerkki, String autonMalli, int bensaaTankissa)
	{
		merkki = autonMerkki;
		malli = autonMalli;
		bensanMaara = bensaaTankissa;
		NaytaTiedot();
				
	}
	
	public void Jarruta()
	{
		
	}
	
	public void Kiihdyta()
	{
		
		if (bensanMaara>0)

		{
			bensanMaara = bensanMaara-1;
		}

		else

		{
			System.out.println("Tankissa ei ole bensaa");
		}
		
	}
	
	public void NaytaTiedot()
	{
		System.out.println("Brand: " + merkki);
		System.out.println("Model: " + malli);
		System.out.println("Fuel: " + bensanMaara);
	}
	
	public void tankkaa (int tankattuBensa)
	{
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Bensaa tankataan: " + tankattuBensa);
		System.out.println("Bensaa tankissa tankkauksen jälkeen: " +(bensanMaara+tankattuBensa));
	}
	
	
	
	
}

