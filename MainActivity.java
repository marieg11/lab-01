package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import com.example.petshop.Pet;
import com.example.petshop.Pettable;
import com.example.petshop.Cat;
import com.example.petshop.Dog;
import com.example.petshop.Scorpion;
import com.example.petshop.Mood;
import com.example.petshop.Happy;
import com.example.petshop.Sad;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);
        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);
        //pettablePets.add(scorpion);

        Happy happy = new Happy();
        Sad sad = new Sad();
        ArrayList<Mood> moods = new ArrayList<>();
        moods.add(happy);
        moods.add(sad);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}