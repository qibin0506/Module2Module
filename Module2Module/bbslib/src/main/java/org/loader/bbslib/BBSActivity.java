package org.loader.bbslib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.loader.router.Router;
import org.loader.router.rule.ActivityRule;
import org.loader.utilslib.Application;
import org.loader.utilslib.Logger;
import org.loader.utilslib.UseContext;

public class BBSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(50);
        tv.setText("BBS!!!");
        setContentView(tv);

        Logger.dump("TAG", "Hei! I am bbs!!!");
        UseContext.use(Application.get());

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = Router.invoke(BBSActivity.this, ActivityRule.ACTIVITY_SCHEME + "shop.main");
                startActivity(it);
            }
        });
    }
}
