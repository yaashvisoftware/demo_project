package com.spice.spicestyle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewIds();

        setClickListenter();
    }

    private void findViewIds(){
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

    }

    private void setClickListenter(){
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menu_home:
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_search:
                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_cart:
                        Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_account:
                        Toast.makeText(MainActivity.this, "account", Toast.LENGTH_SHORT).show();
                        break;
                    /*case R.id.menu_more:
                        Toast.makeText(MainActivity.this, "More", Toast.LENGTH_SHORT).show();
                        break;*/


                }


                return true;
            }
        });
    }

}
