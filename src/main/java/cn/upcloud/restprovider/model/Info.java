package cn.upcloud.restprovider.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Info {
    @Id
    private String username;
    private String type;
    private String area;
    private String licence;
    private String status;
    private String place;
    private int id;
    private int people;

}
