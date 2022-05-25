package com.example.fab.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import com.example.fab.R;
import com.example.fab.databinding.FragmentPayBinding;
import com.example.fab.viewmodels.ShopViewModel;



public class PayFragment extends Fragment {
    NavController navController;
    FragmentPayBinding fragmentPayBinding;
    ShopViewModel shopViewModel;
    EditText Name, address, emailadress, phonenumber;


    public PayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_order, container, false);
        fragmentPayBinding = FragmentPayBinding.inflate(inflater, container, false);
        return fragmentPayBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Name = view.findViewById(R.id.Name);
        address = view.findViewById(R.id.Address);
        emailadress = view.findViewById(R.id.Emailaddress);
        phonenumber = view.findViewById(R.id.Phonenumber);

        navController = Navigation.findNavController(view);
        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        fragmentPayBinding.Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = Name.getText().toString().trim();
                final String location = address.getText().toString().trim();
                final String Emailaddress = emailadress.getText().toString().trim();
                final String phone = phonenumber.getText().toString().trim();

                if (name.isEmpty()) {
                    Name.setError("Fullname is required !");
                    Name.requestFocus();
                    return;
                } else if (name.length() < 3) {
                    Name.setError("Name should be more than 3 !");
                    Name.requestFocus();
                    return;
                } else if (location.isEmpty()) {
                    address.setError("Address is required !");
                    address.requestFocus();
                    return;
                } else if (location.length() < 4) {
                    address.setError("Address should be more than 4 !");
                    address.requestFocus();
                    return;

                } else if (Emailaddress.isEmpty()) {
                    emailadress.setError("Email address is required !");
                    emailadress.requestFocus();
                    return;

                } else if (Emailaddress.length() < 5) {
                    emailadress.setError("Email address should be more than 5 !");
                    emailadress.requestFocus();
                    return;
                } else if (phone.isEmpty()) {
                    phonenumber.setError("Phone numer is required");
                    phonenumber.requestFocus();
                    return;
                } else if (phone.length() < 7) {
                    phonenumber.setError("Phone number should be 8 numbers");
                    phonenumber.requestFocus();
                    return;
                }else
                    navController.navigate(R.id.action_payFragment_to_orderFragment);

            }

        });
    }
}

