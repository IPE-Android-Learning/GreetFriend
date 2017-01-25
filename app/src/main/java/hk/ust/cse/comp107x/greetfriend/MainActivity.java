package hk.ust.cse.comp107x.greetfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        //We create a Intent intace so that we can start another activity
        Intent in = new Intent(this, ShowMessage.class);
        in.putExtra("message", edtTxtFiendName.getText().toString());
        startActivity(in);
    }
}


































