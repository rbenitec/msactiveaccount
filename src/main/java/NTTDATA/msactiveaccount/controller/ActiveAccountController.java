package NTTDATA.msactiveaccount.controller;

import NTTDATA.msactiveaccount.entitty.ActiveAccount;
import NTTDATA.msactiveaccount.service.ActiveAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/active")
public class ActiveAccountController {

    @Autowired
    ActiveAccountService activeAccountService;

    @GetMapping()
    public Flux<ActiveAccount> getAll(){
        return activeAccountService.findAll();
    }

    @PostMapping()
    public Mono<ActiveAccount> createActive(@RequestBody ActiveAccount activeAccount){
        return activeAccountService.create(activeAccount);
    }

    @GetMapping("/{id}")
    public Mono<ActiveAccount> findById(@PathVariable("id") String id){
        return activeAccountService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return activeAccountService.delete(id);
    }

    //Con comunicacion con otro microservicio
    @GetMapping("/byclient/{clientId}")
    public Mono<ActiveAccount> findByClientId(@PathVariable("clientId") String clientId){
        return activeAccountService.findByClientId(clientId);
    }



}
