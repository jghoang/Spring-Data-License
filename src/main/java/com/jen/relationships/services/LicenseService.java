package com.jen.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jen.relationships.models.License;
import com.jen.relationships.repositories.LicenseRepository;

@Service // Sets class as service
public class LicenseService {
	// <----- Attributes ----->
		// Dependency injection
		private final LicenseRepository lRepo;
		
		// <----- Constructors ----->
		public LicenseService(LicenseRepository lRepo) {
			this.lRepo = lRepo;
		}
		
		// <----- Methods ----->		
		// SELECT * FROM licenses
		public List<License> allLicenses() {
			return lRepo.findAll();
		}
		
		// ADD
		public License createLicense(License l) {
			return lRepo.save(l);
		}
}
