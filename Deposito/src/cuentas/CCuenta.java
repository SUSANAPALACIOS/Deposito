package cuentas;

/**
 * Clase que sirve para operar con una cuenta, ver su estado, ingresar o retirar una cantidad.
 * @version 1.0
 * @since 1.0
 * @author Susana Palacios
 */
public class CCuenta {

	private String nombre;
	
	/**
	 * Devuelve el nombre del titular de la cuenta
	 * @return nombre del titular
	 */
    public String getNombre() {
		return nombre;
	}

    /**
     * Modifica el valor del nombre del titular de la cuenta
     * @param nombre del titular
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el número de la cuenta
	 * @return número de la cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Modifica el valor del número de la cuenta
	 * @param cuenta número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el saldo de la cuenta
	 * @return saldo en cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Modifica el saldo de la cuenta
	 * @param saldo en cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el tipo de interés de la cuenta
	 * @return tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Modifica el tipo de interés de la cuenta
	 * @param tipoInteres cuenta
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor que nos devuelve un objeto tipo CCuenta sin inicializar sus atributos.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa el objeto CCuenta con los atributos recibidos como parámetros.
     * @param nom nombre del titular de la cuenta
     * @param cue número de la cuenta
     * @param sal saldo de la cuenta 
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return el saldo en cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que permite ingresar una cantidad de dinero mayor que 0, 
     * si intenta ingresar una cantidad igual o inferior a 0 se producirá un error.
     * @param cantidad dinero a ingresar en cuenta
     * @throws Exception si la cantidad es igual o inferior a 0.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método que permite retirar una cantidad de dinero igual o mayor que 0, 
     * si intenta retirar una cantidad inferior a 0 se producirá un error,
     * si el saldo es mayor a la cantidad que se quiere retirar.
     * @param cantidad de dinero a retirar de la cuenta
     * @throws Exception si la cantidad a retirar es inferior a 0 
     * o si la cantidad a retirar es mayor que el saldo en cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
