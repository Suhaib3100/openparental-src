package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzau();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    @SafeParcelable.Field(getter = "getParcelableGeofences", id = 1)
    private final List<com.google.android.gms.internal.location.zzbe> zza;

    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "", getter = "getTag", id = 3)
    private final String zzc;

    @q0
    @SafeParcelable.Field(getter = "getContextAttributionTag", id = 4)
    private final String zzd;

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public static final class Builder {
        private final List<com.google.android.gms.internal.location.zzbe> zza = new ArrayList();

        @InitialTrigger
        private int zzb = 5;
        private String zzc = "";

        @o0
        public Builder addGeofence(@o0 Geofence geofence) {
            Preconditions.checkNotNull(geofence, ProtectedSandApp.s("\ud9ce"));
            Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbe, ProtectedSandApp.s("\ud9cf"));
            this.zza.add((com.google.android.gms.internal.location.zzbe) geofence);
            return this;
        }

        @o0
        public Builder addGeofences(@o0 List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        @o0
        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.zza.isEmpty(), ProtectedSandApp.s("\ud9d0"));
            return new GeofencingRequest(this.zza, this.zzb, this.zzc, null);
        }

        @o0
        public Builder setInitialTrigger(@InitialTrigger int i4) {
            this.zzb = i4 & 7;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    GeofencingRequest(@SafeParcelable.Param(id = 1) List<com.google.android.gms.internal.location.zzbe> list, @SafeParcelable.Param(id = 2) @InitialTrigger int i4, @SafeParcelable.Param(id = 3) String str, @q0 @SafeParcelable.Param(id = 4) String str2) {
        this.zza = list;
        this.zzb = i4;
        this.zzc = str;
        this.zzd = str2;
    }

    @o0
    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.zzb;
    }

    @o0
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\ud9d1"));
        sb.append(this.zza);
        sb.append(ProtectedSandApp.s("\ud9d2"));
        sb.append(this.zzb);
        sb.append(ProtectedSandApp.s("\ud9d3"));
        sb.append(this.zzc);
        sb.append(ProtectedSandApp.s("\ud9d4"));
        return c.a(sb, this.zzd, ProtectedSandApp.s("\ud9d5"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final GeofencingRequest zza(@q0 String str) {
        return new GeofencingRequest(this.zza, this.zzb, this.zzc, str);
    }
}
