package com.example.demo_selenium

import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide.element
import com.codeborne.selenide.Selenide.elements

class EnterPinCodePage {

    fun inputCode(numbers: List<String>) {
        elements(byAttribute("data-automation-input-code", "true"))
            .forEachIndexed { index, element -> element.sendKeys(numbers[index])}
    }
}