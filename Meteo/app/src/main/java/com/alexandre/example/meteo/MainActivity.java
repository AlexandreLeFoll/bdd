package com.alexandre.example.meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.test.TestInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    public static final String BASE_URL = "https://query.yahooapis.com";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Collection<Objects> results = null;
        try {
            String apiKey = "2fb6799978eadf999b34b57d20776080";
            String sharedSecret = "51ad4ea7d45f40f8";
            Flickr f;
            f = new Flickr(apiKey, sharedSecret, new REST());
            //TestInterface testInterface = f.getTestInterface();
            // = testInterface.echo(Collections.EMPTY_MAP);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(results!=null){
            ((TextView)findViewById(R.id.test)).setText(results.size());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
