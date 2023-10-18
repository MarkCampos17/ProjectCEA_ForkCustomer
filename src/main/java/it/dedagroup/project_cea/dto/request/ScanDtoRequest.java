package it.dedagroup.project_cea.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScanDtoRequest {

    private double mcLiter = 0;
    @NotNull(message = "Il campo data non può essere lasciato in bianco")
    private LocalDate scanDate;
    @NotNull(message = "Il campo apartmentId non può essere lasciato in bianco")
    private long apartmentId;

}
