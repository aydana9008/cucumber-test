package com.nwbank.step_definitions;

import java.util.Locale;
import java.util.Map;

import com.nwbank.beans.Customer;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

public class DataTableConfigure implements TypeRegistryConfigurer{

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}
	
	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		typeRegistry.defineDataTableType(new DataTableType(Customer.class, 
				new TableEntryTransformer<Customer>() {
			@Override
			public Customer transform(Map<String, String> row) throws Throwable {
				String firstName = row.get("First Name");
				String lastName = row.get("Last Name");
				String ssn = row.get("SSN");
				String dob = row.get("DOB");
				String activCode = row.get("Activation Code");
				
				return new Customer(firstName, lastName, ssn, dob, activCode, activCode);
			}
				}
				));
	}
}
