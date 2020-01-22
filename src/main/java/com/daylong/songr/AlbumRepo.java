package com.daylong.songr;

import org.springframework.data.jpa.repository.JpaRepository;

// The diamond declares what is stored <TypeOfThing, TypeOfThing's ID>
public interface AlbumRepo extends JpaRepository<Album, Long> {
}
