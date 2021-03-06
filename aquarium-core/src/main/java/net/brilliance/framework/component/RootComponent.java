/**
 * 
 */
package net.brilliance.framework.component;

import java.io.Serializable;

import javax.inject.Inject;

import net.brilliance.framework.logging.LogService;

/**
 * @author ducbq
 *
 */
public abstract class RootComponent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4315018091652981743L;

	@Inject
	protected LogService log;
}
