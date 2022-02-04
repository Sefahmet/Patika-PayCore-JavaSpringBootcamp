package com.example.railwayreservationsystem.service.iml;

import com.example.railwayreservationsystem.exception.NotFoundException;
import com.example.railwayreservationsystem.model.Passenger;
import com.example.railwayreservationsystem.service.PassengerService;
import repository.PassengerRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassenger(Integer id) {
        Optional<Passenger> byId = passengerRepository.findById(id);
        return byId.orElseThrow(() -> new NotFoundException("Passenger"));
    }

    @Override
    public void addPassenger(Passenger passenger) {
        passengerRepository.save(passenger);

    }

    @Override
    public Passenger updatePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public boolean deletePassenger(Integer id) {
        passengerRepository.delete(getPassenger(id));
        return true;
    }

    @Override
    public List<Passenger> getPassengersNameStartsWith(String prefix) {
        List<Passenger> allPassengers = getAllPassengers();
        return allPassengers.stream().filter(p -> p.getFirstname().startsWith(prefix)).collect(Collectors.toList());

    }

    @Override
    public List<Passenger> getPassengersSortedViaLastNameAsUpperCase() {
        List<Passenger> allPassengers = getAllPassengers();
        return allPassengers.stream()
                .sorted(Comparator.comparing(Passenger::getLastname))
                .peek(p -> p.setLastname(p.getLastname().toUpperCase()))
                .collect(Collectors.toList());
    }
}
