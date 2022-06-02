package bean;

import entidade.Jogo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


import dao.JogoDAO;


@ManagedBean
public class JogoBean {
	private Jogo jogo = new Jogo();
	
	private List<Jogo> listar;
	

	public String salvar() {
			JogoDAO.salvar(jogo);
		return "listar";
	}
	
	public String testando() {
		JogoDAO.atualizar(jogo);
		return null;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	
	


	public String atualizar() {
		
			JogoDAO.atualizar(jogo);
			
		return null;
	}
	
	
	public String excluir() {
		
			JogoDAO.deletar(jogo);;
			listar.remove(jogo); 

		return null;
	}
	
	
	public List<Jogo> getListar() {
		if(listar ==  null) {
			listar = JogoDAO.listar();
		}
		return listar;
	}

	public void setListar(List<Jogo> listar) {
		this.listar = listar;
	}
	
	
	
}

