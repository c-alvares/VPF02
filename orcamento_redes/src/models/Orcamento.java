package models;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public class Orcamento {

	// Atributos do Modelo
	private int id;
	private String fornecedor;
	private String produto;
	private double preco;
	private boolean maisBarato;

	// Atributos de Formata��o dos Decimais
	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");

	// Construtores
	public Orcamento(String id, String fornecedor, String produto, String preco, String maisBarato) {
		df.setCurrency(Currency.getInstance(BRASIL));
		try {
			this.id = Integer.parseInt(id);
			this.fornecedor = fornecedor;
			this.produto = produto;
			this.preco = Double.parseDouble(df.parse(preco).toString());
			this.maisBarato = Boolean.parseBoolean(maisBarato);
		} catch (ParseException e) {
			System.out.println(e);
		}

	}

	// Getters && Setters
	public int getId() {
		return id;
	}

	public String getId(String s) {
		return String.format("%d", id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public String getPreco(String s) {
		return df.format(preco);
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isMaisBarato() {
		return maisBarato;
	}

	public String getMaisBarato(String s) {
		return String.format("%b", maisBarato);
	}

	public void setMaisBarato(boolean maisBarato) {
		this.maisBarato = maisBarato;
	}

	// Definindo o id como Chave
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orcamento other = (Orcamento) obj;
		return id == other.id;
	}

	//M�todos de Sa�da
	@Override
	public String toString() {
		return "Orcamento [id=" + id + ", fornecedor=" + fornecedor + ", produto=" + produto + ", preco=" + preco
				+ ", maisBarato=" + maisBarato + "]";
	}
	
	/*
	 * M�todos de Sa�da para tela simples, arquivo e vetor/tabela
		@Override
		public String toString() {
			return getId("") + "\t" + getFornecedor("") + "\t" + produto + "\t" + getPreco("") + "\t" + getMaisBarato("") + "\n";
		} 
	*/
}
