public class  Habit {
    private String name;
    private int streak; //Quantidade de dias consecutivos




public Habit (String name, int streak){

        this.name = name;
        this.streak = streak;

    }

public String getName(){
        return name;

    }

public int getStreak(){
    return streak;

    }

public void incrementStreak() {
    this.streak++; //aumenta a sequencia em + 1 ao complear um habito
    }
}

