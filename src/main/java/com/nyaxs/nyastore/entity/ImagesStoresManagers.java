package com.nyaxs.nyastore.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ImagesStoresManagers implements Serializable {
    private Integer id;

    private Integer storeId;

    private String imgAddress;

    private static final long serialVersionUID = 1L;


}