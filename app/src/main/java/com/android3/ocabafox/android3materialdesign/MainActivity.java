package com.android3.ocabafox.android3materialdesign;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.android3.ocabafox.android3materialdesign.Fragment.CollapsingToolbarLayoutFragment;
import com.android3.ocabafox.android3materialdesign.Fragment.CoordinatorLayoutFragment;
import com.android3.ocabafox.android3materialdesign.Fragment.FABFragment;
import com.android3.ocabafox.android3materialdesign.Fragment.NavigationViewFragment;
import com.android3.ocabafox.android3materialdesign.Fragment.SbackBarFragment;
import com.android3.ocabafox.android3materialdesign.Fragment.TabLayoutFragment;
import com.android3.ocabafox.android3materialdesign.Fragment.ToolBarFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    DrawerLayout drawerLayout;
    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    TabLayout tabLayout;
    NavigationView navigationView;
    FloatingActionButton fab;

    FABFragment fabFragment;
    CoordinatorLayoutFragment coordinatorLayoutFragment;
    NavigationViewFragment navigationViewFragment;
    TabLayoutFragment tabLayoutFragment;
    ToolBarFragment toolBarFragment;
    SbackBarFragment sbackBarFragment;
    CollapsingToolbarLayoutFragment collapsingToolbarLayoutFragment;

    int aw=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().findItem(aw);

        fabFragment = new FABFragment();
        coordinatorLayoutFragment = new CoordinatorLayoutFragment();
        collapsingToolbarLayoutFragment = new CollapsingToolbarLayoutFragment();
        sbackBarFragment = new SbackBarFragment();
        tabLayoutFragment = new TabLayoutFragment();
        navigationViewFragment = new NavigationViewFragment();
        toolBarFragment = new ToolBarFragment();



        setupNavigationView();
        setupToolbar();

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int x = 0;
        switch (item.getItemId()) {
            case android.R.id.home:
                if(drawerLayout != null)
                    drawerLayout.openDrawer(GravityCompat.START);
                x = item.getItemId();
                return true;
        }
        Toast.makeText(this,""+x,Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }

    private void setupNavigationView(){

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);


    }






    private void setupToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null)
            setSupportActionBar(toolbar);

        // Show menu icon
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        menuItem.setChecked(true);

        aw = menuItem.getItemId();

        navigate(aw);
        return true;
    }


    public void navigate(int item){
        switch (item){
            case R.id.navigation_item_1:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, toolBarFragment)
                        .commit();
                break;
            case R.id.navigation_item_2:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fabFragment)
                        .commit();
                break;
            case R.id.navigation_item_3:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, sbackBarFragment)
                        .commit();
                break;
            case R.id.navigation_item_4:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, tabLayoutFragment)
                        .commit();
                break;
            case R.id.navigation_item_5:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, coordinatorLayoutFragment)
                        .commit();
                break;
            case R.id.navigation_item_6:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, collapsingToolbarLayoutFragment)
                        .commit();
                break;
            case R.id.navigation_item_7:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, navigationViewFragment)
                        .commit();
                break;
        }
    }
}
