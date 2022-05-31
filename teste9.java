import javax.swing.*;

class teste9 {
    public static void main(String entrada[]) {

        String instancia = "";
        String auto, autuado, endereco, numero, complemento, bairro, cidade, estado, CEP = "";
        String msgGeral = "Digite 1 para adicionar complemento.\nDigite 2 para não adicionar complemento.";
        String msgcam = 
        "Digite a opção da sua câmara\nDigite 1 Para 2° Instância\nDigite 2 para VISA\nDigite 3 para Meio Ambiente\nDigite 4 Para Controle Urbano\nDigite 5 para Consumidor";
        String mensagem = "";
        char op=0, cam=0;

        auto = (JOptionPane.showInputDialog("Digite o número do auto: "));
        autuado = (JOptionPane.showInputDialog("Digite o nome do autuado: "));
        endereco = (JOptionPane.showInputDialog("Digite o endereço: "));
        numero = (JOptionPane.showInputDialog("Digite o número do endereço: "));
        bairro = (JOptionPane.showInputDialog("Digite o bairro: "));
        cidade = (JOptionPane.showInputDialog("Digite a cidade: "));
        estado = (JOptionPane.showInputDialog("Digite as siglas do estado: "));
        CEP = (JOptionPane.showInputDialog("Digite o CEP: "));

        cam = (JOptionPane.showInputDialog(msgcam).charAt(0));
        op = (JOptionPane.showInputDialog(msgGeral).charAt(0));
        
        switch(cam){

            case '1':{instancia = "2_instancia_";}
            break;

            case '2':{instancia = "VISA_";}
            break;

            case '3':{instancia = "MEIO_AMBIENTE_";}
            break;

            case '4':{instancia = "CONTROLE_URB_";}
            break;

            case '5':{instancia = "CONSUMIDOR_";}
            break;
        }


        switch(op){
            
            case '1':{
                complemento = (JOptionPane.showInputDialog("Digite o complemento: \n"));
                mensagem =
                mensagem + "1|001|1|0075908905|9912508211||N||S|e-Carta_30722_1_1_AI_"+ auto + "_"+ instancia + "NOTIFICACAO_DAM.pdf|"+ autuado + "|" + endereco + "|" + numero + "|"
                + complemento + "|" + bairro + "|" + cidade + "|" + estado + "|" + CEP + "|";
            }
            break;

            case '2':{
                mensagem =
                mensagem + "1|001|1|0075908905|9912508211||N||S|e-Carta_30722_1_1_AI_"+ auto + "_"+ instancia + "NOTIFICACAO_DAM.pdf|"+ autuado + "|" + endereco + "|" + numero + "|"
                + "|" + bairro + "|" + cidade + "|" + estado + "|" + CEP + "|";
            }
            break;

            default: JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente.");
        }

        if (op >= '1' && op <= '2'){
            JOptionPane.showMessageDialog(null,"\nAbaixo para copiar o texto..");
            System.out.println("\n\n\n\n"+ mensagem + "\n\n\n\n");
        }
        System.exit(0);
    }
}
