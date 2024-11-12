
package com.atakmap.android.atakcivpl.plugin;

import com.atak.plugins.impl.AbstractPluginTool;
import com.atakmap.android.atakcivpl.AtakCivPlDropDownReceiver;
import com.atakmap.util.Disposable;

import android.content.Context;

/**
 * Please note:
 *     Support for versions prior to 4.5.1 can make use of a copy of AbstractPluginTool shipped with
 *     the plugin.
 */
public class AtakCivPlTool extends AbstractPluginTool implements Disposable {

    public AtakCivPlTool(Context context) {
        super(context,
                context.getString(R.string.app_name),
                context.getString(R.string.app_name),
                context.getResources().getDrawable(R.drawable.ic_launcher),
                AtakCivPlDropDownReceiver.SHOW_PLUGIN);
    }

    @Override
    public void dispose() {
    }
}
