package androidx.core.os;

import android.os.Parcel;
import androidx.annotation.o0;

/* compiled from: ParcelCompat.java */
/* loaded from: classes.dex */
public final class q {
    private q() {
    }

    public static boolean a(@o0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(@o0 Parcel parcel, boolean z5) {
        parcel.writeInt(z5 ? 1 : 0);
    }
}
