package com.alivepython.gradecalculator.home;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.alivepython.gradecalculator.R;
import com.alivepython.gradecalculator.databinding.FragmentHomeBinding;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog= new Dialog(getActivity());
                dialog.setContentView(R.layout.custom_user_input_dialogue);

                EditText semesterNameEdittext= dialog.findViewById(R.id.semesterName);
                Button button_create_semester= dialog.findViewById(R.id.button_create_semester);

                button_create_semester.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        if (semesterNameEdittext.getText().toString().trim().equals("")){
                            Toast.makeText(getActivity(), "Please enter semester name.", Toast.LENGTH_SHORT).show();
                        }else {
                            String semesterName= semesterNameEdittext.getText().toString().trim();
                            Toast.makeText(getActivity(), semesterName+" is created.", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                        }
                    }
                });
                dialog.show();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}