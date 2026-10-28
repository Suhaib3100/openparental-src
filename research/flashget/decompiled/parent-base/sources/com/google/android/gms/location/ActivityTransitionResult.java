package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getTransitionEvents", id = 1)
    private final List<ActivityTransitionEvent> zza;

    @q0
    @SafeParcelable.Field(getter = "getExtras", id = 2)
    private Bundle zzb;

    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) @o0 List<ActivityTransitionEvent> list) {
        this.zzb = null;
        Preconditions.checkNotNull(list, ProtectedSandApp.s("\ud9aa"));
        if (!list.isEmpty()) {
            for (int i4 = 1; i4 < list.size(); i4++) {
                Preconditions.checkArgument(list.get(i4).getElapsedRealTimeNanos() >= list.get(i4 + (-1)).getElapsedRealTimeNanos());
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    @q0
    public static ActivityTransitionResult extractResult(@o0 Intent intent) {
        if (hasResult(intent)) {
            return (ActivityTransitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, ProtectedSandApp.s("\ud9ab"), CREATOR);
        }
        return null;
    }

    public static boolean hasResult(@q0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra(ProtectedSandApp.s("\ud9ab"));
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    @o0
    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getTransitionEvents(), false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityTransitionResult(@SafeParcelable.Param(id = 1) @o0 List<ActivityTransitionEvent> list, @q0 @SafeParcelable.Param(id = 2) Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
