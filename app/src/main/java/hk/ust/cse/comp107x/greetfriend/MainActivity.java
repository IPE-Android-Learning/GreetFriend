package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btnGreeting;
    EditText edtTxtFiendName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get a reference to the btnGreeting button on the UI
        btnGreeting = (Button)findViewById(R.id.btnGreeting);
        //get a reference to the edtTxtFriendName EditText on the UI so that we can read in
        // the value typed by the user
        edtTxtFiendName = (EditText)findViewById(R.id.edtTxtFriendName);
        //Set the onClickListener for the btnGreeting Button
        btnGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListenerBtnGreeting (v);
            }
        });
    }

    private void onClickListenerBtnGreeting(View v){
        //TODO 1
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

        //We create a Intent intace so that we can start another activity
        Intent in = new Intent(this, ShowMessage.class);
        in.putExtra("message", timeGreet+edtTxtFiendName.getText()+"!");
        startActivity(in);
    }
}


































