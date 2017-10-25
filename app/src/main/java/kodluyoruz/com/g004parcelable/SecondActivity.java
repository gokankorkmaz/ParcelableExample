package kodluyoruz.com.g004parcelable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView activity_main_tvName, activity_main_tvSchoolName, activity_main_tvAge;

    //TODO 12-Sınıf değişkeni olustur
    StudentInfoVm studentInfoVm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        initView();

        //TODO 13-Bundle nesnesi olusturup gelen veriyi al
        Bundle bundle = getIntent().getExtras();

        //TODO 14-Gelen veriyi Bundle verdiğin key ile cek

        studentInfoVm = bundle.getParcelable("parcelable");

        initEvent();


    }

    private void initEvent() {
        //TODO 15-Gelen veriyi istediğin yerde kullanabilirsin
        activity_main_tvName.setText(studentInfoVm.getStudentName().toString());
        activity_main_tvSchoolName.setText(studentInfoVm.getSchoolName().toString());
        activity_main_tvAge.setText(studentInfoVm.getStudentAge() + " ");

    }

    private void initView() {
        activity_main_tvName = (TextView) findViewById(R.id.activity_main_tvName);
        activity_main_tvSchoolName = (TextView) findViewById(R.id.activity_main_tvSchoolName);
        activity_main_tvAge = (TextView) findViewById(R.id.activity_main_tvAge);

    }
}
