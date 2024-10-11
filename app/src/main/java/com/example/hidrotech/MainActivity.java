package com.example.hidrotech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ajustar o padding para as barras de sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (view, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar o botão para navegar para a Medidas
        Button btnLogin = findViewById(R.id.login_button); // ID do botão de login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para navegar para a Medidas
                Intent intentToMedidas = new Intent(MainActivity.this, Medidas.class);
                startActivity(intentToMedidas); // Inicia a nova Activity
                finish();
            }
        });

        // Configurar o TextView para navegar para a Cadastrar
        TextView registerLink = findViewById(R.id.register_link); // ID do TextView de registro
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para navegar para a Cadastrar
                Intent intentToCadastrar = new Intent(MainActivity.this, Cadastrar.class);
                startActivity(intentToCadastrar); // Inicia a nova Activity
                finish();
            }
        });
    }
}
