package ExPolimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Produtos {
	public static void main(String args[]) {
		int pessoas = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Tem muitas pessoas no mercado? Por favor informe quantas ");
		pessoas = entrada.nextInt();
		
		Collection<String> produto = new ArrayList();
		produto.add("Pasta de dente");
		produto.add("Arroz 10 Kg");
		produto.add("Pão frânces");
		produto.add("Iorgute desnatado");
		produto.add("Pipoca");
		produto.add("Folha sulfite");
		produto.add("Canetas coloridas");
		
		if(pessoas<50){
			System.out.println("Supermecado Livre ");
			System.out.println("Lista de produtos: "+produto);
		}
		if(pessoas>=50 && pessoas<70) {
			produto.remove("Arroz 10 Kg");
			produto.remove("Pipoca");
			produto.remove("Pão frânces");
			produto.remove("Canetas coloridas");
			System.out.println("Supermercado mais ou menos");
			System.out.println("Lista de produtos: "+produto);
		}if(pessoas>70) {
			produto.clear();
			System.out.println("Supermercado Lotadooo acabou tudoooo!!!");
			System.out.println("Lista de produtos: "+produto);
		}
		/*if(produto.isEmpty()) {
			System.out.println("Supermercado Vazio ...");
		}else {
		System.out.println("Lista de produtos: "+produto);
		}*/
	}
}
