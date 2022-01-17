package com.example.myapplicationuas;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.myapplicationuas.model.Anjing;
import com.example.myapplicationuas.model.Elang;
import com.example.myapplicationuas.model.Hewan;
import com.example.myapplicationuas.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Anggora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Siberia,Alaska,Finlandia(daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju.", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9).)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu .", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Elang>initDataElang(Context ctx) {
        List<Elang> elangs = new ArrayList<>();
        elangs.add(new Elang("Elang", "Afrika",
                "Ciri khas dari ular kobra yang mencolok sesungguhnya adalah warna hitam legam. Ular ini juga memiliki panjang hingga 1,5 mete.", R.drawable.elangbido));
        elangs.add(new Elang("Sanca", "Inggris",
                "Elang ini adalah bertubuh yang pendek dengan panjang maksimal sekitar 3 meter.", R.drawable.elanggunung));
        elangs.add(new Elang("Anaconda", "Myanmar",
                "Anaconda biasa hidup di air dan cenderung berburu di dalam air..", R.drawable.elanghitam));
        elangs.add(new Elang("Phyton", "Iran",
                "Python tidak mempunyai bisa,dan python tidak bisa mendengar atau tuli.", R.drawable.elangjawa));
        elangs.add(new Elang("Beludak", "Iran",
                "Beludak cenderung memiliki sisik yg keras,gemuk dan memiliki ekor yang pendek.", R.drawable.elanghitam));
        elangs.add(new Elang("Mamba", "Rusia",
                "Mamba memiliki ukuran 6 meter melebihi anaconda. ", R.drawable.elanggunung));
        return elangs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataElang(ctx));
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
