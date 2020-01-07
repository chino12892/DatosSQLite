package bamr.itics.tesoem.edu.datossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregar(View v){
        Intent pantalla = new Intent(this,AgregarActivity.class);
        startActivity(pantalla);
        finish();
    }
}
