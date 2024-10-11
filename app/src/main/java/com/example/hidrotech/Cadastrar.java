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

public class Cadastrar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastrar);

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
                Intent intent = new Intent(Cadastrar.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza a Activity atual para limpar a pilha
            }
        });

        // Configurar o botão de cadastro (btnCadastrar)
        Button btnCadastrar = findViewById(R.id.btn_register);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para navegar para a próxima página (pode ser uma página de confirmação de cadastro, por exemplo)
                Intent intent = new Intent(Cadastrar.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza a Activity atual após a navegação
            }
        });
    }
}
