package BDD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
 @CucumberOptions(features = "src\\test\\resource\\HomePage.feature" , tags = "@Wishlist",
 plugin = {"html:target/cucumber-html-report",
            "json:target/cucumber-json-report.json",
            "junit:target/cucumber-junit-report.xml",
             "pretty:target/cucumber-pretty-report.txt"}

 ) //feature bracket end

// @CucumberOptions(features = "C:\\Users\\unnati\\BDD\\src\\test\\resource\\ResultPage.feature")

public class RunCukeTest {
}

//Dev Code
<<<<<<< HEAD
//pushing code in to my own branch
//pushing code into dev

//hello

//restore command demo

//chirag patel

//chirag b
=======

//pushing code in to my own branch
=======
//pushing code into dev

>>>>>>> b1770c71f090c2c3aa114b5d453998d71654889f
