package com.example.yuanann.vegetable_app;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.QTabView;

public class TabFragmentActivity extends AppCompatActivity {
    private VerticalTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_type_two);
//        tabLayout = (VerticalTabLayout) findViewById(R.id.tablayout);
//        List<Fragment> fragments = getFragments();
//        tabLayout.setupWithFragment(getSupportFragmentManager(), R.id.fragment_container, fragments
//                , new TabAdapter() {
//                    @Override
//                    public int getCount() {
//                        return 10;
//                    }
//
//                    @Override
//                    public QTabView.TabBadge getBadge(int position) {
//                        return null;
//                    }
//
//                    @Override
//                    public QTabView.TabIcon getIcon(int position) {
//                        return null;
//                    }
//
//                    @Override
//                    public QTabView.TabTitle getTitle(int position) {
//                        return new QTabView.TabTitle.Builder().setContent(String.valueOf(position)).build();
//                    }
//
//                    @Override
//                    public int getBackground(int position) {
//                        return 0;
//                    }
//                });
//        tabLayout.setTabSelected(6);
//    }
//
//    private List<Fragment> getFragments() {
//        List<Fragment> fragments = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            TabFragment fragment = new TabFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("index", String.valueOf(i));
//            fragment.setArguments(bundle);
//            fragments.add(fragment);
//        }
//        return fragments;
    }
}
