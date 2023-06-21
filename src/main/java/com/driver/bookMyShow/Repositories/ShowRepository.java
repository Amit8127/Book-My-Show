package com.driver.bookMyShow.Repositories;

import com.driver.bookMyShow.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Integer> {
}
