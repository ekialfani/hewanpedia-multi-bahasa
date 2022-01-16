package com.uts.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.uts.hewanpedia.jenis.Tikus;
import com.uts.hewanpedia.jenis.Burung;
import com.uts.hewanpedia.jenis.Hewan;
import com.uts.hewanpedia.jenis.Paus;
import com.uts.hewanpedia.jenis.Hiu;

public class DataHewan {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Tikus> initDataTikus(Context ctx) {
        List<Tikus> mouses = new ArrayList<>();
        mouses.add(new Tikus(ctx.getString(R.string.acomys_nama), ctx.getString(R.string.acomys_asal),
                ctx.getString(R.string.acomys_deskripsi), R.drawable.tikus_acomys));
        mouses.add(new Tikus(ctx.getString(R.string.tikus_ladang_bergaris_nama), ctx.getString( R.string.tikus_ladang_bergaris_asal),
                ctx.getString(R.string.tikus_ladang_bergaris_deskripsi),R.drawable.tikus_apodemus_agrarius));
        mouses.add(new Tikus(ctx.getString(R.string.tikus_rumput_sudan_nama), ctx.getString(R.string.tikus_rumput_sudan_asal),
                ctx.getString(R.string.tikus_rumput_sudan_deskripsi), R.drawable.tikus_arvicanthis));
        mouses.add(new Tikus(ctx.getString(R.string.gerbil_nama), ctx.getString(R.string.gerbil_asal),
                ctx.getString(R.string.gerbil_deskripsi), R.drawable.tikus_gerbil));
        mouses.add(new Tikus(ctx.getString(R.string.tikus_hutan_nama), ctx.getString(R.string.tikus_hutan_asal),
                ctx.getString(R.string.tikus_hutan_deskripsi), R.drawable.tikus_hutan));
        mouses.add(new Tikus(ctx.getString(R.string.petromyscus_nama), ctx.getString(R.string.petromyscus_asal),
                ctx.getString(R.string.petromyscus_deskripsi), R.drawable.tikus_harvest_mouse));
        return mouses;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> birds = new ArrayList<>();
        birds.add(new Burung(ctx.getString(R.string.beo_nama), ctx.getString(R.string.beo_asal),
                ctx.getString(R.string.beo_deskripsi), R.drawable.burung_beo));
        birds.add(new Burung(ctx.getString(R.string.cenderawasih_nama), ctx.getString(R.string.cenderawasih_asal),
                ctx.getString(R.string.cenderawasih_deskripsi), R.drawable.burung_cenderawasih));
        birds.add(new Burung(ctx.getString(R.string.burung_hantu_nama), ctx.getString(R.string.burung_hantu_asal),
                ctx.getString(R.string.burung_hantu_deskripsi), R.drawable.burung_hantu));
        birds.add(new Burung(ctx.getString(R.string.burung_unta_nama), ctx.getString(R.string.burung_unta_asal),
                ctx.getString(R.string.burung_unta_deskripsi), R.drawable.burung_unta));
        birds.add(new Burung(ctx.getString(R.string.kakatua_nama), ctx.getString(R.string.kakatua_asal),
                ctx.getString(R.string.kakatua_deskripsi), R.drawable.burung_kakatua));
        birds.add(new Burung(ctx.getString(R.string.jalak_bali_nama), ctx.getString(R.string.jalak_bali_asal),
                ctx.getString(R.string.jalak_bali_deskripsi), R.drawable.burung_jalak_bali));
        return birds;
    }

    private static List<Paus> initDataPaus(Context ctx) {
        List<Paus> whales = new ArrayList<>();
        whales.add(new Paus(ctx.getString(R.string.paus_biru_nama), ctx.getString(R.string.paus_biru_asal),
                ctx.getString(R.string.paus_biru_deskripsi), R.drawable.paus_biru));
        whales.add(new Paus(ctx.getString(R.string.paus_bungkuk_nama), ctx.getString(R.string.paus_bungkuk_asal),
                ctx.getString(R.string.paus_bungkuk_deskripsi), R.drawable.paus_bungkuk));
        whales.add(new Paus(ctx.getString(R.string.paus_sikat_nama), ctx.getString(R.string.paus_sikat_asal),
                ctx.getString(R.string.paus_sikat_deskripsi), R.drawable.paus_sikat_atlantik_utara));
        whales.add(new Paus(ctx.getString(R.string.paus_bryde_nama), ctx.getString(R.string.paus_bryde_asal),
                ctx.getString(R.string.paus_bryde_deskripsi), R.drawable.paus_bryde));
        whales.add(new Paus(ctx.getString(R.string.paus_beluga_nama), ctx.getString(R.string.paus_beluga_asal),
                ctx.getString(R.string.paus_beluga_deskripsi), R.drawable.paus_beluga));
        whales.add(new Paus(ctx.getString(R.string.paus_sirip_nama), ctx.getString(R.string.paus_sirip_asal),
                ctx.getString(R.string.paus_sirip_deskripsi), R.drawable.paus_sirip));
        return whales;
    }


    private static List<Hiu> initDataHiu(Context ctx) {
        List<Hiu> sharks = new ArrayList<>();
        sharks.add(new Hiu(ctx.getString(R.string.hiu_biru_nama), ctx.getString(R.string.hiu_biru_asal),
                ctx.getString(R.string.hiu_biru_deskripsi), R.drawable.blue_shark));
        sharks.add(new Hiu(ctx.getString(R.string.hiu_martil_nama), ctx.getString(R.string.hiu_martil_asal),
                ctx.getString(R.string.hiu_martil_deskripsi), R.drawable.hiu_martil));
        sharks.add(new Hiu(ctx.getString(R.string.hiu_gergaji_nama), ctx.getString(R.string.hiu_gergaji_asal),
                ctx.getString(R.string.hiu_gergaji_deskripsi), R.drawable.hiu_gergaji));
        sharks.add(new Hiu(ctx.getString(R.string.hiu_threser_nama), ctx.getString(R.string.hiu_threser_asal),
                ctx.getString(R.string.hiu_threser_deskripsi), R.drawable.hiu_thresher_shark));
        sharks.add(new Hiu(ctx.getString(R.string.hiu_zebra_nama), ctx.getString(R.string.hiu_zebra_asal),
                ctx.getString(R.string.hiu_zebra_deskripsi), R.drawable.hiu_zebra));
        sharks.add(new Hiu(ctx.getString(R.string.hiu_greenland_nama), ctx.getString(R.string.hiu_greenland_asal),
                ctx.getString(R.string.hiu_greenland_deskripsi), R.drawable.hiu_greenland));
        return sharks;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataTikus(ctx));
        hewans.addAll(initDataBurung(ctx));
        hewans.addAll(initDataHiu(ctx));
        hewans.addAll(initDataPaus(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
