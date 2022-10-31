package cn.flevin.Simple_factory_pattern;

import cn.flevin.factory_pattern.Toy;
import cn.flevin.factory_pattern.Ultraman;

/**
 * @Project JavaProject
 * @Date 10/27/2022
 * @Author FLevin
 * @Description TODO
 */

public class UltramanFactor implements ToyFactory{
    @Override
    public Toy getToyName() {
        return new Ultraman();
    }
}
