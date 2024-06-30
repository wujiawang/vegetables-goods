package com.example.yuanann.vegetable_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class A extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.a,container,false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        TabHost tab = (TabHost)getActivity().findViewById(android.R.id.tabhost);

        //初始化TabHost容器
        tab.setup();
        //在TabHost创建标签，然后设置：标题／图标／标签页布局
        tab.addTab(tab.newTabSpec("tab1").setIndicator("推荐" , null).setContent(R.id.tab1));
        tab.addTab(tab.newTabSpec("tab2").setIndicator("秋季好物" , null).setContent(R.id.tab2));
        tab.addTab(tab.newTabSpec("tab3").setIndicator("每日好菜" , null).setContent(R.id.tab3));

    }

}