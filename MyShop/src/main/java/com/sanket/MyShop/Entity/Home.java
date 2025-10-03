package com.sanket.MyShop.Entity;

import java.util.List;

import lombok.Data;

@Data
public class Home {

    private List<HomeCategory> grid;

    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electricCastegories;

    private List<HomeCategory> dealCategories;

    private List<Deal> deals;
}
