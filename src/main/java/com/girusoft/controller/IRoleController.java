package com.girusoft.controller;

import com.girusoft.model.entities.RoleEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

@Tag(name = "Roles controller", description = "This controller contains all endpoint to management the roles")
public interface IRoleController {

    @Operation(summary = "This endpoint get all roles")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "All roles got successfully", content = {
            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = RoleEntity.class)))})})
    ResponseEntity<List<RoleEntity>> getAllRoles();


    @Operation(summary = "This endpoint get all roles pageable")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "All roles got successfully", content = {
            @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = RoleEntity.class)))})})
    ResponseEntity<Map<String, Object>> getAllRolesPageable(@RequestParam(defaultValue = "0") int page,
                                                            @RequestParam(defaultValue = "1") int size);
}
