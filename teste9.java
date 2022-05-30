import javax.swing.*;

class teste9 {
    public static void main(String entrada[]) {

        String autuado, auto, CEP, endereco, numero, complemento, msg = "";
        char op=0;
        String msgGeral = "Digite 1 para adicionar complemento.\nDigite 2 para não adicionar complemento.";

        autuado = (JOptionPane.showInputDialog("Digite o nome do autuado: "));
        auto = (JOptionPane.showInputDialog("Digite o número do auto: "));
        CEP = (JOptionPane.showInputDialog("Digite o CEP: "));
        endereco = (JOptionPane.showInputDialog("Digite o endereço: "));
        numero = (JOptionPane.showInputDialog("Digite o número do endereço: "));
        op = (JOptionPane.showInputDialog(msgGeral).charAt(0));

        switch(op){
            case '1':{
                complemento = (JOptionPane.showInputDialog("Digite o complemento: \n"));
                msg = msg + "Autuado: " + autuado + " auto: "+ auto + " CEP: "+ CEP +
                " endereço: "+ endereco + " numero: "+ numero + " complemento: "+ complemento + "\n\n\n";
            }
            break;

            case '2':{
                msg = msg + "Autuado: " + autuado + " auto: "+ auto + " CEP: "+ CEP +
                " endereço: "+ endereco + " numero: "+ numero + "\n\n\n";
            }
            break;

            default: JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente.");
        }

        if (op >= '1' && op <= '2'){
            JOptionPane.showMessageDialog(null, msg + 
            "\nAbaixo para copiar o texto..");
            System.out.println(msg);
        }
        System.exit(0);
    }
}