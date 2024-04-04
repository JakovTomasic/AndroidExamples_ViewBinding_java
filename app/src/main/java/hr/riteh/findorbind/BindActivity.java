package hr.riteh.findorbind;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import hr.riteh.findorbind.databinding.CommonExampleLayoutBinding;

public class BindActivity extends AppCompatActivity {

    private CommonExampleLayoutBinding binding;
    private int stateNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = CommonExampleLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.titleView.setText("View binding");

        binding.stateText.setText(String.valueOf(stateNumber));

        binding.clickableButton.setText("Increment!");
        binding.clickableButton.setOnClickListener(v -> {
            stateNumber++;
            binding.stateText.setText(String.valueOf(stateNumber));
        });
    }
}