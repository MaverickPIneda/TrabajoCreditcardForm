package cl.santotomas.creditcardform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button mActivityBtn;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActivityBtn = (Button) findViewById(R.id.botonGuardar);

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