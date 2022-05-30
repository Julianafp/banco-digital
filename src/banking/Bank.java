package banking;

import java.util.Scanner;

/**
 *
 *
 * @author julianapinto
 */
public class Bank {

    public static void main(String[] args) {

        //Cria uma nova instância da classe banco
        Bank bank = new Bank();

        //Chama o método run na classe banco
        bank.run();

    }
    /**
     * Executa o programa inicializando e gerenciando contas bancárias
     * e clientes.
     */
    public void run() {
        System.out.println("Bem vindo ao Banco! Qual o seu nome? ");

        //implementa a entrada de dados atraves do teclado
        Scanner scanner = new Scanner(System.in);

        //obtém a próxima palavra que no caso é o nome do cliente
        String nome = scanner.next();

        System.out.println("Olá " + nome + " Estamos criando conta corrente e poupança para você.");

        //Cria cliente com nome
        Cliente cliente = new Cliente (nome);

        //obtem endereço do cliente
        System.out.println("Qual o seu endereço?");

        //obtém a próxima palavra que é o endereço do cliente
        String endereco = scanner.next();

        //Define o endereço do cliente
        cliente.setEndereco(endereco);

        //Cria uma conta corrente para o cliente
        BankAccount checkingAccount = new BankAccount("conta corrente", cliente);

        //Cria uma conta poupança para o cliente
        BankAccount savingsAccount = new BankAccount("poupança", cliente);

        //Obtém e imprime as informaçÕes do cliente associadas a conta corrente
        System.out.println();
        System.out.println("Informações do Cliente: ");
        System.out.println(checkingAccount.getCustomerInfo());

        //obtém e imrpime informações para checagem da conta
        System.out.println("Saldo "+ checkingAccount.getAccountInfo());
        System.out.println("Saldo " + savingsAccount.getAccountInfo());

        //Depósitos

        //verificação dos depositos
        System.out.println("Valor de depósito na conta corrente?"); //linha em branco
        double amount = scanner.nextDouble(); //obter próximo dado (double)
        checkingAccount.deposit(amount); //deposito em conta corrente

        //Conta Poupança
        System.out.println(); //linha em branco
        System.out.println("Qual o valor para deposíto em sua conta poupança?");
        amount = scanner.nextDouble(); //obter próximo dado (double)
        savingsAccount.deposit(amount); //depositar em conta corrente

        //imprime os novos saldos
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        //Saques

        //conta corrente
        System.out.println(); //linha em branco
        System.out.println("Qual valor gostaria de sacar de sua conta corrente?");
        amount = scanner.nextDouble(); //obter próximo dado (double)
        //bloco de try catch para tratar o erro no caso da conta não ter saldo suficiente
        try {
            checkingAccount.withdraw(amount);
        } catch (Exception e) {
            //imprime mensagem de erro personalizada do método de retirada
            System.out.println(e.getMessage());
        }

        //da poupança
        System.out.println(); //linha em branco
        System.out.println("Qual valor gostaria de sacar de sua conta poupança?");
        amount = scanner.nextDouble(); //obter o próximo dado (double)

        try {
            savingsAccount.withdraw(amount);//retirar da poupança
        } catch (Exception e) {
            //imprime mensagem de erro personalizada do método de retirada
            System.out.println(e.getMessage());
        }

        //imprime novos saldos
        System.out.println(checkingAccount.getAccountInfo());
        System.out.println(savingsAccount.getAccountInfo());

        scanner.close();

    }

}