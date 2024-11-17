package com.example.poinofsupport;

import static androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
import static androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.poinofsupport.model.About;
import com.example.poinofsupport.model.Contacts;
import com.example.poinofsupport.ui.screens.AboutFragment;


public abstract class BaseActivity extends AppCompatActivity {
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
        } else {
            return null;
        }
    }

    public void setToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Точка опоры");
    }
}
