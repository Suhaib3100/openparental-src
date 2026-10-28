package com.google.android.libraries.places.internal;

import android.content.Intent;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzfo {
    public static Status zza(Intent intent) {
        try {
            zzha.zzc(intent, ProtectedSandApp.s("\ue997"));
            Status status = (Status) intent.getParcelableExtra(ProtectedSandApp.s("\ue998"));
            zzha.zze(status != null, ProtectedSandApp.s("\ue999"));
            return status;
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }

    public static Place zzb(Intent intent) {
        try {
            zzha.zzc(intent, ProtectedSandApp.s("\ue997"));
            Place place = (Place) intent.getParcelableExtra(ProtectedSandApp.s("\ue99a"));
            zzha.zze(place != null, ProtectedSandApp.s("\ue99b"));
            return place;
        } catch (Error | RuntimeException e4) {
            zzev.zzb(e4);
            throw e4;
        }
    }
}
