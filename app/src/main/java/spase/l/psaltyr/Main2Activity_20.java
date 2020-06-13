package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main2Activity_20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_20);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_20);
    }
}
