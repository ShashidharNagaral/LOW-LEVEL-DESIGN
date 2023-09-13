package StrategyPattern;


// this is a context on which different algorithms (behaviours) are performed
public abstract class Fighter {
    private Kick kick;
    private Punch punch;

    public Fighter(Kick kick, Punch punch) {
        this.kick = kick;
        this.punch = punch;
    }

    public void setKick(Kick kick) {
        this.kick = kick;
    }

    public void setPunch(Punch punch) {
        this.punch = punch;
    }

    public void performKick() {
        this.kick.kick();
    }

    public void performPunch() {
        this.punch.punch();
    }
}
