package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("A cardiologia cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao("Otorrinolaringologia cuida das vias nasais");

		JOptionPane.showMessageDialog(null, especialidade2.getNome());
		System.out.println(especialidade.getNome());
		System.out.println(especialidade.getDescricao());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
