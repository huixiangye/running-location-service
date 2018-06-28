package demo.service;

import demo.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yehuixiang on 6/27/18.
 */
@Service
public interface LocationService {
    List<Location> saveRunningLocation(List<Location> runningLocations);

    void deleteAll();

    Page<Location> findByRunnerMovementType(String movementType, Pageable pageable);

    Page<Location> findByUnitInfoRunningId(String runningId, Pageable pageable);
}
