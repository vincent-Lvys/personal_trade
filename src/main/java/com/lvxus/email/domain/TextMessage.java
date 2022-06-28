package com.lvxus.email.domain;

import lombok.Data;

/**
 * @author lvxus
 */
@Data
public class TextMessage {

    private Text text;
    private Integer safe;

    @Data
    public static class Text{
        String content;
    }

}
