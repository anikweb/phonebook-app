package com.example.phonebook;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
public class UserDetailsActivity extends AppCompatActivity {

    Intent intent;
    TextView userDetailName,userDetailNumber,UserDetailsmobileNumber2,UserDetailsemailNumber,UserDetailsaddressNumber,UserDetailswhatsappNumber1,UserDetailswhatsappNumber2,UserDetailswhatsappNumber3,detailsPage_back_btn;
    CircleImageView circleImageView;
    ImageView userDetailsCallBTN,userDetailsMsgBTN,userDetailsEmailBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        intent = getIntent();
        userDetailName = findViewById(R.id.userDetailName);
        userDetailNumber = findViewById(R.id.userDetailNumber);
        UserDetailsmobileNumber2 = findViewById(R.id.UserDetailsmobileNumber2);
        UserDetailsemailNumber = findViewById(R.id.UserDetailsemailNumber);

        UserDetailsaddressNumber = findViewById(R.id.UserDetailsaddressNumber);
        UserDetailswhatsappNumber1 = findViewById(R.id.UserDetailswhatsappNumber1);
        UserDetailswhatsappNumber2 = findViewById(R.id.UserDetailswhatsappNumber2);
        UserDetailswhatsappNumber3 = findViewById(R.id.UserDetailswhatsappNumber3);
        detailsPage_back_btn = findViewById(R.id.detailsPage_back_btn);
        circleImageView = findViewById(R.id.userDetailsImage);
        userDetailsCallBTN = findViewById(R.id.userDetailsCallBTN);
        userDetailsMsgBTN = findViewById(R.id.userDetailsMsgBTN);
        userDetailsEmailBTN = findViewById(R.id.userDetailsEmailBTN);

        String Iname,Iemail,Iimage,IcellNumber,Iaddress;

        Iname = intent.getStringExtra("name");
        Iemail = intent.getStringExtra("email");
        Iimage = intent.getStringExtra("image");
        IcellNumber = intent.getStringExtra("cellNumber");
        Iaddress = intent.getStringExtra("address");

        userDetailName.setText(Iname);
        userDetailNumber.setText(IcellNumber);
        UserDetailsmobileNumber2.setText(IcellNumber);
        UserDetailsemailNumber.setText(Iemail);
        UserDetailsaddressNumber.setText(Iaddress);
        UserDetailswhatsappNumber1.setText(IcellNumber);
        UserDetailswhatsappNumber2.setText(IcellNumber);
        UserDetailswhatsappNumber3.setText(IcellNumber);

        Picasso.get().load(Iimage).placeholder(R.drawable.loading).into(circleImageView);

        detailsPage_back_btn.setOnClickListener(v -> {
            super.onBackPressed();
            finish();
        });

        UserDetailsmobileNumber2.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+IcellNumber));
            startActivity(callIntent);
        });
        userDetailsCallBTN.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+IcellNumber));
            startActivity(callIntent);
        });

        userDetailsMsgBTN.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",IcellNumber,null));
            callIntent.putExtra("sms_body","");
            startActivity(callIntent);

        });
        UserDetailsemailNumber.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"+Iemail)); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, Iemail);
            intent.putExtra(Intent.EXTRA_SUBJECT, "");
            startActivity(intent);
        });
        userDetailsEmailBTN.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"+Iemail)); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_EMAIL, Iemail);
            intent.putExtra(Intent.EXTRA_SUBJECT, "");
            startActivity(intent);
        });
    }

}