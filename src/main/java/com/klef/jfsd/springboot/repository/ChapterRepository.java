package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.klef.jfsd.springboot.model.Chapter;

public interface ChapterRepository extends CrudRepository<Chapter, Integer>
{
	public List<Chapter> findByCoursename(String Coursename);
	
}