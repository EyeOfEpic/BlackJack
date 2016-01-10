public class Card {
	private int karte;
	private int farbe;
	private int zahl;

	Card(int zahl)
	{
		setZahl(zahl);
	}
	public int getZahl()
	{
		return zahl;
	}
	public int getFarbe()
	{
		farbe = zahl/13;
		return farbe;
	}
	public int getKarte()
	{
		karte = zahl%13;
		return karte;
	}
	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
}