package ISO2020_2021.B05;
public class Prueba {
	private Persona per;
	private Tiempo ti;
	private Lugar lu;
	public Prueba(Persona per,Tiempo ti, Lugar lu) {
		this.per = per;
		this.ti = ti;
		this.lu = lu;
	}
	public static String recomendarActividad(Persona p, Tiempo t, Lugar l) {
		String result="";
		if (p.isSana() && !p.isContacto() && p.ispasa_Covid() && p.isCartilla() ) { 
			  
		
             if(t.getTemp() < 0 && t.getHumedad() < 15 && (t.isNieva() || t.isLluvia())){
            	 result="Con estas condiciones la recomendación es quedarse en casa.";
            }
		
            else if(t.getTemp() < 0 && t.getHumedad() < 15 && !(t.isNieva() || t.isLluvia()) && l.isHay_Aforo()){
            	result="Con estas condiciones la recomendación es ir a esquiar.";
            }

            else if((t.getTemp() <= 15 && t.getTemp()>= 0) && !t.isLluvia() && l.isHay_Aforo()){
            	result="Con estas condiciones la recomendación es ir a hacer senderismo.";
            }
        
            else if((t.getTemp() <= 25 && t.getTemp()>= 15) && !t.isLluvia() && !t.isNublado() && t.getHumedad() <= 60 && !l.isRestricciones()){
            	result="Con estas condiciones la recomendación es hacer turismo.";
            }
            else if((t.getTemp() <= 35 && t.getTemp()>= 25) && !t.isLluvia() && l.isHay_Aforo()){
            	result="Con estas condiciones la recomendación es irse de cañas";
            }
            else if(t.getTemp() > 30 && !t.isLluvia()){
            	result="Con estas condiciones la recomendación es ir a la playa.";
            }
            else if(t.getTemp() > 30 && !t.isLluvia() && l.isHay_Aforo()){
            	result="Con estas condiciones la recomendación es ir a la piscina.";
            }
	 	}//cierre if
        else{
        	result=("Con estas condiciones no puede realizar ninguna actividad.");
        }//cierre else
	return result;
	}//cierre metodo
	
}//cierre clase
