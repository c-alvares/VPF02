package controllers;

import java.util.ArrayList;

import dao.OrcamentoDAO;
import models.Orcamento;

public class OrcamentoProcess {

	public static ArrayList<Orcamento> orcamentos = new ArrayList<>();
	private static OrcamentoDAO sd = new OrcamentoDAO();
	
	public static void abrir() {
		orcamentos = sd.ler();
		if(orcamentos.size() == 0) {
			orcamentos.add(new Orcamento("1", "Intel - XPTO1", "Processador i7 5ºG", "800"));
			orcamentos.add(new Orcamento("2", "AMD - XPTO1", "Ryzen 5", "780"));
			orcamentos.add(new Orcamento("3", "AMD - XPTO2", "Ryzen 5 (Fingi)", "850"));
			orcamentos.add(new Orcamento("4", "Samsung", "SSD 1TB", "500"));
			orcamentos.add(new Orcamento("5", "Kingston", "SSD 1TB", "550"));
			orcamentos.add(new Orcamento("6", "Seagate", "SSD 1TB", "520"));
		}
	}
	
	public static boolean salvar() {
		sd.escrever(orcamentos);
		return false;
	}
}
