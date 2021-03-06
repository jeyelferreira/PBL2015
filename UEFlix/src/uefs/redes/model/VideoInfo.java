package uefs.redes.model;

import java.util.ArrayList;

public class VideoInfo {
	
	private static final long serialVersionUID = 1L;
	private String nome_arquivo; 
	private ArrayList< String > tags_arquivo = new ArrayList< String >();
	private String descricao;
	private int qualidade;
	private String categoria;
	
	
	public VideoInfo( String nome_arquivo, ArrayList< String > tags_arquivo, String descricao,int qualidade,String categoria )
	{
		this.nome_arquivo = nome_arquivo;
		this.tags_arquivo = tags_arquivo;
		this.setDescricao(descricao);
		this.qualidade = qualidade;
		this.setCategoria(categoria);
	}
	public String getNome_arquivo() {
		return nome_arquivo;
	}
	public void setNome_arquivo(String nome_arquivo) {
		this.nome_arquivo = nome_arquivo;
	}
	public ArrayList< String > getTags_arquivo() {
		return tags_arquivo;
	}
	public void setTags_arquivo(ArrayList< String > tags_arquivo) {
		this.tags_arquivo = tags_arquivo;
	}
	public int getQualidade() {
		return qualidade;
	}
	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
