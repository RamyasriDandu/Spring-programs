package com.boots;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boots.model.AlienSpace;

public interface AlienSpaceRepo extends JpaRepository<AlienSpace, Integer>{

	List<AlienSpace> findByAnameOrderByAidDesc(String aname);// quer dsl(domain specific language)

	//it can be findBy or getBy and we should also pass name Aname should be capital letter

}
