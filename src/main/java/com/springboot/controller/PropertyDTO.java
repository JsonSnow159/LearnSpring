package com.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 吴金才
 * @Description *
 * @date 2021/10/13 8:02 下午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDTO {
    private Long vid;
    private String v;
    private Long kid;
    private String k;
}