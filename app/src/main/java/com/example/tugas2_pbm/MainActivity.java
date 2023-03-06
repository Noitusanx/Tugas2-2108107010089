package com.example.tugas2_pbm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ImageView logo; // deklarasi ImageView untuk menampilkan gambar
    private Button tombol; // deklarasi Button untuk menangani klik tombol
    private boolean isImage = true; // variabel boolean untuk menentukan gambar mana yang akan ditampilkan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menghubungkan variabel dengan elemen pada layout
        logo = findViewById(R.id.logo_unsyiah_hitam);
        tombol = findViewById(R.id.button);

        // menambahkan event listener untuk klik tombol
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mengubah gambar sesuai dengan kondisi variabel isImage
                if (isImage) {
                    logo.setImageResource(R.drawable.logo_unsyiah);
                    isImage = false;
                } else {
                    logo.setImageResource(R.drawable.logo_unsyiah_hitam);
                    isImage = true;
                }
            }
        });
    }
}
