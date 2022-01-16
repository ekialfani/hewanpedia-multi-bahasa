package com.uts.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uts.hewanpedia.jenis.Hewan;
import com.uts.hewanpedia.jenis.Tikus;
import com.uts.hewanpedia.jenis.Burung;
import com.uts.hewanpedia.jenis.Paus;
import com.uts.hewanpedia.jenis.Hiu;

public class ProfileActivity extends AppCompatActivity {
    Hewan hewan;
    TextView txtJudul,txtJenis,txtAsal,txtDeskripsi;
    ImageView ivFotoHewan;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        hewan = (Hewan) intent.getSerializableExtra(DaftarHewanActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewan);
    }

    private void inisialisasiView() {
        txtJudul = findViewById(R.id.txtJudul);
        txtJenis = findViewById(R.id.txtJenis);
        txtAsal = findViewById(R.id.txtAsal);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);
        btnBack = findViewById(R.id.btn_back_to_list);
        btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }


    private void tampilkanProfil(Hewan hewan) {
        Log.d("Profil","Menampilkan "+hewan.getJenis());
        if (hewan instanceof Tikus) {
            txtJudul.setText(getString(R.string.tikus));
        } else if (hewan instanceof Burung) {
            txtJudul.setText(getString(R.string.burung));
        }else if(hewan instanceof Paus){
            txtJudul.setText(getString(R.string.paus));
        }else if(hewan instanceof  Hiu){
            txtJudul.setText(getString(R.string.hiu));
        }
        txtJenis.setText(hewan.getRas());
        txtAsal.setText(hewan.getAsal());
        txtDeskripsi.setText(hewan.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(hewan.getDrawableRes()));
    }
}