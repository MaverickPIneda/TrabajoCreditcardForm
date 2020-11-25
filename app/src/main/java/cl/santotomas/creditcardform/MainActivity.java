package cl.santotomas.creditcardform;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    private Button mActivityBtn;
    private EditText texto;
    private Button Registrar;
    private EditText nombre;
    private EditText apellido;
    private EditText cardNumber;
    private EditText mesID;
    private EditText añoID;
    private EditText calle;
    private EditText ciudad;
    private EditText codigo;
    private EditText codigopostal;
    private EditText estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nombre = findViewById(R.id.NombreID);
        this.apellido = findViewById(R.id.ApellidoID);
        this.cardNumber = findViewById(R.id.CardNumberID);
        this.mesID = findViewById(R.id.MesID);
        this.añoID = findViewById(R.id.AñoID);
        this.calle = findViewById(R.id.CalleYNumeroID);
        this.ciudad = findViewById(R.id.CiudadID);
        this.codigo = findViewById(R.id.CodigoCardID);
        this.codigopostal = findViewById(R.id.CodigoPostalID);
        this.estado = findViewById(R.id.EstadoID);

        Registrar = (Button) findViewById(R.id.botonR);
        nombre = (EditText) findViewById(R.id.NombreID);
        mActivityBtn = (Button) findViewById(R.id.botonGuardar);

        Log.i(TAG, "Funcion oncreate");
        Toast.makeText(this, "Dentro del onCreate", Toast.LENGTH_LONG).show(); // Notificacion del ususario

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.botonR:
                        Intent registroIntent = new Intent(MainActivity.this, Registro.class);
                        startActivity(registroIntent);
                        break;
                }
            }
        });

        mActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                texto = (EditText) findViewById(R.id.NombreID);
                intent.putExtra("nombreTitular",texto.getText().toString());
                texto = (EditText) findViewById(R.id.ApellidoID);
                intent.putExtra("apellidoTitular",texto.getText().toString());
                texto = (EditText) findViewById(R.id.CardNumberID);
                intent.putExtra("numeroTarjeta",texto.getText().toString());
                texto = (EditText) findViewById(R.id.MesID);
                intent.putExtra("mesCard",texto.getText().toString());
                texto = (EditText) findViewById(R.id.AñoID);
                intent.putExtra("añoCard",texto.getText().toString());
                startActivity(intent);


            }
        });
    }
}