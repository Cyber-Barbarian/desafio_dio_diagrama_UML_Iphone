package main.java.com.rafael.projetoiphone.service;

import main.java.com.rafael.projetoiphone.models.enums.EnumAppMusica;
import main.java.com.rafael.projetoiphone.models.enums.EnumAppNavegador;
import main.java.com.rafael.projetoiphone.models.enums.EnumAppSelector;
import main.java.com.rafael.projetoiphone.models.enums.EnumAppTelefone;
import main.java.com.rafael.projetoiphone.utils.IphoneActions;

import java.util.Locale;
import java.util.Scanner;

public class IphoneApps extends IphoneActions {

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public void telaDeAbertura() {
        int appOption = 0;
        do {
            System.out.println("Selecione a ação desejada:");
            System.out.println("Digite: " + 1 + " para o menu de " + EnumAppSelector.INTERNET);
            System.out.println("Digite: " + 2 + " para o menu de " + EnumAppSelector.TELEFONE);
            System.out.println("Digite: " + 3 + " para o menu de " + EnumAppSelector.MUSICA);
            System.out.println("Digite: " + 4 + " para " + EnumAppSelector.SAIR);

            appOption = sc.nextInt();
            switch (appOption) {
                case 1:
                    System.out.println("\n" + "Escolhido " + EnumAppSelector.INTERNET + "\n");
                    appInternet();
                    break;
                case 2:
                    System.out.println("\n" + "Escolhido " + EnumAppSelector.TELEFONE + "\n");
                    appTelefone();
                    break;
                case 3:
                    System.out.println("\n" + "Escolhido " + EnumAppSelector.MUSICA + "\n");
                    appMusica();
                    break;
                case 4:
                    System.out.println("\n" + "Escolhido " + EnumAppSelector.SAIR + "\n");
                    break;
                default:
                    System.out.println("\n" + "Tente novamente" + "\n");
            }

        } while (appOption != 4);
    }

    public void appMusica() {
        int appOption = 0;
        do {
            System.out.println("Selecione a ação desejada:");
            System.out.println("Digite: " + 1 + " para " + EnumAppMusica.SELECIONAR_MUSICA);
            System.out.println("Digite: " + 2 + " para " + EnumAppMusica.REPRODUZIR);
            System.out.println("Digite: " + 3 + " para " + EnumAppMusica.PAUSAR);
            System.out.println("Digite: " + 4 + " para " + EnumAppMusica.VOLTAR_AO_MENU);

            appOption = sc.nextInt();
            switch (appOption) {
                case 1:
                    System.out.println("\n" + "Escolhido " + EnumAppMusica.SELECIONAR_MUSICA + "\n");
                    System.out.println("\n" + "Digite a música selecionada: ");
                    sc.useDelimiter("\\n");
                    String musica = sc.next();
                    selecionarMusica(musica);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\n" + "Escolhido " + EnumAppMusica.REPRODUZIR + "\n");
                    tocar();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n" + "Escolhido " + EnumAppMusica.PAUSAR + "\n");
                    pausar();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n" + "Escolhido " + EnumAppMusica.VOLTAR_AO_MENU + "\n");
                    break;
                default:
                    System.out.println("\n" + "Tente novamente" + "\n");
            }
        } while (appOption != 4);

    }

    public void appTelefone() {
        int appOption = 0;
        do {
            System.out.println("Selecione a ação desejada:");
            System.out.println("Digite: " + 1 + " para " + EnumAppTelefone.TELEFONAR);
            System.out.println("Digite: " + 2 + " para " + EnumAppTelefone.ATENDER);
            System.out.println("Digite: " + 3 + " para " + EnumAppTelefone.CORREIO_DE_VOZ);
            System.out.println("Digite: " + 4 + " para " + EnumAppTelefone.VOLTAR_AO_MENU);

            appOption = sc.nextInt();
            switch (appOption) {
                case 1:
                    System.out.println("\n" + "Escolhido " + EnumAppTelefone.TELEFONAR + "\n");
                    System.out.println("\n" + "Digite o número de telefone: ");
                    long numero = sc.nextInt();
                    ligar(numero);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\n" + "Escolhido " + EnumAppTelefone.ATENDER + "\n");
                    atender();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n" + "Escolhido " + EnumAppTelefone.CORREIO_DE_VOZ + "\n");
                    iniciarCorreioVoz();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n" + "Escolhido " + EnumAppTelefone.VOLTAR_AO_MENU + "\n");
                    break;
                default:
                    System.out.println("\n" + "Tente novamente" + "\n");
            }
        } while (appOption != 4);

    }

    public void appInternet() {
        int appOption = 0;
        do {
            System.out.println("Selecione a ação desejada:");
            System.out.println("Digite: " + 1 + " para " + EnumAppNavegador.EXIBIR_PAGINA);
            System.out.println("Digite: " + 2 + " para " + EnumAppNavegador.ATUALIZAR_PAGINA);
            System.out.println("Digite: " + 3 + " para " + EnumAppNavegador.ABRIR_NOVA_ABA);
            System.out.println("Digite: " + 4 + " para " + EnumAppNavegador.VOLTAR_AO_MENU);

            appOption = sc.nextInt();
            switch (appOption) {
                case 1:
                    System.out.println("\n" + "Escolhido " + EnumAppNavegador.EXIBIR_PAGINA + "\n");
                    System.out.println("\n" + "Digite a página que deseja acessar: ");
                    sc.useDelimiter("\\n");
                    String pagina = sc.next();
                    exibirPagina(pagina);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\n" + "Escolhido " + EnumAppNavegador.ATUALIZAR_PAGINA + "\n");
                    atualizarPagina();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\n" + "Escolhido " + EnumAppNavegador.ABRIR_NOVA_ABA + "\n");
                    adicionarNovaAba();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n" + "Escolhido " + EnumAppNavegador.VOLTAR_AO_MENU + "\n");
                    break;
                default:
                    System.out.println("\n" + "Tente novamente" + "\n");
            }
        } while (appOption != 4);

    }

}
