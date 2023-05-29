package src.View;

import javax.swing.*;

public class View {
    public static void chamaMenuPrincipal (){
        String[] opcoesMenu= {"Cadastros", "Lançamentos","Relatórios", "Sair"};
        int opcao= JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                "Menu principal", JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
        switch (opcao){
            case 0: // Cadastros
                break;
            case 1: // Lançamentos
                break;
            case 2: // Relatórios
                break;
            case 3: // SAIR
                break;
        }
    }
}
