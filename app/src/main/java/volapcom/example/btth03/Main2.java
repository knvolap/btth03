package volapcom.example.btth03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2  extends AppCompatActivity{
        Button btBack ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
            btBack=(Button)findViewById(R.id.btBack);
            btBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent Dis1=new Intent(Main2.this,MainActivity.class);
                    startActivity(Dis1);
                }
            });
        }
    }

