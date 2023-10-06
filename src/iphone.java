import InterfaceIphone.reprodutorMusical;
import InterfaceIphone.aparelhoTelefonico;
import InterfaceIphone.navegadorInternet;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);

    }

    @Override
    public void atender(String numero) {
        System.out.println("Ligação de " + numero);

    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página do Amazon");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");

    }

    @Override
    public void tocar(String song) {
        System.out.println("Tocando agora: "+ song);

    }

    @Override
    public void pausar(String song) {
        System.out.println("A música "+ song + " está pausada");

    }

    @Override
    public void selecionarMusica(String song) {
        System.out.println("Música escolhida > " + song);
    }
}