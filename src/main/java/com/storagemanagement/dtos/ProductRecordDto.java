package com.storagemanagement.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/*    Alguns detalhes do java 17 e Spring Boot 3 . . .
 * 
		Recebem parametros ()
		São imutáveis
 		Não tem sets somentes gets
		Por padrão já são privados

 */

public record ProductRecordDto(@NotBlank String name, @NotNull BigDecimal value ) {
	
	
}
