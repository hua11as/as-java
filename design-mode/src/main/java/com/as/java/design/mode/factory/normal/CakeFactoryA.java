package com.as.java.design.mode.factory.normal;

import com.as.java.design.mode.factory.product.AbstractCake;
import com.as.java.design.mode.factory.product.CakeA;

/**
 * desc:
 * author: as
 * date: 2019/5/22
 */
public class CakeFactoryA implements ICakeFactory {
    @Override
    public AbstractCake makeCake() {
        return new CakeA();
    }
}
