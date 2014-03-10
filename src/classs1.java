import java.util.Scanner;
public class classs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner mi_s=new Scanner(System.in);
int arreglo [];
System.out.println("Ingrese la Longitud del arreglo: ");
arreglo= new int [mi_s.nextInt()];

for (int i=0; i<arreglo.length; i++ ){
System.out.print("Ingrese la posicion "+i+": ");	
arreglo [i]= mi_s.nextInt();
}

for (int i=0; i<arreglo.length; i++ ){
	System.out.print(arreglo[i]+",");
}

		
	}

}
