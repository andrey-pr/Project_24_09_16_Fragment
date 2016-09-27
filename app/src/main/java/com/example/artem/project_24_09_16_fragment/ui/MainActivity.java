package com.example.artem.project_24_09_16_fragment.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.artem.project_24_09_16_fragment.R;
import com.example.artem.project_24_09_16_fragment.fragment.StoreFragment;
import com.example.artem.project_24_09_16_fragment.fragment.ToolFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private StoreFragment sf;
    private ToolFragment tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.container_main);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        sf = new StoreFragment();
        fragmentTransaction.replace(R.id.container, sf);
        fragmentTransaction.commit();
//        FragmentManager fm1 = getFragmentManager();
//        FragmentTransaction ft1 = fm1.beginTransaction();
//        ft1.add(R.id.framecontainer, new StoreFragment());
//        ft1.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.container);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Toast.makeText(getApplicationContext(), "Кота покормили?", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(getApplicationContext(), "Кота покормили?", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_slideshow) {
            Toast.makeText(getApplicationContext(), "Кота покормили?", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Toast.makeText(getApplicationContext(), "Кота покормили?", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            Toast.makeText(getApplicationContext(), "Кота покормили?", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_send) {
            Toast.makeText(getApplicationContext(), "Кота покормили?", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.container);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
