package com.example.admin.llkgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void mainClick(View view) {
        switch (view.getId()) {
            case R.id.coin:
                startGameActivity("sg_config.json");
                break;
            case R.id.dw:
                startGameActivity("sc_config.json");
                break;
            case R.id.love:
                startGameActivity("dw_config.json");
                break;
            case R.id.sc:
                startGameActivity("love_config.json");
                break;
            case R.id.sg:
                startGameActivity("coin_config.json");
                break;
        }
    }
    private void startGameActivity(String gameConfigFile) {
        Intent i = new Intent(this, LinkGameActivity.class);
        i.putExtra("configFile", gameConfigFile);
        startActivity(i);
    }
}
