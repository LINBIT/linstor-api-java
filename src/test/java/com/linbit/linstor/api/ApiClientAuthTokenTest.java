package com.linbit.linstor.api;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

/**
 * Offline tests for the auth.json token fallback ({@link ApiClient#readAuthTokenFile}).
 */
public class ApiClientAuthTokenTest {

    @Test
    public void readsTokenFromAuthJson() throws Exception {
        Path tmp = Files.createTempFile("auth", ".json");
        try {
            Files.write(tmp, "{\"token\":\"abc123\"}".getBytes(StandardCharsets.UTF_8));
            Assert.assertEquals("abc123", ApiClient.readAuthTokenFile(tmp));
        } finally {
            Files.deleteIfExists(tmp);
        }
    }

    @Test
    public void missingFileReturnsNull() {
        Assert.assertNull(ApiClient.readAuthTokenFile(Paths.get("/nonexistent/linstor.d/auth.json")));
    }

    @Test
    public void absentTokenFieldReturnsNull() throws Exception {
        Path tmp = Files.createTempFile("auth", ".json");
        try {
            Files.write(tmp, "{\"other\":\"x\"}".getBytes(StandardCharsets.UTF_8));
            Assert.assertNull(ApiClient.readAuthTokenFile(tmp));
        } finally {
            Files.deleteIfExists(tmp);
        }
    }

    @Test
    public void invalidJsonReturnsNull() throws Exception {
        Path tmp = Files.createTempFile("auth", ".json");
        try {
            Files.write(tmp, "not json".getBytes(StandardCharsets.UTF_8));
            Assert.assertNull(ApiClient.readAuthTokenFile(tmp));
        } finally {
            Files.deleteIfExists(tmp);
        }
    }
}
