package SixKingdoms;

import java.util.Scanner;

public class SixKingdoms
{
    private int lives = 3;
    
    public static void main(String[] args)
    {
        gameIntro();
        System.out.print("1. ");
        fungi();
        System.out.print("2. ");
        archaebacteria();
        System.out.print("3. ");
        plantae();
        System.out.print("4. ");
        protista();
        System.out.print("5. ");
        animalia();
        System.out.print("6. ");
        eubacteria();
        goodbye();
    }
    
    public static void gameIntro(){
        transition();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Six Kingdoms of biology!");
        System.out.println("You'll be given descriptions of organisms. Use your knowledge of the six kingdoms to classify them.");
        System.out.println("Afterwards, you'll see why these organisms belong to their respective kingdoms and learn some fun facts!");
        System.out.println("\nAre you ready to start?");
        String readyToStart = input.nextLine();
        if(readyToStart.equals("yes") || readyToStart.equals("Yes")){
            System.out.println("\nLet's begin! Your first question is...");
            transition();
        }
        input.close();
    }
    
    //Fungi method
    //Plerotus eryngii
    public static void fungi(){
        Scanner input = new Scanner(System.in);
        /*System.out.println("You wake up in a temperate, humid forest. The birds are chirping and the sun leaves a warm glow down upon the soft soil.");
        System.out.println("Suddenly, a royal horde captures you! A cloth is pulled over your head as you slowly dr i f  t   o   f   f    ....");
        System.out.println("-------------------------------------");
        System.out.println("\"Silence!\", the King orders. \"I'll give you one more chance to escape.");
        System.out.println("If you can guess which kingdom I'm from, I'll set you free. Otherwise, you'll die a painful death. Are you ready?\"");
        */System.out.println("\"My scientific name is Pleurotus eryngii. As you can see, I've got strong cell walls made of chitin. I get my energy through other\norganisms after they die. I also use oxygen and I reproduce both asexually and sexually.\"");
        System.out.println("\nCan you find which kingdom this organism is classified in?");
        boolean isRight = false;
        
        while(!isRight){
            System.out.println("A) Protista      B) Fungi        C) Plantae\n");
            String fungiAnswer = input.nextLine();
            if(fungiAnswer.toLowerCase().equals("a")){
                System.out.println("\nHmmm... that's not quite right. Protists do reproduce sexually and asexually and are also aerobic, but they don't have cell walls of chitin nor do they\n(hint) \"decompose\" other organisms.");
                System.out.println("Give it another shot!\n");
            }
            if(fungiAnswer.toLowerCase().equals("b")){
                isRight = true;
            }
            if(fungiAnswer.toLowerCase().equals("c")){
                System.out.println("\nGood try. Plants do indeed have cell walls and have aerobic functions! However, plants are mainly autotrophs and photosynthesize, which means they\ndon't (hint) \"decompose\" other organisms to gather nutrients. And, their cell walls are made of cellulose.");
                System.out.println("Give it another shot!\n");
            }
        }
        
        System.out.print("\nThat's right! This organism is a fungus. Fungi are decomposers and use oxygen, just like this organism, which mainly feeds on carbon sources,\nattached to the roots of dying hardwood trees. "); 
        System.out.println("Fungi reproduce either sexually or asexually through spores, and some fungi have cell walls of chitin. This organism\nreleases spores into the air which travel great distances in the wind. Take a look at the lab scans. The rigid outer layer of the cells is the chitin cell wall.");
        System.out.println("\nThis organism was Pleurotus eryngii, otherwise known as... the King Oyster mushroom or the King Trumpet mushroom! Fun fact: the King Oyster mushroom\ncomprises about 27% of global mushroom production. They can also be used to make imitation synthetic leather. Nice work!");
        transition();
        input.close();
    }
    
