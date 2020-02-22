package com.example.interview.pojo;

import lombok.Data;
import org.beetl.sql.core.annotatoin.AutoID;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 */
@Data
public class User  implements Serializable {
//    @AutoID
    private Integer id ;
    private Integer age ;
    private String name ;
    private Date createDate ;

}