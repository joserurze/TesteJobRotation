package questao02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class sequencia {

	//Funcao com formula de Fibonacci
	static int fibo(int n){
		if (n<2)
			return n;
		else
			return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		
		//Criar uma lista 
		ArrayList<Object> listas = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			listas.add(sequencia.fibo(i));//adicionar a sequencia numa lista
		}
		
		//Foreach para imprimir a lista
		for (Object object : listas) {
			System.out.print(object+", ");
		}
		
		//Digite um número e consulte se faz parte da lista
		
		String digito = JOptionPane.showInputDialog("Digite um número: ");
		int dig = Integer.parseInt(digito);
		
		if(listas.contains(dig)) {
			System.out.println("\nO número existe na sequencia. ");
		} else {
			System.out.println("\nO número não existe na sequencia.");
		}
	}

}
