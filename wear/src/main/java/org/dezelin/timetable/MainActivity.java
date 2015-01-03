package org.dezelin.timetable;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;

import butterknife.ButterKnife;

public class MainActivity extends Activity {

    //@InjectView(R.id.text)
    //protected TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                ButterKnife.inject(MainActivity.this, stub);
            }
        });
    }
}
