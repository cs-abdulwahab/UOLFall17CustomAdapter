package com.example.abdul_wahab.uolfall17customadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.abdul_wahab.uolfall17customadapter.adapters.UserAdapter;
import com.example.abdul_wahab.uolfall17customadapter.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AdapterView
        ListView listView = (ListView) this.findViewById(R.id.list1);

        // DataSource
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User(1, "u1", "r1", "n1"));
        for (int i = 1; i < 1000; i++) {
            arrayList.add(new User(i + 1, "u" + i, "r" + i, "n" + i));
        }

        UserAdapter userAdapter = new UserAdapter(this, arrayList);

        listView.setAdapter(userAdapter);


    }
}
