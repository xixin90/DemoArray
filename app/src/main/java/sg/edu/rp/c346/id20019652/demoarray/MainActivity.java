package sg.edu.rp.c346.id20019652.demoarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    //String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ArrayList");

        tv = findViewById(R.id.textViewArray);

        /*Fruits
          =====*/
        String text = "Fruits\n";
        text += "=====\n";

        //add array
        /*fruits = new String[3];
        //add fruits into fruits array
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";*/

        //add arraylist
        fruits = new ArrayList<String>();
        //add fruits into fruits arraylist
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        //add new fruits to arraylist
        fruits.add(1, "durian");
        String itemgotten = fruits.get(3);
        //remove fruit from arraylist
        fruits.remove(2);
        //update last fruit
        fruits.set(fruits.size()-1, "dragon fruits");

        //loop to add fruits texts
        for (int i=0; i < fruits.size(); i++){
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);
    }
}