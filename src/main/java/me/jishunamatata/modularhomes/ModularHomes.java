package me.jishunamatata.modularhomes;

import org.bukkit.plugin.java.JavaPlugin;

import me.jishunamatata.modularcore.IModularPlugin;
import me.jishunamatata.modularcore.SimpleSemVersion;

public class ModularHomes extends JavaPlugin implements IModularPlugin {
	
	private final SimpleSemVersion MIN_CORE_VERSION = SimpleSemVersion.fromString("1.0.1");

	public void onEnable() {
		getLogger().severe("test");
	}

	@Override
	public SimpleSemVersion getMinCoreVersion() {
		return MIN_CORE_VERSION;
	}

}
