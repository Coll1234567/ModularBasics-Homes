package me.jishunamatata.modularhomes;

import me.jishunamatata.modularcore.database.DatabaseManager;
import me.jishunamatata.modularcore.utils.ModularPlugin;
import me.jishunamatata.modularcore.utils.SimpleSemVersion;

public class ModularHomes extends ModularPlugin {

	private final SimpleSemVersion MIN_CORE_VERSION = SimpleSemVersion.fromString("1.0.1");

	public void onEnable() {
		DatabaseManager.executeUpdate(this, "CREATE TABLE IF NOT EXISTS 'test' ('col' VARCHAR(16) NOT NULL);",
				DatabaseManager.getConnection(this), true);
	}

	@Override
	public SimpleSemVersion getMinCoreVersion() {
		return MIN_CORE_VERSION;
	}

}
