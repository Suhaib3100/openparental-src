package com.google.android.gms.maps.model;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class AdvancedMarker extends Marker {
    public AdvancedMarker(com.google.android.gms.internal.maps.zzad zzadVar) {
        super(zzadVar);
    }

    @q0
    public View getIconView() {
        try {
            return (View) ObjectWrapper.unwrap(this.zza.zzh());
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }

    public void setIconView(@q0 View view) {
        if (view != null && view.getParent() != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\udab4"));
        }
        try {
            this.zza.zzu(ObjectWrapper.wrap(view));
        } catch (RemoteException e4) {
            throw new RuntimeRemoteException(e4);
        }
    }
}
