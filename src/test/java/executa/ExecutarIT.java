package executa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        // Mostrar o caminho das features
        features = {"src/test/resources/features"},
        // Mostrar em qual package estao os testes
        glue = {"testes"},
        // Tags para apontar ou nao, a execucao dos cenarios
        tags = "@Executa and not @nExecuta",
        // Para formatar do console de acordo com o Cucumber, e gerar um report em html
        plugin = {"pretty", "html:target/report_cucumber.html"},
        // Monochrome deixa o console com uma melhor visualizacao, sem trazer caracteres especiais
        monochrome = true,
        // Deixa os metodos com padrao da linguagem Java
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        // Nao executa o teste, so valida o mapeamento se faltar executar alguma coisa. Padrao deixar false
        dryRun = false
)
public class ExecutarIT extends AbstractTestNGCucumberTests {

}