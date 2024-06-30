package dev.jsedano.ezcraft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CraftAtttribute {

  private String name;
  private String type;
}
