package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BloqueandoAlgo {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BloqueandoAlgo
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return Var.valueOf("");
			}
		}.call();
	}

}
