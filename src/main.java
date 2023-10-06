import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        iphone iphone = new iphone();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Iphone");
        System.out.println("1 > Ipod");
        System.out.println("2 > Telefone");
        System.out.println("3 > Safari Browser");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:{
                String musica = "Take me Home, Country Roads";
                iphone.selecionarMusica(musica);
                iphone.tocar(musica);
                iphone.pausar(musica);
                break;
            }
            case 2:{
                iphone.atender("98991235");
                iphone.ligar("99991234");
                iphone.iniciarCorreioVoz("99852365");
                break;
            }
            case 3:{
                iphone.exibirPagina();
                iphone.adicionarNovaAba();
                iphone.atualizarPagina();
                break;
            }
            default:{
                System.out.println("Escolha um app válido");
                break;
            }
        }

    }
}
