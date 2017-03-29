package com.spice.spicestyle;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.spice.spicestyle.fragments.MoreFragment;
import com.spice.spicestyle.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private LinearLayout llFragmentChange;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewIds();

        setClickListenter();
    }

    private void findViewIds(){
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        llFragmentChange = (LinearLayout) findViewById(R.id.llFragmentChange);

    }

    private void setClickListenter(){
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menu_home:

                    case R.id.menu_search:

                        SearchFragment searchFragment = new SearchFragment();
                        replaceFragment(searchFragment);
                        break;
                    case R.id.menu_cart:

                        break;
                    case R.id.menu_account:

                        break;
                    case R.id.menu_more:
                        MoreFragment moreFragment = new MoreFragment();
                        replaceFragment(moreFragment);

                        break;


                }


                return true;
            }
        });
    }
    //End of onCreate()

    private void replaceFragment(Fragment fragment){


        FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack if needed
        transaction.replace(R.id.llFragmentChange, fragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();

    }
}
