package cn.ud.testbugly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.bugly.Bugly;

/**
 * @author liu
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CrashReport.initCrashReport(getApplicationContext(), "d3c2795c01", true);

        Bugly.init(getApplicationContext(), "d3c2795c01", false);
//        findViewById(R.id.bt_test).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CrashReport.testJavaCrash();
//
//            }
//        });


    }
}
