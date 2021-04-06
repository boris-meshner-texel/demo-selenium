package com.example.demo_selenium

import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide as driver

class EnterPinCodePage {

    fun inputCode(numbers: List<String>) {
        driver.elements(byAttribute("data-automation-input-code", "true"))
            .forEachIndexed { index, element -> element.sendKeys(numbers[index])}
    }
}