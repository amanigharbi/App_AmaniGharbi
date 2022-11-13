package com.example.app_amanigharbi.ui.phone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app_amanigharbi.databinding.FragmentPhoneBinding;

public class PhoneFragment extends Fragment {

    private FragmentPhoneBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PhoneViewModel homeViewModel =
                new ViewModelProvider(this).get(PhoneViewModel.class);

        binding = FragmentPhoneBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPhone;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}