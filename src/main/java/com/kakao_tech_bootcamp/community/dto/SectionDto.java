package com.kakao_tech_bootcamp.community.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class SectionDto {
    private String title;
    private List<String> paragraphs;
    private List<String> lists;
    
    // 편의 생성자들
    public SectionDto(String title, List<String> paragraphs) {
        this.title = title;
        this.paragraphs = paragraphs;
        this.lists = null;
    }
    
    public SectionDto(String title, List<String> paragraphs, List<String> lists) {
        this.title = title;
        this.paragraphs = paragraphs;
        this.lists = lists;
    }
}