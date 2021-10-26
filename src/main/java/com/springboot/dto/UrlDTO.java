package com.springboot.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 吴金才
 * @Description *
 * @date 2021/9/16 7:50 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlDTO {
    @JSONField(name = "url")
    private String url;


    public static final class Builder {
        private String url;

        public Builder() {
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public UrlDTO build() {
            UrlDTO urlDTO = new UrlDTO();
            urlDTO.setUrl(url);
            return urlDTO;
        }
    }
}
