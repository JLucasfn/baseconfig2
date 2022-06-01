import javax.swing.*;

class teste10 {
    public static void main(String entrada[]) {

        String instancia = "";
        String mensagemGrande = "";
        String auto, arroz, feijao, numero, macarrao, carne, cidade, estado, CEP = "";
        String mensagem = "";
        String msgGeral =
        "Digite 1 para adicionar complemento.\nDigite 2 para não adicionar complemento.";
        String msgcam = 
        "Digite a opção da sua câmara\nDigite 1 Para 2° Instância\nDigite 2 para VISA\nDigite 3 para Meio Ambiente\nDigite 4 Para Consumidor \nDigite 5 para Controle Urbano";
        char op=0, cam=0;

        JOptionPane.showMessageDialog
        (null, 
        "%%%%%% Regras de bom uso: %%%%%%\nPor favor," +
        " Conferir se está tudo certo.\nEm caso de erro, só precisa reiniciar o programa.\n"+ 
        "É sobre isso :)\nLulusmentallity 2022, feito por: João Lucas.");

        auto = (JOptionPane.showInputDialog("Digite o número do auto: "));
        arroz = (JOptionPane.showInputDialog("Digite o nome do autuado: "));
        feijao = (JOptionPane.showInputDialog("Digite o endereço: "));
        numero = (JOptionPane.showInputDialog("Digite o número do endereço: "));
        macarrao = (JOptionPane.showInputDialog("Digite o bairro: "));
        cidade = (JOptionPane.showInputDialog("Digite a cidade: "));
        estado = (JOptionPane.showInputDialog("Digite as siglas do estado: "));
        CEP = (JOptionPane.showInputDialog("Digite o CEP: "));

        // Arroz = autuado, feijão = endereço, macarrao = bairro, carne = complemento.

        String autuado = arroz.replace(" ", "_");
        String endereco = feijao.replace(" ", "_");
        String bairro = macarrao.replace(" ", "_");

        cam = (JOptionPane.showInputDialog(msgcam).charAt(0));
        op = (JOptionPane.showInputDialog(msgGeral).charAt(0));
        
        switch(cam){

            case '1':{instancia = "2_INSTANCIA_";}
            break;

            case '2':{instancia = "VISA_";}
            break;

            case '3':{instancia = "MEIO_AMBIENTE_";}
            break;

            case '4':{instancia = "CONSUMIDOR_";}
            break;

            case '5':{instancia = "CONTROLE_URB_";}
            break;
        }


        switch(op){
            
            case '1':{
                carne = (JOptionPane.showInputDialog("Digite o complemento:\n"));
                String complemento = carne.replace(" ", "_");
                mensagem =
                mensagem + "1|001|1|xxxx|xxxx||N||S|e-Carta_x_1_1_AI_"+ auto + "_"+ instancia + "NOTIFICACAO_DAM.pdf|"+ autuado + "|" + endereco + "|" + numero + "|"
                + complemento + "|" + bairro + "|" + cidade + "|" + estado + "|" + CEP + "|";
            }
            break;

            case '2':{
                mensagem =
                mensagem + "1|001|1|xxxx|||N||S|e-Carta_x_1_1_AI_"+ auto + "_"+ instancia + "NOTIFICACAO_DAM.pdf|"+ autuado + "|" + endereco + "|" + numero + "|"
                + "|" + bairro + "|" + cidade + "|" + estado + "|" + CEP + "|";
            }
            break;

            default: JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente.");
        }
        
        if (op >= '1' && op <= '2'){
            mensagemGrande = mensagem.toUpperCase();
            JOptionPane.showMessageDialog(null,"\nAbaixo para copiar o texto...");
            System.out.println("\n\n\n\n"+ mensagemGrande + "\n\n\n\n");
        }
        System.exit(0);
    }
    
}
