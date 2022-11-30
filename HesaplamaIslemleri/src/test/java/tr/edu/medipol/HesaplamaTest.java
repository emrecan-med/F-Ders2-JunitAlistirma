package tr.edu.medipol;
import static org.junit.Assert.*;
import org.junit.Test;

import tr.edu.medipol.Hesaplama;
public class HesaplamaTest {
	
	@Test
	public void testToplamaIkiBasSayi() {
		int sayi1 = 42;
		int sayi2 = 28;
		Hesaplama h = new Hesaplama();
		
		long gerceklesen = h.toplama(42, 28);
		
		
		assertEquals(70, gerceklesen);
	}
	
	@Test
	public void testCikarmaIkiBasSayi() {
		int sayi1 = 30;
		int sayi2 = 50;
		Hesaplama hesaplama = new Hesaplama();
		
		long gerceklesen = hesaplama.cikarma(30,50);
		
		assertEquals(-20,gerceklesen);
	}
	
	@Test
	public void testCarpmaIkiBasSayi() {
		int sayi1 = 3;
		int sayi2 = 5;
		Hesaplama hesaplama = new Hesaplama();
		
		long gerceklesen = hesaplama.carpma(3,5);
		
		assertEquals(15,gerceklesen);
	}
	
	@Test
	public void testBolmeIkiBasSayi() {
		int sayi1 = 10;
		int sayi2 = 5;
		Hesaplama hesaplama = new Hesaplama();
		
		long gerceklesen = hesaplama.bolme(10,5);
		
		assertEquals(2,gerceklesen);
	}
	
	@Test
	public void testUsAlma() {
		int sayi1 = 3;
		int sayi2 = 5;
		Hesaplama hesaplama = new Hesaplama();
		
		long gerceklesen = hesaplama.usAlma(3,5);
		
		assertEquals(243,gerceklesen);
	}
}
