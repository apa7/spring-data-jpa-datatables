package org.springframework.data.jpa.datatables.repository;

import java.io.Serializable;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Convenience interface to allow pulling in {@link PagingAndSortingRepository}
 * and {@link JpaSpecificationExecutor} functionality in one go.
 * 
 * @author Damien Arrachequesne
 */
@NoRepositoryBean
public interface DataTablesRepository<T, ID extends Serializable> extends
		PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T> {

	/**
	 * Returns the filtered list for the given {@link DataTablesInput}.
	 * 
	 * @param input
	 * @return
	 */
	DataTablesOutput<T> findAll(DataTablesInput input);

}
