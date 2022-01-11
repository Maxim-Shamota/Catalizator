package site.shamota.catalizator.repo;

import site.shamota.catalizator.domain.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepo extends ReactiveCrudRepository<Message, Long> {
}
