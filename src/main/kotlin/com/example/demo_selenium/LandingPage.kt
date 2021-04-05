package com.example.demo_selenium

import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.Selenide.elements

class LandingPage {
    val buttons = elements(byTagName("button"));

    private val joinArenaButton = buttons[0]
    private val helpLink = buttons[1]

    fun joinArena () {
        joinArenaButton.click();
    }

    fun clickHelp () {
        helpLink.click();
    }
}
