package com.example.writenow.Write;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.writenow.R;


public class WriteStudentFragment extends Fragment {
    private EditText userInputEditText;
    private Button submitButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_write_student,container,false);
        userInputEditText = view.findViewById(R.id.editText);
        submitButton = view.findViewById(R.id.appCompatButton);

        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String userInput = userInputEditText.getText().toString();
                handleUerInput(userInput);
            }
        });
        return view;
    }
    private void handleUerInput(String userInput){
        Toast.makeText(getActivity(),"사용자 입력: "+ userInput,Toast.LENGTH_SHORT).show();
    }
}