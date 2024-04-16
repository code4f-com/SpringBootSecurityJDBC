/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.domain;

/**
 *
 * @author tuanpla
 */
import java.time.LocalDateTime;

public record LoginAttempt(String email, boolean success, LocalDateTime createdAt) {

}
