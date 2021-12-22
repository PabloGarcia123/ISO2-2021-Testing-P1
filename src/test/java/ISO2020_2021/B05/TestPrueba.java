package ISO2020_2021.B05;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrueba {
	
	private static Persona p;
	private static Tiempo t;
	private static Lugar l;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(false, true, true, true);
		t = new Tiempo(29, 3, false,false,false);
		l= new Lugar(false,false);
		
	}


	@Before
	public void setUp() throws Exception {
	}



	@Test
	public void testRecomendarActividad() {
		assertEquals("Con estas condiciones no puede realizar ninguna actividad.",(PRUEBA.recomendarActividad(p, t, l)));
	}


	
}
