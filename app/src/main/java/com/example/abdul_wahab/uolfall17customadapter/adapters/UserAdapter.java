package com.example.abdul_wahab.uolfall17customadapter.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.abdul_wahab.uolfall17customadapter.R;
import com.example.abdul_wahab.uolfall17customadapter.models.User;

import java.util.List;

/**
 * Created by Abdul-Wahab on 9/28/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {


    public UserAdapter(@NonNull Context context, @NonNull List<User> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.user_item_list, parent,false);
        User u = getItem(position);
        TextView tvUsername = (TextView) view.findViewById(R.id.tvUsername);
        TextView tvRollNumber = (TextView) view.findViewById(R.id.tvRollNumber);

        tvUsername.setText(u.getUsername());
        tvRollNumber.setText(u.getRollnumber());


        return view;

    }

}

