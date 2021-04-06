package com.example.demo_selenium

import com.codeborne.selenide.Selectors
import com.codeborne.selenide.Selenide as driver
class LegalNoticePage {
    val buttons = driver.elements(Selectors.byTagName("button"));

    private val continueButton = buttons[0]
    private val legalNoticeButton = buttons[1]

    fun clickContinueButton () {
        continueButton.click();
    }

    fun clickLegalNotice () {
        legalNoticeButton.click();
    }
}