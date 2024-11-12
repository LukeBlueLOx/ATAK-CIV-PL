
package com.atakmap.android.atakcivpl.plugin;


import com.atak.plugins.impl.AbstractPluginLifecycle;
import com.atakmap.android.atakcivpl.AtakCivPlMapComponent;
import android.content.Context;


/**
 * Please note:
 *     Support for versions prior to 4.5.1 can make use of a copy of AbstractPluginLifeCycle shipped with
 *     the plugin.
 */
public class AtakCivPlLifecycle extends AbstractPluginLifecycle {

    private final static String TAG = "AtakCivPlLifecycle";

    public AtakCivPlLifecycle(Context ctx) {
        super(ctx, new AtakCivPlMapComponent());
        PluginNativeLoader.init(ctx);
    }

}
