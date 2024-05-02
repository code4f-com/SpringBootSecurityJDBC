/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.common;

import ch.qos.logback.classic.PatternLayout;

/**
 *
 * @author tuanp
 */
public class ColorAwarePatternLayout extends PatternLayout {

    static {
//        if (!Ansi.AUTO.enabled()) { // Usage of Picocli heuristic 
        DEFAULT_CONVERTER_MAP.put("black", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("red", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("green", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("yellow", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("blue", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("magenta", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("cyan", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("white", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("gray", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldRed", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldGreen", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldYellow", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldBlue", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldMagenta", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldCyan", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("boldWhite", NoColorConverter.class.getName());
        DEFAULT_CONVERTER_MAP.put("highlight", NoColorConverter.class.getName());
    }
}
