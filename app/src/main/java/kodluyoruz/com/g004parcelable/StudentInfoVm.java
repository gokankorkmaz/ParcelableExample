package kodluyoruz.com.g004parcelable;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by GokhanKorkmaz on 22.10.2017.
 */


//TODO 1-ViewModel Sınıfını Olustur


public class StudentInfoVm implements Parcelable {

    //TODO 2-Degiskenleri Tanımla

    //TODO 6-Sınıf kızaracak Alt Enterla metotları ekle Bitti :(
    public static final Creator<StudentInfoVm> CREATOR = new Creator<StudentInfoVm>() {
        @Override
        public StudentInfoVm createFromParcel(Parcel in) {
            return new StudentInfoVm(in);
        }

        @Override
        public StudentInfoVm[] newArray(int size) {
            return new StudentInfoVm[size];
        }
    };
    private String studentName;
    private String schoolName;


    //TODO 3-Kurucu Metotu Olustur
    private int studentAge;


    //TODO 4-Getter ve Setter Metotlarını Tanımla

    public StudentInfoVm(String studentName, String schoolName, int studentAge) {
        this.studentName = studentName;
        this.schoolName = schoolName;
        this.studentAge = studentAge;
    }


    protected StudentInfoVm(Parcel in) {
        studentName = in.readString();
        schoolName = in.readString();
        studentAge = in.readInt();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    //TODO 5-Parcelable implement et describeContents ve describeContents metotlarını eklemiş olacaksın

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }


    //TODO 5-writeToParcel metotu içine değişkenlerini yaz.D

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.getStudentName());
        parcel.writeString(this.getSchoolName());
        parcel.writeInt(this.getStudentAge());
    }


}
