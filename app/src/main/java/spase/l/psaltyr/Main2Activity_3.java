package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity_3 extends AppCompatActivity {
private TextView activity_main2_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_3);

        activity_main2_3 = (TextView) findViewById(R.id.text_view2_id);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_3);
    }
}
