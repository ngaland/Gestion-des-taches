package com.ngaland.Gestion.des.taches.dto;

import com.ngaland.Gestion.des.taches.models.Priorite;
import com.ngaland.Gestion.des.taches.models.Statut;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TacheDto {
    private String titre;
    private String description;
    private Statut statut;
    private Priorite priorite;
    private String responsable;
    private LocalDate dateEcheance;

}
