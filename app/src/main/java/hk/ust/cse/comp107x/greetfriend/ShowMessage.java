package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class ShowMessage extends AppCompatActivity {

    TextView txtViwMessage;

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
    }
}
