package com.example.feng.design.prototype;

import android.os.Bundle;
import android.view.View;

import com.example.feng.base.BaseActivity;
import com.example.feng.design.R;

import java.io.IOException;

/**
 * Created by Feng on 2017/11/17.
 */

public class ProtoTypeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        findViewById(R.id.clone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProtoType protoTypeSrc = new ProtoType().init();
                try {
                    ProtoType protoTypeDes1 = (ProtoType) protoTypeSrc.clone();
                    ProtoType protoTypeDes2 = (ProtoType) protoTypeSrc.deepClone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
