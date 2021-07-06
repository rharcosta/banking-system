package sistemabancario;

import javax.swing.JOptionPane;

public class conta {

    private int numero;
    private double saldo, limite = 500, pagamento = 2000;

    //Só vai devolver o valor
    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo atual = R$" + saldo + "\nSaldo com limite = R$" + (saldo + limite));
    }

    //Pedir uma entrada
    public boolean sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            return true;
        } else {
            //Saldo insuficiente
            return false;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(conta c2, double valor) {
        if (sacar(valor) == true) {
            c2.depositar(valor);
            System.out.println("Saldo conta 2 = " + c2.saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        }
    }

    public void pagamento(conta c2, double valor) {
        if (valor <= (saldo + limite) && valor <= pagamento) {
            sacar(valor);
            c2.depositar(valor);
            JOptionPane.showMessageDialog(null, "Pagamento concluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Pagamento não autorizado!");
        }
    }
}
