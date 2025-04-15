package com.ngaland.Gestion.des.taches.mapper;


import com.ngaland.Gestion.des.taches.dto.TacheDto;
import com.ngaland.Gestion.des.taches.models.Tache;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TacheMapper {
    Tache toEntity(TacheDto dto);
    TacheDto toDTO(Tache tache);
}
