package kangkan.developer.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav=findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new BlankFragment1()).commit();

    }


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectrdFragment=null;

            switch (item.getItemId())
            {
                case  R.id.nav_home:
                    selectrdFragment=new BlankFragment1();
                    break;

                case  R.id.nav_settings:
                    selectrdFragment=new BlankFragment2();
                    break;

                case  R.id.nav_camera:
                    selectrdFragment=new BlankFragment3();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectrdFragment).commit();
            return true;
        }
    };
}
