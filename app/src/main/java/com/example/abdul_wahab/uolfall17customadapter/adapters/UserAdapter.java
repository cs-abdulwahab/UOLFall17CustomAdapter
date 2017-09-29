package com.example.abdul_wahab.uolfall17customadapter.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
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

    class ViewHolder {
        TextView tvUsername;
        TextView tvRollNumber;
    }


    private static final String TAG = "MTAG";

    public UserAdapter(@NonNull Context context, @NonNull List<User> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "convertview : " + convertView);
        View view = convertView;
        ViewHolder vh;
        User u = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.user_item_list, parent, false);

            TextView tvUsername = (TextView) view.findViewById(R.id.tvUsername);
            TextView tvRollNumber = (TextView) view.findViewById(R.id.tvRollNumber);

            vh = new ViewHolder();
            vh.tvUsername = tvUsername;
            vh.tvRollNumber = tvRollNumber;
            view.setTag(vh);
        }

        vh = (ViewHolder) view.getTag();

        vh.tvUsername.setText(u.getUsername());
        vh.tvRollNumber.setText(u.getRollnumber());


        return view;

    }

}

