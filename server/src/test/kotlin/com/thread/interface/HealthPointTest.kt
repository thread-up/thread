package com.thread.`interface`

import org.hamcrest.CoreMatchers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
internal class HealthEndpointsTest {
    @Autowired
    private val mvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun `should respond pong`() {
        mvc?.perform(MockMvcRequestBuilders
                .get("/ping")
                .accept(MediaType.APPLICATION_JSON))
                ?.andExpect(MockMvcResultMatchers.status().isOk)
                ?.andExpect(MockMvcResultMatchers.content().string(CoreMatchers.equalTo("pong")))
    }
}