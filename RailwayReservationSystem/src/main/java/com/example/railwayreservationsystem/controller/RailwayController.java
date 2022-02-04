package com.example.railwayreservationsystem.controller;

import com.example.railwayreservationsystem.model.Railway;
import com.example.railwayreservationsystem.service.RailwayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/railway")
public class RailwayController {
    
    private final RailwayService railwayService;

    @GetMapping("/all")
    public List<Railway> getAllRailways(){return railwayService.getAllRailways();}
    
    @GetMapping("/{id}")
    public Railway getRailway(@PathVariable @Min(1) Integer id) {return railwayService.getRailway(id);}

    @PostMapping(value = "/create")
    public void saveRailway(@Valid @RequestBody Railway railway) {railwayService.addRailway(railway);}

    @PutMapping(value = "/update")
    public Railway updateRailway(@Valid @RequestBody Railway railway) {
        return railwayService.updateRailway(railway);
    }

    @DeleteMapping(value = "/delete")
    public boolean deleteRailway(@RequestParam @Min(1) Integer id) {
        return railwayService.deleteRailway(id);
    }

    @GetMapping(value = "/v2/departure-airport/{dep_id}")
    public ResponseEntity<Railway> getOneByDepartureIdV2(
            @PathVariable @Min(1) Integer dep_id
    ) {
        Railway railway = railwayService.getFirstRailwayByFirstStationByDefault(dep_id);
        return new ResponseEntity<>(railway, HttpStatus.OK);
    }

}
