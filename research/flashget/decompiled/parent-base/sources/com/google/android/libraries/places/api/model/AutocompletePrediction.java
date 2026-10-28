package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.q0;
import b9.c;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzhs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class AutocompletePrediction implements Parcelable {

    /* compiled from: com.google.android.libraries.places:places@@2.6.0 */
    @c.a
    public static abstract class Builder {
        @RecentlyNonNull
        public AutocompletePrediction build() {
            AutocompletePrediction zze = zze();
            setPlaceTypes(zzhs.zzk(zze.getPlaceTypes()));
            List zzd = zze.zzd();
            if (zzd != null) {
                zza(zzhs.zzk(zzd));
            }
            List zze2 = zze.zze();
            if (zze2 != null) {
                zzc(zzhs.zzk(zze2));
            }
            List zzf = zze.zzf();
            if (zzf != null) {
                zzd(zzhs.zzk(zzf));
            }
            return zze();
        }

        @RecentlyNullable
        public abstract Integer getDistanceMeters();

        @RecentlyNonNull
        public abstract String getFullText();

        @RecentlyNonNull
        public abstract List<Place.Type> getPlaceTypes();

        @RecentlyNonNull
        public abstract String getPrimaryText();

        @RecentlyNonNull
        public abstract String getSecondaryText();

        @RecentlyNonNull
        public abstract Builder setDistanceMeters(@q0 Integer num);

        @RecentlyNonNull
        public abstract Builder setFullText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setPlaceTypes(@RecentlyNonNull List<Place.Type> list);

        @RecentlyNonNull
        public abstract Builder setPrimaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setSecondaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder zza(@q0 List list);

        @RecentlyNonNull
        public abstract Builder zzc(@q0 List list);

        @RecentlyNonNull
        public abstract Builder zzd(@q0 List list);

        abstract AutocompletePrediction zze();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzd zzdVar = new zzd();
        zzdVar.zzb(str);
        zzdVar.setPlaceTypes(new ArrayList());
        zzdVar.setFullText("");
        zzdVar.setPrimaryText("");
        zzdVar.setSecondaryText("");
        return zzdVar;
    }

    private static final SpannableString zzg(String str, @q0 List list, @q0 CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbb zzbbVar = (zzbb) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzbbVar.zzb(), zzbbVar.zzb() + zzbbVar.zza(), 0);
            }
        }
        return spannableString;
    }

    @RecentlyNullable
    public abstract Integer getDistanceMeters();

    @RecentlyNonNull
    public SpannableString getFullText(@q0 CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNonNull
    public abstract List<Place.Type> getPlaceTypes();

    @RecentlyNonNull
    public SpannableString getPrimaryText(@q0 CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString getSecondaryText(@q0 CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }

    abstract String zza();

    abstract String zzb();

    abstract String zzc();

    @q0
    abstract List zzd();

    @q0
    abstract List zze();

    @q0
    abstract List zzf();
}
