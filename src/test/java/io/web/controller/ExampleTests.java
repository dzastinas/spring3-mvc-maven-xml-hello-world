package io.web.controller;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.Validator;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ViewResolver;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration()
//@ContextConfiguration(classes = {TestContext.class, AppConfig.class})
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration({
        "file:src/main/webapp/WEB-INF/spring-web-servlet.xml"
})
public class ExampleTests {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

        @Before
    public void setUp() {
            //We have to reset our mock between tests because the mock objects
            //are managed by the Spring container. If we would not reset them,
            //stubbing and verified behavior would "leak" from one test to another.
//            Mockito.reset(todoServiceMock);

            mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void show404Page() throws Exception {

        mockMvc.perform(get("/hotels3"))
                .andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].name", is("a")));

//        MvcResult a = mockMvc.perform(get("/hotels3"))
//                .andExpect(status().isOk()).andExpect(jsonPath("$.name", is("a"))).andReturn();
////                .andExpect(view().name(ErrorController.VIEW_NOT_FOUND))
////                .andExpect(forwardedUrl("/WEB-INF/jsp/error/404.jsp"));

//        a.getResponse().getContentAsString();
    }

    @Test
    public void testJsonMapping() throws Exception {

        mockMvc.perform(get("/hotels3/info"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("admino")));
    }

    private ViewResolver viewResolver() {
        return null;
    }

    private Validator validator() {
        return null;
    }

    private List<HandlerExceptionResolver> exceptionResolver() {
        return null;
    }

    @Test
    public void getAccount() throws Exception {
        this.mockMvc.perform(get("/hotel3")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.name").value("Lee"));
    }


}
