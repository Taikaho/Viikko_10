package olio_ohjelmointi.viikko_9;

import static olio_ohjelmointi.viikko_9.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText mailInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstNameInput = findViewById(R.id.txtInputFirstName);
        lastNameInput = findViewById(R.id.txtInputLastName);
        mailInput = findViewById(R.id.txtInputMail);

    }

    public void addUser(View view) {

        String firstNameString = firstNameInput.getText().toString();
        String lastNameString = lastNameInput.getText().toString();
        String mailString = mailInput.getText().toString();
        String degree = "";

        RadioGroup rgDegreeProgram = findViewById(R.id.rgDegreeProgram);

        if (rgDegreeProgram.getCheckedRadioButtonId() == R.id.rbTietotekniikka) {
            degree = "Tietotekniikka";
        } else if (rgDegreeProgram.getCheckedRadioButtonId() == R.id.rbTuotantotalous) {
            degree = "Tuotantotalous";
        } else if (rgDegreeProgram.getCheckedRadioButtonId() == R.id.rbLaskennallinenTekniikka) {
            degree = "Laskennallinen tekniikka";
        } else if (rgDegreeProgram.getCheckedRadioButtonId() == R.id.rbSahkotekniikka) {
            degree = "Sähkötekniikka";
        }
        UserStorage.getInstance().addUser(new User(firstNameString, lastNameString, mailString, degree));

    }
}