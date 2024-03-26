package com.example.fragment_ruang_bangun;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class bangun_datar extends Fragment {

    RecyclerView rvBangun;
    ArrayList<Data> listDataMakanan;
    Adapter adapter;

    public bangun_datar() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        listDataMakanan = new ArrayList<>();
        rvBangun = rootView.findViewById(R.id.homeRecylerview);


        Data BngunOne = new Data();
        BngunOne.setJudul("Persegi");
        BngunOne.setImageUrl("https://cdn0-production-images-kly.akamaized.net/kwVB6mWrePUIgUoMofCsWGJPKho=/1200x900/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3409130/original/098589600_1616496130-persegi.jpg");
        listDataMakanan.add(BngunOne);

        Data Bngun2 = new Data();
        Bngun2.setJudul("Segitiga");
        Bngun2.setImageUrl("https://cdn0-production-images-kly.akamaized.net/HMlQZTZBi9T7WUSt6wXjJFv2sic=/500x667/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3471854/original/039486200_1622699012-sama_sisi.jpg");
        listDataMakanan.add(Bngun2);

        Data Bngun3 = new Data();
        Bngun3.setJudul("lingkaran");
        Bngun3.setImageUrl("https://i.pinimg.com/originals/40/be/d0/40bed0c3fa7a18a4ce7e74c021c90507.jpg");
        listDataMakanan.add(Bngun3);

        Data Bngun4 = new Data();
        Bngun4.setJudul("layang layang");
        Bngun4.setImageUrl("https://asset-a.grid.id//crop/0x0:0x0/700x0/photo/2020/06/01/2137176162.jpg");
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
}
