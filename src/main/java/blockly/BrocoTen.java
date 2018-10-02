package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.lang.Math;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BrocoTen {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BrocoTen
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.math.Operations.sqrt(Var.valueOf(9));
			}
		}.call();
	}

}
