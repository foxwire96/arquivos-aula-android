package rj.senac.sharedpreference2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nome, idade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setwidth();
    }

    private void setwidth() {
        nome = findViewById(R.id.EditTextName);
        idade = findViewById(R.id.EditTextIdade);
    }
    private void Salvar() {

    }
}