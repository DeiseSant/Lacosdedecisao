package EXERCICIOS;

import java.util.Scanner;

public class EXERCICIO4 {

	public static void main (String[] args) {
		
		int num; 
		int resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		
		resto = num % 2;
		
		if (resto == 0)
		{
			System.out.println("O n�mero " + num + " � par e sua raiz quadrada � " + Math.sqrt(num));
		}
		else 
		{
			System.out.println("O n�mero " + num + " � impar e o quadrado deste n�mero � "  +Math.pow(num, 2));			
		}	
		
	   }
	}

