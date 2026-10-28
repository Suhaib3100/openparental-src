package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.c1;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f25403a = (IconCompat) versionedParcel.h0(remoteActionCompat.f25403a, 1);
        remoteActionCompat.f25404b = versionedParcel.w(remoteActionCompat.f25404b, 2);
        remoteActionCompat.f25405c = versionedParcel.w(remoteActionCompat.f25405c, 3);
        remoteActionCompat.f25406d = (PendingIntent) versionedParcel.W(remoteActionCompat.f25406d, 4);
        remoteActionCompat.f25407e = versionedParcel.m(remoteActionCompat.f25407e, 5);
        remoteActionCompat.f25408f = versionedParcel.m(remoteActionCompat.f25408f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.m1(remoteActionCompat.f25403a, 1);
        versionedParcel.z0(remoteActionCompat.f25404b, 2);
        versionedParcel.z0(remoteActionCompat.f25405c, 3);
        versionedParcel.X0(remoteActionCompat.f25406d, 4);
        versionedParcel.n0(remoteActionCompat.f25407e, 5);
        versionedParcel.n0(remoteActionCompat.f25408f, 6);
    }
}
