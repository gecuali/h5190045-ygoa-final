package tr.edu.h5190045.ygoa.selimgecu;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/hasta")

public class HastaRestApi {
	
	public static List<String> hasta = new ArrayList<>();
	
	@GetMapping("/listele")
	public static List<String> goruntule(){
		return hasta;
	}
	
	@PostMapping("/ekle")
	public static String ekle(@RequestBody String ad) {
		hasta.add(ad);
		return ad;
	}
	
	@PostMapping("/sil")
	public static String sil(@RequestBody String ad) {
		hasta.clear();
		return ad;

	}
}