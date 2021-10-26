package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author 吴金才
 * @Description *
 * @date 2021/10/13 8:01 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertiesDTO {
    private List<PropertyDTO> propertyDTOList;

    public String buildPropertiesName(List<PropertyDTO> propertyDTOList){
        if(CollectionUtils.isEmpty(propertyDTOList)){
            return null;
        }
        StringBuilder propertiesName = new StringBuilder("");
        for(PropertyDTO propertyDTO : propertyDTOList){
            propertiesName.append(propertyDTO.getK()).append(":").append(propertyDTO.getV()).append(" ");
        }
        return propertiesName.toString();
    }
}