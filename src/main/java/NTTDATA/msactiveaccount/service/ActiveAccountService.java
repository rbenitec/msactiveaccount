package NTTDATA.msactiveaccount.service;

import NTTDATA.msactiveaccount.entitty.ActiveAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ActiveAccountService {

    Mono<ActiveAccount> create(ActiveAccount activeAccount);
    Mono<ActiveAccount> findById(String id);
    Flux<ActiveAccount> findAll();

    Mono<Void> delete(String id);

    //Encontrar las cuentas por clientId
    Mono<ActiveAccount> findByClientId(String clientId);
}
