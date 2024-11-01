package rj.senac.fatorial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

            button.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        double num = Double.parseDouble(editText.getText().toString());
                        textView.setText(String.format(Locale.getDefault(), "%.0f", factorial(num)));
                    } catch (NumberFormatException e) {
                        textView.setText("Entrada inválida");
                    }
                }
            }));
        }
                private double factorial(double num) {
                    if (num < 2) {
                        return 1;
                    } else {
                        return num * factorial(num-1);
                    }
                }
            }


