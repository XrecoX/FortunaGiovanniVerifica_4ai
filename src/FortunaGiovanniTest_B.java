import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FortunaGiovanniTest_B {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testFortunaMet1() {
		FortunaGiovanniClass f=new FortunaGiovanniClass();
		int risOttenuto=f.fortunaMet(2, 2);
		int risAtteso=4;
		assertEquals(risAtteso,risOttenuto);
		System.out.println(risOttenuto);
	}
	@Test
	void testFortunaMet2() {
		FortunaGiovanniClass f=new FortunaGiovanniClass();
		int risOttenuto=f.fortunaMet(3, 3);
		int risAtteso=18;
		assertEquals(risAtteso,risOttenuto);
		System.out.println(risOttenuto);
	}
	@Test
	void testFortunaMet3() {
		FortunaGiovanniClass f=new FortunaGiovanniClass();
		int risOttenuto=f.fortunaMet(4, 4);
		int risAtteso=48;
		assertEquals(risAtteso,risOttenuto);
		System.out.println(risOttenuto);
	}
	}


