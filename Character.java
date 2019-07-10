public class Character{
//atributos del personajee


    private int lifePoints;
    private int defensePoints;
    private int attackPoints;
    public String img;


    // metodos

    public void setlifePoints(int lifePoints)// aqui andamos dandole valor al int lifep
    {
this.lifePoints=lifePoints;
//"this. es para acceder al private"
    }
public int getlifePoints()
{

    return lifePoints;
}

public void setdefensePoints(int defensePoints) 
{
this.defensePoints=defensePoints;

    }
public int getdefensePoints()
{

    return defensePoints;
}
public void setattackPoints(int attackPoints)
    {
this.attackPoints=attackPoints;

    }
public int getattackPoints()
{

    return attackPoints;
}




//constructor

public Character( String img, int lifePoints, int attackPoints, int defensePoints)

{
this.img=img;
this.lifePoints=lifePoints;
this.defensePoints=defensePoints;
this.attackPoints=attackPoints;
}

public void printing()//damos este void para darle a cada personaje 
{

System.out.println("----------------------------");
System.out.println(img);
System.out.println("life points="+ getlifePoints());
System.out.println("attack points="+ getattackPoints());
System.out.println("defense points="+ getdefensePoints());
System.out.println("----------------------------");
}
public void attack(Character c)
{

    int lp;                                     // aqui declaramos la operacion de la vida despues de un ataque, donde "c" es el personaje
    int newlp;
    int attack;
    int newA;
     attack=c.getattackPoints();
    lp=c.getlifePoints();
    newA= attack-getdefensePoints();
    newlp=lp-newA;
   c.setlifePoints(newlp);
    
    
    System.out.println("Attacking........");
    System.out.println(c.img + "life points =" + c.getlifePoints());

}
public void die()
{

    System.out.print("HE DEAD BRO");

}
}