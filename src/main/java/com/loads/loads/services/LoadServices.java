package com.loads.loads.services;

import java.util.List;
import java.util.Optional;

import com.loads.loads.entities.Load;

public interface LoadServices {

	public List<Load> getLoads();

	public Optional<Load> getLoad(long sellerId);

	public Load addLoad(Load load);

	public Load updateLoad(Load load);

	public void deleteLoad(long parseLong);
	
}
