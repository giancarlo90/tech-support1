import java.util.ArrayList;
import java.util.Random;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestasPredeterminadas();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numero = aleatorio.nextInt(respuestas.size());
        return respuestas.get(numero);
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
