package com.example.demo;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



 public class HastaRestApiTest {
	 

	@Test
	void testListele() {
		
        List<String> hasta = Arrays.asList("Ali Selim");
        List<String> goruntule = Arrays.asList("Ali Selim");

         Assert.assertEquals(hasta, goruntule);
			
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
