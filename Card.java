//Gabrielle Farah
public class Card{
    private Color color;
    private Type type;
    private int number;
    private Card otherSide;

    public Card(Color color, Type type, int number){
        this.color = color;
        this.type = type;
        this.number = number;

        public void setOtherSide(Card other){
            this.otherSide = other;
        }

        public Card getOtherSide(){
            return otherSide;

        }
        public boolean matches(Card other){
            if (color ==other.color || this.type == Type.NUMBER && other.type == Type.NUMBER && this.number == other.number){
                return true;
            }
            if (this.type==other.type || this.type == Type.WILD || this.type == Type.WILD_DRAW_FOUR){
                return true;
            }
            return false;
        }
        @Override
        public String toString(){
        if (type == Type.NUMBER) {
            return color + " " + number;
        } else {
            return color + " " + type;
        }
        }
    }
}