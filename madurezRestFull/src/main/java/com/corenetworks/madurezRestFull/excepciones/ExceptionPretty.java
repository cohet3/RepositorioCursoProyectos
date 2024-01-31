package com.corenetworks.madurezRestFull.excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ExceptionPretty {
    private LocalDateTime fecha;
    private String mensaje;
    private String description;


}
