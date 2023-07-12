package olio_ohjelmointi.viikko_9;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView firstName, lastName, mail, degreeProgramm;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName = itemView.findViewById(R.id.txtInputFirstName);
        lastName = itemView.findViewById(R.id.txtInputLastName);
        mail = itemView.findViewById(R.id.txtMail);
        degreeProgramm = itemView.findViewById(R.id.txtDegreeProgram);


    }
}

