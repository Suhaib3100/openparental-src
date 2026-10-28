package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.g0;
import androidx.annotation.q0;
import b9.c;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzen;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class FetchPhotoRequest implements zzen {

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public FetchPhotoRequest build() {
            PhotoMetadata zza = zza();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = zza.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = zza.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzc();
        }

        @RecentlyNullable
        public abstract CancellationToken getCancellationToken();

        @RecentlyNullable
        public abstract Integer getMaxHeight();

        @RecentlyNullable
        public abstract Integer getMaxWidth();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(@q0 CancellationToken cancellationToken);

        @RecentlyNonNull
        public abstract Builder setMaxHeight(@q0 @g0(from = 1, to = 1600) Integer num);

        @RecentlyNonNull
        public abstract Builder setMaxWidth(@q0 @g0(from = 1, to = 1600) Integer num);

        @q0
        abstract PhotoMetadata zza();

        abstract FetchPhotoRequest zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull PhotoMetadata photoMetadata) {
        zza zzaVar = new zza();
        zzaVar.zzb(photoMetadata);
        return zzaVar;
    }

    @RecentlyNonNull
    public static FetchPhotoRequest newInstance(@RecentlyNonNull PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @Override // com.google.android.libraries.places.internal.zzen
    @RecentlyNullable
    public abstract CancellationToken getCancellationToken();

    @RecentlyNullable
    @g0(from = 1, to = 1600)
    public abstract Integer getMaxHeight();

    @RecentlyNullable
    @g0(from = 1, to = 1600)
    public abstract Integer getMaxWidth();

    @RecentlyNonNull
    public abstract PhotoMetadata getPhotoMetadata();
}
