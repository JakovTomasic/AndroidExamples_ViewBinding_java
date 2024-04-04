package hr.riteh.findorbind;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import hr.riteh.findorbind.databinding.CommonExampleLayoutBinding;

public class BindFragment extends Fragment {

    private CommonExampleLayoutBinding binding;
    private int stateNumber = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = CommonExampleLayoutBinding.inflate(inflater, container, false);

        binding.titleView.setText("View binding");

        binding.stateText.setText(String.valueOf(stateNumber));

        binding.clickableButton.setText("Increment!");
        binding.clickableButton.setOnClickListener(v -> {
            stateNumber++;
            binding.stateText.setText(String.valueOf(stateNumber));
        });

        return binding.getRoot();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}