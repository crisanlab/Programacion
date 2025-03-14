package modelo;

import java.time.LocalDate;

public class CuentaBancaria {
	private double saldo;
	private LocalDate fechaApertura;
	private int id;
	private String iban;
	private Cliente clienteTitular;
	private Cliente clienteAutorizado;
	private static int contador;
	
	public CuentaBancaria(double saldo, LocalDate fechaApertura, String iban, Cliente clienteTitular,
			Cliente clienteAutorizado) {
		super();
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.id = contador +1;
		this.iban = iban;
		this.clienteTitular = clienteTitular;
		this.clienteAutorizado = clienteAutorizado;
		contador=contador+1;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected LocalDate getFechaApertura() {
		return fechaApertura;
	}

	protected void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getIban() {
		return iban;
	}

	protected void setIban(String iban) {
		this.iban = iban;
	}

	protected Cliente getClienteTitular() {
		return clienteTitular;
	}

	protected void setClienteTitular(Cliente clienteTitular) {
		this.clienteTitular = clienteTitular;
	}

	protected Cliente getClienteAutorizado() {
		return clienteAutorizado;
	}

	protected void setClienteAutorizado(Cliente clienteAutorizado) {
		this.clienteAutorizado = clienteAutorizado;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		CuentaBancaria.contador = contador;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", fechaApertura=" + fechaApertura + ", id=" + id + ", iban=" + iban
				+ ", clienteTitular=" + clienteTitular + ", clienteAutorizado=" + clienteAutorizado + "]";
	}

	
	

}
