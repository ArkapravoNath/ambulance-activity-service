package com.gok.medicalpractitioners.service.mapper;


import com.gok.medicalpractitioners.domain.*;
import com.gok.medicalpractitioners.service.dto.AmbulanceActivityDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link AmbulanceActivity} and its DTO {@link AmbulanceActivityDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AmbulanceActivityMapper extends EntityMapper<AmbulanceActivityDTO, AmbulanceActivity> {



    default AmbulanceActivity fromId(Long id) {
        if (id == null) {
            return null;
        }
        AmbulanceActivity ambulanceActivity = new AmbulanceActivity();
        ambulanceActivity.setId(id);
        return ambulanceActivity;
    }
}
