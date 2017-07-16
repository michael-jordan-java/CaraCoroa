package br.com.jordan.caraoucoroa;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {
    private ImageButton ibVoltar;
    private ImageView ivMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        ibVoltar = (ImageButton) findViewById(R.id.ibVoltar);
        ibVoltar.setOnClickListener(listenerVoltar);

        ivMoeda = (ImageView) findViewById(R.id.ivMoeda);

        int moeda = getIntent().getExtras().getInt("moeda");

        if(moeda == 0){
            ivMoeda.setImageResource(R.drawable.moeda_cara);
        }else{
            ivMoeda.setImageResource(R.drawable.moeda_coroa);
        }

    }

    private View.OnClickListener listenerVoltar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
