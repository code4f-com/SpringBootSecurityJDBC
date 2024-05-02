/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.common;

import ch.qos.logback.core.pattern.CompositeConverter;
import com.tuanpla.utils.common.LogUtils;

/**
 *
 * @author tuanp
 * @param <E>
 */
public class NoColorConverter<E> extends CompositeConverter<E> {

    @Override
    protected String transform(E event, String in) {
        LogUtils.out(event);
        LogUtils.out(in);
        return in;
    }
}
