package com.app.hudhud.islam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

/**
 * Created by Hadi on 08-05-2017.
 */

public class Fasten_Sojler extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter_Fasten_Sojler(getSupportFragmentManager()));

        // Give the PagerSlidingTabStrip the ViewPager
        SmartTabLayout tabView = findViewById(R.id.main_tab_view);
        tabView.setViewPager(viewPager);
        Toolbar toolbar = findViewById(R.id.main_title);
        toolbar.setTitle("Fastens søjler");

//        getSupportActionBar().setTitle("Fastens søjler");
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#8b4513")));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu_main, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.Forside) {
            intent = new Intent(this, Frontpage.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
