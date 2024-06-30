package dev.jsedano.ezcraft.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CraftClass {

  private String name;
  private List<CraftAtttribute> attributes;
}
