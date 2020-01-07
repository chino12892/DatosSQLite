package bamr.itics.tesoem.edu.datossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import bamr.itics.tesoem.edu.datossqlite.BaseDatos.DatosConexion;

public class AgregarActivity extends AppCompatActivity {

    EditText nombre,edad,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        nombre = findViewById(R.id.txtnombre);
        edad = findViewById(R.id.txtedad);
        correo = findViewById(R.id.txtcorreo);

    }

    public void registrar(View v){
        ContentValues contentValues = new ContentValues();
        DatosConexion datosConexion = new DatosConexion(this);
        datosConexion.open();

        contentValues.put("Nombre",nombre.getText().toString());
        contentValues.put("Edad",edad.getText().toString());
        contentValues.put("Correo",correo.getText().toString());

        if (datosConexion.insertar(contentValues)){
            Toast.makeText(this,"Se agrego el dato...",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"No se puede registrar...",Toast.LENGTH_SHORT).show();
        }
        datosConexion.close();
    }

    public  void regresar(View v){
        Intent pantalla = new Intent(this,MainActivity.class);
        startActivity(pantalla);
        finish();
    }
}
