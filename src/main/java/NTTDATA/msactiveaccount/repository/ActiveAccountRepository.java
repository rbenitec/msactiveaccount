package NTTDATA.msactiveaccount.repository;

import NTTDATA.msactiveaccount.entitty.ActiveAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ActiveAccountRepository extends ReactiveMongoRepository<ActiveAccount,String> {

    Mono<ActiveAccount> findByClientId(String clientId);

}
