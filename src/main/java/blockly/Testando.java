package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Testando {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Testando
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				System.out.println(Var.valueOf("Testando salvamento de Blcos").getObjectAsString());
				return Var.VAR_NULL;
			}
		}.call();
	}

}
