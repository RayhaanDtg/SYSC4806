package App;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//
@RepositoryRestResource( path = "greeting")
public interface BuddyRep extends CrudRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findByName(String lastName);

    BuddyInfo findByNumber(Integer number);
}
