package banking;

/**
 *Represneta uma conta corrente e poupança para um cliente.
 * @author julianapinto
 *
 */
public class BankAccount {

    //instancia variáveis

    /**
     * Tipo de conta (corrente/poupança)
     */
    String accountType;

    /**
     * Saldo para conta bancária.
     */
    double balance;

    /**
     * Cliente para essa conta.
     */
    Cliente cliente;

    //construtor

    /**
     * Cria uma conta bancária de determinado tipo para determinado cliente.
     * @param accountType para conta bancária
     * @param cliente para conta bancária
     */
    public BankAccount(String accountType, Cliente cliente) {
        this.accountType = accountType;
        this.cliente = cliente;

    }


    //Metodos

    /**
     * Deposita a quantia indicada
     * @param amount to add to balance
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Retira o valor dado do saldo.
     * @param amount para retirada
     * @throws Exception se o valor fornecido for maior que o saldo disponível
     */
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("O valor é maior que o saldo disponível.");
        }
        this.balance -= amount;
    }

    /**
     * Retorna tipo de conta e saldo
     * @return string com todas as informações
     */
    public String getAccountInfo() {
        return this.accountType + ": " + this.balance;
    }

    /**
     * Retorna o nome e o endereço do cliente para esta conta bancária
     * @return string com todas as informações
     */
    public String getCustomerInfo() {
        return this.cliente.getName() + " de " + this.cliente.getEndereco();
    }






}