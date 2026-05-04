package com.example.dclassicsbooks;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class StoresActivity extends AppCompatActivity {
    private RecyclerView rvStores;
    private StoreAdapter adapter;
    private List<Store> storeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stores);

        rvStores = findViewById(R.id.rvStores);
        rvStores.setLayoutManager(new LinearLayoutManager(this));

        storeList = new ArrayList<>();

        storeList.add(new Store(R.drawable.store_gi, "Grand Indonesia", "Jl. M.H. Thamrin No.1, Menteng, Kec. Menteng, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10310", "Open: 10:00 - 22:00"));
        storeList.add(new Store(R.drawable.store_pvj, "Paris Van Java", "Jl. Sukajadi No.131-139, Cipedes, Kec. Sukajadi, Kota Bandung, Jawa Barat 40162", "Open: 09:00 - 23:00"));
        storeList.add(new Store(R.drawable.store_cbdc, "CBD Ciledug", "Jl. HOS Cokroaminoto No.93, Karang Tengah, Kec. Karang Tengah, Kota Tangerang, Banten 15157", "Open: 10:00 - 21:00"));
        storeList.add(new Store(R.drawable.store_dts, "Depok Town Square", "Jl. Margonda Raya No.1, Kemiri Muka, Kec. Beji, Kota Depok, Jawa Barat 16424", "Open: 10:00 - 21:00"));
        storeList.add(new Store(R.drawable.store_ktm, "Koja Trade Mall", "Jl. Kramat Jaya No.30, Tugu Utara, Kec. Koja, Kota Jakarta Utara, Daerah Khusus Ibukota Jakarta 14260", "Open: 09:00 - 20:00"));

        adapter = new StoreAdapter(storeList);
        rvStores.setAdapter(adapter);
    }
}