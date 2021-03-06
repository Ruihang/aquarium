/**
 * 
 */
package com.sunrise.utility;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

import lombok.Builder;

/**
 * @author ducbq
 *
 */
@Builder
public class ClassPathResourceUtility {
	public InputStream getInputStream(String resource) throws IOException {
		return 	new ClassPathResource(resource).getInputStream();
	}
}
