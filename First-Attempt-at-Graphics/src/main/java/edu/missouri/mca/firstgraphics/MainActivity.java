package edu.missouri.mca.firstgraphics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Gallery;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Instantiate an ImageView and define its properties
        final ImageView i = new ImageView(this);
        i.setImageResource(R.drawable.scooby);
        i.setAdjustViewBounds(true); // set the ImageView bounds to match the Drawable's dimensions
        i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));

        i.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent mv) {
                // do something when touched
                i.setPivotX(i.getPivotX() + 1);
                return true;
            }
        });


        //Add the ImageView to the layout and set the layout as the content view
        try {
            ((RelativeLayout) findViewById(R.id.layout)).addView(i);
        }
        catch(Exception e) {
        }
    }


}