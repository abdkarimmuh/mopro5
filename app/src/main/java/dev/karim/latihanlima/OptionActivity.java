package dev.karim.latihanlima;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Karim on 11/1/2017.
 */

public class OptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opt1:
                Log.i("Status", "Option One Selected");
                return true;
            case R.id.opt2:
                Log.i("Status", "Option Two Selected");
                return true;
            case R.id.opt3:
                Log.i("Status", "Option Three Selected");
                return true;
            case R.id.sub1:
                Log.i("Status", "Sub Option One Selected");
                return true;
            case R.id.sub2:
                Log.i("Status", "Sub Option Two Selected");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
