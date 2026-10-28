package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.c1;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4005a = (IconCompat) versionedParcel.h0(remoteActionCompat.f4005a, 1);
        remoteActionCompat.f4006b = versionedParcel.w(remoteActionCompat.f4006b, 2);
        remoteActionCompat.f4007c = versionedParcel.w(remoteActionCompat.f4007c, 3);
        remoteActionCompat.f4008d = (PendingIntent) versionedParcel.W(remoteActionCompat.f4008d, 4);
        remoteActionCompat.f4009e = versionedParcel.m(remoteActionCompat.f4009e, 5);
        remoteActionCompat.f4010f = versionedParcel.m(remoteActionCompat.f4010f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.m1(remoteActionCompat.f4005a, 1);
        versionedParcel.z0(remoteActionCompat.f4006b, 2);
        versionedParcel.z0(remoteActionCompat.f4007c, 3);
        versionedParcel.X0(remoteActionCompat.f4008d, 4);
        versionedParcel.n0(remoteActionCompat.f4009e, 5);
        versionedParcel.n0(remoteActionCompat.f4010f, 6);
    }
}
