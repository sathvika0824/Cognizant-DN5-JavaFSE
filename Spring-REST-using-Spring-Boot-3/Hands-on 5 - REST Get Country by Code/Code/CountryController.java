package spring_learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping("/country")
    public Country getCountryIndia() {
        return countryService.getCountry("IN");
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}