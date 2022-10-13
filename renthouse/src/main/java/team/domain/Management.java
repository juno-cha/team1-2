package team.domain;

import team.RenthouseApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Management_table")
@Data

public class Management  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private Long rentUnitPrice;
    
    
    
    
    
    private Boolean rentAvailable;

    @PostPersist
    public void onPostPersist(){
    }

    public static ManagementRepository repository(){
        ManagementRepository managementRepository = RenthouseApplication.applicationContext.getBean(ManagementRepository.class);
        return managementRepository;
    }



    public void bikeArrival(){
        BikeArrivaled bikeArrivaled = new BikeArrivaled(this);
        bikeArrivaled.publishAfterCommit();

    }
    public void bikeRepair(){
        BicycleRepaired bicycleRepaired = new BicycleRepaired(this);
        bicycleRepaired.publishAfterCommit();

    }
    public void bikeRepairComplete(){
        BikeRepairCompleted bikeRepairCompleted = new BikeRepairCompleted(this);
        bikeRepairCompleted.publishAfterCommit();

    }

    public static void bikeConditionChange(BikeArrivaled bikeArrivaled){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(bikeArrivaled.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }
    public static void bikeConditionChange(BicycleRepaired bicycleRepaired){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(bicycleRepaired.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }
    public static void bikeConditionChange(Paid paid){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }
    public static void bikeConditionChange(Returned returned){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(returned.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }
    public static void bikeConditionChange(BikeRepairCompleted bikeRepairCompleted){

        /** Example 1:  new item 
        Management management = new Management();
        repository().save(management);

        */

        /** Example 2:  finding and process
        
        repository().findById(bikeRepairCompleted.get???()).ifPresent(management->{
            
            management // do something
            repository().save(management);


         });
        */

        
    }


}
