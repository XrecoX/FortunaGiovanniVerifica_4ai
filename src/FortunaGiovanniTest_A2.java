import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FortunaGiovanniTest_A2 {

	@Test
	//FALLITO
	void testFortunaMet1() {
			FortunaGiovanniClass f=new FortunaGiovanniClass();
			int risOttenuto=f.fortunaMet(2, 2);
			int risAtteso=4;
			assertEquals(risAtteso,risOttenuto);
			System.out.println(risOttenuto);
		}
	@Test
	//FALLITO
	void testFortunaMet2() {
			FortunaGiovanniClass f=new FortunaGiovanniClass();
			int risOttenuto=f.fortunaMet(3, 3);
			int risAtteso=9;
			assertEquals(risAtteso,risOttenuto);
			System.out.println(risOttenuto);
		}
	@Test
	//FALLITO
	void testFortunaMet3() {
			FortunaGiovanniClass f=new FortunaGiovanniClass();
			int risOttenuto=f.fortunaMet(4, 4);
			int risAtteso=16;
			assertEquals(risAtteso,risOttenuto);
			System.out.println(risOttenuto);
		}
	}

