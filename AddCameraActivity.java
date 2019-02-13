package com.****.******.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;



/**
 * Created by xuying on 2018/8/27.
 * 摄像头添加方式 
 */

public class AddCameraActivity extends BaseActivity implements View.OnClickListener{

    private TitleLayout titleLayout;
    private PercentRelativeLayout wave_camera,ap_hot_camera,connection_camera;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_camera);
        initView();
    }

    /**
     * 视图初始化
     */
    public void initView(){
        titleLayout = findViewById(R.id.title);
        titleLayout.setTitle(getResources().getString(R.string.connect_type));
        wave_camera = findViewById(R.id.wave_camera);
        ap_hot_camera = findViewById(R.id.ap_hot_camera);
        connection_camera = findViewById(R.id.connection_camera);

        wave_camera.setOnClickListener(this);
        ap_hot_camera.setOnClickListener(this);
        connection_camera.setOnClickListener(this);
    }

    public static void startIntent(Context context){
        Intent intent = new Intent(context,AddCameraActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wave_camera:
                CameraWaveOneActivity.startIntent(this);
                break;
            case R.id.ap_hot_camera:
                CameraAPHotOneActivity.startIntent(this);
                break;
            case R.id.connection_camera:
                CameraConnectionActivity.startIntent(this);
                break;
                default:
                    break;
        }
    }
}
