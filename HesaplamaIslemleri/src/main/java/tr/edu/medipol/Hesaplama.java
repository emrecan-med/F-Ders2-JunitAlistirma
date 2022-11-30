package tr.edu.medipol;
import java.math.*;
public class Hesaplama {

	public static void main(String[] args) {
		Hesaplama hesaplama = new Hesaplama();
		long s = hesaplama.toplama(42, 28);
		System.out.println(s);
	}
	
	long toplama(int sayi1, int sayi2)
	{
		int sonuc = sayi1+sayi2;
		return sonuc;
	}
	
	long cikarma(int sayi1, int sayi2)
	{
		int sonuc = sayi1-sayi2;
		return sonuc;
	}
	
	long carpma(int sayi1,int sayi2)
	{
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
	
	long bolme(int sayi1,int sayi2)
	{
		long sonuc = sayi1 / sayi2;
		return sonuc;
	}
	
	long usAlma(int sayi1,int sayi2)
	{
		long sonuc = (long) Math.pow(sayi1, sayi2);
		return sonuc;
	}

}
