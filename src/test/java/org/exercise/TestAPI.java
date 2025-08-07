package org.exercise;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This is an exercise to assess your RestAssured skills.
 * Using classes from the above packages starting from line 3 and the website
 * https://jsonplaceholder.typicode.com/
 * 1) Create a RestAssured test that:
 - Sets up a base URL.
 - Sends a GET request to the /posts endpoint.
 - Verifies that the response status code.
 - Extracts the first post's title and body.
 - Asserts that the extracted title and body match expected values.
 * 2) If you complete this, are there any improvements you can do to make the test more thorough?
 * */

public class TestAPI {

    private ObjectMapper objMapper = new ObjectMapper();

    @Test
    public void testGetPosts() {

    }
    
}