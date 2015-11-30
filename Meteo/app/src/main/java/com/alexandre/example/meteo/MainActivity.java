package com.alexandre.example.meteo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aetrion.flickr.Flickr;
import com.aetrion.flickr.REST;
import com.aetrion.flickr.photos.Photo;
import com.aetrion.flickr.photos.SearchParameters;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;



public class MainActivity extends AppCompatActivity {
    Flickr f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String apikey;
        String secret;

        // Create a Flickr instance with your data. No need to authenticate
        try {
            Flickr flickr = new Flickr("2fb6799978eadf999b34b57d20776080", "51ad4ea7d45f40f8", new REST());

            // Set the wanted search parameters (I'm not using real variables in the example)
            SearchParameters searchParameters = new SearchParameters();
            searchParameters.setAccuracy(1);
            ArrayList<Photo> list = flickr.getPhotosInterface().search(searchParameters, 0, 0);

            for (Iterator iterator = list.iterator(); iterator.hasNext();) {
                Photo photo = (Photo) iterator.next();

                photo.getLargeUrl()

                ByteArrayOutputStream b = new ByteArrayOutputStream();
                b.write(photo.g);

                FileOutputStream file = new FileOutputStream("/tmp/" + photo.getId() + ".jpg");
                file.write(IOUtils.toByteArray(is));
                file.close();
            }
        }catch(Throwable e){
            e.printStackTrace();
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
