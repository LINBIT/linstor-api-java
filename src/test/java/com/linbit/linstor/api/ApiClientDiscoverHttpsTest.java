package com.linbit.linstor.api;

import org.junit.Assert;
import org.junit.Test;

/**
 * Offline tests for {@link ApiClient#discoverHttps()} scheme handling. The secure-scheme cases
 * never touch the network; the plain "linstor" case targets a closed local port (fast refusal).
 */
public class ApiClientDiscoverHttpsTest {

    @Test
    public void linstorSslSchemeUsesHttpsDefaultPort() {
        ApiClient client = new ApiClient();
        client.setBasePath("linstor+ssl://lin1");
        Assert.assertTrue(client.discoverHttps());
        Assert.assertEquals("https://lin1:3371", client.getBasePath());
    }

    @Test
    public void linstorSslSchemeKeepsExplicitPort() {
        ApiClient client = new ApiClient();
        client.setBasePath("linstor+ssl://lin1:8443");
        Assert.assertTrue(client.discoverHttps());
        Assert.assertEquals("https://lin1:8443", client.getBasePath());
    }

    @Test
    public void httpsSchemeStaysHttps() {
        ApiClient client = new ApiClient();
        client.setBasePath("https://lin1:8443");
        Assert.assertTrue(client.discoverHttps());
        Assert.assertEquals("https://lin1:8443", client.getBasePath());
    }

    @Test
    public void linstorPlainSchemeNormalizedToHttpWhenNoRedirect() {
        ApiClient client = new ApiClient();
        // closed local port -> connection refused (fast), no redirect
        client.setBasePath("linstor://127.0.0.1:1");
        Assert.assertFalse(client.discoverHttps());
        Assert.assertEquals("http://127.0.0.1:1", client.getBasePath());
    }
}