package com.practical.restful.training.service;

import com.practical.restful.training.entity.Car;
import com.practical.restful.training.entity.Engine;
import com.practical.restful.training.entity.Tire;
import com.practical.restful.training.util.RandomDateUtil;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


@Service
public class RandomCarService implements CarService {
    @Override
    public Car generateCar() {
        var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
        var color = COLORS.get(ThreadLocalRandom.current().nextInt(0, COLORS.size()));
        var types = TYPES.get(ThreadLocalRandom.current().nextInt(0, TYPES.size()));
        var available = ThreadLocalRandom.current().nextBoolean();
        var price = ThreadLocalRandom.current().nextInt(5000, 12001);
        var firstReleaseDate = RandomDateUtil.generateRandomLocalDate();

        int randomCount = ThreadLocalRandom.current().nextInt(ADDITIONAL_FEATURES.size());
        var additionalFetures = new ArrayList<String>();
        var fuel = FUELS.get(ThreadLocalRandom.current().nextInt(FUELS.size()));
        var horsePower = ThreadLocalRandom.current().nextInt(75, 901);
        var tires = new ArrayList<Tire>();
        var secretFeature = ThreadLocalRandom.current().nextBoolean() ? "Can Fly" : null;


        for (int h = 0; h < 3; h++) {
            var manufacturer = TIRE_MANUFACTURERS.get(ThreadLocalRandom.current().nextInt(TIRE_MANUFACTURERS.size()));
            var size = ThreadLocalRandom.current().nextInt(15, 18);
            var tirePrice = ThreadLocalRandom.current().nextInt(200, 401);

            var tire = new Tire();
            tire.setManufacturer(manufacturer);
            tire.setSize(size);
            tire.setPrice(tirePrice);

            tires.add(tire);
        }

        var engine = new Engine();
        engine.setFuelType(fuel);
        engine.setHorsePower(horsePower);

        for (int i = 0; i < randomCount; i++) {
            additionalFetures.add(ADDITIONAL_FEATURES.get(i));
        }

        var result = new Car(brand, color, types);

        result.setAvailable(available);
        result.setPrice(price);
        result.setFirstReleaseDate(firstReleaseDate);
        result.setAdditionalFeatures(additionalFetures);
        result.setEngine(engine);
        result.setTires(tires);
        result.setSecretFeature(secretFeature);

        return result;
    }
}
