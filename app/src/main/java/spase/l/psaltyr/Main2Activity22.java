package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity22 extends AppCompatActivity {
    private TextView textVactivity_22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main222);
        textVactivity_22 = (TextView) findViewById(R.id.textView_22_id);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_22);
    }
}
