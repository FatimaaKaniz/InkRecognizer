package hu.unideb.inf.mobileSolutions.android.InkRecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import hu.unideb.inf.mobileSolutions.android.InkRecognizer.R;

public class Instructions extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    public final String MyPREFERENCES = "MyPref" ;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        tv = findViewById(R.id.textView);
        tv.setText(sharedpreferences.getString("items","History Not Found\n"));
    }

    public void clearHistory(View view) {
        SharedPreferences.Editor editor= sharedpreferences.edit();
        editor.clear();
        editor.apply();
        tv.setText("History Not Found");
    }
}