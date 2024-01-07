package com.vedruna.martinezpalaciose01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityLogin extends AppCompatActivity {
    // VARIABLES
    private TextView user;
    private TextView pass;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicializar las variables
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        message = findViewById(R.id.message);
    }

    public void login(View view) {
        // Obtener el usuario y la contraseña ingresados
        String usuario = user.getText().toString();
        String password = pass.getText().toString();

        // Verificar si el usuario y la contraseña son "admin"
        if (usuario.equals("admin") && password.equals("admin")) {
            message.setVisibility(View.VISIBLE);
            message.setText("Usuario y contraseña correctos");

            // Intent para pasar a la segunda ventana
            Intent intent = new Intent(this, MainActivity.class);

            // Iniciar la segunda ventana y finalizar la primera
            startActivity(intent);
            finish();
        } else {
            // Mensajes de error
            message.setVisibility(view.VISIBLE);
            message.setText("Usuario o contraseña incorrectos");
        }
    }
}