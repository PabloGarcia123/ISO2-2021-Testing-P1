package ISO2020_2021.B05;

public class Persona {
	private boolean sana;
	private boolean contacto;
	private boolean pasa_Covid;
	private boolean cartilla;

	
	
	public Persona(boolean sana, boolean contacto, boolean pasa_Covid, boolean cartilla) {
		this.sana = sana;
		this.contacto = contacto;
		this.cartilla = cartilla;
		this.pasa_Covid = pasa_Covid;
	}

	public boolean isSana() {
		return sana;
	}

	public boolean isContacto() {
		return contacto;
	}

	public boolean isCartilla() {
		return cartilla;
	}
	public boolean ispasa_Covid() {
		return pasa_Covid;
	}
}
