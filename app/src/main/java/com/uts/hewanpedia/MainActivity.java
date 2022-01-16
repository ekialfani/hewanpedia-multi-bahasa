package com.uts.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import com.uts.hewanpedia.jenis.Tikus;
import com.uts.hewanpedia.jenis.Burung;
import com.uts.hewanpedia.jenis.Paus;
import com.uts.hewanpedia.jenis.Hiu;

public class MainActivity extends AppCompatActivity {

    ImageButton btnTikus,btnBurung, btnPaus, btnHiu;
    Button btnBiodata;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnTikus = findViewById(R.id.btn_buka_ras_tikus);
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnPaus = findViewById(R.id.btn_buka_ras_paus);
        btnHiu = findViewById(R.id.btn_buka_ras_hiu);
        btnBiodata = findViewById(R.id.biodata);
        btnTikus.setOnClickListener(view -> bukaGaleri("Tikus"));
        btnBurung.setOnClickListener(view -> bukaGaleri("Burung"));
        btnPaus.setOnClickListener(view -> bukaGaleri("Paus"));
        btnHiu.setOnClickListener(view -> bukaGaleri("Hiu"));
        btnBiodata.setOnClickListener(view -> bukaBiodataActivity());
    }


    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    private void bukaBiodataActivity() {
        Log.d("MAIN","Buka bodata");
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }
}