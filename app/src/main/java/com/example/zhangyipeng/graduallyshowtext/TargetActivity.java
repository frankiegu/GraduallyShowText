package com.example.zhangyipeng.graduallyshowtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhangyipeng.gradually_show_text.view.XTextView;

public class TargetActivity extends AppCompatActivity {

    private XTextView xtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        xtv = (XTextView) findViewById(R.id.xtv);

        String alignment = getIntent().getStringExtra("alignment");
        if(alignment.equals("normal")){
            testOne();
        }else if(alignment.equals("center")){
            testTwo();
        }else if(alignment.equals("opposite")){
            testThree();
        }

    }

    private void testOne() {
        String s = "http://www.jianshu.com/p/6d97b4a10b18\n" +
                "ubuntu12.04(64bit)编译android4.4源码、sdk及kernel\n" +
                "字数2619 阅读286 评论6 喜欢16\n" +
                "Get ready for the next version of Android! Test your apps on Nexus and other devices." +
                " Support new system behaviors to save power and memory. Extend your apps with multi-window UI," +
                " direct reply notifications and more.";
        xtv.setTextContent(s);
        xtv.setDelayPlayTime(200);
        xtv.setTextAlignment("normal");

    }

    private void testTwo() {
        String s = "天龙群侠传\n" +
                "御剑乘风来,除魔天地间\n" +
                "有酒唯我醉,无酒我亦颠\n" +
                "一饮尽江河,再饮吞日月\n" +
                "千杯我不醉,唯我酒剑仙";
        xtv.setTextContent(s);
        xtv.setTextAlignment("center");
        xtv.setTextSpacingMult(2.0f);
        xtv.setTextSpacingAdd(2.0f);
    }
    private void testThree() {
        String s = "天龙群侠传\n" +
                "御剑乘风来,除魔天地间\n" +
                "有酒唯我醉,无酒我亦颠\n" +
                "一饮尽江河,再饮吞日月\n" +
                "千杯我不醉,唯我酒剑仙";
        xtv.setTextContent(s);
        xtv.setTextAlignment("opposite");
        xtv.setTextSpacingMult(2.0f);
    }
}
