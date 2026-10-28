package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.List;

/* compiled from: LocationListenerCompat.java */
/* loaded from: classes3.dex */
public interface f extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i4) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@o0 List<Location> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            onLocationChanged(list.get(i4));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@o0 String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@o0 String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@o0 String str, int i4, @q0 Bundle bundle) {
    }
}
