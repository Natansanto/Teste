package br.com.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import java.util.List;
import br.com.model.Veiculo;
import br.com.model.dao.CrudGaragem;
import br.com.model.dao.VeiculoDAO;

@ManagedBean(name = "veiculoController", eager = true)
@SessionScoped
public class VeiculoController implements Serializable {

	private Veiculo veiculo;
	private DataModel listarVeiculos;
	private CrudGaragem dao;

	public VeiculoController() {
		this.dao = new VeiculoDAO();
	}

	/**
	 * Carrega o formulário para adicionar um novo veiculo contendo todos os campos
	 * populados para serem alterados pelo usuário
	 * 
	 * @return manterVeiculo.html
	 */
	public String actionAlterar() {
		veiculo = (Veiculo) (listarVeiculos.getRowData());
		return "manterVeiculo";
	}

	/**
	 * Exclui do banco de dados o veiculo selecionado no GRID da dataTable,
	 * retornando para a página principal carregando novamente os dados da dataTable
	 * atualizados.
	 * 
	 * @return index.html
	 */
	public String actionExcluir() {
		Veiculo objTemporario = (Veiculo) (listarVeiculos.getRowData());
		dao.deletar(objTemporario);
		return "index";
	}

	public String actionManterVeiculo() {
		veiculo = new Veiculo();
		return "ManterVeiculo";
	}

	/**
	 * Salva um novo veiculo no banco de dados e retorna para a página principal
	 * 
	 * @return index.html
	 */
	public String actionGravarNovo() {
		dao.salvar(veiculo);
		return "index";
	}

	/**
	 * Salva os dados do veiculo com as alterações e retorna para a página principal
	 * atualizado a dataTable.
	 * 
	 * @return index.html
	 */
	public String actionSalvarAlteracao() {
		dao.alterar(veiculo);
		return "index";
	}

	
	
	
	
	
	
	
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public DataModel getListarVeiculos() {
		List<Veiculo> lista = new VeiculoDAO().listar();
		listarVeiculos = new ListDataModel(lista);
		return listarVeiculos;
	}

	public void setListarVeiculos(DataModel listarVeiculos) {
		this.listarVeiculos = listarVeiculos;
	}

}
