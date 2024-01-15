package io.alexkdeveloper.predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ProgressBar progress;

    String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        progress = findViewById(R.id.progress);

        array = new String[]{"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes—definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.",
                "Signs point to yes.", "Yep!", "Absolutely!", "You bet!", "Confirmed.", "Don’t count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.",
                "Very doubtful.", "Naw.", "I’ve got a bad feeling about this…", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.",
                "Concentrate and ask again.", "Impossible to see, the future is.", "404 Answer Not Found"};

        onButtonClicked(null);
    }
    public void onButtonClicked(View view) {
        text.setVisibility(View.INVISIBLE);
        progress.setVisibility(View.VISIBLE);

        new Handler().postDelayed(() -> {
            text.setVisibility(View.VISIBLE);
            progress.setVisibility(View.INVISIBLE);
        }, 2 * 1000);

        int rand = new Random().nextInt(28);

        if (rand < 14){
            text.setTextColor(Color.BLUE);
        } else if (rand < 21){
            text.setTextColor(Color.RED);
        } else {
            text.setTextColor(Color.GRAY);
        }

        text.setText(array[rand]);
    }
}