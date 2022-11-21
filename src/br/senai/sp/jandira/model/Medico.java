package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

        private static int contador = 99;
	private String nome;
	private Especialidade[] especialidades;
	private String telefone;
	private String email;
	private String crm;
        private LocalDate dataDeNascimento;
        private Integer codigo;
        
        public Medico(String nome, Especialidade[] especialidades, String telefone, String email, String crm) {
            this.nome = nome;
            this.especialidades = especialidades;
            this.email = email;
            this.telefone = telefone;
            this.crm = crm;
            
            gerarCodigo();
       
        }
        
        public Medico(String nome, String crm, String telefone, LocalDate dataDeNascimento) {
            this.nome = nome;
            this.crm = crm;
            this.telefone = telefone;
            this.dataDeNascimento = dataDeNascimento;
            
            gerarCodigo();
       
        }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade[] getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Especialidade[] especialidades) {
		this.especialidades = especialidades;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
        
        public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Integer getCodigo() {
		return codigo;
	}
        
        private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
        }

}
