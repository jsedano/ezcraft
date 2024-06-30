package dev.jsedano.ezcraft.controller;

import dev.jsedano.ezcraft.dto.CraftRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ezcraft")
@RequiredArgsConstructor
@Log4j2
public class CraftController {

  @RequestMapping("/")
  public String newRandomSelect(Model model) {
    model.addAttribute("craftRequest", CraftRequest.builder().build());
    return "craftForm";
  }

  @RequestMapping("/download")
  public String newRandomSelect(Model model, CraftRequest craftRequest) {
    log.info(craftRequest);
    model.addAttribute("craftRequest", CraftRequest.builder().build());
    return "craftForm";
  }
}
