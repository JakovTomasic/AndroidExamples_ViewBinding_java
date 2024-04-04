package hr.riteh.findorbind;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentActivity extends AppCompatActivity {

    public static String IS_BIND_EXTRA_FLAG = "isBind";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        if (savedInstanceState == null) {
            boolean isBind = getIntent().getBooleanExtra(IS_BIND_EXTRA_FLAG, false);
            if (isBind) {
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.content_container, BindFragment.class, null)
                        .commit();
            } else {
                getSupportFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .add(R.id.content_container, FindFragment.class, null)
                        .commit();
            }
        }

    }
}