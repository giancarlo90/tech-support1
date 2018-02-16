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
    private HashMap<HashSet<String>, String> respuestasConClave;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestasConClave = new HashMap<>();
        HashSet<String> set01 = new HashSet<>();
        set01.add("muy");
        set01.add("lento");
        HashSet<String> set02 = new HashSet<>();
        set02.add("muy");
        HashSet<String> set03 = new HashSet<>();
        set03.add("lento");
        HashSet<String> set04 = new HashSet<>();
        set04.add("necesita");
        set04.add("una");
        set04.add("reparacion");
        respuestasConClave.put(set01,"Pruebe a desfragmentar el disco");
        respuestasConClave.put(set02,"Podria especificar mejor?");
        respuestasConClave.put(set03,"La velocidad es muy relativa");
        respuestasConClave.put(set04,"Contacte con nosotros a traves de nuestro numero de telefono");
        respuestasPredeterminadas();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> respuestaUsuario)
    {
        String response = null;
        response = respuestasConClave.get(respuestaUsuario);
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
