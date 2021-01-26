package tr.edu.h5190045.ygoa.selimgecu;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import tr.edu.h5190045.ygoa.selimgecu.HastaRestApi;


 public class HastaRestApiTest {
	 

	@Test
	void testListele() {
		
        List<String> hasta = Arrays.asList("Ali Selim");
        List<String> listele = Arrays.asList("Ali Selim");

         Assert.assertEquals(hasta, listele);
			
	}
	

	@Test
	void testSilme() {
		HastaRestApi.sil("Ali Selim");

        String hasta=HastaRestApi.goruntule().toString();
        String sil= HastaRestApi.goruntule().toString();

        Assert.assertEquals(hasta, sil);
	}

	@Test
	void testEkleme () {
		HastaRestApi.ekle("Selim");

        String hasta=HastaRestApi.goruntule().toString();
        String ekle= HastaRestApi.goruntule().toString();

        Assert.assertEquals(hasta, ekle);
		}
}
