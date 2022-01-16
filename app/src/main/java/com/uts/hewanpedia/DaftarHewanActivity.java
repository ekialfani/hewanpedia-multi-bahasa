package com.uts.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.uts.hewanpedia.jenis.Hewan;
import com.uts.hewanpedia.jenis.Tikus;
import com.uts.hewanpedia.jenis.Burung;
import com.uts.hewanpedia.jenis.Hiu;
import com.uts.hewanpedia.jenis.Paus;

public class DaftarHewanActivity extends AppCompatActivity {

    public final static String HEWAN_TERPILIH ="hewan_obj_key";
    List<Hewan> hewans;
    ListView listView;
    String jenisHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_hewan);
        Intent intent = getIntent();
        jenisHewan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);

        hewans = DataHewan.getHewansByTipe(this,jenisHewan);

        TextView txJudulList = findViewById(R.id.text_title_daftar);
        String judul = "";
        if (hewans.get(0) instanceof Tikus) {
            judul = getString(R.string.tikus_list_title);
        } else if (hewans.get(0) instanceof Burung) {
            judul = getString(R.string.burung_list_title);
        }else if(hewans.get(0) instanceof Paus){
            judul = getString(R.string.paus_list_title);
        }else if(hewans.get(0) instanceof Hiu){
            judul = getString(R.string.hiu_list_title);
        }

        txJudulList.setText(judul);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DaftarHewanAdapter adapter = new DaftarHewanAdapter(this,hewans);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Hewan terpilih = hewans.get(position);
            bukaProfileHewan(terpilih);
        }
    };

    private void bukaProfileHewan(Hewan hewanTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra(HEWAN_TERPILIH, hewanTerpilih);
        startActivity(intent);
    }
}