package ISO2020_2021.B05;

public class Tiempo {
	private int temp;
	private int humedad;
	private boolean nieva;
	private boolean lluvia;
	private boolean nublado;
	
	
	
	public Tiempo(int temp, int humedad, boolean nieva, boolean lluvia, boolean nublado) {
		this.temp = temp;
		this.humedad = humedad;
		this.nieva = nieva;
		this.lluvia = lluvia;
		this.nublado = nublado;
	}
	public int getTemp() {
		return temp;
	}
	public int getHumedad() {
		return humedad;
	}
	public boolean isNieva() {
		return nieva;
	}
	public boolean isLluvia() {
		return lluvia;
	}
	public boolean isNublado() {
		return nublado;
	}


}
