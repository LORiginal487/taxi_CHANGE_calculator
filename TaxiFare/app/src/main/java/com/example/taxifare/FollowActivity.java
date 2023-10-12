package com.example.taxifare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FollowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);
    }

    public void goBack(View view) {
        Intent intent = new Intent(FollowActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void openFB(View view) {
        String url = "https://www.facebook.com/oscarravuku487?mibextid=ZbWKwL";

        // Create an Intent to open the URL in a web browser
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        // Start the web browser activity
        startActivity(intent);
    }

    public void openInsta(View view) {
        String url = "https://instagram.com/loriginal487?igshid=OGQ5ZDc2ODk2ZA==";

        // Create an Intent to open the URL in a web browser
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        // Start the web browser activity
        startActivity(intent);
    }

    public void openTT(View view) {
        String url = "https://www.tiktok.com/@hate_talk_www?_t=8gRgSh6EKft&_r=1";

        // Create an Intent to open the URL in a web browser
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        // Start the web browser activity
        startActivity(intent);
    }

    public void openX(View view) {
        String url = "https://x.com/OscarRavuku487?t=hgnJBjbYsOgwCd_njpoFrg&s=09";

        // Create an Intent to open the URL in a web browser
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        // Start the web browser activity
        startActivity(intent);
    }
}