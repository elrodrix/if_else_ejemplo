package com.example.usuario.if_else;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.beans.IndexedPropertyChangeEvent;


public class MainActivity extends ActionBarActivity {

    EditText et;
    Button btnAccion;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.etedad);
        btnAccion = (Button) findViewById(R.id.baccion);
        tv = (TextView) findViewById(R.id.tvedad);

        btnAccion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String aux = et.getText().toString();

                if (!aux.isEmpty()){
                    //Toast.makeText(getApplicationContext(), "Ingrese VALOR", Toast.LENGTH_SHORT).show();
                    int auxEntero = 0;
                    try{
                        auxEntero = Integer.parseInt(aux);
                        if (auxEntero > 18){
                            tv.setText("Es MAYOR de edad");
                        }else{
                            tv.setText("Es MENOR de edad");
                        }
                    }catch (Exception e){
                        Toast.makeText(getApplicationContext(), "Ingrese valor NUMERICO", Toast.LENGTH_SHORT).show();
                        et.setText("");
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Ingrese un VALOR", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
