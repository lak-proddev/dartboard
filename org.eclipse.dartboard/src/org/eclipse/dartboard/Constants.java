/*******************************************************************************
 * Copyright (c) 2019 vogella GmbH and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Jonas Hungershausen - initial API and implementation
 *******************************************************************************/
package org.eclipse.dartboard;

import org.eclipse.dartboard.launch.LaunchConfig;

public abstract class Constants {

	private Constants() {
	}

	/**
	 * Preferences key for the Dart SDK location
	 */
	public static final String PREFERENCES_SDK_LOCATION = "sdk_location"; //$NON-NLS-1$

	/**
	 * Plugin ID of the plugin
	 */
	public static final String PLUGIN_ID = "org.eclipse.dartboard"; //$NON-NLS-1$

	/**
	 * Key for the main class of a launch configuration
	 */
	public static final String LAUNCH_MAIN_CLASS = "main_class"; //$NON-NLS-1$

	/**
	 * Key for the selected project of a launch configuration
	 */
	public static final String LAUNCH_SELECTED_PROJECT = "selected_project"; //$NON-NLS-1$

	/**
	 * The ID of {@link LaunchConfig} inside the IDE
	 */
	public static final String LAUNCH_CONFIGURATION_ID = "org.eclipse.dartboard.launch"; //$NON-NLS-1$

	/**
	 * The ID used to identify this project nature
	 */
	public static final String NATURE_ID = "org.eclipse.dartboard.dartprojectnature"; //$NON-NLS-1$
}
