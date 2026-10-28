package com.google.android.gms.common.stats;

import android.support.v4.media.c;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface Types {

        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;

        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    @o0
    public final String toString() {
        long zza = zza();
        int zzb = zzb();
        String zzc = zzc();
        int length = String.valueOf(zza).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(zzb).length() + 3 + zzc.length());
        sb.append(zza);
        sb.append(ProtectedSandApp.s("쯊"));
        sb.append(zzb);
        return c.a(sb, ProtectedSandApp.s("쯋"), zzc);
    }

    public abstract long zza();

    public abstract int zzb();

    @o0
    public abstract String zzc();
}
