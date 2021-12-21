package Mover_Practica;

/**
 * 
 * @author Juan Carlos Ruiz
 * @version 1.0
 * @since 03/12/2021
 *
 */
public class CuentaCorriente implements InterfazCC {
	private static final int ZERO = 0;
	/**
	 * Definimos nombre
	 */
	protected String nombre;
	/**
	 * Definimos Cuenta
	 */
	private String cuenta;
	/**
	 * Definimos Saldo
	 */
	private double saldo;
	/**
	 * Definimos Tipo de Interes
	 */
	private double tipoInteres;

	public CuentaCorriente() {
	}

	/**
	 * Podemos ver todos los datos de la cuenta
	 * 
	 * @param nom  Nombre de la cuenta
	 * @param cue  La cuenta que tienes(Nº o nombre)
	 * @param sal  El saldo que tiene la cuenta
	 * @param tipo El tipo de interes de la cuenta (cuenta ahorro...)
	 */
	public CuentaCorriente(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	/**
	 * Asignas un nombre a Cuenta
	 * 
	 * @param nom Nombre de la cuenta
	 */
	@Override
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	/**
	 * Devuelve el nombre de la cuenta
	 * 
	 * @return Devuelve Nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * Te dice la cantidad de dinero que tienes en Cuenta
	 * 
	 * @return Devuelve el valor de Saldo
	 */
	@Override
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Sirve para ingresar dinero en Cuenta
	 * 
	 * @param cantidad Cuanto dinero queremos ingresar
	 * @throws Exception En caso de que quieras ingrear dinero en "negativo" no te
	 *                   dejara
	 */
	@Override
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Sirve para retirar dinero de Cuenta
	 * 
	 * @param cantidad Cuanto se retira
	 * @throws Exception En caso de que no haya suficiente dinero o quieras retirar
	 *                   dinero en "negativo" no te dejara
	 */
	@Override
	public void retirar(double cantidad) throws Exception {
		if (cantidad < ZERO) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (getSaldo() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	/**
	 * Creas una cuenta nueva
	 * 
	 * @return Devuelve una cuenta
	 */
	@Override
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Selecciona Cuenta
	 * 
	 * @param cuenta Selecciona la cuenta actual
	 */
	@Override
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Selecciona Saldo
	 * 
	 * @param saldo Selecciona el saldo actual de Cuenta
	 */
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Da el tipo de interes de la cuenta
	 * 
	 * @return Devuelve el tipo de interes
	 */
	@Override
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Selecciona el tipo de interes
	 * 
	 * @param tipoInteres selecciona el tipo de interes actual
	 */
	@Override
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
