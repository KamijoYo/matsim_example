package org.matsim.codeexamples.scoring.aaAddToScoring;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.Event;
import org.matsim.api.core.v01.events.HasPersonId;
import org.matsim.api.core.v01.population.Person;

import java.util.Map;

public class RainOnPersonEvent extends Event implements HasPersonId {

	private Id<Person> personId;

	public RainOnPersonEvent(double time, Id<Person> personId) {
		super(time);
		this.personId = personId;
	}

	@Override
	public Id<Person> getPersonId() {
		return personId;
	}

	@Override
	public String getEventType() {
		return "rain";
	}

	@Override
	public Map<String, String> getAttributes() {
		final Map<String, String> attributes = super.getAttributes();
		attributes.put("person", getPersonId().toString());
		return attributes;
	}

}
