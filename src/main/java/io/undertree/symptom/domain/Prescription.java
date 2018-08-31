/*
 * Copyright 2016-2017 Shawn Sherwood
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.undertree.symptom.domain;

import java.time.LocalDate;

import javax.persistence.*;

/**
 * Prescription entity.
 *
 * @author Shawn Sherwood
 */
@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private LocalDate initialDate;
	private LocalDate expirationDate;

	// TODO Doctor doctor

	@OneToOne
	private Patient patient;

	@OneToOne
	private Medication medication;

	// schedule?
	// route?

	///

	public Long getId() {
		return this.id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Medication getMedication() {
		return this.medication;
	}

	public void setMedication(Medication medication) {
		this.medication = medication;
	}

	public LocalDate getInitialDate() {
		return this.initialDate;
	}

	public void setInitialDate(LocalDate initialDate) {
		this.initialDate = initialDate;
	}

	public LocalDate getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	// TODO equals and hashcode
}
