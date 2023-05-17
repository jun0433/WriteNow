package com.example.writenow.Write;

import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.writenow.R;

import com.example.writenow.Write.ChatGptApiManager;

public class WriteStudentFragment extends Fragment {
    private EditText userInputEditText;
    private Button submitButton;
    private static final String TAG = "WriteStudentFragment";


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
                sendUserInputToChatGpt(userInput);
            }
        });
        return view;
    }
    private void sendUserInputToChatGpt(String userInput) {
        // ChatGptApiManager를 사용하여 사용자 입력을 ChatGPT API로 전송
        String response = ChatGptApiManager.getChatGptResponse(userInput);

        if (response != null) {
            // 응답 처리
            handleChatGptResponse(response);
        } else {
            // API 요청 실패 처리
            Log.e(TAG, "ChatGPT API request failed");
            Toast.makeText(getActivity(), "ChatGPT API request failed", Toast.LENGTH_SHORT).show();
        }
    }

    private void handleChatGptResponse(String response) {
        // 응답 처리 로직을 구현합니다.
        // ChatGPT API로부터 받은 응답(response)을 사용하여 원하는 동작을 수행합니다.
        Toast.makeText(getActivity(), "ChatGPT 응답: " + response, Toast.LENGTH_SHORT).show();
    }

}