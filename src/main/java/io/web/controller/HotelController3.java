package io.web.controller;

import com.google.common.collect.ImmutableList;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Produces;
import java.util.List;

@Controller
@ContextConfiguration(classes = {AppConfig.class})
@RequestMapping(value = "/hotels3")
//@Consumes({MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_HTML_VALUE})
public class HotelController3 {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> getHotel() {
        return getHotels();
    }

    @ResponseBody
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Hotel getHotelInfo() {
        return new Hotel("admino");
    }

    public List<Hotel> getHotels() {
        return ImmutableList.of(new Hotel("a"), new Hotel("b"));
    }
}
