package hr.riteh.findorbind;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FindActivity extends AppCompatActivity {

    private int stateNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_example_layout);

        TextView title = (TextView) findViewById(R.id.title_view);
        title.setText("findViewById");

        TextView stateText = (TextView) findViewById(R.id.state___text);
        stateText.setText(String.valueOf(stateNumber));

        Button clickableButton = (Button) findViewById(R.id.clickableButton);
        clickableButton.setText("Increment!");
        clickableButton.setOnClickListener(v -> {
            stateNumber++;
            stateText.setText(String.valueOf(stateNumber));
        });
    }
}