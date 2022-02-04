package repository;


import com.example.railwayreservationsystem.model.Railway;
import com.example.railwayreservationsystem.model.Station;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface RailwayRepository  extends JpaRepository<Railway, Integer> {
    @Query(
            "select r from Railway r " +
                    "where" +
                    "(:first_statiton is NULL or r.firstStation = :first_station)"+
                    " AND " +
                    "(:last_station is NULL or r.lastStation = :last_station)"
    )
    Page<Railway> findByFirst_stationAndLast_station(
            Pageable pageable,
            @Param("first_station") Station first_station,
            @Param("last_station") Station last_station
            );
    default List<Railway> findByFirst_station(Station first_station){

        return null;
    }

    Railway getFirstById(Integer id);
    static  String getRailwayMessage(){

        return "Hello from railway repo interface";

    }
    Railway findByFirstStation(Station first_station);

}
