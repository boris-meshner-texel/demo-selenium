package com.example.demo_selenium

import com.codeborne.selenide.Configuration
import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.logevents.SelenideLogger
import io.qameta.allure.selenide.AllureSelenide
import org.junit.jupiter.api.*

import com.codeborne.selenide.Selenide.*


class LandingPageTest {
    private val landingPage = LandingPage()
    private val legalNoticePage = LegalNoticePage()
    private val enterPinCodePage = EnterPinCodePage()

    @BeforeEach
    fun setUpAllure() {
        SelenideLogger.addListener("allure", AllureSelenide())
    }

    @BeforeEach
    fun setUp() {
        Configuration.startMaximized = true
        open("http://localhost:3000/")
    }

    @Test
    fun legalNotice() {

        landingPage.clickJoinArena();
        //test if in the right page

        legalNoticePage.clickContinueButton()

        //element(byName("input1")).waitUntil(visible,20000)
        enterPinCodePage.inputCode(listOf("1", "2", "3", "4"))

        val pinErrorLabel = "Please check the Code and try again."
        val errorMsgAutomationAtr = "data-automation-check-pin-error-msg"
        val isError = element(byAttribute(errorMsgAutomationAtr, "true")).text().equals(pinErrorLabel)

        println(isError);

        print(",essage")


        /*element(byXpath("//button[@type='submit' and text()='Search']")).click()

        element(byClassName("js-search-input")).shouldHave(attribute("value", "Selenium"))*/
    }

    /*@Test
    fun toolsMenu() {
        mainPage.toolsMenu.hover()

        element(byClassName("menu-main__popup-wrapper")).shouldBe(visible)
    }

    @Test
    fun navigationToAllTools() {
        mainPage.seeAllToolsButton.click()

        element(byClassName("products-list")).shouldBe(visible)

        assertEquals("All Developer Tools and Products by JetBrains", Selenide.title())
    }*/
}
