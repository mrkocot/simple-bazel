package tests

import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.nulls.shouldBeNull
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class KotlinJ5Test {
    @Test
    fun doSomething() {
        val twoPlusOne = 2 + 1
        val three = 3
        twoPlusOne shouldBeExactly three
    }

    @Nested
    inner class Additional {
        @Test
        fun `test with multiple words`() {
            val nothing = emptyList<String>().firstOrNull()
            nothing.shouldBeNull()
        }
    }
}
