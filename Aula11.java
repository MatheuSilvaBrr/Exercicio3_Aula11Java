package br.com.db1start.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula11 {
	// Exercicio 1

	public List<String> cores() {
		List<String> cores = new ArrayList<>();
		cores.add("Azul");
		cores.add("Vermelhor");
		cores.add("Preto");
		return cores;
	}

	// Exercicio 2
	public List<String> cores2() {
		List<String> cores = new ArrayList<>();
		cores.add("Azul");
		cores.add("Vermelhor");
		cores.add("Preto");
		return cores;
	}
	// em Assert no teste usar cores.size()

	// Exercicio3
	public List<String> cores3() {
		String cor1 = "Preto";
		String cor2 = "Vermelho";
		String cor3 = "Azul";
		List<String> cores = new ArrayList<>();
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		cores.remove(cor2);
		return cores;
	}

	// Exercicio5
	public List<String> cores5() {
		String cor1 = "Preto";
		String cor2 = "Vermelho";
		String cor3 = "Azul";
		List<String> cores = new ArrayList<>();
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		Collections.sort(cores);
		return cores;
	}

	// Exercicio6
	public List<String> cores6() {
		String cor1 = "Preto";
		String cor2 = "Vermelho";
		String cor3 = "Azul";
		List<String> cores = new ArrayList<>();
		cores.add(cor1);
		cores.add(cor2);
		cores.add(cor3);
		cores.remove(cor2);
		Collections.sort(cores);
		return cores;
	}

	// Exercicio7
	public List<String> cores7() {
		List<String> cores7 = new ArrayList<>();
		cores7.add("Azul");
		cores7.add("Vermelho");
		cores7.add("Preto");
		Collections.sort(cores7, Collections.reverseOrder());
		return cores7;

	}

	// Exercicio8
	public List<Integer> inteiros() {
		Integer n1 = 1;
		Integer n2 = 2;
		Integer n3 = 3;
		Integer n4 = 4;
		Integer n5 = 5;

		List<Integer> Par = new ArrayList();

		List<Integer> Impar = new ArrayList();

		List<Integer> inteiros = new ArrayList<>();
		inteiros.add(n1);
		inteiros.add(n2);
		inteiros.add(n3);
		inteiros.add(n4);
		inteiros.add(n5);

		for (int i = 0; i <= 5; i++) {
			
			if (n1 % 2 == 0) {
				Par.add(n1);
			} else {
				Impar.add(n1);
			}
			

		}

		return null;

	}

	// Exercicio9
	public List<String> nomes9() {
		List<String> nomes9 = new ArrayList<>();
		nomes9.add("ANA");
		nomes9.add("ANA LAURA");
		nomes9.add("JOSE");
		nomes9.add("WAGNER");
		nomes9.add("RODOLFO");
		nomes9.add("ROBERVAL");
		nomes9.add("RODOLPHO");
		nomes9.add("VAGNER");
		nomes9.add("JOSÉ");
		nomes9.add("JOALDO");
		nomes9.add("CLECIO");
		nomes9.add("JOSÉ");
		nomes9.add("MARIA");
		nomes9.add("MARCOS");
		Collections.sort(nomes9);
		return nomes9;
	}
	
	public Integer soma() {
		List<Integer> soma = new ArrayList<>();
		soma.add(10);
		soma.add(20);
		Integer sma = 0;
		
		for (int a : soma){
			sma = sma + a;
		}
		return sma;
	}
	
	

}
