package comsci.alice.myfirstapp;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View ทำการให้มันรู้จักกับตัวแปลที่java
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        Button button = (Button) findViewById(R.id.btnBack);
        //show data from mainActivity
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));
    }//main method
    public void clickBack(View view){
        finish();
    }

}//main class
