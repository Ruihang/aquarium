/**
 * 
 */
package net.sunrise.crsx.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.brilliance.framework.repository.BaseRepository;
import net.sunrise.crsx.domain.entity.Region;

/**
 * @author ducbq
 *
 */
@Repository
public interface RegionRepository extends BaseRepository<Region, Long> {
	Optional<Region> findByName(String name);
	@Query("SELECT entity FROM #{#entityName} entity WHERE ("
			+ " LOWER(entity.name) like LOWER(CONCAT('%',:keyword,'%'))"
			+ ")"
	)
	Page<Region> search(@Param("keyword") String keyword, Pageable pageable);
}
