package io.web.controller;

import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@ContextConfiguration(classes = {AppConfig.class})
public class HotelController {

    @RequestMapping("/hotels/{hotelId}")
    public String getHotel(@PathVariable String hotelId, Model model) {
        List<Hotel> hotels = getHotels();
        model.addAttribute("hotels", hotels);
        return "hotels";
    }

    public List<Hotel> getHotels() {
        return ImmutableList.of(new Hotel("a"), new Hotel("b"));
    }
}
