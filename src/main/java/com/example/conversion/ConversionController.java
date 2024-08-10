package com.example.conversion;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/conversion")
public class ConversionController {

    @PostMapping("/distance")
    double ConvertDistance(@RequestBody ConversionInput input)
    {
        Converter converter=new DistanceConversion();
        return converter.convert(input);
    }

}
