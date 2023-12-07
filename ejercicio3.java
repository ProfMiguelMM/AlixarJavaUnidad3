
public class ejercicio3 {

	public static void imprimirArrayBI(int [][] numeros) {
	
		
		System.out.println();
		for (int i=0;i<numeros.length;i++) {
			System.out.println();
			for (int j=0;j<numeros.length;j++) {
				if (numeros[i][j]<10)
					System.out.print("[ " + numeros[i][j] + "]");
				else
					System.out.print("[" + numeros[i][j] + "]");
			}
		}
		
		
	}
	public static void imprimirArrayUNI(int [] numeros) {
		System.out.println();
	

		for (int i=0;i<numeros.length;i++) 
			System.out.print("[" + numeros[i]+ "]");
			
		}
		
		
	
	
	
	public static int [] diagonalPrincipal (int [][] numeros) {
		
		int [] diagonal = new int[numeros.length];
		
		
		for (int i=0;i<numeros.length;i++) {
			for (int j=0;j<numeros.length;j++) {
				if (i==j)
					diagonal[i]=numeros[i][j];
			}
		}
		
		
		
		return diagonal;
	}
	
	
public static int [] diagonalSecundaria (int [][] numeros) {
		
		int [] diagonal = new int[numeros.length];
		
		
		for (int i=0;i<numeros.length;i++) {
			for (int j=0;j<numeros.length;j++) {
				if (j==numeros.length-i-1)
					diagonal[i]=numeros[i][j];
			}
		}
		
		
		
		return diagonal;
	}

public static int [] invertirArray(int [] numeros,int inicio, int fin) {
	
	
	if (fin<=inicio)
		return numeros;
	else {
		int aux;
		aux=numeros[inicio];
		numeros[inicio]=numeros[fin];
		numeros[fin]=aux;
		
	} 
			
	return invertirArray(numeros,inicio+1,fin-1);
	
	
}
	
public static void inicializar (int numeros [][]) {
	for (int i=0;i<numeros.length;i++) {
		for (int j=0;j<numeros.length;j++) {
			numeros[i][j]= (int) (Math.random()*25+1);
		}
	}

	
}	

public static void main(String[] args) {

		int numeros [][] = new int [5][5];
		inicializar(numeros);
		
		
		System.out.println("\nArray principal: ");
		imprimirArrayBI(numeros);
		
		
		int [] diagonalPrincipal=diagonalPrincipal(numeros);
		System.out.println("\n\nDiagonal principal: ");
		imprimirArrayUNI(diagonalPrincipal);
		int [] diagonalPrincipalInvertida=invertirArray(diagonalPrincipal,0,4);
		System.out.println("\n\nDiagonal principal invertida: ");
		imprimirArrayUNI(diagonalPrincipalInvertida);
		
		
		int [] diagonalSecundaria=diagonalSecundaria(numeros);
		System.out.println("\n\nDiagonal secundaria: ");
		imprimirArrayUNI(diagonalSecundaria);
		int [] diagonalSecundariaInvertida;
		diagonalSecundariaInvertida=invertirArray(diagonalSecundaria,0,4);
		System.out.println("\n\nDiagonal secundaria invertida: ");
		imprimirArrayUNI(diagonalSecundariaInvertida);

	}

}















