package com.example.jinqh.myapplicationclass;


import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static android.content.ContentValues.TAG;
/**
 * 第一个页面 课表查询
 *
 * @author qingyin
 *
 */
public class BlankFragment extends Fragment {

    private static TextView mTx11;
    private static TextView mTx12;
    private static TextView mTx13;
    private static TextView mTx14;
    private static TextView mTx15;
    private static TextView mTx21;
    private static TextView mTx22;
    private static TextView mTx23;
    private static TextView mTx24;
    private static TextView mTx25;
    private static TextView mTx31;
    private static TextView mTx32;
    private static TextView mTx33;
    private static TextView mTx34;
    private static TextView mTx35;
    private static TextView mTx41;
    private static TextView mTx42;
    private static TextView mTx43;
    private static TextView mTx44;
    private static TextView mTx45;
    private static TextView mTx51;
    private static TextView mTx52;
    private static TextView mTx53;
    private static TextView mTx54;
    private static TextView mTx55;
    private static TextView mTx61;
    private static TextView mTx62;
    private static TextView mTx63;
    private static TextView mTx64;
    private static TextView mTx65;
    private static TextView mTxzhouci,mtitle;


    private View view;
    private Button btn_show;
    Context context;
    User_Data ud;
    List<classcourse_json> bf_classcourse_jsons = new ArrayList<classcourse_json>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        initview();
        minitView();

