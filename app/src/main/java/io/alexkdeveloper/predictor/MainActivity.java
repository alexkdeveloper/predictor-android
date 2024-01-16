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

        array = new String[]{getString(R.string.it_is_certain), getString(R.string.it_is_decidedly_so), getString(R.string.without_a_doubt), getString(R.string.yes_definitely), getString(R.string.you_may_rely_on_it), getString(R.string.as_i_see_it_yes), getString(R.string.most_likely), getString(R.string.outlook_good), getString(R.string.yes),
                getString(R.string.signs_point_to_yes), getString(R.string.yep), getString(R.string.absolutely), getString(R.string.you_bet), getString(R.string.confirmed), getString(R.string.don_t_count_on_it), getString(R.string.my_reply_is_no), getString(R.string.my_sources_say_no), getString(R.string.outlook_not_so_good),
                getString(R.string.very_doubtful), getString(R.string.naw), getString(R.string.i_ve_got_a_bad_feeling_about_this), getString(R.string.reply_hazy_try_again), getString(R.string.ask_again_later), getString(R.string.better_not_tell_you_now), getString(R.string.cannot_predict_now),
                getString(R.string.concentrate_and_ask_again), getString(R.string.impossible_to_see_the_future_is), getString(R.string._404_answer_not_found)};

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