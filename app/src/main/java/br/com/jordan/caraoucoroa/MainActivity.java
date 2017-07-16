package br.com.jordan.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton ibJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibJogar = (ImageButton) findViewById(R.id.ibJogar);
        ibJogar.setOnClickListener(listenerJogar);
    }

    private View.OnClickListener listenerJogar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Random random = new Random();
            int moeda = random.nextInt(2);
            Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
            intent.putExtra("moeda", moeda);
            startActivity(intent);
        }
    };
}
