
/**
 * @author : Davidson Teixeira Filho
 * @month : 11/2023
 */

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"DAO", "controller", "model", "main", "view", "view.telasAlteracao", "view.telasCadastro", "view.telasDelete", "view.telasExibicao"})
@IncludeClassNamePatterns("^.*Tests?$")
public class SuiteTest {
    
}
