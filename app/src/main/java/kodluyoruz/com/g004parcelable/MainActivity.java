package kodluyoruz.com.g004parcelable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText activity_main_etName, activity_main_etSchoolName, activity_main_etAge;
    Button activity_main_btnSend;


    //TODO 7-Sınıf değişkenini yarat
    StudentInfoVm studentInfoVm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();

        initEvent();


    }


    private void initView() {
        activity_main_etName = (EditText) findViewById(R.id.activity_main_etName);
        activity_main_etSchoolName = (EditText) findViewById(R.id.activity_main_etSchoolName);
        activity_main_etAge = (EditText) findViewById(R.id.activity_main_etAge);
        activity_main_btnSend = (Button) findViewById(R.id.activity_main_btnSend);

    }

    private void initEvent() {

        activity_main_btnSend.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {


        //TODO 8-Gönderilecek verilerin nasıl gönderileceğini belirt.EditTextlerden alınacak
        String name = activity_main_etName.getText().toString();
        String schoolName = activity_main_etSchoolName.getText().toString();
        int age = Integer.parseInt(activity_main_etAge.getText().toString());


        //TODO 8.1-EditText'lerden alınan veriler StudentInfoVm sınıfına gönderildi


        studentInfoVm = new StudentInfoVm(name, schoolName, age);


        //TODO 9-Diğer sayfaya geçiş için Intent Nesnesi Eklendi
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        //TODO 10-intent putExtra ile key value mantıgıyla parcelable key'i ile studentInfoVm sınıfını gonderdim
        intent.putExtra("parcelable", studentInfoVm);


        //TODO 11-Diğer activity'ye geç
        startActivity(intent);


    }
}
