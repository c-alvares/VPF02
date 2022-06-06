package controllers;

import java.util.ArrayList;

import models.Orcamento;
import models.OrcamentoDAO;

public class OrcamentoProcess {

	public static ArrayList<Orcamento> orcamentos = new ArrayList<>();
	private static OrcamentoDAO sd = new OrcamentoDAO();
	
	public static void abrir() {
		orcamentos = sd.ler();
	}
	
	public static void salvar() {
		sd.escrever(orcamentos);
	}

}