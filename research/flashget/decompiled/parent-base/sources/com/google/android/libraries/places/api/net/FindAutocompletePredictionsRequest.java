package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.q0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzen;
import com.google.android.libraries.places.internal.zzhs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class FindAutocompletePredictionsRequest implements zzen {

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public FindAutocompletePredictionsRequest build() {
            setCountries(zzhs.zzk(getCountries()));
            return zza();
        }

        @RecentlyNullable
        public abstract CancellationToken getCancellationToken();

        @RecentlyNonNull
        public abstract List<String> getCountries();

        @RecentlyNullable
        public abstract LocationBias getLocationBias();

        @RecentlyNullable
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract LatLng getOrigin();

        @RecentlyNullable
        public abstract String getQuery();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @RecentlyNullable
        public abstract TypeFilter getTypeFilter();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(@q0 CancellationToken cancellationToken);

        @RecentlyNonNull
        public abstract Builder setCountries(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public Builder setCountries(@RecentlyNonNull String... strArr) {
            return setCountries(zzhs.zzl(strArr));
        }

        @RecentlyNonNull
        public Builder setCountry(@q0 String str) {
            setCountries(str == null ? zzhs.zzm() : zzhs.zzn(str));
            return this;
        }

        @RecentlyNonNull
        public abstract Builder setLocationBias(@q0 LocationBias locationBias);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(@q0 LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setOrigin(@q0 LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setQuery(@q0 String str);

        @RecentlyNonNull
        public abstract Builder setSessionToken(@q0 AutocompleteSessionToken autocompleteSessionToken);

        @RecentlyNonNull
        public abstract Builder setTypeFilter(@q0 TypeFilter typeFilter);

        abstract FindAutocompletePredictionsRequest zza();
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzi zziVar = new zzi();
        zziVar.setCountries(new ArrayList());
        return zziVar;
    }

    @RecentlyNonNull
    public static FindAutocompletePredictionsRequest newInstance(@q0 String str) {
        Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @Override // com.google.android.libraries.places.internal.zzen
    @RecentlyNullable
    public abstract CancellationToken getCancellationToken();

    @RecentlyNonNull
    public abstract List<String> getCountries();

    @RecentlyNullable
    public String getCountry() {
        if (getCountries().size() > 1) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\ue671"));
        }
        Iterator<T> it = getCountries().iterator();
        return (String) (it.hasNext() ? it.next() : null);
    }

    @RecentlyNullable
    public abstract LocationBias getLocationBias();

    @RecentlyNullable
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract LatLng getOrigin();

    @RecentlyNullable
    public abstract String getQuery();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();

    @RecentlyNullable
    public abstract TypeFilter getTypeFilter();
}
