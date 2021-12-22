package ISO2020_2021.B05;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrueba {
	
	private static Persona p;
	private static Tiempo t;
	private static Lugar l;
	private static Prueba pr;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		p = new Persona(false, true, true, true);
		t = new Tiempo(29, 3, false,false,false);
		l= new Lugar(false,false);
		pr= new Prueba(p,t,l);
	}


	@Before
	public void setUp() throws Exception {
	}



	@Test
	public void testRecomendarActividad() {
		assertEquals("Con estas condiciones no puede realizar ninguna actividad.",(pr.recomendarActividad(p, t, l)));
	}


	private Object pr(Persona p2, Tiempo t2, Lugar l2) {
		// TODO Auto-generated method stub
		return null;
	}

}
