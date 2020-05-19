package br.com.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

import br.cm.codewars.VasyaClerk;

public class VasyaClerkTeste {

	@Test
	public final void testTickets() {
		assertEquals("YES",VasyaClerk.Tickets(new int[] {25, 25, 25, 100}));
	}

}
