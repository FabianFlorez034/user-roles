package com.girusoft.controller;

import com.girusoft.model.dto.Request;
import com.girusoft.model.dto.ResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;

@Tag(name = "User controller", description = "This controller contains all endpoint to management the users")
public interface IUserController {

    @Operation(summary = "This endpoint get a user by email")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User got by email successfully", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseDto.class))})})
    ResponseEntity<ResponseDto> retrieveUserByEmail(Request request);
}
