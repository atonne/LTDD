package com.example.lab4;

import android.support.v4.app.*;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lab4.R;
import com.example.lab4.LanguageAdapter;
import com.example.lab4.Language;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.idListView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Cá nấu lẩu", "Shop Devang"));
        listLanguage.add(new Language(2, "1 kg Gà khô bơ tỏi", "LTD Food"));
        listLanguage.add(new Language(3, "Xây cầu đa năng", "Thế giới đồ chơi"));
        listLanguage.add(new Language(4, "Đồ chơi mô hình", "shop thế giới mô hình"));
        listLanguage.add(new Language(5, "Lãnh đại giản đơn", "Minh Long Book"));
        listLanguage.add(new Language(6, "Hiểu lòng con trẻ", "Minh Long Book"));
        listLanguage.add(new Language(7, "1 kg Gà khô bơ tỏi", "LTD Food"));
        listLanguage.add(new Language(8, "1 kg Gà khô bơ tỏi", "LTD Food"));


        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_listview, listLanguage);
        listView.setAdapter(adapter);

    }
}