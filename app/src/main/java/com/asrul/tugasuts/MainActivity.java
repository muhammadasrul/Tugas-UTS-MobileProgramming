package com.asrul.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGithub = findViewById(R.id.btn);
        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri github = Uri.parse("https://github.com/muhammadasrul/Tugas-UTS-MobileProgramming");
                Intent intent = new Intent(Intent.ACTION_VIEW, github);
                startActivity(intent);
            }
        });
    }
}
