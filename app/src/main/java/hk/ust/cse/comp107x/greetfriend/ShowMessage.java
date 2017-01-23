package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowMessage extends AppCompatActivity {

    TextView txtViwMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent in = getIntent();
        String message = in.getStringExtra("message");

        txtViwMessage = (TextView) findViewById(R.id.txtViwMessage);
        txtViwMessage.setText(message);
    }
}
