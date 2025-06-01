package psc.lista10;

public class Livro {
	
	private String titulo;
	private String autor;
	private String genero;
	private int qntdPag;
	private int anoPublicado;
	boolean emprestado;
	
	
	public Livro(String titulo, String autor, String genero, int qntdPag, int anoPublicado) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setGenero(genero);
		this.setQntdPag(qntdPag);
		this.setAnoPublicado(anoPublicado);
		this.emprestado = false;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getQntdPag() {
		return qntdPag;
	}


	public void setQntdPag(int qntdPag) {
		this.qntdPag = qntdPag;
	}


	public int getAnoPublicado() {
		return anoPublicado;
	}


	public void setAnoPublicado(int anoPublicado) {
		this.anoPublicado = anoPublicado;
	}
	
	public void exibirLivro() {
		System.out.println("--- Detalhes do Livro ---");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Ano de Publicação: " + this.getAnoPublicado());
        System.out.println("Número de Páginas: " + this.getQntdPag());
        System.out.println("Disponível: " + (emprestado ? "Não" : "Sim"));
        System.out.println("-------------------------");
	}
	
	public void emprestarLivro() {
		if (emprestado) {
			System.out.println("Livro já emprestado");
		} else {
			System.out.println("Livro emprestado!");
			this.emprestado = true;
		}
	}
	
	public void devolverLivro() {
		if (emprestado) {
			System.out.println("Livro devolvido!");
			this.emprestado = false;
		} else {
			System.out.println("Livro já com você");
		}
	}
}
