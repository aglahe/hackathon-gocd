package com.datatactics.hackathon.gocd.plugin;

import com.thoughtworks.go.plugin.api.annotation.Extension;
import com.thoughtworks.go.plugin.api.annotation.Load;
import com.thoughtworks.go.plugin.api.annotation.UnLoad;
import com.thoughtworks.go.plugin.api.info.PluginContext;
import com.thoughtworks.go.plugin.api.info.PluginDescriptor;
import com.thoughtworks.go.plugin.api.info.PluginDescriptorAware;
import com.thoughtworks.go.plugin.api.logging.Logger;

@Extension
public class HelloWorldPlugin implements PluginDescriptorAware {
    private Logger logger = Logger.getLoggerFor(HelloWorldPlugin.class);

    @Load
    public void onLoad(PluginContext context) {
        logger.info("onLoad called");
    }

    @UnLoad
    public void onUnload(PluginContext context) {
        logger.info("onUnload called");
    }

	@Override
	public void setPluginDescriptor(PluginDescriptor arg0) {
		logger.info("SetPluginDescriptor called");
		logger.info("Hello World!!!");
	}
    
}
