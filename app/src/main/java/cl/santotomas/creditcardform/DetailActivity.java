package cl.santotomas.creditcardform;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView datosCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        recibirDatos();
    }
    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("nombreTitular");
        String d2 = extras.getString("apellidoTitular");
        String d3 = extras.getString("numeroTarjeta");
        String d4 = extras.getString("mesCard");
        String d5 = extras.getString("añoCard");

        datosCard = (TextView) findViewById(R.id.datosCard);
        datosCard.setText(d1+" "+d2);
        datosCard = (TextView) findViewById(R.id.numeroCard);
        datosCard.setText(d3);
        datosCard = (TextView) findViewById(R.id.mesañoCard);
        datosCard.setText(d4+"/"+d5);
    }
}