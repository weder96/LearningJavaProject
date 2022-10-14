package exec;

import br.com.wsousa.model.*;

public class SistemaInterno {

    public boolean login (Autenticavel usuario, int senha) {
        return usuario.autentica(senha);
    }
}
