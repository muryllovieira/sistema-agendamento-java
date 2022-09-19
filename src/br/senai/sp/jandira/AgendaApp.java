package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		// Criar um objeto PlanoDeSaude
		
		PlanoDeSaude planoDeSaude1 = new PlanoDeSaude();
		planoDeSaude1.setOperadora("Unimed");
		planoDeSaude1.setCategoria("Bronze");
		planoDeSaude1.setNumero("8629-8454-6225-78");
		planoDeSaude1.setValidade(LocalDate.of(2023, 8, 20));
		
		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		planoDeSaude2.setOperadora("Unimed");
		planoDeSaude2.setCategoria("Diamante");
		planoDeSaude2.setNumero("3959-7591-6225-28");
		planoDeSaude2.setValidade(LocalDate.of(2023, 8, 20));
		
		// Criar um objeto Endereço
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Avenida Brigadeiro");
		endereco.setNumero("1785");
		endereco.setBairro("Esmeralda");
		endereco.setCidade("Barueri");
		endereco.setCep("06417-036");
		endereco.setEstados(Estados.SAU_PAULO);
		endereco.setComplemento("Ao lado do Banco Itaú");
		
		// Criar um objeto Paciente
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Carlos Eduardo");
		paciente1.setDataDeNascimento(LocalDate.of(2000, 2, 15));
		paciente1.setCpf("563.561.569-63");
		paciente1.setRg("69.566.842.-3");
		paciente1.setEndereco(endereco);
		paciente1.setTelefone("(14)96633-5478");
		paciente1.setPlanoDeSaude(planoDeSaude1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Maria Julia");
		paciente2.setDataDeNascimento(LocalDate.of(2001, 6, 19));
		paciente2.setCpf("563.561.581-37");
		paciente2.setRg("64.577.852-9");
		paciente2.setEndereco(endereco);
		paciente2.setTelefone("(14)96588-5478");
		paciente2.setPlanoDeSaude(planoDeSaude2);
		
		// Exibir os dados do Paciente
		
		System.out.println("Nome do Paciente: " + paciente1.getNome());
		System.out.println("Telefone do Paciente: " + paciente1.getTelefone());
		System.out.println("Operadora do plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
		System.out.println("Categoria do plano de saúde: " + paciente1.getPlanoDeSaude().getCategoria());
		System.out.println("Cidade do paciente: " + paciente1.getEndereco().getCidade());
		System.out.println("Estado do paciente: " + paciente1.getEndereco().getEstado());
		System.out.println("--------------------------------------------");
		// Criar especialidades
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração.");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologista");
		especialidade2.setDescricao("Cuida das vias nasais.");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico Geral");
		especialidade3.setDescricao("Cuida de tudo.");
		
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Cuida dos ossos.");
		
		// Criar objeto médico
		
		Medico medico1 = new Medico();
		medico1.setNome("Pedro Antonio");
		medico1.setEmail("paulo@hotmail.com");
		medico1.setTelefone("(11) 96536-5246");
		medico1.setCrm("55525-55");
		Especialidade[] especialidades1 = {especialidade1, especialidade3};
		medico1.setEspecialidades(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Ana Paula");
		medico2.setEmail("napaula@hotmail.com");
		medico2.setTelefone("(11) 96545-5246");
		medico2.setCrm("55314-69");
		Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3, especialidade4};
		medico2.setEspecialidades(especialidades2);
		
		System.out.println("Nome do médico: " + medico1.getNome());
		int i = 0;
		while (i < medico1.getEspecialidades().length) {
			System.out.println("Especialidade " + (i + 1) + " - " + medico1.getEspecialidades()[i].getNome());
			i++;
		}
		System.out.println("-------------------------------------");
		
		System.out.println("Nome do médico: " + medico2.getNome());
		i = 0;
		while (i < medico2.getEspecialidades().length) {
			System.out.println("Especialidade " + (i + 1) + " - " + medico2.getEspecialidades()[i].getNome());
			i++;
		}
		
		// Fazer o agendamento do paciente Carlos Eduardo
		// com um cardiologista para o dia 27/09/2022
		// as 14h15m
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade1);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
		agenda1.setHoraDaConsulta(LocalTime.of(14, 15));
		
		// Fazer o agendamento do paciente Maria Julia
		// com um fisioterapia para o dia 12/10/2022
		// as 09h30m
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidade(especialidade4);
		agenda2.setMedico(medico2);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
		agenda2.setHoraDaConsulta(LocalTime.of(9, 30));
		
		// Exibir os dados de agenda,com o nome do paciente,
		// nome do médico, nome da especialidade, data e hora
		// do agendamento e plano de saúde utilizado.
		System.out.println("-------------------------------------------");
		System.out.println("Nome do Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Nome do Médico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Data: " + agenda1.getDataDaConsulta());
		System.out.println("Hora: " + agenda1.getHoraDaConsulta());
		
		System.out.println("-------------------------------------------");
		System.out.println("Nome do Paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Nome do Médico: " + agenda2.getMedico().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Data: " + agenda2.getDataDaConsulta());
		System.out.println("Hora: " + agenda2.getHoraDaConsulta());
		
		
		
		
	}

}
