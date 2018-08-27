/**
 * @Developer:  Juan Camilo Peña Vahos
 * @LastUpdate: 02/07/2018
 *
 * TODO:    Olvidé la contraseña
 *
 */

package com.evilgeniuses.pistola

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IniciarSesionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        var EEmail          = findViewById(R.id.EEmail) as EditText;
        var EPassword       = findViewById(R.id.EPassword) as EditText;
        var BIniciarSesion  = findViewById(R.id.BIniciarSesion) as Button;
        var BRegistrarse    = findViewById(R.id.BRegistrase)as Button;



    }


}
