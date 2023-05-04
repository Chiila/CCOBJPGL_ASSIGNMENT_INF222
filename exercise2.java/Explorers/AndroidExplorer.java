package Explorers;
import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Earth earth) {
        System.out.println("Visiting Earth Now!");
    }

    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("Visiting Jupiter Now!");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Visiting Mars Now!");
    }

    @Override
    public void visit(Mercury mercury) {
        System.out.println("Visiting Mercury Now!");
    }

    @Override
    public void visit(Neptune neptune) {
        System.out.println("Visiting Neptune Now!");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Visiting Saturn Now!");
    }

    @Override
    public void visit(Uranus uranus) {
        System.out.println("Visiting Uranus Now!");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("Visiting Venus Now!");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Visiting Pluto Now!");
    }
}
