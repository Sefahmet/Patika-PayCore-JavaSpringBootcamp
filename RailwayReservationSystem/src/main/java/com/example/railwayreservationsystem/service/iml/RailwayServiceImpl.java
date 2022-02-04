package com.example.railwayreservationsystem.service.iml;

import com.example.railwayreservationsystem.exception.NotFoundException;
import com.example.railwayreservationsystem.model.Railway;
import com.example.railwayreservationsystem.service.RailwayService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import repository.RailwayRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RailwayServiceImpl implements RailwayService {

    private final RailwayRepository railwayRepository;

    @Override
    public List<Railway> getAllRailways(){return railwayRepository.findAll();}

    @Override
    public Railway getRailway(Integer id){
        Optional<Railway> byId = railwayRepository.findById(id);
        return byId.orElseThrow(() -> new NotFoundException("Railway"));

    }

    @Override
    public void addRailway(Railway railway) {
        railwayRepository.save(railway);
    }

    @Override
    public Railway updateRailway(Railway railway) {
        return railwayRepository.save(railway);
    }

    @Override
    public boolean deleteRailway(Integer id) {
        railwayRepository.delete(getRailway(id));
        return true;
    }

    @Override
    public Railway getFirstRailwayByFirstStationByDefault(Integer first_station_id) {

        return null;
    }
}
