package com.example.getroomiecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Room1DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room1_details);
    }

    public void gotosignoutAction(View v) {
        try {
            Intent toOtherIntent = new Intent(this, MainActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }
    public void gotohomePage(View v) {
        try {
            Intent toOtherIntent = new Intent(this,SignInActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }
    public void gotoSearchResultsImagesAction(View v) {
        try {
            Intent toOtherIntent = new Intent(this, SearchResultsImagesActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }
    public void gotoContactAction(View v) {
        try {
            Intent toOtherIntent = new Intent(this, ContactActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }
}
