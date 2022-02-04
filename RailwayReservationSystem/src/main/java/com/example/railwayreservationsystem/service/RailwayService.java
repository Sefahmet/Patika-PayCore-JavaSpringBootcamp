package com.example.railwayreservationsystem.service;

import com.example.railwayreservationsystem.model.Railway;

import java.util.List;

public interface RailwayService {
    List<Railway> getAllRailways();

    Railway getRailway(Integer id);

    void addRailway(Railway railway);

    Railway updateRailway(Railway railway);

    boolean deleteRailway(Integer id);

    Railway getFirstRailwayByFirstStationByDefault(Integer first_station_id);
}
