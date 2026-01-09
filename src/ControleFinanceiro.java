import java.util.ArrayList;

public class ControleFinanceiro {

    private ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

    public void adicionarMovimentacao(Movimentacao mov) {
        movimentacoes.add(mov);
    }

    public void listarMovimentacoes() {
        if (movimentacoes.isEmpty()) {
            System.out.println("Nenhuma movimentação registrada.");
        } else {
            for (Movimentacao m : movimentacoes) {
                System.out.println(
                    m.getTipo() + " | " +
                    m.getDescricao() + " | R$ " +
                    m.getValor()
                );
            }
        }
    }

    public double calcularSaldo() {
        double saldo = 0;

        for (Movimentacao m : movimentacoes) {
            if (m.getTipo().equalsIgnoreCase("RECEITA")) {
                saldo += m.getValor();
            } else {
                saldo -= m.getValor();
            }
        }
        return saldo;
    }
}
