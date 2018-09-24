package com.example.asus.aplikasi_biodata_mahasiswa;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view) {
        Uri uri = Uri.parse("geo:0,0?q=-7.3649281,109.9114507");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void showTlp(View view) {
        Uri uri = Uri.parse("tel:082221567952");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }

    public void showBlg(View view) {
        Uri uri = Uri.parse("http://student.blog.dinus.ac.id/ardiansandi98/");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}
