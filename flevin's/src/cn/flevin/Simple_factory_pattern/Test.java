package cn.flevin.Simple_factory_pattern;

import cn.flevin.factory_pattern.Toy;

/**
 * @Project JavaProject
 * @Date 10/27/2022
 * @Author FLevin
 * @Description TODO
 */

public class Test {
    public static void main(String[] args) {
        Toy g = new GodzillaFactor().getToyName();
        Toy u = new UltramanFactor().getToyName();
        g.name();
        u.name();
    }
}
