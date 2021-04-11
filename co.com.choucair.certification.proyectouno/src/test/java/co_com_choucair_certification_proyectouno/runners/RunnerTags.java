package co_com_choucair_certification_proyectouno.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                features = "src/test/resources/features/academyChoucair.feature",
                   tags = "@stories",
                    glue = "co_com_choucair_certificacion_proyectouno.stepdefinitions",
                     snippets = SnippetType.CAMELCASE)
public  class RunnerTags{

}
