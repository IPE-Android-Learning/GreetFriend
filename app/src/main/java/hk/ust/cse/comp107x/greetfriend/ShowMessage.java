package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    TextView txtViwMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
        //We get the Intent object from this activity was actived
        Intent in = getIntent();
        //We get the parameter has been passed from another activity
        String message = in.getStringExtra("message");
        //We get the UI component txtViwMessage
        txtViwMessage = (TextView) findViewById(R.id.txtViwMessage);
        //We validate if the UI component exists
        if(txtViwMessage != null){
            txtViwMessage.setText(message);
        }
    }
}
