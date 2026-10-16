package fun.android.rpgmzstart;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import fun.android.rpgmzstart.fun.Fun;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        M.context= this;
        M.linear = findViewById(R.id.linear);

        for(int i=0; i<100; i++){
            M.linear.addView(Fun.getChildView());
        }

    }
}