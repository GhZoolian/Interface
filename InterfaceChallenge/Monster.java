import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {
    private String name;
    private int hitPoint;
    private int strength;

    public Monster(String name,int hitPoint,int strength){
        this.name = name ;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }
    public int getHitPoint() {
        return hitPoint;
    }
    public int getStrength() {
        return strength;
    }

    @Override
    public void read(List<String> savedValues) {
        // TODO Auto-generated method stub
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoint = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
        
    }
    @Override
    public List<String> write() {
        // TODO Auto-generated method stub
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoint);
        values.add(2, "" + this.strength);
        return null;
    }
     @Override
     public String toString() {
        return "Player{" + 
        "name = " + name + "\'" +
        ", hitPoint = " + hitPoint + 
        ", Strength = " + strength +
        "}";
     }
}
