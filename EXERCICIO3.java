package EXERCICIOS;

import java.util.Scanner;

public class EXERCICIO3 {
	
	public static void main (String[]args) {
	
	int idade;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Qual a sua idade:");
	idade = leia.nextInt();
	
	if(idade>=10 && idade<=14)
	{
		System.out.println("Voc� pertence a categoria INFANTIL");
	}
	else if(idade>=15 && idade<=17)
	{
		System.out.println("Voc� pertence a categoria JUVENIL");
	}
	else if(idade>=18 && idade>=25)
	{
		System.out.println("Voc� pertence a categoria ADULTO");
	}
	else
	{
		System.out.println("Voc� n�o pertence a nenhuma categoria dispon�vel");
	}
	
	System.out.println("\n FIM DO PROGRAMA");
	
	}
}

