package banking;

/**
 * Representa o cliente de um banco
 * @author julianapinto
 *
 */
public class Cliente {
	
	//instancia variáveis
	
	/**
	 * Nome do cliente
	 */
	String name;
	
	/**
	 * Endereço do cliente.
	 */
	String endereco;
	
	//construtor da classe
	
	/**
	 * Cria um cliente com o nome fornecido.
	 * @param name do cliente
	 */
	public Cliente(String name) {
		//define a instãncia com o nome do cliente
		this.name = name;
	}
	
	//metodos
	
	/**
	 * Define o endereço do cliente
	 * @param address do cliente
	 */
	public void setEndereco(String address) {
		this.endereco = address;
	}
	
	/**
	 * Retorna o nome do cliente.
	 * @return nome do cliente
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * retorna o endereço do cliente.
	 * @return endereço do cliente
	 */
	public String getEndereco() {
		return this.endereco;
	}
	
	
	
	

}
