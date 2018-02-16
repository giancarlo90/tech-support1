import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList <String> respuestas;
    private HashMap<String, String> respuestasConClave;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestasConClave = new HashMap<>();
        respuestasConClave.put("lento","Pruebe a desfragmentar el disco");
        respuestasConClave.put("movil","Nuestro sistema solo es apto para ordenadores");
        respuestasConClave.put("conexion","Compruebe que el cable de internet este conectado");
        respuestasConClave.put("reparacion","Contacte con nosotros a traves de nuestro numero de telefono");
        respuestasPredeterminadas();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> respuestaUsuario)
    {
        String response = null;
        Iterator<String> iterator = respuestaUsuario.iterator(); 
        String respuestaUsuarioString = iterator.next(); 
        response = respuestasConClave.get(respuestaUsuarioString);
        return (response == null) ? respuestas.get(aleatorio.nextInt(respuestas.size())) : response;
    }

    private void respuestasPredeterminadas()
    {
        respuestas.add("Eso suena interesante. Cuentame mas...");
        respuestas.add("Hablame acerca de tu consulta...");
        respuestas.add("Veamos como podria ayudarte...");
        respuestas.add("Cuentame acerca del motivo de tu llamada...");
        respuestas.add("Veamos como puedo ayudarte...");
    }
}
