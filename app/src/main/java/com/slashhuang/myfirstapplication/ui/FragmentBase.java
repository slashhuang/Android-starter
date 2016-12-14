package com.slashhuang.myfirstapplication.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.slashhuang.myfirstapplication.R;

public class FragmentBase extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        // 拉伸该 Fragment 的布局
        return inflater.inflate(R.layout.artical_view,container,false);

    }
}
