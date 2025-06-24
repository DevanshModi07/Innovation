package com.innovation.Innovation.ai.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Employee")

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String issue;
}
