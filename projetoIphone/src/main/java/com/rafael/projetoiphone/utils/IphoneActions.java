package main.java.com.rafael.projetoiphone.utils;

import main.java.com.rafael.projetoiphone.models.AparelhoTelefonico;
import main.java.com.rafael.projetoiphone.models.NavegadorInternet;
import main.java.com.rafael.projetoiphone.models.ReprodutorMusical;

public class IphoneActions implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String musica;
    private long telefone;
    private String pagina;

    public IphoneActions() {
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public void ligar(long telefone) {
        System.out.println("Realizando ligação para: " + telefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Acessando a página: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música selecionada");
    }
}
