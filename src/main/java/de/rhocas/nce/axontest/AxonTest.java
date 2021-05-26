package de.rhocas.nce.axontest;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AxonTest {

	public static void main( final String[] args ) {
		new SpringApplicationBuilder( AxonTest.class )
				.logStartupInfo( false )
				.bannerMode( Mode.OFF )
				.run( args )
				.close( );
	}

}
