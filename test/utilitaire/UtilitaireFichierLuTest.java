package utilitaire;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UtilitaireFichierLuTest {

	@Test
	public void test1RetourneOccurenceCaractere() {
		int occurrence;
		occurrence = UtilitaireFichierLu.retourneOccurenceCaractere("indivisible","i");
		Assert.assertSame(4, occurrence);
		Assert.assertNotSame(-2, occurrence);    
		Assert.assertNotSame("quatre", occurrence);
	}
	
	@Test
	public void test2RetourneOccurenceCaractere() {
		int occurrence;
		occurrence = UtilitaireFichierLu.retourneOccurenceCaractere("indivisible","n");
		Assert.assertSame(1, occurrence);
		Assert.assertNotSame(-2, occurrence);    
		Assert.assertNotSame("quatre", occurrence);
	}

}
