package best.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private Button btnResult;
    private EditText edtNumberA;
    private EditText edtNumberB;
    private int numberA, numberB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnResult = (Button) findViewById(R.id.btn_Result);
        edtNumberA= (EditText) findViewById(R.id.edt_NumberA);
        edtNumberB= (EditText) findViewById(R.id.edt_NumberB);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtNumberA.getText().toString().isEmpty()&&!edtNumberB.getText().toString().isEmpty()){
                    numberA=Integer.parseInt(edtNumberA.getText().toString());
                    numberB=Integer.parseInt(edtNumberB.getText().toString());
                    TextView text_kq=(TextView)findViewById(R.id.text_kq);
                    text_kq.setText((numberA+numberB)+"");
                }
               else{
                    Toast.makeText(MainActivity.this, "Nhap so hop le", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
