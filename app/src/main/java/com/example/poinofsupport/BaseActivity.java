package com.example.poinofsupport;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.poinofsupport.model.About;
import com.example.poinofsupport.model.Contacts;


public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_about) {

            Intent intent = new Intent(BaseActivity.this, About.class);
            startActivity(intent);
            return true;

        } else if (item.getItemId() == R.id.menu_item_news) {

            Intent intent = new Intent(BaseActivity.this, MainActivity.class);
            startActivity(intent);
            return true;

        } else if (item.getItemId() == R.id.menu_item_contacts) {

            Intent intent = new Intent(BaseActivity.this, Contacts.class);
            startActivity(intent);
            return true;

        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void setToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Точка опоры");
    }
}
