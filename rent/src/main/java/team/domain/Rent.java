package team.domain;

import team.domain.Returned;
import team.domain.BikeRented;
import team.RentApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Rent_table")
@Data

public class Rent  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long productId;
    
    
    
    
    
    private Date startTime;
    
    
    
    
    
    private Date endTime;
    
    
    
    
    
    private Long rentHour;
    
    
    
    
    
    private Long totalPrice;

    @PostPersist
    public void onPostPersist(){


        Returned returned = new Returned(this);
        returned.publishAfterCommit();



        BikeRented bikeRented = new BikeRented(this);
        bikeRented.publishAfterCommit();

        // Get request from Management
        //team.external.Management management =
        //    Application.applicationContext.getBean(team.external.ManagementService.class)
        //    .getManagement(/** mapping value needed */);

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static RentRepository repository(){
        RentRepository rentRepository = RentApplication.applicationContext.getBean(RentRepository.class);
        return rentRepository;
    }



    public void rentalCancel(){
        RentalCanceled rentalCanceled = new RentalCanceled(this);
        rentalCanceled.publishAfterCommit();

    }
    public void bikeReturn(){
        RentalCanceled rentalCanceled = new RentalCanceled(this);
        rentalCanceled.publishAfterCommit();

    }



}
