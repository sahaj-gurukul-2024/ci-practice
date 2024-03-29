package com.example
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.restassured.specification.RequestSpecification
import jakarta.inject.Inject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.hamcrest.CoreMatchers.`is`


@MicronautTest
class CiPracticeTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Test
    fun testItWorks() {
        Assertions.assertTrue(application.isRunning)
    }

    @Test
    fun testHelloEndpoint(spec: RequestSpecification) {
        spec
            .`when`()["/hello"]
            .then()
            .statusCode(200)
    }

}
