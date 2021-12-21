package Mover_Practica;

public interface InterfazCC {

	/**
	 * Asignas un nombre a Cuenta
	 * 
	 * @param nom Nombre de la cuenta
	 */
	void asignarNombre(String nom);

	/**
	 * Devuelve el nombre de la cuenta
	 * 
	 * @return Devuelve Nombre
	 */
	String getNombre();

	/**
	 * Te dice la cantidad de dinero que tienes en Cuenta
	 * 
	 * @return Devuelve el valor de Saldo
	 */
	double getSaldo();

	/**
	 * Sirve para ingresar dinero en Cuenta
	 * 
	 * @param cantidad Cuanto dinero queremos ingresar
	 * @throws Exception En caso de que quieras ingrear dinero en "negativo" no te
	 *                   dejara
	 */
	void ingresar(double cantidad) throws Exception;

	/**
	 * Sirve para retirar dinero de Cuenta
	 * 
	 * @param cantidad Cuanto se retira
	 * @throws Exception En caso de que no haya suficiente dinero o quieras retirar
	 *                   dinero en "negativo" no te dejara
	 */
	void retirar(double cantidad) throws Exception;

	/**
	 * Creas una cuenta nueva
	 * 
	 * @return Devuelve una cuenta
	 */
	String getCuenta();

	/**
	 * Selecciona Cuenta
	 * 
	 * @param cuenta Selecciona la cuenta actual
	 */
	void setCuenta(String cuenta);

	/**
	 * Selecciona Saldo
	 * 
	 * @param saldo Selecciona el saldo actual de Cuenta
	 */
	void setSaldo(double saldo);

	/**
	 * Da el tipo de interes de la cuenta
	 * 
	 * @return Devuelve el tipo de interes
	 */
	double getTipoInteres();

	/**
	 * Selecciona el tipo de interes
	 * 
	 * @param tipoInteres selecciona el tipo de interes actual
	 */
	void setTipoInteres(double tipoInteres);

}