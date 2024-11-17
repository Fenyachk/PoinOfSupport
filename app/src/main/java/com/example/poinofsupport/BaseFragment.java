package com.example.poinofsupport;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.example.poinofsupport.ui.screens.AboutFragment;
import com.example.poinofsupport.ui.screens.ContactsFragment;
import com.example.poinofsupport.ui.screens.MainFragment;


public abstract class BaseFragment extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Class<? extends Fragment> menuFragment = getFragmentById(item.getItemId());

        if (menuFragment == null) {
            return super.onOptionsItemSelected(item);
        } else {
            setFragment(menuFragment);
            return true;
        }
    }

    public void setFragment(Class<? extends Fragment> fragment) {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, fragment, null)
                .addToBackStack(fragment.getName())
                .commit();
    }

    public Class<? extends Fragment> getFragmentById(int id) {
        if (id == R.id.menu_item_about) {
            return AboutFragment.class;
        }
        else if (id == R.id.menu_item_news) {
            return MainFragment.class;
        }
        else if (id == R.id.menu_item_contacts) {
            return ContactsFragment.class;
        }
        else {
            return null;
        }
    }

    public void setToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Точка опоры");
    }
}
