package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity_1 extends AppCompatActivity {
private TextView textVactivity_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_1);

        textVactivity_1 = (TextView) findViewById(R.id.textViewBefore_id);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_1);


    }
}