        time_week(getActivity());
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();

    }


    private void minitView() {

        mTxzhouci = view.findViewById(R.id.zhouci);
        mTx11 = view.findViewById(R.id.tx011);
        mTx12 = view.findViewById(R.id.tx012);
        mTx13 = view.findViewById(R.id.tx013);
        mTx14 = view.findViewById(R.id.tx014);
        mTx15 = view.findViewById(R.id.tx015);
        mTx21 = view.findViewById(R.id.tx021);
        mTx22 = view.findViewById(R.id.tx022);
        mTx23 = view.findViewById(R.id.tx023);
        mTx24 = view.findViewById(R.id.tx024);
        mTx25 = view.findViewById(R.id.tx025);
        mTx31 = view.findViewById(R.id.tx031);
        mTx32 = view.findViewById(R.id.tx032);
        mTx33 = view.findViewById(R.id.tx033);
        mTx34 = view.findViewById(R.id.tx034);
        mTx35 = view.findViewById(R.id.tx035);
        mTx41 = view.findViewById(R.id.tx041);
        mTx42 = view.findViewById(R.id.tx042);
        mTx43 = view.findViewById(R.id.tx043);
        mTx44 = view.findViewById(R.id.tx044);
        mTx45 = view.findViewById(R.id.tx045);
        mTx51 = view.findViewById(R.id.tx051);
        mTx52 = view.findViewById(R.id.tx052);
        mTx53 = view.findViewById(R.id.tx053);
        mTx54 = view.findViewById(R.id.tx054);
        mTx55 = view.findViewById(R.id.tx055);
        mTx61 = view.findViewById(R.id.tx061);
        mTx62 = view.findViewById(R.id.tx062);
        mTx63 = view.findViewById(R.id.tx063);
        mTx64 = view.findViewById(R.id.tx064);
        mTx65 = view.findViewById(R.id.tx065);
        mtitle.setText("课表");
    }

    public void deal_find(List<classcourse_json> classcourse_jsons, Context mcontext) {
        int deal_weizhi;
        String mTx;

        for (classcourse_json cc_j : classcourse_jsons) {
            deal_weizhi = cc_j.getWeizhi();
            mTx = "tx0" + deal_weizhi;

            //获得资源ID
            int mTx_id = mcontext.getResources().getIdentifier("" + mTx, "id", mcontext.getPackageName());

            switch (deal_weizhi) {
                case 11:
                    mTx11.setText("" + cc_j.getName());
                    break;
                case 12:
                    mTx12.setText("" + cc_j.getName());
                    break;
                case 13:
                    mTx13.setText("" + cc_j.getName());
                    break;
                case 14:
                    mTx14.setText("" + cc_j.getName());
                    break;
                case 15:
                    mTx15.setText("" + cc_j.getName());
                    break;
                case 21:
                    mTx21.setText("" + cc_j.getName());
                    break;
                case 22:
                    mTx22.setText("" + cc_j.getName());
                    break;
                case 23:
                    mTx23.setText("" + cc_j.getName());
                    break;
                case 24:
                    mTx24.setText("" + cc_j.getName());
                    break;
                case 25:
                    mTx25.setText("" + cc_j.getName());
                    break;
                case 31:
                    mTx31.setText("" + cc_j.getName());
                    break;
                case 32:
                    mTx32.setText("" + cc_j.getName());
                    break;
                case 33:
                    mTx33.setText("" + cc_j.getName());
                    break;
                case 34:
                    mTx34.setText("" + cc_j.getName());
                    break;
                case 35:
                    mTx35.setText("" + cc_j.getName());
                    break;
                case 41:
                    mTx41.setText("" + cc_j.getName());
                    break;
                case 42:
                    mTx42.setText("" + cc_j.getName());
                    break;
                case 43:
                    mTx43.setText("" + cc_j.getName());
                    break;
                case 44:
                    mTx44.setText("" + cc_j.getName());
                    break;
                case 45:
                    mTx45.setText("" + cc_j.getName());
                    break;
                case 51:
                    mTx51.setText("" + cc_j.getName());
                    break;
                case 52:
                    mTx52.setText("" + cc_j.getName());
                    break;
                case 53:
                    mTx53.setText("" + cc_j.getName());
                    break;
                case 54:
                    mTx54.setText("" + cc_j.getName());
                    break;
                case 55:
                    mTx55.setText("" + cc_j.getName());
                    break;
                case 61:
                    mTx61.setText("" + cc_j.getName());
                    break;
                case 62:
                    mTx62.setText("" + cc_j.getName());
                    break;
                case 63:
                    mTx63.setText("" + cc_j.getName());
                    break;
                case 64:
                    mTx64.setText("" + cc_j.getName());
                    break;
                case 65:
                    mTx65.setText("" + cc_j.getName());
                    break;
                default:
                    break;
            }

        }
    }

    /*
    获取系统日期
    进入自动生成当日课表*/
    public void time_week(Context con) {

        Calendar calendar = Calendar.getInstance();
//获取系统的日期
//月
        int month = calendar.get(Calendar.MONTH) + 1;
//日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        switch (month) {
            case 9:
                if (9 <= day && day <= 15) week_2(con);
                else if (16 <= day && day <= 22) week_3(con);
                else if (23 <= day && day <= 29) week_4(con);
                else if (30 == day) week_5(con);
                break;
            case 10:
                if (1 <= day && day <= 6) week_5(con);
                else if (7 <= day && day <= 13) week_6(con);
                else if (14 <= day && day <= 20) week_7(con);
                else if (21 <= day && day <= 27) week_8(con);
                else if (28 <= day && day <= 31) week_9(con);
                break;
            case 11:
                if (1 <= day && day <= 3) week_9(con);
                else if (4 <= day && day <= 10) week_10(con);
                else if (11 <= day && day <= 17) week_11(con);
                else if (18 <= day && day <= 24) week_12(con);
                else if (25 <= day && day <= 30) week_13(con);
                break;
            case 12:
                if (1 == day) week_13(con);
                else if (2 <= day && day <= 8) week_14(con);

                break;
        }
    }

    public void week_2(Context con) {
        mTxzhouci.setText("周次:二");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(2);
        deal_find(bf_classcourse_jsons, con);

    }

    public static void clear_week(Context con) {
        mTx11.setText("");
        mTx12.setText("");
        mTx13.setText("");
        mTx14.setText("");
        mTx15.setText("");
        mTx21.setText("");
        mTx22.setText("");
        mTx23.setText("");
        mTx24.setText("");
        mTx25.setText("");
        mTx31.setText("");
        mTx32.setText("");
        mTx33.setText("");
        mTx34.setText("");
        mTx35.setText("");
        mTx41.setText("");
        mTx42.setText("");
        mTx43.setText("");
        mTx44.setText("");
        mTx45.setText("");
        mTx51.setText("");
        mTx52.setText("");
        mTx53.setText("");
        mTx54.setText("");
        mTx55.setText("");
        mTx61.setText("");
        mTx62.setText("");
        mTx63.setText("");
        mTx64.setText("");
        mTx65.setText("");
    }

    public void week_3(Context con) {
        mTxzhouci.setText("周次:三");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(3);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_4(Context con) {
        mTxzhouci.setText("周次:四");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(4);
        deal_find(bf_classcourse_jsons, con);

    }

    public void week_5(Context con) {
        mTxzhouci.setText("周次:五");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(5);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_6(Context con) {
        mTxzhouci.setText("周次:六");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(6);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_7(Context con) {
        mTxzhouci.setText("周次:七");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(7);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_8(Context con) {
        mTxzhouci.setText("周次:八");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(8);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_9(Context con) {
        mTxzhouci.setText("周次:九");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(9);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_10(Context con) {
        mTxzhouci.setText("周次:十");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(10);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_11(Context con) {
        mTxzhouci.setText("周次:十一");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(11);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_12(Context con) {
        mTxzhouci.setText("周次:十二");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(12);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_13(Context con) {
        mTxzhouci.setText("周次:十三");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(13);
        deal_find(bf_classcourse_jsons, con);
    }

    public void week_14(Context con) {
        mTxzhouci.setText("周次:十四");
        ud = new User_Data(con);
        bf_classcourse_jsons = ud.find(14);
        deal_find(bf_classcourse_jsons, con);
    }

    public void initview() {
 //       mtitle=view.findViewById(R.id.text_title);
        btn_show = view.findViewById(R.id.butselect1);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DiaFragment.newInstance().show(getChildFragmentManager(), "dialog");

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

    }


}

