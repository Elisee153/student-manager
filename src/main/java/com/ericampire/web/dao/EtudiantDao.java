package com.ericampire.web.dao;

import com.ericampire.web.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EtudiantDao extends CrudRepository<Etudiant, Long> {

}
