package dev.jsedano.ezcraft.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CraftRequest {

  private String description;
  private String name;
  private String artifact;
}
