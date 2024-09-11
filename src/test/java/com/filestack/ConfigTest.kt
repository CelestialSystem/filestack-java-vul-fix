package org.filestack

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class ConfigTest {

    @Test
    fun `verifies security`() {
        var config = Config("api_key")
        assertFalse(config.hasSecurity())

        config = Config("api_key", "return_url", "policy", null)
        assertFalse(config.hasSecurity())

        config = Config("api_key", "return_url", null, "policy")
        assertFalse(config.hasSecurity())

        config = Config("api_key", "return_url", "policy", "signature")
        assertTrue(config.hasSecurity())

        val policy = Policy.Builder()
                .giveFullAccess()
                .build("api_key")

        config = Config("api_key", policy)
        assertTrue(config.hasSecurity())
    }

}
