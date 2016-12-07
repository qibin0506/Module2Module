package org.loader.shoplib;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.loader.annotation.StaticRouter;
import org.loader.router.rule.ActivityRule;
import org.loader.utilslib.Application;
import org.loader.utilslib.Logger;
import org.loader.utilslib.UseContext;

@StaticRouter(ActivityRule.ACTIVITY_SCHEME + "shop.main")
public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(50);
        tv.setText("SHOP!!!");
        setContentView(tv);

        Logger.dump("TAG", "Hei! I am shop!!!");
        UseContext.use(Application.get());

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = org.loader.router.Router.invoke(ShopActivity.this, ActivityRule.ACTIVITY_SCHEME + "org.loader.bbslib.BBSActivity");
                startActivity(it);
            }
        });
    }
}
