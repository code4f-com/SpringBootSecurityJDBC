/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vn.smartclinic.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author tuanpla
 */
public record ApiErrorResponse(
        @Schema(description = "Error code")
        int errorCode,
        @Schema(description = "Error description")
        String description) {

}
