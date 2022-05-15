package be.md.pokerstudio.web;

import be.md.pokerstudio.web.dto.PotDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Controller
public class PotOddsController {
    @GetMapping("/potodds")
    public String getOddsView(Model model) {
        model.addAttribute("potdto", new PotDto());
        return "potodds";
    }

    @PostMapping("/potodds")
    public String potOddsSubmit(@ModelAttribute PotDto potDto, Model model) {
        var potOdds = (potDto.getPot().add(potDto.getToCall()))
                .divide(potDto.getToCall(), RoundingMode.FLOOR);
        BigDecimal result = new BigDecimal(100).divide(potOdds,potOdds.scale(),RoundingMode.FLOOR );
        potDto.setResult(result);

        model.addAttribute("potdto", potDto);
        return "potodds";
    }
}
