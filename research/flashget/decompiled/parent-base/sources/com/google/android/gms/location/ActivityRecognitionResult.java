package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.concurrent.futures.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@SafeParcelable.Class(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @o0
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzk();

    @SafeParcelable.Field(id = 1)
    List<DetectedActivity> zza;

    @SafeParcelable.Field(id = 2)
    long zzb;

    @SafeParcelable.Field(id = 3)
    long zzc;

    @SafeParcelable.Field(id = 4)
    int zzd;

    @q0
    @SafeParcelable.Field(id = 5)
    Bundle zze;

    @VisibleForTesting
    public ActivityRecognitionResult(@o0 DetectedActivity detectedActivity, long j4, long j5) {
        this(Collections.singletonList(detectedActivity), j4, j5, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.location.ActivityRecognitionResult extractResult(@androidx.annotation.o0 android.content.Intent r3) {
        /*
            boolean r0 = hasResult(r3)
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L2f
        L9:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L10
            goto L7
        L10:
            java.lang.String r2 = "\ud992"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L29
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = com.google.android.gms.location.ActivityRecognitionResult.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r0, r2)
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L2f
        L29:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L7
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
        L2f:
            if (r0 == 0) goto L32
            return r0
        L32:
            java.util.List r3 = zza(r3)
            if (r3 == 0) goto L4c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3f
            goto L4c
        L3f:
            int r0 = r3.size()
            int r0 = r0 + (-1)
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.extractResult(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public static boolean hasResult(@q0 Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra(ProtectedSandApp.s("\ud992"))) {
            return true;
        }
        List<ActivityRecognitionResult> zza = zza(intent);
        return (zza == null || zza.isEmpty()) ? false : true;
    }

    @q0
    public static List<ActivityRecognitionResult> zza(@o0 Intent intent) {
        if (intent == null) {
            return null;
        }
        String s4 = ProtectedSandApp.s("\ud993");
        if (intent.hasExtra(s4)) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, s4, CREATOR);
        }
        return null;
    }

    private static boolean zzb(@q0 Bundle bundle, @q0 Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i4 = 0; i4 < length; i4++) {
                            if (Objects.equal(Array.get(obj, i4), Array.get(obj2, i4))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @ShowFirstParty
    public final boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && Objects.equal(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i4) {
        for (DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i4) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    @o0
    public DetectedActivity getMostProbableActivity() {
        return this.zza.get(0);
    }

    @o0
    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze);
    }

    @o0
    public String toString() {
        String valueOf = String.valueOf(this.zza);
        long j4 = this.zzb;
        long j5 = this.zzc;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        a.a(sb, ProtectedSandApp.s("\ud994"), valueOf, ProtectedSandApp.s("\ud995"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\ud996"));
        sb.append(j5);
        sb.append(ProtectedSandApp.s("\ud997"));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ActivityRecognitionResult(@o0 List<DetectedActivity> list, long j4, long j5) {
        this(list, j4, j5, 0, null);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(id = 1) @o0 List<DetectedActivity> list, @SafeParcelable.Param(id = 2) long j4, @SafeParcelable.Param(id = 3) long j5, @SafeParcelable.Param(id = 4) int i4, @q0 @SafeParcelable.Param(id = 5) Bundle bundle) {
        Preconditions.checkArgument(list != null && list.size() > 0, ProtectedSandApp.s("\ud990"));
        Preconditions.checkArgument(j4 > 0 && j5 > 0, ProtectedSandApp.s("\ud991"));
        this.zza = list;
        this.zzb = j4;
        this.zzc = j5;
        this.zzd = i4;
        this.zze = bundle;
    }
}
