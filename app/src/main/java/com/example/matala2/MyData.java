package com.example.matala2;
public class MyData implements RecyclerViewInterface{

    static String[] nameArray = {"Arthur", "Binky", "Brain", "Buster", "Francine", "Gili", "Muffy"};
    static String[] description = {"The main character in the series", "Binky is the biggest kid in the class", "A child with a high IQ", "Arthur's best friend", "Her characteristic attire is a red sweater", "Arthur's little sister", "The rich, arrogant and spoiled girl in the class"};
    static String[] description2 = {"The clothes that characterize him are a yellow sweater underneath which is a white button-down shirt, smooth blue jeans and red All-Star shoes. \n He wears brown glasses with a round frame. His best friends are Bester, Francine and Allen.\n" +
            " Arthur is a fan of the series \"The Bionic Rabbit\", Arthur plays the piano and loves animals especially his pet dog \"Friend\".", "Binky is the biggest kid in the class. He was supposed to be in the fourth grade, but remained in the fourth grade.\n The whole class is afraid of him except Sue Allen because he is very strong, even though he is actually nice and courteous.\n His characteristic attire is an orange button-down shirt, jeans, a blue belt and brown shoes. \nBinky likes to watch wrestling on TV, play the clarinet, collect butterflies, read poetry, ride a bike, and dance ballet.\n Binky is allergic to peanuts. His mother works as a nurse. He has an adopted baby sister from China named Mei Lin.", "Brain is the only son of his parents and a child with a high IQ, and loves to apply his knowledge in daily life.\n His characteristic attire is a gray sweater over a white shirt, brown pants and brown shoes. Brain is hydrophobic and loves to play chess, but very good at sports, especially football. \nThe great love of a brain is mathematics and science, and his big dream is to get a new particle accelerator. Despite his intelligence, he often tends to think and act irrationally, complicating things more than they really are.", "His characteristic attire is a heavenly turquoise shirt, light jeans and red All-Star shoes. Bester is very fond of eating, sleeping and playing the tuba. Just like Arthur, Buster is a big fan of the TV series \"The Bionic Rabbit\". His father is a pilot and his mother is a journalist for the Alwood local newspaper. Buster is a fan of comics and jokes, and obsessed with aliens and outer space and believes in conspiracy theories about extraterrestrials.  During the series, Bester travels around the world with his dad.", "Francine is an accepted girl and known as Tom Boy, loves sports (especially hockey, basketball and football), drumming and singing. Francine's behavior is frank and blunt, sometimes causing her to quarrel with her friends and family. Her father works as a garbage man. Raising a cat named Nemo. Francine has a 16-year-old older sister named Catherine. Francine is Jewish, she fasts Yom Kippur, celebrates Chanukah and celebrates a Bar Mitzvah (for her cousin), Francine also celebrates Thanksgiving, because it is a national American holiday and not a Christian one.", "Gili's characteristic attire is a light pink dress underneath which is a white blouse, pink tights and light blue doll shoes. Gili is four years old (and later in the series celebrates her fifth birthday), but unlike other children her age, she knows how to read a very limited number of words. Her best friends are Emily, Teomi Tibel, Bad Compson, and James. She has an imaginary girlfriend named Nadine. Gili adores the TV show \"Mimi Mu the Cow\" (or \"Mary Mo the Cow\") that Arthur hates very much. ", "Mofi is very feminine, mature for her age and loves to spend money in the mall, mainly on clothes and makeup. She is described as an arrogant girl who loves to show off and makes fun of her friends many times. Her characteristic attire is a purple dress over a white shirt, white socks and brown shoes, and two braided braids to her head. Her father is the owner of the car company \"Crossaway engines\". Her brother Chip is studying at the university. Has an attached butler and a limousine. Mofi has been studying with Arthur since the second grade. Her name is originally Marie."};

    static Integer[] drawableArray = {R.drawable.arthur, R.drawable.binky, R.drawable.brain,
            R.drawable.buster, R.drawable.francine, R.drawable.gili, R.drawable.muffy,};

    static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6};

    @Override
    public void onItemClick(int position) {

    }
}