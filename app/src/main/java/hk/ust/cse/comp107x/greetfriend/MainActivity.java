package hk.ust.cse.comp107x.greetfriend;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] friends_names;

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Construct a string array from the String Array resource "friends" in the strings.xml file
        friends_names = getResources().getStringArray(R.array.friends);

        //This object adapt the data, friends names, to the list view of the List Activity
        ArrayAdapter<String> arrayAdapterFriendsNames =
                new ArrayAdapter<>(this, R.layout.friend_item, friends_names);



        // This method call sets the names string array as the source of the names
        // for the list of items in the listview. The ArrayAdapter object is used
        // to adapt the string array and construct a list of layout items that are
        // then used by the ListView of the ListActivity to construct the list of friends.
        // The layout of each item is specified by the friend_item.xml file
        setListAdapter(arrayAdapterFriendsNames);

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

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // The parameter "id" indicates the index of the item that was selected from
        // the list of friends. This is used to index into the names[] array to get
        // the name of the friend selected. Rest of the code is similar to the earlier
        // exercise.

        // create a new intent. The first parameter is the Context which is the current Activity.
        // Hence we use "this". The second parameter is the Activity class that we wish to start.
        // Hence it is specified as ShowMessage.class
        Intent in = new Intent(this,ShowMessage.class);

        // Add the message as a payload to the Intent. We add data to be carried by the intern using
        // the putExtra() methods. The data is specified as a key-value pair. The first parameter is
        // the key, specified as a string, and the second parameter is the value.
        in.putExtra("message", friends_names[(int) id]);

        // We start the new activity by calling this method to inform the Android framework to start
        // the new activity. The parameter is the Intent we just created earlier
        startActivity(in);

    }
}


































