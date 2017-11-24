package universodoandroid.apptoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private EditText textToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = (Button) findViewById(R.id.btnToast);
        textToast = (EditText) findViewById(R.id.txtToast);

        buttonToast.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String txtT = textToast.getText().toString().trim();

                if(TextUtils.isEmpty(txtT)){

                    Toast.makeText(getApplicationContext(), getString(R.string.message_empty), Toast.LENGTH_SHORT).show();

                } else{

                    Toast.makeText(getApplicationContext(), txtT, Toast.LENGTH_SHORT).show();

                }

            }

        });

    }
}
