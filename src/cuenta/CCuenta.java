package cuenta;

public class CCuenta {

    //Campos de la clase

        private String nombre;
        private String cuenta;
        private double saldo;
        private double tipoInterés;


    /**
     * Constructor por defecto
     *No tiene parámetros
     */
        public CCuenta() {

        }

    /**
     *Constructor
     * @param nom el nombre del dueño de la cuenta
     * @param cue el numero de cuenta
     * @param sal el salario de la cuenta
     * @param tipo de la cuenta
     */

        public CCuenta(String nom, String cue, double sal, double tipo) {
            setNombre(nom);
            setCuenta(cue);
            setSaldo(sal);
        }

    /**
     * Constructor
     * @param nom pedimos el valor de nombre que tendrá el propietario
     */
    public void asignarNombre(String nom) {
            setNombre(nom);
        }

    /**
     * Getter
     * @return nombre
     */
    public String obtenerNombre() {
            return getNombre();
        }

    /**
     * Getter
     * @return saldo
     */
    public double estado() {
            return getSaldo();
        }

    /**
     * Getter
     * @return cuenta
     */
    public String obtenerCuenta() {
            return getCuenta();
        }

    /**
     *Metodos de la clase CCuenta
     * @param cantidad para ingresar de la cuenta
     * @throws Exception si se cumple la condición muestra un mensaje
     */
    public void ingresar(double cantidad) throws Exception {
            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad);
        }

    /**
     * Metodos de la clase CCuenta
     * @param cantidad  para retirar de la cuenta
     * @throws Exception si se cumple la condición muestra un mensaje
     */
        public void retirar(double cantidad) throws Exception {
            if (cantidad <= 0)
                throw new Exception("No se puede retirar una cantidad negativa");
            if (estado() < cantidad)
                throw new Exception("No hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
        }

    /**
     * Getter
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre asigna un nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Getter
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter
     * @param cuenta asigna un numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter
     * @return saldo de la cuentas
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter
     * @param saldo asiga el saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter
     * @return tipoInteres que tiene la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter
     * @param tipoInterés para asignar el tipo de interes de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
