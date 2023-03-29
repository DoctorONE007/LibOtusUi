package com.example.libotusui.security;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class RestSecurityTest {

    @Autowired
    private MockMvc mockMvc;

    @WithAnonymousUser
    @Test
    public void authorsIndex() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @WithMockUser(username = "user", authorities = {"author:read"})
    @Test
    public void authorsAuth() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/authors")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @WithAnonymousUser
    @Test
    public void authorsAnon() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/authors")).andExpect(MockMvcResultMatchers.status().is(302));
    }

    @WithMockUser(username = "user", roles = {"ADMIN"})
    @Test
    public void authorsGetEdit() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .get("/authors/edit")
                        .param("id", "1"))
                .andExpect(MockMvcResultMatchers.status().is(200));
    }

}
