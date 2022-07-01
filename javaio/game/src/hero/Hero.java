package hero;
import weapor.*;
import armor.*;
import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int lvl;
    Weapor weapor;
    Armor armor;
    public Hero(String name){
        this.name=name;
        this.lvl=1;
        this.weapor=new Axe();
        this.armor = new ClothArmor();
    }
    public void setLvl(int lvl){this.lvl=lvl;}
    public void setWeapor(Weapor weapor){this.weapor=weapor;}
    public void setArmor(Armor armor){this.armor=armor;}
    public String toSrting(){
        return String.format("Герой {Имя=%s, Уровень=%s, Оружие=%s, Броня=%s}",name,lvl,weapor,armor);
    }
}

