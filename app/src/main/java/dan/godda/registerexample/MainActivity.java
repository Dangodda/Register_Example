package dan.godda.registerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText muserName;
    EditText mpassWord;

    int accountCount = 10;

    String userName;
    String passWord;
    String[] accountName = new String[accountCount];
    String[] accountPass = new String[accountCount];
    boolean successfulLogin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int j=0;j<accountCount;j++)
        {
            String detailsHolder;
            detailsHolder = "WORKER" + j;
            accountName[j] = detailsHolder;
            detailsHolder = "PASS" + j;
            accountPass[j] = detailsHolder;
            j++;
        }
    }

    public void loginOnClick(View view) {
        muserName = (findViewById(R.id.uiUsernameInput));
        mpassWord = (findViewById(R.id.uiPasswordInput));

        userName = muserName.getText().toString();
        passWord = mpassWord.getText().toString();

        for (int i = 0; i < accountCount; i++)
        {
            if (userName.equals(accountName[i]))
            {
                if (passWord.equals(accountPass[i]))
                {
                    successfulLogin = true;
                }
            }
            i++;
        }

        if(successfulLogin)
        {
            loggedIn();
        }
        else
        {
            Toast.makeText(this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
        }
    }

    public void loggedIn()
    {
            Intent i = new Intent(getApplicationContext(), OrderActivity.class);
            i.putExtra("Username", userName);
            startActivity(i);
    }

}
