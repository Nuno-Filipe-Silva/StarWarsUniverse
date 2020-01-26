package com.example.starwarsuniverse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class VehicleAdapter extends ArrayAdapter<Vehicle> {

public VehicleAdapter(Context context, ArrayList<Vehicle> vehicleArrayList){

    super(context, 0, vehicleArrayList);


}

@NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

    View listItemView = convertView;

    if(listItemView == null){

        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);

    }

    Vehicle currentVehicle = getItem(position);

    TextView nameTextView = listItemView.findViewById(R.id.name);

    nameTextView.setText(currentVehicle.getName());

    ImageView imageView = listItemView.findViewById(R.id.people_image_view);

    imageView.setImageResource(currentVehicle.getImageId());

    imageView.setVisibility(View.VISIBLE);

    return listItemView;



}


}
