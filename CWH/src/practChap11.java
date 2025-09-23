abstract class Pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends Pen{
    public void write(){
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing Nib");
    }
}

interface basiAnimal {
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Jumping ... ");
    }
    void bite(){
        System.out.println("Bitting..");
    }
}

class Humans extends Monkey implements basiAnimal {
    public void eat(){
        System.out.println("Eating ...");
    }

    public void sleep(){
        System.out.println("Sleeping ...zz.zzz");
    }
}


abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone extends telePhone{
    public void ring(){
        System.out.println("tring tring ... tring tring ..");
    }
    public void lift(){
        System.out.println("Hello Baburav Boltoy");
    }
    public void disconnect(){
        System.out.println("tic .. tic tic ");
    }

    void playGame(){
        System.out.println("Playing video games");
    }
}

interface tvRemote extends smartTvRemote{
    void powerOn();
}
interface smartTvRemote {
    void speakToSearch();
    void typeToSearch();
}
class TV implements tvRemote{
    public void speakToSearch(){
        System.out.println("Listening..");
    }
    public void typeToSearch(){
        System.out.println("Typeing..");
    }
    public void powerOn(){
        System.out.println("Switching on ");
    }
}



public class practChap11 {
    public static void main(String[] args) {
        //Q1) Create an alstract class Pen with methods
        // Writec() and refill() as alsthact methds

        //Q2)Use the Pen Class from 21 to creste a
        // Concrete class Fountain Pen with radditional
        // methad changeNibl)
        fountainPen fp = new fountainPen();
        fp.changeNib();
        fp.write();

        // Q3)Create a class Monkey with jump() and bitel) methods. Create a elass Human which inherits
        // this Mankey lass and implements BasicAnimal Basi interface with eates and steep me thods.
        Humans hu = new Humans();
        hu.eat();
        hu.jump();
        hu.sleep();

        // Q4) Create a class Tele Phone with ring()) lifts and disconnect ) methads as abstract methads.
        // Greate smother class Smart Telephone and demanstatepolymotphism

        telePhone tel=new smartphone();
        // tel.playGame();  --> getting error 
        tel.lift();

        // Q5) Pemonstate polymorphism using monkey class from Q3
        Monkey mon= new Humans();
        mon.jump();
        // mon.eat();
        // mon.sleep(); -->getting error

        // Q6) Ceate an Inerfpuce TVRemote and use it to inherit
        // another Interface Smar!TrRemote
        // Q7)Create a Class Tv which implements TvRemote interface
        // from Q6
        TV tv = new TV();
        tv.powerOn();
        tv.speakToSearch();
        


    }
}
