package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class MaisUm {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// MaisUm
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Testando novamente").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
