package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity_2 extends AppCompatActivity {
    private TextView activity_main2_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_2);

        activity_main2_2  = (TextView) findViewById(R.id.text_view2_id);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_2);
    }
}
