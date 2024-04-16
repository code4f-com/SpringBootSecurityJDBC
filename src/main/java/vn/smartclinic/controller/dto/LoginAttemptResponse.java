/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import vn.smartclinic.domain.LoginAttempt;

/**
 *
 * @author tuanpla
 */
public record LoginAttemptResponse(
        @Schema(description = "The date and time of the login attempt")
        LocalDateTime createdAt,
        @Schema(description = "The login status")
        boolean success) {

    public static LoginAttemptResponse convertToDTO(LoginAttempt loginAttempt) {
        return new LoginAttemptResponse(loginAttempt.createdAt(), loginAttempt.success());
    }
}
