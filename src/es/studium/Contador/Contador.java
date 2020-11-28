package es.studium.Contador;
 
import java.util.Scanner;
 
public class Contador 
{
            public static void main(String[] args) 
            {
                        Scanner teclado = new Scanner(System.in);
                        int[] tabla=new int[2];
                        /*En tabla[1] cuento los negativos
                         * En tabla [0] cuento los positivos */
                        int numero;
                        for (int i=0;i<2;i++)
                        {
                                    tabla[i]=0;
                        }
                        do
                        {
                                    System.out.println("Indique un número:");
                                    numero = teclado.nextInt();
                                    if (numero>0)
                                    {
                                               tabla[0]= tabla[0]+1;
                                    }
                                    if (numero<0)
                                    {
                                               tabla[1]= tabla[1]+1;
                                    }
                        }while(numero!=0);
                        System.out.println("Hay "+tabla[0]+ " valores positivos");
                        System.out.println("Hay "+tabla[1]+ " valores negativos");
                        teclado.close();
            }
}