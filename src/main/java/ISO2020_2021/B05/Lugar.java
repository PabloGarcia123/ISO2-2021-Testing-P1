package ISO2020_2021.B05;

public class Lugar {
	private boolean hay_Aforo;
	private boolean restricciones;
	public Lugar(boolean hay_Aforo, boolean restricciones) {
		this.hay_Aforo = hay_Aforo;
		this.restricciones = restricciones;
	}
	public boolean isHay_Aforo() {
		return hay_Aforo;
	}
	public boolean isRestricciones() {
		return restricciones;
	}


}
