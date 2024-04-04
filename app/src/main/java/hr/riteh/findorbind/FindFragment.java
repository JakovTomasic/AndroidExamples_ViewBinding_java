package hr.riteh.findorbind;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FindFragment extends Fragment {

    private int stateNumber = 0;

    // U ovom primjeru ovi views mogu biti lokalni unutar onCreateView, ali cesto cete
    // zeljeti definirati globalne views. Napisano ovako radi usporedbe s View Bindingom.
    private TextView title;
    private TextView stateText;
    private Button clickableButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.common_example_layout, container, false);

        title = root.findViewById(R.id.title_view);
        title.setText("findViewById");

        stateText = root.findViewById(R.id.state___text);
        stateText.setText(String.valueOf(stateNumber));

        clickableButton = root.findViewById(R.id.clickableButton);
        clickableButton.setText("Increment!");
        clickableButton.setOnClickListener(v -> {
            stateNumber++;
            stateText.setText(String.valueOf(stateNumber));
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        title = null;
        stateText = null;
        clickableButton = null;
    }
}