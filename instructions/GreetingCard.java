package instructions;

public class GreetingCard {
    // value
    String introduction;

    // default constructor
    public GreetingCard() {
        this.introduction = "None";
    }

    // full constructor
    public GreetingCard(String introduction) {
        this.introduction = introduction;

        //return this
    }

    // getter
    public String GetIntroduction() {

        return introduction;
    }

    // setter
    public void SetIntroduction(String newIntroduction) {
        
    }

    // toString
    public String toString() {
        return introduction;
    }

    // equals
    public boolean equals(GreetingCard otherGreetingCard) {
        if (this.introduction.equals(otherGreetingCard.introduction)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
