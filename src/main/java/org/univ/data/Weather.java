package org.univ.data;

import lombok.Data;

import java.sql.Date;

@Data
public class Weather {
    private int id;
    private int regionId;
    private Date date;
    private int temperature;
    private boolean snow;
    private String precipitation;
}
