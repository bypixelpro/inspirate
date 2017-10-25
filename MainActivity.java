package es.pixelpro.david.inspirat;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //En el segundo paso, nos cargamos la clase frasesLibreria, lo hacemos aqui para no instanciar cada vez que se llame, que es lo que sucederia en el btn
    private frasesLibreria nuestrasFrases = new frasesLibreria();
    private coloresLibreria randomColor = new coloresLibreria();

    //Declaramos las variables
    private TextView fraseTextView;
    private Button verFrasetButton;
    //Modificamos el fondo del layout
    private ConstraintLayout miLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Asignación de las vistas a sus variables
        fraseTextView = (TextView) findViewById(R.id.fraseInspiraT);
        verFrasetButton = (Button) findViewById(R.id.btnFrase);
        miLayout = (ConstraintLayout) findViewById(R.id.miLayout);


        verFrasetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Estos metodos vienen de java, donde todas las clases, de forma directa o indirecta extienden la clase del objeto
                String frase = nuestrasFrases.obtenerFrases();
                int colorFondo = randomColor.obtenerColores();

                // Muestra la frase en pantalla
                fraseTextView.setText(frase);
                miLayout.setBackgroundColor(colorFondo);
                verFrasetButton.setTextColor(colorFondo);

            }
        });




    }
}
