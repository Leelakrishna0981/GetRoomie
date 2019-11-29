package com.example.getroomiecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }
    public void gotosignoutAction(View v) {
        try {
            Intent toOtherIntent = new Intent(this, MainActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }
    public void gotoHomePageAction(View v) {
        try {
            Intent toOtherIntent = new Intent(this, SignInActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }


    public void gotoRoomDetails(View v) {
        try {
            Intent toOtherIntent = new Intent(this, RoomCompleteDetailsActivity.class);
            startActivity(toOtherIntent);

        } catch (Exception e) {

        }
    }

}
