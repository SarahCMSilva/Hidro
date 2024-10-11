package com.example.hidrotech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Medidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medidas);

        // Ajustar o padding para as barras de sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar o clique no back_button (ícone de voltar)
        ImageView backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para navegar para a MainActivity
                Intent intent = new Intent(Medidas.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza a Activity atual para limpar a pilha
            }
        });

        // Configurar o botão de confirmação para navegar para Componetes
        Button btnConfirm = findViewById(R.id.btn_confirm); // ID do botão de confirmação
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent para navegar para Componetes
                Intent intentToComponetes = new Intent(Medidas.this, Componetes.class);
                startActivity(intentToComponetes);
                finish(); // Finaliza a Activity atual após a navegação
            }
        });
    }
}
