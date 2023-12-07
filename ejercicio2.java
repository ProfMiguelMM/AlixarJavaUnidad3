
public class ejercicio2 {

	
	public static void main(String[] args) {
		
		String cadena="                hTtpS://www.Google.eS HTtp://iesAlixaR.oRg hTTps://www.juntadEandalucia.es                  ";
		String cadenaprueba;
		String cadena2=cadena.toLowerCase().trim();
		String subcadena1="https://";
		String subcadena2="http://";
		String [] cadenaPartida = cadena2.split(" ");
		
		int contadorhttps=0;
		int contadorhttp=0;
		
		for (int i=0;i<cadenaPartida.length;i++) {
			if (cadenaPartida[i].contains(subcadena1)) {
				contadorhttps++;
			}
			
			if (cadenaPartida[i].contains(subcadena2)) {
				contadorhttp++;
			}		
			
		}
		
		System.out.println("Número de dominios https:// --> " + contadorhttps);
		System.out.println("Número de dominios http://  --> "+ contadorhttp);

	}

}
