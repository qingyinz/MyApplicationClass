package com.example.jinqh.myapplicationclass;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;


public class phone_and_qq extends AppCompatActivity {

    TextView paq_tx_1, paq_tx_2, paq_tx_name, paq_ET_1, paq_ET_2;
    Intent intent;
    ImageView ipaq_imageView1, ipaq_imageView2;
    String model_name, model_phone, model_qq;
    private Context mContext;
    View view;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_model);
        this.mContext = this;
        initview();
        initdata();
//通过系统提供的实例获得一个LayoutInflater对象  
//        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//第一个参数为xml文件中view的id，第二个参数为此view的父组件，可以为null，android会自动寻找它是否拥有父组件  
//        view = inflater.inflate(R.layout.item_model, null);
        ipaq_imageView1.setOnClickListener(myOnClickListener);
        ipaq_imageView2.setOnClickListener(myOnClickListener);
    }

    //拨打电话(跳转到拨号界面，用户手动点击拨打）
    public void diallPhone(String phoneNum) {
        Intent intent1 = new Intent(Intent.ACTION_DIAL);
        Uri data = Uri.parse("tel:" + phoneNum);
        intent1.setData(data);
        startActivity(intent1);
    }

    //拨打电话（直接拨打电话）
    public void callPhone(String phoneNum) {
        Intent intent2 = new Intent(Intent.ACTION_CALL);
        Uri data = Uri.parse("tel:" + phoneNum);
        intent2.setData(data);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent2);
    }

    //image的点击事件
    //实现拨打电话，QQ聊天
    View.OnClickListener myOnClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.model_imageView1: {
                    model_phone = intent.getStringExtra("phone");
                    diallPhone(model_phone);
                    break;
                }
                case R.id.model_imageView2: {
                    model_qq = intent.getStringExtra("qq");
                    //先检查是否安装了QQ客户端，如果安装了再打开QQ
                    if (isQQClientAvailable(mContext)) {
                        final String qqUrl = "mqqwpa://im/chat?chat_type=wpa&uin="+model_qq;
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(qqUrl)));
                    } else {
                        Toast.makeText(mContext, "请安装QQ客户端", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
            }
        }
    };

        //判断QQ客户端是否安装
        public static boolean isQQClientAvailable(Context context) {
            final PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);
            if (pinfo != null) {
                for (int i = 0; i < pinfo.size(); i++) {
                    String pn = pinfo.get(i).packageName;
                    if (pn.equals("com.tencent.mobileqq")) {
                        return true;
                    }
                }
            }
            return false;
        }

        //获得传递数据，并展现
        private void initdata() {
            intent = getIntent();//获取传来的intent对象
            model_name = intent.getStringExtra("name");
            model_phone = intent.getStringExtra("phone");//获取键值对的键名
            model_qq = intent.getStringExtra("qq");
            paq_tx_name.setText("" + model_name);
            paq_ET_1.setText("" + model_phone);
            paq_ET_2.setText("" + model_qq);

            int array[] = { R.mipmap.icbk_bk_01,R.mipmap.icbk_bk_02,R.mipmap.icbk_bk_03,R.mipmap.icbk_bk_04,R.mipmap.icbk_bk_05,R.mipmap.icbk_bk_06,R.mipmap.icbk_bk_07,R.mipmap.icbk_bk_08,R.mipmap.icbk_bk_09,R.mipmap.icbk_bk_10,R.mipmap.icbk_bk_11,R.mipmap.icbk_bk_12,R.mipmap.icbk_bk_13,R.mipmap.icbk_bk_14,R.mipmap.icbk_bk_15,R.mipmap.icbk_bk_16,R.mipmap.icbk_bk_17,R.mipmap.icbk_bk_18,R.mipmap.icbk_bk_19,R.mipmap.icbk_bk_20,R.mipmap.icbk_bk_21,R.mipmap.icbk_bk_22,R.mipmap.icbk_bk_23,R.mipmap.icbk_bk_24,R.mipmap.icbk_bk_25};
            Random rnd = new Random();
            int index = rnd.nextInt(25);
             frameLayout.setBackgroundResource(array[index]);
        }

        //初始化控件
        private void initview() {
            paq_tx_1 = findViewById(R.id.model_textView1);
            paq_tx_2 = findViewById(R.id.model_textView2);
            paq_tx_name = findViewById(R.id.model_textView_name);
            paq_ET_1 = findViewById(R.id.model_editText1);
            paq_ET_2 = findViewById(R.id.model_editText2);
            ipaq_imageView1 = findViewById(R.id.model_imageView1);
            ipaq_imageView2 = findViewById(R.id.model_imageView2);
            frameLayout=findViewById(R.id.bk_fl);


        }
    }


