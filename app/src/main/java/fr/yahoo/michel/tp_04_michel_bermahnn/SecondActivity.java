package fr.yahoo.michel.tp_04_michel_bermahnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "MBDS_2021_SECONDACTIVITY";
    private Button buttonClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "La méthode onCreate est appelée");
        initViews_SA();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "La méthode onStart est appelée");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "La méthode onResume est appelée");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "La méthode onPause est appelée");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "La méthode onStop est appelée");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "La méthode onRestart est appelée");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "La méthode onStart est appelée");
    }

    private void initViews_SA(){
        buttonClose = findViewById(R.id.btn_fermer);

        buttonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    finish();

            }
        });

    }
}