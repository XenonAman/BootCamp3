package com.example.amank.bootcamp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.itm1:
            {
                // Toast.makeText(getApplicationContext(), "Item 1 selected", Toast.LENGTH_SHORT).show();
            }
            case R.id.itm2:
            {
               // Toast.makeText(getApplicationContext(), "Item 2 Selected", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.itm3:
            {
                //Toast.makeText(getApplicationContext(), "Item 3 Selected", Toast.LENGTH_SHORT).show();
                return true;
            }
            default:{
                //Toast.makeText(this, "Caandni raat", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
            }
        }
    }



}
