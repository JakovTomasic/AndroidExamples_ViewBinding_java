package hr.riteh.findorbind;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import hr.riteh.findorbind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnFind.setOnClickListener(v -> startActivity(new Intent(this, FindActivity.class)));
        binding.btnBind.setOnClickListener(v -> startActivity(new Intent(this, BindActivity.class)));
        binding.btnFragmentFind.setOnClickListener(v -> {
            Intent intent = new Intent(this, FragmentActivity.class);
            intent.putExtra(FragmentActivity.IS_BIND_EXTRA_FLAG, false);
            startActivity(intent);
        });
        binding.btnFragmentBind.setOnClickListener(v -> {
            Intent intent = new Intent(this, FragmentActivity.class);
            intent.putExtra(FragmentActivity.IS_BIND_EXTRA_FLAG, true);
            startActivity(intent);
        });
    }
}