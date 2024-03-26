package com.example.fragment_ruang_bangun;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class bangunRuang extends Fragment  implements Adapter.ItemClickListener {

    RecyclerView rvBangun;
    ArrayList<Data> listDataMakanan;
    Adapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        listDataMakanan = new ArrayList<>();
        rvBangun = rootView.findViewById(R.id.homeRecylerview);


        Data BngunOne = new Data();
        BngunOne.setJudul("Balok");
        BngunOne.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Cuboid_simple.svg/1200px-Cuboid_simple.svg.png");
        listDataMakanan.add(BngunOne);

        Data Bngun2 = new Data();
        Bngun2.setJudul("Kubus");
        Bngun2.setImageUrl("https://cdn0-production-images-kly.akamaized.net/kVzypGAVI-AYpRPOwLT44iy4xfA=/1200x1200/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3518168/original/026826900_1626957470-KUBUSSS.jpg");
        listDataMakanan.add(Bngun2);

        Data Bngun3 = new Data();
        Bngun3.setJudul("Limas");
        Bngun3.setImageUrl("https://awsimages.detik.net.id/community/media/visual/2021/09/21/limas-segi-empat.jpeg?w=600&q=90");
        listDataMakanan.add(Bngun3);

        Data Bngun4 = new Data();
        Bngun4.setJudul("Persegi");
        Bngun4.setImageUrl("https://akupintar.id/documents/portlet_file_entry/20143/1+%288%29.png/78981bbc-9482-c8fe-17f8-d53578cd41c4?imagePreview=1");
        listDataMakanan.add(Bngun4);





        listDataMakanan.add(Bngun2);


        adapter = new Adapter(getContext(), listDataMakanan, new Adapter.ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                }
        });

        rvBangun.setAdapter(adapter);
        rvBangun.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }

    @Override
    public void onItemClick(View view, int position) {
        if (adapter.getItem(position).getJudul().equals("Kubus")) {
            Intent intent = new Intent(getActivity(), persegiklk.class);
            startActivity(intent);
        }

    }
}
