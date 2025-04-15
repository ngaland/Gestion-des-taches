package com.ngaland.Gestion.des.taches.mapper;

import com.ngaland.Gestion.des.taches.dto.TacheDto;
import com.ngaland.Gestion.des.taches.models.Tache;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-15T09:25:03+0100",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class TacheMapperImpl implements TacheMapper {

    @Override
    public Tache toEntity(TacheDto dto) {
        if ( dto == null ) {
            return null;
        }

        Tache tache = new Tache();

        tache.setTitre( dto.getTitre() );
        tache.setDescription( dto.getDescription() );
        tache.setResponsable( dto.getResponsable() );
        tache.setDateEcheance( dto.getDateEcheance() );
        tache.setStatut( dto.getStatut() );
        tache.setPriorite( dto.getPriorite() );

        return tache;
    }

    @Override
    public TacheDto toDTO(Tache tache) {
        if ( tache == null ) {
            return null;
        }

        TacheDto tacheDto = new TacheDto();

        tacheDto.setTitre( tache.getTitre() );
        tacheDto.setDescription( tache.getDescription() );
        tacheDto.setStatut( tache.getStatut() );
        tacheDto.setPriorite( tache.getPriorite() );
        tacheDto.setResponsable( tache.getResponsable() );
        tacheDto.setDateEcheance( tache.getDateEcheance() );

        return tacheDto;
    }
}
