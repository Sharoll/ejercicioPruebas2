package ejercicioFibonacci;

public class fibonacci {

	public static int serieFibonacci(int valor) {
		
		 int a = 0;
         int b = 1;

         for (int i = 0; i < valor; i++)
         {
            int auxiliar = a;
             a = b;
             b = auxiliar + a;
             
         }

         return a;

	}

}
