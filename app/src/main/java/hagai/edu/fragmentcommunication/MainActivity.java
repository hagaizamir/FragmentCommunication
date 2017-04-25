package hagai.edu.fragmentcommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ColorFragment.OnColorChangeListener{
    FrameLayout f1 , f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       f1 = (FrameLayout) findViewById(R.id.fr1);
        f2 = (FrameLayout) findViewById(R.id.fr2);

        getSupportFragmentManager().beginTransaction().replace(R.id.fr1,new ColorFragment()).
                commit();
    }

   
    @Override
    public void onColorChange(int color) {
        Toast.makeText(this,"color:"+color,Toast.LENGTH_SHORT).show();

    }
}
