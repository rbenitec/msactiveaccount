package NTTDATA.msactiveaccount.service.implemt;

import NTTDATA.msactiveaccount.entitty.ActiveAccount;
import NTTDATA.msactiveaccount.repository.ActiveAccountRepository;
import NTTDATA.msactiveaccount.service.ActiveAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ActiveAccountServiceImpl implements ActiveAccountService {

    @Autowired
    private ActiveAccountRepository activeAccountRepository;

    @Override
    public Mono<ActiveAccount> create(ActiveAccount activeAccount) {
        return activeAccountRepository.save(activeAccount);
    }

    @Override
    public Mono<ActiveAccount> findById(String id) {
        return activeAccountRepository.findById(id);
    }

    @Override
    public Flux<ActiveAccount> findAll() {
        return activeAccountRepository.findAll();
    }

    @Override
    public Mono<Void> delete(String id) {
        return activeAccountRepository.deleteById(id);
    }


    @Override
    public Mono<ActiveAccount> findByClientId(String clientId) {
        return activeAccountRepository.findByClientId(clientId);
    }

}
