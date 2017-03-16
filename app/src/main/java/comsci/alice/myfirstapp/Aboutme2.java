package comsci.alice.myfirstapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Aboutme2 extends AppCompatActivity {
    //Explicit
    MediaPlayer mediaPlayer;
    int soundID = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme2);
        //toast onclick
        ImageView clickImageView = (ImageView) findViewById(R.id.imv);
        clickImageView.setOnClickListener(new View.OnClickListener() {//ให้พิมพ์แค่ new On
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello My name is Thossaporn",Toast.LENGTH_SHORT).show();

                //show sound1 when click image
                soundID = R.raw.sound;
                playSound(soundID);
            }
        });
        //toast onLongClick
        ImageView longClickImageView = (ImageView) findViewById(R.id.imv);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(),"Thanks Guy",Toast.LENGTH_LONG).show();
                soundID = R.raw.sound1;
                playSound(soundID);
                return true;
            }
        });
    }

    private void playSound(int soundID) {
        mediaPlayer=MediaPlayer.create(getApplicationContext(),soundID);
        mediaPlayer.start();
    }

    public void clickBack(View view){
        finish();
    }
    public void onClickFacebook(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/thossaporn.dungdit"));
        startActivity(intent);}
}
