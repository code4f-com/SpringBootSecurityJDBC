/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.common;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

/**
 *
 * @author tuanpla
 */
public class HighlightingCompositeConverterEx extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent event) {
        Level level = event.getLevel();
        return switch (level.toInt()) {
            case Level.ERROR_INT ->
                ANSIConstants.BOLD + ANSIConstants.RED_FG;
            case Level.WARN_INT ->
                ANSIConstants.RED_FG;
            case Level.INFO_INT ->
                ANSIConstants.CYAN_FG;
            default ->
                ANSIConstants.DEFAULT_FG;
        }; // same as default color scheme
        // same as default color scheme
        // use CYAN instead of BLUE
    }

}
