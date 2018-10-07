package com.example.jinqh.myapplicationclass;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 第二个页面 通讯录
 *
 * @author qingyin
 *
 */
public class BlankFragment2 extends Fragment {
    private ListView listView;
    private SideBar sideBar;
    private ArrayList<User> list;
    private View view;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        initView();
        initData();

        return view;
    }


    private void initView() {
        listView= view.findViewById(R.id.fb2_listView);





        sideBar = view.findViewById(R.id.side_bar);
        sideBar.setOnStrSelectCallBack(new SideBar.ISideBarSelectCallBack() {
            @Override
            public void onSelectStr(int index, String selectStr) {
                for (int i = 0; i < list.size(); i++) {
                    if (selectStr.equalsIgnoreCase(list.get(i).getFirstLetter())) {
                        listView.setSelection(i); // 选择到首字母出现的位置
                        return;
                    }
                }
            }
        });
    }
    //初始化数据
    private void initData() {
        list = new ArrayList<>();
        list.add(new User("金秋晗","15970253019","153705849"));
        list.add(new User("董老师", "18770298029" , "263587220" ));
        list.add(new User("罗诗帆", "18770251128" , "892658320" ));
        list.add(new User("冷彬彬", "18379600280" , "1461302341" ));
        list.add(new User("尹平平", "15070634344" , "2435884205" ));
        list.add(new User("叶兴邦", "13479372259" , "2318208088" ));
        list.add(new User("刘鑫", "17379217802", "1290279297" ));
        list.add(new User("曾鑫", "15170223155" , "1545704322" ));
        list.add(new User("熊志远", "1545704322" , "956793340" ));
        list.add(new User("张国权", "15079653532", "1034869152" ));
        list.add(new User("郭鑫", "13117972003" , "1847795280" ));
        list.add(new User("方堃", "18379967746", "191646784" ));
        list.add(new User("苏世麟", "18370354123" , "669873975" ));
        list.add(new User("尹虹", "18720461734" , "1696907499" ));
        list.add(new User("曾耀祖", "15270404543" , "1573835228" ));
        list.add(new User("刘官富", "15579990667" , "384725676" ));
        list.add(new User("吴依婷", "18770820198" , "163024067" ));
        list.add(new User("肖嘉伟", "17879835477", "1146947526" ));
        list.add(new User("詹震", "18379245529" , "786546276" ));
        list.add(new User("彭炜昊", "18379060697" , "1528902244" ));
        list.add(new User("江定贤", "18870267205" , "1763830935" ));
        list.add(new User("黄善鸿", "15179697870" , "2821098212" ));
        list.add(new User("谢地荣", "15779008703" , "3082623323"));
        list.add(new User("谢宇", "15807996924" , "37319646" ));
        list.add(new User("翁清俊", "18379241344" , "947174135" ));
        list.add(new User("黄思旺", "15070659008" , "2835309850" ));
        list.add(new User("邢书翰", "15779408830" , "1409866719" ));
        list.add(new User("曾根", "18897991811" , "1843113879" ));
        list.add(new User("田立梦", "18720296025" , "2375714838" ));
        list.add(new User("何海燕", "13970764663", "1543154333" ));
        list.add(new User("冯昊俊", "15879846392" , "448266154" ));
        list.add(new User("李志鑫", "18797827968" , "962937662" ));
        list.add(new User("刘福林", "18146771146" , "2801632670" ));
        list.add(new User("欧阳岷", "18296295696" , "1041669554" ));
        list.add(new User("钟宏松", "13707023546" , "782010136" ));
        list.add(new User("刘闻政", "15770789102" , "982677009" ));
        list.add(new User("胡辉", "18770930910" , "528578508" ));
        list.add(new User("罗善喜", "18870267535" , "505450109" ));



        Collections.sort(list); // 对list进行排序，需要让User实现Comparable接口重写compareTo方法
        SortAdapter adapter = new SortAdapter(getActivity(), list);
        listView.setAdapter(adapter);

    }
    @Override
    public void onStart() {

        super.onStart();
    }
}
