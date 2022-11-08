package br.com.unipar.pcbuild;

import br.com.unipar.pcbuild.models.Computador;
import br.com.unipar.pcbuild.models.Peca;
import br.com.unipar.pcbuild.models.TipoPecaEnum;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class PcBuild {

    
    static int contadorId = 0;
    
    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame janelaPrincipal = new JFrame("Menu PAV");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setLocationRelativeTo(null);

        janelaPrincipal.setJMenuBar(createMenuBar());

        janelaPrincipal.setSize(450, 300);
        janelaPrincipal.setVisible(true);
    }

    private static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCadastro = new JMenu("Cadastro");
        menuBar.add(menuCadastro);

        JMenuItem telaPeca = new JMenuItem("Peca");
        telaPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroPeca();
            }
        });
        menuCadastro.add(telaPeca);

        return menuBar;
    }
    
    /*
        int op;

        do {
            op = Integer.valueOf(JOptionPane.showInputDialog("Digite uma das opções:\n\n1 - Adicionar Peça\n"
                    + "2 - Montar PC\n0 - Sair\n\n"));

            if (op >= 0 && op <= 2) {
                switch (op) {
                    case 1:
                        adcPeca();
                        break;
                    case 2:
                        //MontarPC(, );
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            }

        } while (op != 0);

    }

    public static void adcPeca() {
        Peca novaPeca = new Peca();
        novaPeca.setId(contadorId++);
        novaPeca.setMarca(JOptionPane.showInputDialog("Digite a marca da peça: "));
        novaPeca.setNome(JOptionPane.showInputDialog("Digite o nome da peça: "));
        String tpPeca = JOptionPane.showInputDialog("Digite o tipo da peça(MEMORIA,PLACA MAE, PLACA VIDEO, PROCESSADOR, GABINETE, PLACA REDE, SSD, HD): ");
        /*switch(tpPeca.toUpperCase().trim()){
            case "MEMORIA":
                novaPeca.setTipoPeca(TipoPecaEnum.MEMORIA);
                break;
            case "PLACA MAE":
                novaPeca.setTipoPeca(TipoPecaEnum.PLACAMAE);
                break;
            case "PLACA VIDEO":
                novaPeca.setTipoPeca(TipoPecaEnum.PLACAVIDEO);
                break;
            case "PROCESSADOR":
                novaPeca.setTipoPeca(TipoPecaEnum.PROCESSADOR);
                break;
            case "GABINETE":
                novaPeca.setTipoPeca(TipoPecaEnum.GABINETE);
                break;
            case "PLACA REDE":
                novaPeca.setTipoPeca(TipoPecaEnum.PLACAREDE);
                break;
            case "SSD":
                novaPeca.setTipoPeca(TipoPecaEnum.SSD);
                break;
            case "HD":
                novaPeca.setTipoPeca(TipoPecaEnum.HD);
                break;
        }
        novaPeca.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça: ")));
    }
    
    public static void MontarPC(){
        
    }*/
}
