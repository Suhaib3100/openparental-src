package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* compiled from: LocationListenerCompat.java */
/* loaded from: classes.dex */
public interface s extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i5) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@androidx.annotation.o0 List<Location> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            onLocationChanged(list.get(i5));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@androidx.annotation.o0 String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@androidx.annotation.o0 String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@androidx.annotation.o0 String str, int i5, @androidx.annotation.q0 Bundle bundle) {
    }
}
