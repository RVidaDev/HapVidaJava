package br.com.NotreDame.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.NotreDame.beans.Cadastro;
import br.com.NotreDame.beans.ListarCadastro;
import br.com.NotreDame.beans.PreConsulta;
import br.com.NotreDame.beans.SairBean;

public class MenuCadastro {
    private static ArrayList<String> cadastros = new ArrayList<>();
    private static ArrayList<String> preConsulta = new ArrayList<>();
    
	public static void main(String[] args) {
		SairBean sairBean = new SairBean();
        Cadastro cadastro = new Cadastro();
        ListarCadastro listarCadastros = new ListarCadastro();
        PreConsulta preConsulta = new PreConsulta();
        Scanner scanner = new Scanner(System.in);
        
        int escolha;
        do {
        	
            exibirMenu();

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
            case 1:
                cadastro();
                break;
            case 2:
                ListarCadastros();
                break;
            case 3:
            	PreConsulta();
            	System.out.println();
            	break;
            case 4:
                System.out.println("Saindo do programa. Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

        } while (escolha != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar Todos os Cadastros");
        System.out.println("3. Pré consulta");
        System.out.println("4. Sair");
    }

    public static void cadastro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nome = scanner.nextLine();
        cadastros.add(nome);
        System.out.println("Digite seu CPF: ");
        String CPF = scanner.nextLine();
        cadastros.add(CPF);
        System.out.println("Digite o email: ");
        String email = scanner.nextLine();
        cadastros.add(email);
        System.out.println("Digite o telefone (Apenas números): ");
        String telefone = scanner.nextLine();
        cadastros.add(telefone);
        
        System.out.println("Cadastro realizado com sucesso!\n");
    }

     private static void ListarCadastros() {
        if (cadastros.isEmpty()) {
            System.out.println("Não há cadastros para exibir.\n");
        } else {
            System.out.println("----- Cadastros -----");
            for (String cadastro : cadastros) {
                System.out.println(cadastro);
            }
            System.out.println();
        }
    }
     
     public static void PreConsulta() {
         Scanner scanner = new Scanner(System.in);
    	 System.out.println("Quais são seus sintomas? ");
    	 String sintomas = scanner.nextLine();
    	 preConsulta.add(sintomas);
    	 System.out.println("Qual a intensidade (fraco, médio ou forte): ");
    	 String intensidadeDor = scanner.nextLine();
    	 preConsulta.add(intensidadeDor);
    	 System.out.println("Qual a data do acontecimento? ");
    	 String dataOcorrido = scanner.nextLine();
    	 preConsulta.add(dataOcorrido);
    	 System.out.println("Dê uma breve descrição aqui: ");
    	 String descricao = scanner.nextLine();
    	 preConsulta.add(descricao);
    	 
    	 System.out.println("Pré consulta deita com sucesso!.\n");
    	 System.out.println();
     }
}