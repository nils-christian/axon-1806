package de.rhocas.nce.axontest;

import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup( "MyProjector" )
class MyProjector {

	@EventHandler
	public void on( final String event ) {
	}

}
