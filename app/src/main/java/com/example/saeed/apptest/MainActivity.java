package com.example.saeed.apptest;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.btn_showmore)
    Button button;

    @BindView(R.id.tvSongDes)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // button.setOnClickListener(new btnclicklistener());

        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {


      /*  if (button.getText().toString().equalsIgnoreCase("Showmore...")) {
            textView.setMaxLines(Integer.MAX_VALUE);//your TextView
            button.setText("Showless");
        } else {
            textView.setMaxLines(3);//your TextView
            button.setText("Showmore...");
        }*/
   if (button.getText().toString().equalsIgnoreCase("Showmore...")) {
       ObjectAnimator animation = ObjectAnimator.ofInt(textView, "maxLines", 40);
       animation.setDuration(1000).start();
            button.setText("Showless");
        } else {
       ObjectAnimator animation = ObjectAnimator.ofInt(textView, "maxLines", 3);
       animation.setDuration(500).start();
            button.setText("Showmore...");
        }

    }


    private class btnclicklistener implements View.OnClickListener {
        @Override
        public void onClick(View view) {


        }
    }
}
