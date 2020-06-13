package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity_before1 extends AppCompatActivity {
private TextView tVbefore1;
private Typeface faceBefore1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_before1);

        tVbefore1 = (TextView)findViewById(R.id.textV_before1_id);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.button_before1);
       // faceBefore1 = Typeface.createFromAsset(this.getAssets(), "SourceSansPro-Regular.ttf");
        //activity_main2_before1.setTypeface(faceBefore1);
    }


}
