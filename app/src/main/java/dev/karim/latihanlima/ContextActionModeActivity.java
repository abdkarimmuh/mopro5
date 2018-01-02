package dev.karim.latihanlima;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Karim on 11/1/2017.
 */
public class ContextActionModeActivity extends AppCompatActivity implements View.OnLongClickListener {
    private ActionMode.Callback mActionModeCallback;
    private ActionMode mActionMode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_action_mode);
        mActionModeCallback = new ActionMode.Callback(){
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                mode.setTitle("Setting");
                MenuInflater inflater = mode.getMenuInflater();
                inflater.inflate(R.menu.action_context_menu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_share:
                        Toast.makeText(getApplicationContext(), "Option Share Clicked", Toast.LENGTH_LONG).show();
                        mode.finish();
                        return true;
                    default:
                        return false;
                }
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                mActionMode = null;
            }
        };
        TextView tv = (TextView) findViewById(R.id.txt1);
        tv.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View v) {
        if (mActionMode != null){
            return false;
        }
        mActionMode = this.startActionMode(mActionModeCallback);
        v.setSelected(true);
        return true;
    }
}
