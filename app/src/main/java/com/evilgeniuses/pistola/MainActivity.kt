/**
 * @Developer:  Juan Camilo Peña Vahos
 * @LastUpdate: 02/07/2018
 *
 * TODO:    Hacer las políticas de la aplicación
 * TODO:    Logo de la aplicación
 * TODO:    Cambiar la fuente de la aplicación?
 */

package com.evilgeniuses.pistola

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, IniciarSesionActivity::class.java);
        startActivity(intent);

    }
}
