import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import BankOfJEE.Receipt;

public class ReceiptTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	/*
	 * test to see if a receipt can be created
	 */
	@Test
	public void testReceiptCreation() {
		Receipt rec = null;
		rec = new Receipt(0, true, 0);
		assertEquals(!rec.equals(null), true);

	}


}
