package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
@Deprecated
/* loaded from: classes5.dex */
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    @o0
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(@o0 Context context, @o0 Intent intent, @o0 String str, @o0 String str2, @o0 String str3, int i4, @o0 String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@o0 Context context, @o0 String str, @o0 String str2, @o0 String str3, int i4, @o0 List<String> list, boolean z4, long j4) {
    }

    @KeepForSdk
    public void registerEvent(@o0 Context context, @o0 String str, int i4, @o0 String str2, @o0 String str3, @o0 String str4, int i5, @o0 List<String> list) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@o0 Context context, @o0 Intent intent) {
    }

    @KeepForSdk
    public void registerEvent(@o0 Context context, @o0 String str, int i4, @o0 String str2, @o0 String str3, @o0 String str4, int i5, @o0 List<String> list, long j4) {
    }
}
