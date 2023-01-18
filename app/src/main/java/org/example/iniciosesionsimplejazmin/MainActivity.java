package org.example.iniciosesionsimplejazmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnIniciarSesion;
    EditText cuadroTextoUsuario, cuadroTextoClave;
    TextView etiquetaMensajeApp;

    String usuarioAutorizado = "jazmin", claveAutorizada = "jazmin9988";
    String usuarioTecleado = "", claveTecleada = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIniciarSesion = (Button) findViewById( R.id.btnIniciarSesion );
        cuadroTextoUsuario = (EditText) findViewById( R.id.cuadroTextoUsuario );
        cuadroTextoClave = (EditText) findViewById( R.id.cuadroTextoClave );
        etiquetaMensajeApp = (TextView) findViewById( R.id.etiquetaMensajeApp );

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = "";
                usuarioTecleado = cuadroTextoUsuario.getText().toString();
                claveTecleada = cuadroTextoClave.getText().toString();
                if( usuarioTecleado.equals( usuarioAutorizado ) && claveTecleada.equals( claveAutorizada )) {
                    // Inicio de Sesión CORRECTO (coincidendia de usuario y contrasenia)
                    // redirigir a la siguiente pantalla...
                    // por ahora SOLO MOSTRAR mensaje en pantalla
                    mensaje = "Usuario [" + usuarioTecleado + "] HA INICIADO SESIÓN CORRECTAMENTE.";
                }else{
                    // usuario y contrasenia NO COINCIDEN
                    // mostrar 'Mensaje de ERROR' en pantalla al usuario
                    mensaje = "ERROR: la contrasenia NO COINCIDE para el usuario [" + usuarioTecleado + "].";
                }
                etiquetaMensajeApp.setText( mensaje );
            }
        });
    }

}