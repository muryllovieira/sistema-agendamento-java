package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {
	public static void main(String[] args) {

		int a = 5;

		Integer b = 5;

		Double x = 2.9;

		ArrayList<Especialidade> especialidades = new ArrayList<>();

		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setNome("cardiologia");
		e1.setDescricao("não deixa ter um ataque");

		Especialidade e2 = new Especialidade("Gastroenteologia");
		e2.setNome("Gastroenteologia");
		e2.setDescricao("Não deixa ficar com dor de barriga");

		especialidades.add(e1);
		especialidades.add(e2);

		Especialidade e3 = new Especialidade("Fisioterapeuta");
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida do seus ossos");

		especialidades.add(e3);

		Especialidade e4 = new Especialidade("Pediatria");
		e4.setNome("Pediatria");
		e4.setDescricao("Cuida da saude do seu filho");

		Especialidade[] epecialidades = { e1, e2, e3, e4 };

		Especialidade e5 = new Especialidade("Clinico");
		e5.setNome("Clinico");
		e5.setDescricao("serve para tudo");

		//	especialidades[4] = e5;	
		especialidades.add(e4);
		especialidades.add(e5);

		System.out.println(especialidades.size());

		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(12);
		notas.add(10);
		notas.add(40);
		notas.add(20);

		System.out.println(notas.size());

		notas.add(50);
		notas.add(3);

		System.out.println(notas.size());

		System.out.println(especialidades.get(3).getNome());

		especialidades.get(1).setNome("Teste");

		System.out.println(especialidades.get(1).getNome());

		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		nova.setNome("Não é mais fisio!");

		e3.setNome("Senai Jandira");
		
		System.out.println(nova.getNome());
		System.out.println(especialidades.get(2).getNome());

	}

}
