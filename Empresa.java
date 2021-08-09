/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Empresa.java 587 2008-04-30 16:37:44Z f-vela $
 * Universidad Ean (Bogotá - Colombia)
 * Programa de Ingeniería de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Bloque de Estudios: Desarrollo de Software
 * Ejercicio: Feria Empresarial
 * Adaptado de: Proyecto CUPI2 - UNIANDES
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package universidadean.feriaempresarial.mundo;

/**
 * Clase que modela una empresa
 */
public class Empresa {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Tipo de empresa visitante
     */
    public static String VISITANTE = "Visitante";

    /**
     * Tipo de empresa expositora
     */
    public static String EXPOSITORA = "Expositora";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre de la empresa
     */
    private String nombre;

    /**
     * Tipo de empresa
     */
    private String tipo;

    /**
     * Número de personas de la empresa
     */
    private int numeroPersonasAsistentes;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor de la empresa con parámetros<br>
     * <b>post: </b>Se creó un objeto empresa con los valores ingresados por parámetro<br>
     * @param nNombre Nombre de la empresa. nNombre != null, nNombre != ""
     * @param nTipo Tipo de la empresa. Debe pertenecer a uno de los valores de las constantes de la clase
     * @param nNumeroPersonasAsistentes Número de personas de la empresa
     */
    public Empresa(String nNombre, String nTipo, int nNumeroPersonasAsistentes) {
        nombre = nNombre;
        tipo = nTipo;
        numeroPersonasAsistentes = nNumeroPersonasAsistentes;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre de la empresa<br>
     * <b>post: </b>Se retornó el nombre de la empresa. Nombre != null, Nombre != ""<br>
     * @return Nombre de la empresa
     */
    public String darNombre() {
        return nombre;
    }

    /**
     * Retorna el tipo de la empresa<br>
     * <b>post: </b>Se retornó el tipo de la empresa. tipo != null, tipo != ""<br>
     * @return Tipo de la empresa
     */
    public String darTipo() {
        return tipo;
    }

    /**
     * Retorna el número de personas de la empresa<br>
     * <b>post: </b>Se retornó el número de personas de la empresa. Número mayor a cero<br>
     * @return Número de personas de la empresa
     */
    public int darNumeroPersonasAsistentes() {
        return numeroPersonasAsistentes;
    }

}
