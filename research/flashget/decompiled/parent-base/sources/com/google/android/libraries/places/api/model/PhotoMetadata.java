package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.g0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.internal.zzha;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class PhotoMetadata implements Parcelable {

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public PhotoMetadata build() {
            PhotoMetadata zzb = zzb();
            int width = zzb.getWidth();
            zzha.zzj(width >= 0, ProtectedSandApp.s("\ue53d"), width);
            int height = zzb.getHeight();
            zzha.zzj(height >= 0, ProtectedSandApp.s("\ue53e"), height);
            zzha.zzi(!TextUtils.isEmpty(zzb.zza()), ProtectedSandApp.s("\ue53f"));
            return zzb;
        }

        @RecentlyNonNull
        public abstract String getAttributions();

        @g0(from = 0)
        public abstract int getHeight();

        @g0(from = 0)
        public abstract int getWidth();

        @RecentlyNonNull
        public abstract Builder setAttributions(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setHeight(@g0(from = 0) int i4);

        @RecentlyNonNull
        public abstract Builder setWidth(@g0(from = 0) int i4);

        abstract PhotoMetadata zzb();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzo zzoVar = new zzo();
        zzoVar.zza(str);
        zzoVar.setWidth(0);
        zzoVar.setHeight(0);
        zzoVar.setAttributions("");
        return zzoVar;
    }

    @RecentlyNonNull
    public abstract String getAttributions();

    @g0(from = 0)
    public abstract int getHeight();

    @g0(from = 0)
    public abstract int getWidth();

    @RecentlyNonNull
    public abstract String zza();
}
