package com.loads.loads.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loads.loads.dao.LoadDao;
import com.loads.loads.entities.Load;

@Service
public class loadServicesimpl implements LoadServices {

	@Autowired
	private LoadDao loadDao;
	
	
	// List<Load> list;
	




	// public loadServicesimpl() {
		
	// 	list = new ArrayList<>();
	// 	list.add(new Load(1,"abc","cde","asdf","a",11,22,"wer","fff"));
	// 	list.add(new Load(11,"vsfabc","cdffsdde","adfsdsdf","adsfsd",14441,23332,"wedfsdr","ffdvsff"));
		
	// }





	@Override
	public List<Load> getLoads() {
		
		return loadDao.findAll();
	}





	@Override
	public Optional<Load> getLoad(long sellerId) {
		// Load s = null;

		// for(Load load:list)
		// {
		// 	if(load.getId()==sellerId)
		// 	{
		// 		s=load;
		// 		break;
		// 	}
		// }

		return loadDao.findById(sellerId);
	}





	@Override
	public Load addLoad(Load load) {
		// list.add(load);
		loadDao.save(load);
		return load;
	}





	@Override
	public Load updateLoad(Load load) {
		// list.forEach(e -> {
		// 	if(e.getId() == load.getId()){
		// 		e.setLoadingPoint(load.getLoadingPoint());
		// 		e.setUnloadingPoint(load.getUnloadingPoint());
		// 		e.setProductType(e.getProductType());
		// 		e.setTruckType(e.getTruckType());
		// 		e.setNoOfTrucks(load.getNoOfTrucks());
		// 		e.setWeight(e.getWeight());
		// 		e.setComment(e.getComment());
		// 		e.setDate(e.getDate());
				
		// 	}
		// });
		loadDao.save(load);

		return load;
	}





	@Override
	public void deleteLoad(long parseLong) {
		// list =list.stream().filter(e-> e.getId()!=parseLong).collect(Collectors.toList());
		Load entity = loadDao.getOne(parseLong);
		loadDao.delete(entity);
	}

	
}
