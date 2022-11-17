package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phonebook.adapter.PhonebookAdapter;
import com.example.phonebook.data.People;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<People> people;
    RecyclerView recyclerView;
    PhonebookAdapter adapter;
    TextView add_home_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        add_home_btn = findViewById(R.id.add_home_btn);

        people = new ArrayList<>();

        people.add(new People("AD Niloy","niloydutta2468@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t39.30808-6/296385121_1866107750249786_1446664864044037183_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEGCUBWOWArzgmq9WFlFWfndcSPwoE1v311xI_CgTW_fStG7PjEgDqUlYOiWh9eVsvOs1q2VI8Gl3UJ1u-Ggxfr&_nc_ohc=lh8O299UFBcAX-yB-MG&_nc_ht=scontent.fdac142-1.fna&oh=00_AfA5LeOe1vE_4u7KR4miBJdj4RgDBRqykHMs5bAnSZe2ug&oe=63793F61","01304198022","Kobor khana, Mymensingh"));
        people.add(new People("Ariful Islam Arif","arif@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t39.30808-6/298780429_1457346844781609_5750734422505666878_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeGidtKpHRXhT1nH-0Nk9m6zkUGqRTbY5FaRQapFNtjkVhVX_Ds4WUejJD7pDh1XORIQ6fhYoDOXKSouwbOkrXKt&_nc_ohc=-0Fxw3F_EygAX8C3yAE&tn=PnmXzvCIC6iTRSLA&_nc_ht=scontent.fdac142-1.fna&oh=00_AfB-C1gceGS_qFdtclCT6PTwUUS61C_zeAWzUm6HgwspVQ&oe=6378FB15","0123456789","Pabna"));
        people.add(new People("Anik Kumar Nandi","aniknandi.it@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t1.6435-9/176601258_1680234215497837_2868847107966502975_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEzSrBwZQSCU8BQKBbPFqSlDbIDpBgvZAANsgOkGC9kAG4rfiaO5Emkm9UtiLd2Nto1iem4xmN8Qr1Ff_abUp0J&_nc_ohc=7Apj7CclePkAX8Qp4MS&tn=PnmXzvCIC6iTRSLA&_nc_ht=scontent.fdac142-1.fna&oh=00_AfAb_RqUYNVmmR07loJVgTfBKzi0V5-iPkVPxAbn2O0Bzw&oe=639B566A","01783674575","Atharabari, Ishwarganj, Mymensingh"));
        people.add(new People("Creative IT Institute","help@creativeitinstitute.com","https://bestlistbd.com/wp-content/uploads/classified-listing/2021/12/64478036_2427346153983298_9018223001270747136_n.png","01777308777","Dhanmondi 4, Dhaka"));
        people.add(new People("Elon Musk","elon@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Elon_Musk_Royal_Society_%28crop2%29.jpg/1200px-Elon_Musk_Royal_Society_%28crop2%29.jpg","0123456789","America"));
        people.add(new People("Sabbir Hasan Hridoy","sabbirhasan94753@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t1.6435-9/82007462_942054449522759_8003645520004251648_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=174925&_nc_eui2=AeFNJfcPPcjskbL5nnLWz149nA1OOX4P8zycDU45fg_zPCqeodo0VH1-0xco_4A4MvJfgBLxnp776kgkeGWg2hlQ&_nc_ohc=r4eblavNB8cAX8Ks_es&tn=PnmXzvCIC6iTRSLA&_nc_ht=scontent.fdac142-1.fna&oh=00_AfD3MSL3Zkou4nZ_RwNquoy3ZlOimoBM0_QVeER8eO2hTg&oe=639B466C","01708319093","Kewatkhali, Mymensingh"));
        people.add(new People("Sanjida Islam Sanny","11sanjida.sunny@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t39.30808-6/311132802_647834916754383_7619022817684826922_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeFMo1IRaHASyCjdoJsoLb9Ag_HsILkGPZqD8ewguQY9mnmLVdZBUdH3HJApGyp381ZT-r9cNpmHSdEWmiRWfdWn&_nc_ohc=0iAzMFUuNXEAX-lfyBX&_nc_ht=scontent.fdac142-1.fna&oh=00_AfC2mbzpWKzGLItibjigGYr6OYYK5vT7csNgFAQw2LE1Vw&oe=637820C8","0123456789","Boilor, Trishal"));
        people.add(new People("Shohan Hossain Ean","shohan.cit.bd@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t1.6435-9/66011740_2500224776701612_722815594025451520_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=174925&_nc_eui2=AeE3f9TgMzyZSZBbARw8be_3vxZBX5cDfv2_FkFflwN-_eNVXDZnXfMcG3tTnSDZIxLQT5AF2CnuKwgS4K4O2euS&_nc_ohc=v18_zuJQECIAX9IhZa9&_nc_ht=scontent.fdac142-1.fna&oh=00_AfBJEYQDvrbit3Qa8UpkusRhrshTMGW1_NvjDHczAVSvww&oe=639B4234","0123456789","Panthapath, Dhaka"));
        people.add(new People("Shakib Al Hasan","shakib@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t1.6435-9/164686194_10165054579155394_1750262748118629180_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeHwNCIwaLZLncUa52HdUQ0fYoivKOLqHYJiiK8o4uodgslmMqUrnA47uWZUT9c4Y0jO38Uchp-hFMktecxSfmP2&_nc_ohc=VYvitlWkZowAX9aWePL&tn=PnmXzvCIC6iTRSLA&_nc_ht=scontent.fdac142-1.fna&oh=00_AfAwNZtpsIjpgX4mD3w4l3MQ7Pb04fFzV2xvU1Z6e7dFig&oe=639B5B02","0123456789","Magura, Jessore"));
        people.add(new People("Tamanna Akter Chompa","chompa@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t39.30808-6/309399500_823383892146250_4377404098724421134_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=09cbfe&_nc_eui2=AeEX1T5fhG8jd4aeHNgxIp9da21JRgIJaPRrbUlGAglo9C3QCuq6m-enV61s-uD_FvQgubILluSEekBBwquDDwoU&_nc_ohc=jXeOXEk7X3wAX9tOvML&tn=PnmXzvCIC6iTRSLA&_nc_ht=scontent.fdac142-1.fna&oh=00_AfCsH61foo7_DGAOQ3y_Q_wfgVLKNjQ0Q-5PqZynJrcOFg&oe=6378CC8D","0123456789","Shivpur, Kendua"));
        people.add(new People("Muktir Bondhon Foundation","info@muktirbondhon.org","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQAZ2HFQJO_0T0H5VLrgfvVnv_u5tz2bKnAKWdOtBIIw&s","0123456789","Biojoy Nagar, Dhaka"));
        people.add(new People("Liton Kumar Das","liton@gmail.com","https://scontent.fdac142-1.fna.fbcdn.net/v/t39.30808-6/292971594_580765476753309_2284509776024029394_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=174925&_nc_eui2=AeE65dbufbG15Rw5SoYLNSLcVsbF7SjnKJlWxsXtKOcomd0-OdOBubXbRxNh09_UIMYRDpX8Yo4C6jbc52FeDloT&_nc_ohc=5iFISCWiTOQAX9JwIEE&_nc_ht=scontent.fdac142-1.fna&oh=00_AfC9xsq7mS94-fSKQ_XNXKmv3CVzKfrRhOLNcdHtASdVfA&oe=6379C1CC","0123456789","Dhaka"));
        people.add(new People("Mashrafe Bin Murtuza","mashrafe@gmail.com","https://images.thedailystar.net/sites/default/files/feature/images/mash_147.jpg","0123456789","Natore"));
        people.add(new People("Mark Zuckerburg","mark@gmail.com","https://cdn.britannica.com/99/236599-050-1199AD2C/Mark-Zuckerberg-2019.jpg","123456789","America"));
        people.add(new People("Hero Alom","hero@gmail.com","https://nypost.com/wp-content/uploads/sites/2/2022/08/newspress-collage-23392666-1660087158675.jpg?1660072838","123456789","Dhaka"));
        people.add(new People("Ripon Video","ripon@gmail.com","https://www.musicgoln.com/wp-content/uploads/2022/06/images-9.jpg","0123456789","Dhaka"));
        
        adapter = new PhonebookAdapter(this,people);
        recyclerView.setAdapter(adapter);
        add_home_btn.setOnClickListener(v->{
            Intent addUserIntent = new Intent(MainActivity.this, AddUserActivity.class);
            startActivity(addUserIntent);
        });


    }
}