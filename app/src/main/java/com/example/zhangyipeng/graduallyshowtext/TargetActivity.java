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
                "最近闲来无事，就想编译一下android源码折腾折腾。过程还算顺利，编译源码用了近3小时，编译sdk用了近30分钟。关于为什么要编译4.4的源码，而不编译5.0、6.0的源码，一是正好笔记本中有下载好的4.4源码；二是一些源码学习的资料大都是4.x、2.x的源码，而且4.4系统也是现在市场占有率最大的；三是基于4.4的源码编译，出现问题易于解决，因为大家都遇到过嘛(嘿嘿！)。\n" +
                "\n" +
                "当然类似的文章教程很多，我主要是记录自己编译源码的过程以及遇到的一些问题，方便自己以后查看。";
        xtv.setTextContent(s);
        xtv.setDelayPlayTime(300);
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
