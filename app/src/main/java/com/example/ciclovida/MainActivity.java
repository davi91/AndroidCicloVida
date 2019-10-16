package com.example.ciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView saludoText;
    private int firstTime;
    private long mils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludoText = findViewById(R.id.saludoText);

        // Obtenemos la primera instancia
        firstTime = Calendar.getInstance().get(Calendar.SECOND);
        mils = Calendar.getInstance().get(Calendar.MILLISECOND);

        Log.d("infoActivity", "Creating: " +  (Calendar.getInstance().get(Calendar.SECOND) - firstTime) + " seg") ;
        Log.d("infoActivity", "Creating(ms): " +  (Calendar.getInstance().get(Calendar.MILLISECOND) - mils) + " ms") ;

        Toast msg = Toast.makeText(getApplicationContext(),Calendar.getInstance().getTime().toString(), Toast.LENGTH_SHORT);
        msg.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("infoActivity", "Starting: " +  (Calendar.getInstance().get(Calendar.SECOND) - firstTime) + " seg") ;
        Log.d("infoActivity", "Starting(ms): " +  (Calendar.getInstance().get(Calendar.MILLISECOND) - mils) + " ms") ;

        Toast msg = Toast.makeText(getApplicationContext(),Calendar.getInstance().getTime().toString(), Toast.LENGTH_SHORT);
        msg.show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("infoActivity", "Resume: " +   (Calendar.getInstance().get(Calendar.SECOND) - firstTime) + " seg") ;
        Log.d("infoActivity", "Resume(ms): " +  (Calendar.getInstance().get(Calendar.MILLISECOND) - mils) + " ms") ;
        saludoText.setText(R.string.saludo);

        Toast msg = Toast.makeText(getApplicationContext(),Calendar.getInstance().getTime().toString(), Toast.LENGTH_SHORT);
        msg.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("infoActivity", "Pause: " +   (Calendar.getInstance().get(Calendar.SECOND) - firstTime) + " seg") ;
        Log.d("infoActivity", "Pause(ms): " +  (Calendar.getInstance().get(Calendar.MILLISECOND) - mils) + " ms") ;

        Toast msg = Toast.makeText(getApplicationContext(),Calendar.getInstance().getTime().toString(), Toast.LENGTH_SHORT);
        msg.show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("infoActivity", "Stopping: " +   (Calendar.getInstance().get(Calendar.SECOND) - firstTime) + " seg") ;
        Log.d("infoActivity", "Stopping(ms): " +  (Calendar.getInstance().get(Calendar.MILLISECOND) - mils) + " ms") ;
        saludoText.setText(R.string.despedida);

        Toast msg = Toast.makeText(getApplicationContext(),Calendar.getInstance().getTime().toString(), Toast.LENGTH_SHORT);
        msg.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("infoActivity", "Destroying: " +  (Calendar.getInstance().get(Calendar.SECOND) - firstTime) + " seg") ;
        Log.d("infoActivity", "Destroying(ms): " +  (Calendar.getInstance().get(Calendar.MILLISECOND) - mils) + " ms") ;

        Toast msg = Toast.makeText(getApplicationContext(),Calendar.getInstance().getTime().toString(), Toast.LENGTH_SHORT);
        msg.show();
    }
}
