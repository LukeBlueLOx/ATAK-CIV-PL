
package com.atakmap.android.atakcivpl;

import android.content.Context;
import android.content.Intent;
import com.atakmap.android.ipc.AtakBroadcast.DocumentedIntentFilter;

import com.atakmap.android.maps.MapView;
import com.atakmap.android.dropdown.DropDownMapComponent;

import com.atakmap.coremap.log.Log;
import com.atakmap.android.atakcivpl.plugin.R;

public class AtakCivPlMapComponent extends DropDownMapComponent {

    private static final String TAG = "AtakCivPlMapComponent";

    private Context pluginContext;

    private AtakCivPlDropDownReceiver ddr;

    public void onCreate(final Context context, Intent intent,
            final MapView view) {

        context.setTheme(R.style.ATAKPluginTheme);
        super.onCreate(context, intent, view);
        pluginContext = context;

        ddr = new AtakCivPlDropDownReceiver(
                view, context);

        Log.d(TAG, "registering the plugin filter");
        DocumentedIntentFilter ddFilter = new DocumentedIntentFilter();
        ddFilter.addAction(AtakCivPlDropDownReceiver.SHOW_PLUGIN);
        registerDropDownReceiver(ddr, ddFilter);
    }

    @Override
    protected void onDestroyImpl(Context context, MapView view) {
        super.onDestroyImpl(context, view);
    }

}
