package eu.fse.instantapptest.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button clicca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clicca = findViewById(R.id.bottone);

        clicca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSecond = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(openSecond);
            }
        });

    }
}