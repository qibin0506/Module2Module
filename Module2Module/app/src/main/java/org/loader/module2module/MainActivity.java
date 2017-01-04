package org.loader.module2module;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.loader.router.Router;
import org.loader.router.rule.ActivityRule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        if (Router.resolveRouter(ActivityRule.ACTIVITY_SCHEME + "shop.main")) {
            Intent it = Router.invoke(this, ActivityRule.ACTIVITY_SCHEME + "shop.main");
            startActivity(it);
        }
    }
}
