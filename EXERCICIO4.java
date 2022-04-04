package EXERCICIOS;

import java.util.Scanner;

public class EXERCICIO4 {

	public static void main (String[] args) {
		
		int num; 
		int resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		resto = num % 2;
		
		if (resto == 0)
		{
			System.out.println("O número " + num + " é par e sua raiz quadrada é " + Math.sqrt(num));
		}
		else 
		{
			System.out.println("O número " + num + " é impar e o quadrado deste número é "  +Math.pow(num, 2));			
		}	
		
	   }
	}

