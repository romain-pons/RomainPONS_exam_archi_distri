package com.example.romainpons_exam_archi_distri.repository;

import com.example.romainpons_exam_archi_distri.dto.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Long> {
    List<Course> findByNomClientAndPrenomClient(String nomClient, String prenomClient);
}
