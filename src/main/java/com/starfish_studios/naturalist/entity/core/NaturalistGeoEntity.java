package com.starfish_studios.naturalist.entity.core;

import software.bernie.geckolib.animatable.GeoEntity;

public interface NaturalistGeoEntity extends GeoEntity {
    @Override
    default double getBoneResetTime() {
        return 5;
    }
}
