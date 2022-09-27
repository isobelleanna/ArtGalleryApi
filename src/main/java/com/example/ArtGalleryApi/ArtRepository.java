package com.example.ArtGalleryApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtRepository extends JpaRepository<Art, String> {
    Art findByid(String id);

    String deleteByid(String id);
}
