package spase.l.psaltyr;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageMainActivity extends AppCompatActivity {
    private Button buttonBefore1,buttonBefore2,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12, button13,button14,button15,button16,button17,button18,button19,button20,buttonAfter,button22;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_main);

        buttonBefore1 = (Button)findViewById(R.id.button_before1_id);
        buttonBefore2 = (Button)findViewById(R.id.button_second_id);
        button1 = (Button)findViewById(R.id.button1_id);
        button2 = (Button)findViewById(R.id.button2_id);
        button3 = (Button)findViewById(R.id.button3_id);
        button4 = (Button)findViewById(R.id.button4_id);
        button5 = (Button)findViewById(R.id.button5_id);
        button6 = (Button)findViewById(R.id.button6_id);
        button7 = (Button)findViewById(R.id.button7_id);
        button8 = (Button)findViewById(R.id.button8_id);
        button9 = (Button)findViewById(R.id.button9_id);
        button10 = (Button)findViewById(R.id.button10_id);
        button11 = (Button)findViewById(R.id.button11_id);
        button12 = (Button)findViewById(R.id.button12_id);
        button13 = (Button)findViewById(R.id.button13_id);
        button14 = (Button)findViewById(R.id.button14_id);
        button15 = (Button)findViewById(R.id.button15_id);
        button16 = (Button)findViewById(R.id.button16_id);
        button17 = (Button)findViewById(R.id.button17_id);
        button18 = (Button)findViewById(R.id.button18_id);
        button19 = (Button)findViewById(R.id.button19_id);
        button20 = (Button)findViewById(R.id.button20_id);
        buttonAfter = (Button)findViewById(R.id.button_after_id);
        button22 = (Button)findViewById(R.id.button22_id);



//        buttonBefore1.setOnClickListener(this);
//        buttonBefore2.setOnClickListener(this);
//        button1.setOnClickListener(this);
//        button2.setOnClickListener(this);
//        button3.setOnClickListener(this);
//        button4.setOnClickListener(this);
//        button5.setOnClickListener(this);
//        button6.setOnClickListener(this);
//        button7.setOnClickListener(this);
//        button8.setOnClickListener(this);
//        button9.setOnClickListener(this);
//        button10.setOnClickListener(this);
//        button11.setOnClickListener(this);
//        button12.setOnClickListener(this);
//        button13.setOnClickListener(this);
//        button14.setOnClickListener(this);
//        button15.setOnClickListener(this);
//        button16.setOnClickListener(this);
//        button17.setOnClickListener(this);
//        button18.setOnClickListener(this);
//        button19.setOnClickListener(this);
//        button20.setOnClickListener(this);
//        buttonAfter.setOnClickListener(this);
//        button12spesial.setOnClickListener(this);

        buttonBefore1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {openActivity_before1(); }});
        buttonBefore1.setText(R.string.button_before1);
      buttonBefore2.setOnClickListener(new View.OnClickListener() {
                    @Override
                   public void onClick(View v) {openActivity_before2();}});
      button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) { openActivity_1();}
    });
      button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {openActivity_2();}
      });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_3();}
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_4();}
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_5();}
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_6();}
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_7();}
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_8();}
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_9();}
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_10();}
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_11();}
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_12();}
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_13();}
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_14();}
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_15();}
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_16();}
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_17();}
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_18();}
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_19();}
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_20();}
        });
        buttonAfter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {openActivity_21();}
        });
        button22.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { openActivity_22(); }});


    }
    public void openActivity_before1(){
        Intent page_before1  = new Intent(this,Main2Activity_before1.class);
        startActivity(page_before1);

    }
    public void openActivity_before2(){
        Intent page_before2  = new Intent(this,Main2Before2.class);
        startActivity(page_before2);

    }
   public void openActivity_1(){
        Intent page1  = new Intent(this,Main2Activity_1.class);
        startActivity(page1);

   }
    public void openActivity_2(){
        Intent page2  = new Intent(this,Main2Activity_2.class);
        startActivity(page2);
    }
    public void openActivity_3(){
        Intent page3  = new Intent(this,Main2Activity_3.class);
        startActivity(page3);
    }
    public void openActivity_4(){
        Intent page4  = new Intent(this,Main2Activity_4.class);
        startActivity(page4);
    }
    public void openActivity_5(){
        Intent page5 = new Intent(this,Main2Activity_5.class);
        startActivity(page5);
    }
    public void openActivity_6(){
        Intent page6  = new Intent(this,Main2Activity_6.class);
        startActivity(page6);
    }
    public void openActivity_7(){
        Intent page7  = new Intent(this,Main2Activity_7.class);
        startActivity(page7);
    }
    public void openActivity_8(){
        Intent page8  = new Intent(this,Main2Activity_8.class);
        startActivity(page8);
    }
    public void openActivity_9(){
        Intent page9  = new Intent(this,Main2Activity_9.class);
        startActivity(page9);
    }
    public void openActivity_10(){
        Intent page10  = new Intent(this,Main2Activity_10.class);
        startActivity(page10);
    }
    public void openActivity_11(){
        Intent page11  = new Intent(this,Main2Activity_11.class);
        startActivity(page11);
    }
    public void openActivity_12(){
        Intent page12  = new Intent(this,Main2Activity_12.class);
        startActivity(page12);
    }
    public void openActivity_13(){
        Intent page13  = new Intent(this,Main2Activity_13.class);
        startActivity(page13);
    }
    public void openActivity_14(){
        Intent page14  = new Intent(this,Main2Activity_14.class);
        startActivity(page14);
    }
    public void openActivity_15(){
        Intent page15  = new Intent(this,Main2Activity_15.class);
        startActivity(page15);
    }
    public void openActivity_16(){
        Intent page16  = new Intent(this,Main2Activity_16.class);
        startActivity(page16);
    }
    public void openActivity_17(){
        Intent page17  = new Intent(this,Main2Activity_17.class);
        startActivity(page17);
    }
    public void openActivity_18(){
        Intent page18  = new Intent(this,Main2Activity_18.class);
        startActivity(page18);
    }
    public void openActivity_19(){
        Intent page19  = new Intent(this,Main2Activity_19.class);
        startActivity(page19);
    }
    public void openActivity_20(){
        Intent page20  = new Intent(this,Main2Activity_20.class);
        startActivity(page20);
    }
    public void openActivity_21(){
        Intent page21  = new Intent(this,Main2Activity_21.class);
        startActivity(page21);
    }
    public void openActivity_22(){
        Intent  page22 = new Intent(this, Main2Activity22.class);
        startActivity(page22);
    }


}


