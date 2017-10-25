package es.pixelpro.david.inspirat;

import java.util.Random;

/**
 * Created by pixelpro on 23/9/17.
 */

public class frasesLibreria {
    String[] frases = {
            "La vida es como andar en bicicleta. Para tener equilibrio tienes que mantenerte en movimiento. - Albert Einstein",
            "El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. - Herman Cain",
            "Un negocio que no hace otra cosa más que dinero es un negocio pobre. – Henry Ford",
            "Los obstáculos no son más que un condimento del triunfo. - Mark Twain",
            "El mejor momento para plantar un árbol fue hace veinte años. El segundo mejor momento es hoy.",
            "Nuestra mayor gloria no está en no caer nunca, sino en levantarnos cada vez que caemos. - Confucio",
            "Cada hombre puede mejorar su vida mejorando su actitud. - Héctor Tassinari",
            "Pide y recibirás, busca y encontrarás; llama y se te abrirán las puertas.",
            "Si eres paciente en un momento de ira, escaparás a cien días de tristeza. - Proverbio chino.",
            "No hay camino para la verdad, la verdad es el camino. - Mahatma Gandhi" };

    public String obtenerFrases() {
        // El btn se ha pulsado, asi que actualizamos el textview con la frase
        // Seleccionamos una frase al azar
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(frases.length);
        return frases[randomNumber];
    }
}
