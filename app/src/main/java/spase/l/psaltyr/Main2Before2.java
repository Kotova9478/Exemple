package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Before2 extends AppCompatActivity {
private TextView textViewbefore2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_before2);

        textViewbefore2 = (TextView)findViewById(R.id.textV_before2_id);
        textViewbefore2.setText(R.string.string_before2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_before2);

    }
}
