package gn.moria.auth.entity;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

public class BaseMongoAudit {
    @Id
    @MongoId
    private String id;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String updatedBy;

    @Version
    private Integer version;
}
