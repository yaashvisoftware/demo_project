package com.spice.spicestyle;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.spice.spicestyle.fragments.MoreFragment;
import com.spice.spicestyle.fragments.MyAccountFragment;
import com.spice.spicestyle.fragments.MyProfileFragment;
import com.spice.spicestyle.fragments.PaymentFragment;
import com.spice.spicestyle.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private LinearLayout llFragmentChange;

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
                        Fragment fragmentPayment = new PaymentFragment();
                        replaceFragment(fragmentPayment);
                        break;
                    case R.id.menu_search:

                        SearchFragment searchFragment = new SearchFragment();
                        replaceFragment(searchFragment);
                        break;
                    case R.id.menu_cart:

                        MyProfileFragment myProfileFragment = new MyProfileFragment();
                        replaceFragment(myProfileFragment);
                        break;
                    case R.id.menu_account:

                        MyAccountFragment myAccountFragment = new MyAccountFragment();
                        replaceFragment(myAccountFragment);
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
        transaction.replace(R.id.llFragmentChange, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
