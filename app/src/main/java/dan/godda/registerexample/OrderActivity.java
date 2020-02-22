package dan.godda.registerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OrderActivity extends AppCompatActivity {

    String currentUserText;
    String userName;
    TextView mcurrUserTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        userName = getIntent().getSerializableExtra("userName").toString();

        currentUserText = "Current user:" + userName;
        mcurrUserTextView = (findViewById(R.id.uiCurrUserText));
        mcurrUserTextView.setText(currentUserText);

    }
}