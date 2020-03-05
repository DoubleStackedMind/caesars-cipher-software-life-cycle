import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {

	private CaesersCipher caesarsCipher = new CaesersCipher();
	
	@Test
	void TestCipheredMessageWithOffset12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarsCipher.cipher("",12));
	}

}
