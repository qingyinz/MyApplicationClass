package com.example.jinqh.myapplicationclass;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DiaFragment extends DialogFragment {
    Button a0001;
    Button a0002;
    Button a0003;
    Button a0004;
    Button a0005;
    Button a0006;
    Button a0007;
    Button a0008;
    Button a0009;
    Button a00010;
    Button a00011;
    Button a00012;
    Button a00013;
    View view;
    View.OnClickListener mylistener = null;

    public static DiaFragment newInstance() {

        Bundle args = new Bundle();
        DiaFragment fragment = new DiaFragment();
        fragment.setCancelable(true);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.dialog);


    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //点击空白处返回
       getDialog().setCanceledOnTouchOutside(true);
        view = inflater.inflate(R.layout.activity_diffent_dialog, null, false);
        this.a0001 = view.findViewById(R.id.a0001);
        this.a0002 = view.findViewById(R.id.a0002);
        this.a0003 = view.findViewById(R.id.a0003);
        this.a0004 = view.findViewById(R.id.a0004);
        this.a0005 = view.findViewById(R.id.a0005);
        this.a0006 = view.findViewById(R.id.a0006);
        this.a0007 = view.findViewById(R.id.a0007);
        this.a0008 = view.findViewById(R.id.a0008);
        this.a0009 = view.findViewById(R.id.a0009);
        this.a00010 = view.findViewById(R.id.a00010);
        this.a00011 = view.findViewById(R.id.a00011);
        this.a00012 = view.findViewById(R.id.a00012);
        this.a00013 = view.findViewById(R.id.a00013);
        final BlankFragment bf=new BlankFragment();

        View.OnClickListener mylistener = new View.OnClickListener() {

            @Override
            public void onClick(View a) {
                switch (a.getId()) {
                    case R.id.a0001:
                        BlankFragment.clear_week(getActivity());
                        bf.week_2(getActivity());
                        dismiss();
                        break;
                    case R.id.a0002:
                        BlankFragment.clear_week(getActivity());
                        bf.week_3(getActivity());
                        dismiss();
                        break;
                    case R.id.a0003:
                        BlankFragment.clear_week(getActivity());
                        bf.week_4(getActivity());
                        dismiss();
                        break;
                    case R.id.a0004:
                        BlankFragment.clear_week(getActivity());
                        bf.week_5(getActivity());
                        dismiss();
                        break;
                    case R.id.a0005:
                        BlankFragment.clear_week(getActivity());
                        bf.week_6(getActivity());
                        dismiss();
                        break;
                    case R.id.a0006:
                        BlankFragment.clear_week(getActivity());
                        bf.week_7(getActivity());
                        dismiss();
                        break;
                    case R.id.a0007:
                        BlankFragment.clear_week(getActivity());
                        bf.week_8(getActivity());
                        dismiss();
                        break;
                    case R.id.a0008:
                        BlankFragment.clear_week(getActivity());
                        bf.week_9(getActivity());
                        dismiss();
                        break;
                    case R.id.a0009:
                        BlankFragment.clear_week(getActivity());
                        bf.week_10(getActivity());
                        dismiss();
                        break;
                    case R.id.a00010:
                        BlankFragment.clear_week(getActivity());
                        bf.week_11(getActivity());
                        dismiss();
                        break;
                    case R.id.a00011:
                        BlankFragment.clear_week(getActivity());
                        bf.week_12(getActivity());
                        dismiss();
                        break;
                    case R.id.a00012:
                        BlankFragment.clear_week(getActivity());
                        bf.week_13(getActivity());
                        dismiss();
                        break;
                    case R.id.a00013:
                        BlankFragment.clear_week(getActivity());
                        bf.week_14(getActivity());
                        dismiss();
                        break;

                    default:
                        break;
                }
            }
        };

        a0001.setOnClickListener(mylistener);
        a0002.setOnClickListener(mylistener);
        a0003.setOnClickListener(mylistener);
        a0004.setOnClickListener(mylistener);
        a0005.setOnClickListener(mylistener);
        a0006.setOnClickListener(mylistener);
        a0007.setOnClickListener(mylistener);
        a0008.setOnClickListener(mylistener);
        a0009.setOnClickListener(mylistener);
        a00010.setOnClickListener(mylistener);
        a00011.setOnClickListener(mylistener);
        a00012.setOnClickListener(mylistener);
        a00013.setOnClickListener(mylistener);
        return view;
    }


}

