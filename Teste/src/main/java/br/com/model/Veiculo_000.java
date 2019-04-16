package br.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue
	private long id;

	private Integer km;
	private String fabricante;
	private String modelo;
	private String ano;
	private String nome_proprietario;
	private String cidade;
	private String estado;
	private String bairro;

	public Veiculo() {
	}

	public Veiculo(long id, Integer km, String fabricante, String modelo, String ano, String nome_proprietario,
			String cidade, String estado, String bairro) {
		this.id = id;
		this.km = km;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.nome_proprietario = nome_proprietario;
		this.cidade = cidade;
		this.estado = estado;
		this.bairro = bairro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getNome_proprietario() {
		return nome_proprietario;
	}

	public void setNome_proprietario(String nome_proprietario) {
		this.nome_proprietario = nome_proprietario;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
