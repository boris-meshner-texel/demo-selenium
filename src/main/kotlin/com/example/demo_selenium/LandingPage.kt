package com.example.demo_selenium

import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide as driver

class LandingPage {
    val buttons = driver.elements(byTagName("button"));

    private val joinArenaButton = buttons[0]
    private val helpLink = buttons[1]

    fun clickJoinArena () {
        joinArenaButton.click();
    }

    fun clickHelp () {
        helpLink.click();
    }
}
