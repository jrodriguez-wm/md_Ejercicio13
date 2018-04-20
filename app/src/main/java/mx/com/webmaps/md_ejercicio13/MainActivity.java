package mx.com.webmaps.md_ejercicio13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    String []name={
            "Usr1",
            "Usr2",
            "Usr3",
            "Usr4",
            "Usr5",
            "Usr6",
            "Usr7",
            "Usr8",
            "Usr9",
            "Usr10",
            "Usr11"
    };

    String []desc={
            "Descr1",
            "Descr2",
            "Descr3",
            "Descr4",
            "Descr5",
            "Descr6",
            "Descr7",
            "Descr8",
            "Descr9",
            "Descr10",
            "Descr11"
    };

    int []img={
            R.drawable.cara1,
            R.drawable.cara2,
            R.drawable.cara3,
            R.drawable.cara4,
            R.drawable.cara5,
            R.drawable.cara6,
            R.drawable.cara7,
            R.drawable.cara8,
            R.drawable.cara9,
            R.drawable.cara10,
            R.drawable.cara11
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView_id);

        List<User> sampleUser = new ArrayList<>();


        User user;

        for(int i=0; i<name.length;i++){
            user = new User();

            user.usrName= name[i];
            user.usrDesc= desc[i];
            user.usrImage= img[i];

            sampleUser.add(user);
        }

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        //recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getBaseContext(),sampleUser));

    }
}