    //Archaebacteria
    //Thermococcus gammatolerans
    public static void archaebacteria(){
        Scanner input = new Scanner(System.in);
        //System.out.println("The inside chamber is hollow and metallic, but your submarine zooms at more than 30 knots off the Baja Californian coast.");
        System.out.println("\"My scientific name is Thermococcus gammatolerans. I can be found off the coast of Baja California, more than 2600 meters underwater, by hydrothermal vents.");
        System.out.println("I'm pretty small at just one cell, but you won't have trouble finding me, because I reproduce many copies of myself.");
        System.out.println("You won't find any nuclei here, though. All my DNA floats freely inside.\"");
        System.out.println("\nCan you find which kingdom this organism is classified in?");
        boolean isRight = false;
        
        while(!isRight){
            System.out.println("A) Eubacteria       B) Protista     C) Archaebacteria\n");
            String archaebacteriaAnswer = input.nextLine();
            if(archaebacteriaAnswer.toLowerCase().equals("a")){
                System.out.println("\nSuper close! Eubacteria are indeed unicellular prokaryotes (no membrane-bound organelles).");
                System.out.println("But think a little about the first clue. What other similarly \"extreme\" kingdoms are there?");
                System.out.println("Give it another shot!\n");
            }
            if(archaebacteriaAnswer.toLowerCase().equals("b")){
                System.out.println("Almost there! Protists can be unicellular organisms that reproduce asexually. But what about the absence of nuclei?");
                System.out.println("Which kingdoms don't have nuclei, or rather, any membrane-bound organelles?");
                System.out.println("Give it another shot!\n");
            }
            if(archaebacteriaAnswer.toLowerCase().equals("c")){
                isRight = true;
            }
        }
        
        System.out.println("Great work! This organism is part of the kingdom Archaebacteria. Let's see why. Because it does not have a nucleus");
        System.out.println("or any membrane-bound organelles, and it reproduces asexually and is unicellular, this organism must be prokaryotic.");
        System.out.println("Take a look at the images. Because this organism doesn't have a nucleus, its DNA is floating around inside.");
        System.out.println("That narrows it down to the kingdoms Eubacteria and Archaebacteria. But look at the first clue: this organism");
        System.out.println("likes hanging out in deep waters near thermal vents. Extreme! This has to be an archaebacteria because they are");
        System.out.println("characterized as extreme-loving organisms."); 
        System.out.println("\nIn fact, this organism's name, Thermococcus gammatolerans, translates to \"ball of fire\". It doesn't have a common name.");
        System.out.println("But that's not all. This organism is literally the most radiation-resistant organism ever discovered.");
        System.out.println("To put that in perspective, a dosage of 5gy can kill a human, and 60gy is enough to kill an entire colony of e. coli.");
        System.out.println("This organism can withstand over 30,000gy! Great job.\n");
        transition();
        input.close();
    }
    
    //Plantae
    //Nelumbo nucifera
    public static void plantae(){
        Scanner input = new Scanner(System.in);
        System.out.println("\"My scientific name is Nelumbo nucifera. I use oxygen and I'm built up of many different cells.");
        System.out.println("If you look inside, you'll find organelles like mitochondria. I also have cell walls made out of cellulose.\"");
        boolean isRight = false;
        
        while(!isRight){
            System.out.println("\nCan you find which kingdom this organism is classified in?");
            System.out.println("A) Plantae      B) Animalia     C) Fungi\n");
            String plantaeAnswer = input.nextLine();
            if(plantaeAnswer.toLowerCase().equals("a")){
                isRight = true;
            }
            if(plantaeAnswer.toLowerCase().equals("b")){
                System.out.println("Close - animals are indeed multicellular aerobic organisms, and they have organelles like mitochondria.");
                System.out.println("However, the description also states that this organism has \"cell walls made of CELLULOSE\".");
                System.out.println("Which kingdom could this be? Give it another shot!\n");
            }
            if(plantaeAnswer.toLowerCase().equals("c")){
                System.out.println("Almost - fungi are indeed multicellular aerobic organisms, and they have organelles like mitochondria.");
                System.out.println("However, the description also states that this organism has \"cell walls made of CELLULOSE\".");
                System.out.println("The cell walls of fungi are built up of chitin. Which kingdoms have cell walls of cellulose?");
                System.out.println("Give it another shot!\n");
            }
        }
        
        System.out.println("You got it! Nelumbo nucifera is a plant. Plants are aerobic organisms that must be multicellular, like this organism.");
        System.out.println("And, they have membrane-bound organelles like mitochondria, because they are prokaryotic. This organism has organelles");
        System.out.println("and rigid cell walls as can be seen in the pictures. Because this organism is prokaryotic, multicellular, aerobic, and has");
        System.out.println("cell walls of cellulose, it must be from the kingdom Plantae.");
        System.out.println("\nThis organism's common names are... the sacred lotus and the Indian lotus, but it's often colloquially called the water lily.");
        System.out.println("Its seeds last a very long time, with the oldest surviving records dating almost 13,000 years back. That's why it");
        System.out.println("was considered sacred by many cultures, including the Chinese. Good job!");
        transition();
        input.close();
    }
    
    //Protista
    //Paramecium caudatum
    public static void protista(){
        Scanner input = new Scanner(System.in);
        System.out.println("\"My scientific name is Paramecium caudatum. I get my energy through consuming other organisms. I only consist of one");
        System.out.println("cell, but some of my cousins in my kingdom are multicellular. I move around using tiny 'hairs' called cilia.\"");
        boolean isRight = false;
        
        while(!isRight){
            System.out.println("\nCan you find which kingdom this organism is classified in?");
            System.out.println("A) Animalia      B) Eubacteria     C) Protista\n");
            String protistaAnswer = input.nextLine();
            if(protistaAnswer.toLowerCase().equals("a")){
                System.out.println("Animals are heterotrophs, so they consume other organisms, but they must be multicellular.");
                System.out.println("Give it another shot!\n");
            }
            if(protistaAnswer.toLowerCase().equals("b")){
                System.out.println("Eubacteria are unicellular and can be heterotrophic, but they are all unicellular, whereas this organism's kingdom");
                System.out.println("can also have multicellular organisms. Give it another shot!\n");
            }
            if(protistaAnswer.toLowerCase().equals("c")){
                isRight = true;
            }
        }
        
        System.out.println("Good work. This organism is a protist because it is heterotrophic, has cilia for movement, and is unicellular but other organisms");
        System.out.println("in this kingdom can be multicellular. All protists are heterotrophic and can be either unicellular, multicellular, or colonial.");
        System.out.println("In addition, protists move with either flagella, cilia, or pseudopods.");
        System.out.println("\nBecause of these organisms' likeness to a slipper, they have been dubbed the \"slipper animalcule\". They can reach up");
        System.out.println("to 0.33 mm in size and are commonly found in marine, brackish, and freshwater environments. Next question...");
        transition();
        input.close();
    }
    
