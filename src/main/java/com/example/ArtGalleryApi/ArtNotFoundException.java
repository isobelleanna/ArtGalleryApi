package com.example.ArtGalleryApi;

import javax.persistence.EntityNotFoundException;

public class ArtNotFoundException extends EntityNotFoundException {
    public ArtNotFoundException() {
        super("Artwork has not been found");
    }
}
