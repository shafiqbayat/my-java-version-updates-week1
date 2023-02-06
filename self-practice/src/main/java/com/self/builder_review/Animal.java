package com.self.builder_review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Animal {
   private String name;
   private int age;
   private String type;
   private int weight;
   private String color;


}
