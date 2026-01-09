import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControleFinanceiro controle = new ControleFinanceiro();
        int opcao;

        do {
            System.out.println("\n=== CONTROLE FINANCEIRO ===");
            System.out.println("1 - Adicionar receita");
            System.out.println("2 - Adicionar despesa");
            System.out.println("3 - Listar movimentações");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Descrição da receita: ");
                String desc = sc.nextLine();

                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                controle.adicionarMovimentacao(
                    new Movimentacao(desc, valor, "RECEITA")
                );

                System.out.println("Receita adicionada!");

            } else if (opcao == 2) {
                System.out.print("Descrição da despesa: ");
                String desc = sc.nextLine();

                System.out.print("Valor: ");
                double valor = sc.nextDouble();
                sc.nextLine();

                controle.adicionarMovimentacao(
                    new Movimentacao(desc, valor, "DESPESA")
                );

                System.out.println("Despesa adicionada!");

            } else if (opcao == 3) {
                controle.listarMovimentacoes();

            } else if (opcao == 4) {
                System.out.println("Saldo atual: R$ " + controle.calcularSaldo());
            }

        } while (opcao != 0);

        sc.close();
        System.out.println("Sistema finalizado.");
    }
}
