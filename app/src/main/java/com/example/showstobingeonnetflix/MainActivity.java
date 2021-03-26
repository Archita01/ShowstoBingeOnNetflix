package com.example.showstobingeonnetflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycleView;
    Adapter adapter;
    String [] Shows = {"Stranger Things", "Riverdale", "Sherlock","Suits", "Never Have I Ever",
            "Money Heist","13 Reasons Why","Friends","Brooklyn Nine-Nine","The Vampire Diaries"};
    String [] Description = {"When a young boy disappears, his mother, a police chief and his friends must confront terrifying supernatural forces in order to get him back....",
            "Archie, Betty, Jughead and Veronica tackle being teenagers in a town that is rife with sinister happenings and blood-thirsty criminals....",
            "Dr Watson, a former army doctor, finds himself sharing a flat with Sherlock Holmes, an eccentric individual with a knack for solving crimes. Together, they take on the most unusual cases....",
            "On the run from a drug deal gone bad, brilliant college dropout Mike Ross, finds himself working with Harvey Specter, one of New York City's best lawyers.....",
            "The complicated life of a first-generation Indian-American teenager....",
            "An unusual group of robbers attempt to carry out the most perfect robbery in Spanish history - stealing 2.4 billion euros from the Royal Mint of Spain....",
            "Follows teenager Clay Jensen, in his quest to uncover the story behind his classmate and crush, Hannah, and her decision to end her life....",
            "The personal and professional lives of six twenty to thirty-something-year-old friends living in Manhattan...",
            "Ray Holt, an eccentric commanding officer, and his diverse and quirky team of odd detectives solve crimes in Brooklyn, New York City....",
            "Creatures of unspeakable horror lurk beneath the town of Virginia as a teenage girl is torn between two vampire brothers..."};
    int ShowImage[]={R.drawable.i2,R.drawable.i1,R.drawable.i8,R.drawable.i3,R.drawable.i4
            ,R.drawable.i9,R.drawable.i10,R.drawable.i12,R.drawable.i11,R.drawable.i14};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleView = findViewById(R.id.recyclerView);
        recycleView.setLayoutManager(new LinearLayoutManager(this ));
        adapter = new Adapter(this, Shows , Description, ShowImage);
        recycleView.setAdapter(adapter);


    }
}