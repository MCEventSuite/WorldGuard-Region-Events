package com.mewin.WGRegionEvents;

import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author mewin
 */
public class WGRegionEventsPlugin extends JavaPlugin {
    private WGRegionEventsListener listener;
    
    @Override
    public void onEnable() {        
        listener = new WGRegionEventsListener(this);
        
        getServer().getPluginManager().registerEvents(listener, this);
    }
}
