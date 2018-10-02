package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FazAlgo {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// FazAlgo
	public static Var teste() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						Var.valueOf("testando"));
				return Var.VAR_NULL;
			}
		}.call();
	}

}
