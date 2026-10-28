package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.q0;
import b9.c;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzen;
import com.google.android.libraries.places.internal.zzhs;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class FetchPlaceRequest implements zzen {

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public FetchPlaceRequest build() {
            zza(zzhs.zzk(zzc().getPlaceFields()));
            return zzc();
        }

        @RecentlyNullable
        public abstract CancellationToken getCancellationToken();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(@q0 CancellationToken cancellationToken);

        @RecentlyNonNull
        public abstract Builder setSessionToken(@q0 AutocompleteSessionToken autocompleteSessionToken);

        abstract Builder zza(List list);

        abstract FetchPlaceRequest zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        zze zzeVar = new zze();
        zzeVar.zzb(str);
        zzeVar.zza(list);
        return zzeVar;
    }

    @RecentlyNonNull
    public static FetchPlaceRequest newInstance(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        return builder(str, list).build();
    }

    @Override // com.google.android.libraries.places.internal.zzen
    @RecentlyNullable
    public abstract CancellationToken getCancellationToken();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();
}