    //Eubacteria
    //Microcystis aeruginosa
    public static void eubacteria(){
        Scanner input = new Scanner(System.in);
        System.out.println("\"My scientific name is Microcystis aeruginosa. I'm pretty lonely at just one cell, but my protective peptidoglycan");
        System.out.println("cell wall keeps me safe. If you look closely, you'll notice I don't have any membrane-bound organelles.\"");
        boolean isRight = false;
        
        while(!isRight){
            System.out.println("\nCan you find which kingdom this organism is classified in?");
            System.out.println("A) Eubacteria      B) Archaebacteria     C) Protista\n");
            String eubacteriaAnswer = input.nextLine();
            if(eubacteriaAnswer.toLowerCase().equals("a")){
                isRight = true;
            }
            if(eubacteriaAnswer.toLowerCase().equals("b")){
                System.out.println("Close! Archaebacteria are unicellular prokaryotes, but they don't");
                System.out.println("have peptidolgycan cell walls. Give it another shot!\n");
            }
            if(eubacteriaAnswer.toLowerCase().equals("c")){
                System.out.println("Hmm... that's not quite right. Protists can be unicellular and have cell walls, but their cell walls are made up of");
                System.out.println("cellulose and they do have membrane-bound organelles. Give it another shot!\n");
            }
        }
        
        System.out.println("That's right! This organism is a eubacteria because it is unicellular, prokaryotic, and has a peptidoglycan cell wall.");
        System.out.println("All organisms in the eubacteria kingdom only consist of one cell, have no membrane-bound organelles, and have peptidoglycan cell walls.");
        System.out.println("\nThese organisms can actually photosynthesize because they are part of a group of eubacteria called cyanobacteria.");
        System.out.println("They are the most common toxic cyanobacterial bloom in eutrophic freshwater.");
        transition();
        input.close();
    }
    
    //Animalia
    //Suricata suricatta
    public static void animalia(){
        Scanner input = new Scanner(System.in);
        System.out.println("\"My scientific name is Suricata suricatta. My diet mainly consists of insects, but I eat fruit and even poisonous scorpions.");
        System.out.println("I'm built up of many cells, which have membrane-bound organelles, and I reproduce sexually.\"");
        boolean isRight = false;
        
        while(!isRight){
            System.out.println("\nCan you find which kingdom this organism is classified in?");
            System.out.println("A) Plantae      B) Animalia     C) Protista\n");
            String animaliaAnswer = input.nextLine();
            if(animaliaAnswer.toLowerCase().equals("a")){
                System.out.println("Good try. Plants aren't heterotrophic. Give it another shot!\n");
            }
            if(animaliaAnswer.toLowerCase().equals("b")){
                isRight = true;
            }
            if(animaliaAnswer.toLowerCase().equals("c")){
                System.out.println("Close! Protists are heterotrophic and eukaryotic, but this is not a protist. What other kingdom is similar and matches the description?");
                System.out.println("Give it another shot!\n");
            }
        }
        
        System.out.println("Excellent work! This organism is classified under the kingdom Animalia. It's an animal because it is heterotrophic (eats other organisms),");
        System.out.println("multicellular, eukaryotic (membrane-bound organelles), and reproduce sexually. All animals are hetertrophic, multicellular, prokaryotic");
        System.out.println("and reproduce sexually. This organism's common name is the meerkat. It can be commonly found around southern Africa, and they're immune to venom.");
        transition();
        input.close();
    }
    
    public void endGame(String message){
        if(lives <= 0){
            System.out.println(message);
            System.out.println("You feel your muscles trembling as you slowly lose your strength. The last things you see are your palms writhing in agony before everything goes to black.");
            System.exit(0);
            //Hey, if you found this, cool! This is me from the past and you from the future.
        }
    }
    
    public static void transition(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
    
    public static void goodbye(){
        System.out.println("Thanks for playing! These are the sources used to research for this game:");
        System.out.println("Decherney, Sophia and Petruzzello, Melissa. \"king oyster mushroom\". Encyclopedia Britannica, https://www.britannica.com/science/king-oyster-mushroom.");
        System.out.println("Britannica, The Editors of Encyclopaedia. \"protist\". Encyclopedia Britannica, https://www.britannica.com/science/protist.");
        System.out.print("\nCreated by Lucas Chen, Class of 2028. Signed 9/27/24 6:43 PM.");
    }
}
