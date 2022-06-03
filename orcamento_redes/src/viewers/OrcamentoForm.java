package viewers;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class OrcamentoForm extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3L;
	private JPanel painel;
	private String imgIco = "./imgs/icone.png";
	private JLabel id, fornecedor, produto, preco;
	private JTextField tfId, tfFornecedor, tfProduto, tfPreco;
	private JComboBox<String> cbProduto;
	private JScrollPane rolagem;
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton create, read, update, delete;
	
	private int autoId = OrcamentoProcess.orcamentos.get(OrcamentoProcess.orcamentos.size() - 1).getId() + 1;
	
	OrcamentoForm () {
		setTitle("Formulário de Orçamentos");
		setBounds(150, 170, 640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(imgIco).getIconImage());
		painel = new JPanel();
		painel.setBackground(new Color(213, 233, 255));
		setContentPane(painel);
		setLayout(null);
	}
}
