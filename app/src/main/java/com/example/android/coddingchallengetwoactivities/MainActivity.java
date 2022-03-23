package com.example.android.coddingchallengetwoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_MESSAGE = "com.example.android.coddingchallengetwoactivities.extra.MESSAGE";

    String arr[] = {
            "Adapted from \"The Colors of Animals\" by Sir John Lubbock in A Book of Natural History (1902, ed. David Starr Jordan)\n\n" +
                    "The color of animals is by no means a matter of chance; it depends on many considerations, but in the majority of cases tends to protect the animal from danger by rendering it less conspicuous. Perhaps it may be said that if coloring is mainly protective, there ought to be but few brightly colored animals. There are, however, not a few cases in which vivid colors are themselves protective. The kingfisher itself, though so brightly colored, is by no means easy to see. The blue harmonizes with the water, and the bird as it darts along the stream looks almost like a flash of sunlight.\n" +
                    "Desert animals are generally the color of the desert. Thus, for instance, the lion, the antelope, and the wild donkey are all sand-colored. \"Indeed,\" says Canon Tristram, \"in the desert, where neither trees, brushwood, nor even undulation of the surface afford the slightest protection to its foes, a modification of color assimilated to that of the surrounding country is absolutely necessary. Hence, without exception, the upper plumage of every bird, and also the fur of all the smaller mammals and the skin of all the snakes and lizards, is of one uniform sand color.\"\n\n" +
                    "The next point is the color of the mature caterpillars, some of which are brown. This probably makes the caterpillar even more conspicuous among the green leaves than would otherwise be the case. Let us see, then, whether the habits of the insect will throw any light upon the riddle. What would you do if you were a big caterpillar? Why, like most other defenseless creatures, you would feed by night, and lie concealed by day. So do these caterpillars. When the morning light comes, they creep down the stem of the food plant, and lie concealed among the thick herbage and dry sticks and leaves, near the ground, and it is obvious that under such circumstances the brown color really becomes a protection. It might indeed be argued that the caterpillars, having become brown, concealed themselves on the ground, and that we were reversing the state of things. But this is not so, because, while we may say as a general rule that large caterpillars feed by night and lie concealed by day, it is by no means always the case that they are brown; some of them still retaining the green color. We may then conclude that the habit of concealing themselves by day came first, and that the brown color is a later adaptation.\n\n",
            "1. Topic Sentence\n" +
                    "\n" +
                    "A topic sentence is a precise statement that reflects the main idea of the paragraph. It should be carefully written as it will show the reader what you are going to talk about. Words chosen for this should not be cluttered and ambiguous as readers will decide to read further based on this. It is not necessary to write the topic sentence at the beginning of the paragraph. It can be put anywhere, as long as it reflects the main topic. For instance, if you mention that you are going to talk about the advantages of using the hand sanitizer, then in supporting sentence you should only talk about advantages, not the features or anything else. \n" +
                    "\n" +
                    "\n" +
                    "2. Supporting Sentences\n" +
                    "\n" +
                    "Supporting sentences explain the topic sentence in detail. They expand the main topic and develops the main idea into the explanation. They explain the main topic using examples, facts, quotes, etc. They have to be related to the topic sentence.\n" +
                    "\n" +
                    "\n" +
                    "There can be two types of Supporting sentences, First, The major supporting sentence; this sentence directly explains the main idea with some new fact or new idea. Second, a minor support sentence helps the major supporting sentence develop the controlling idea.",
            "The uncommon and speedy increase in Earth’s average temperature is called global warming. This growth has extensively been higher within the last century due to human intervention with nature. The release of greenhouse gasses in the ecosystem has been one of the number one motives behind the boom in temperature. The multiplied intake of fossil fuels has extended the attention of greenhouse gasses. The effect of world Warming is a lot higher than just a sore in temperature.\n" +
                    "\n" +
                    "\n" +
                    "It modifies the rainfall pattern, intensifies coastal erosion, lengthens seasons in line with geography, the glaciers and ice caps are melting and will increase the range of continual and infectious illnesses. As a way to expect similar weather changes, scientists constructed models. These climate fashions are used to simulate the interactional responses of the sea and environment. They predict a boom of round 2C to 6C with the aid of the 21st century.\n" +
                    "\n" +
                    "\n" +
                    "As you can see, that the main idea of the paragraph was describing the room. \n" +
                    "\n" +
                    "Then there are many supporting sentences supporting the main idea and expanding it in a way that the picture becomes clear in the reader’s mind.\n" +
                    "\n" +
                    "Concluding sentence “ I felt that I breathed an atmosphere of sorrow. An air of stern, deep, and irredeemable gloom hung over and pervaded all,” \n" +
                    "\n" +
                    "\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void launchSecondActivityBtn1(View view) {
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, arr[0]);
        startActivity(intent);
    }

    public void launchSecondActivityBtn2(View view) {
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, arr[1]);
        startActivity(intent);
    }

    public void launchSecondActivityBtn3(View view) {
        Log.d(LOG_TAG, "BTN 3");
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, arr[2]);
        startActivity(intent);
    }
}