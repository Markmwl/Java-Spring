package com.mark.Factory_Car;

import com.mark.Models_Car.Car;
import com.mark.Models_Car.Dipan;
import com.mark.Models_Car.Fadongji;
import com.mark.Models_Car.Luntai;
import lombok.Data;

@Data
public class CarFactory {

    public Car GetCarFactory()
    {
        Car car1 = new Car();
        car1.setDipan(new Dipan());
        car1.setFadongji(new Fadongji());
        car1.setLuntai(new Luntai());
        return  car1;
    }
}
