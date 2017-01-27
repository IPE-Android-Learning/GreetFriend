package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class ShowMessage extends AppCompatActivity {

    TextView txtViwMessage;

    private static final String TAG = ShowMessage.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent in = getIntent();
        //TODO 2
        setContentView(R.layout.activity_show_message);
        //Get the current date and time
        Date currentDate = new Date();
        //Get a instance of Calendar, so that we can get only the hour of the day
        Calendar currentCalendarDate = Calendar.getInstance();
        //Set the current day to the calendar instance
        currentCalendarDate.setTime(currentDate);
        //Now we can get the current hour of the day
        int currentHour = currentCalendarDate.get(Calendar.HOUR_OF_DAY);

        String timeGreet;

        //Get the greeting depending on the time of day
        if(currentHour > 6 & currentHour <=12){
            timeGreet = getString(R.string.goodmorning);
        }else if(currentHour > 12 & currentHour <=17){
            timeGreet = getString(R.string.goodafternoon);
        }else if(currentHour > 17 & currentHour <= 21){
            timeGreet = getString(R.string.goodevening);
        }else {
            timeGreet = getString(R.string.goodnight);
        }

        String message = in.getStringExtra("message");

        txtViwMessage = (TextView) findViewById(R.id.txtViwMessage);
        if(txtViwMessage != null)
            txtViwMessage.setText(timeGreet + message + "!");

        Log.i(TAG, "onCreate()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }
}
