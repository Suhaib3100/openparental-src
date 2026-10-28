package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@SafeParcelable.Class(creator = "ConnectionResultCreator")
/* loaded from: classes5.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final int DEVELOPER_ERROR = 10;

    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    @KeepForSdk
    public static final int UNKNOWN = -1;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getErrorCode", id = 2)
    private final int zzb;

    @q0
    @SafeParcelable.Field(getter = "getResolution", id = 3)
    private final PendingIntent zzc;

    @q0
    @SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    private final String zzd;

    @q0
    @SafeParcelable.Field(getter = "getClientMethodKey", id = 5)
    private final Integer zze;

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);

    @o0
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zza();

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @q0 @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @q0 @SafeParcelable.Param(id = 4) String str, @q0 @SafeParcelable.Param(id = 5) Integer num) {
        this.zza = i4;
        this.zzb = i5;
        this.zzc = pendingIntent;
        this.zzd = str;
        this.zze = num;
    }

    @o0
    static String zza(int i4) {
        if (i4 == 99) {
            return ProtectedSandApp.s("쥆");
        }
        if (i4 == 1500) {
            return ProtectedSandApp.s("쥅");
        }
        switch (i4) {
            case -1:
                return ProtectedSandApp.s("쥄");
            case 0:
                return ProtectedSandApp.s("쥃");
            case 1:
                return ProtectedSandApp.s("쥂");
            case 2:
                return ProtectedSandApp.s("쥁");
            case 3:
                return ProtectedSandApp.s("쥀");
            case 4:
                return ProtectedSandApp.s("줿");
            case 5:
                return ProtectedSandApp.s("줾");
            case 6:
                return ProtectedSandApp.s("줽");
            case 7:
                return ProtectedSandApp.s("줼");
            case 8:
                return ProtectedSandApp.s("줻");
            case 9:
                return ProtectedSandApp.s("줺");
            case 10:
                return ProtectedSandApp.s("줹");
            case 11:
                return ProtectedSandApp.s("줸");
            default:
                switch (i4) {
                    case 13:
                        return ProtectedSandApp.s("줷");
                    case 14:
                        return ProtectedSandApp.s("줶");
                    case 15:
                        return ProtectedSandApp.s("줵");
                    case 16:
                        return ProtectedSandApp.s("줴");
                    case 17:
                        return ProtectedSandApp.s("줳");
                    case 18:
                        return ProtectedSandApp.s("줲");
                    case 19:
                        return ProtectedSandApp.s("줱");
                    case 20:
                        return ProtectedSandApp.s("줰");
                    case 21:
                        return ProtectedSandApp.s("줯");
                    case 22:
                        return ProtectedSandApp.s("줮");
                    case 23:
                        return ProtectedSandApp.s("줭");
                    case 24:
                        return ProtectedSandApp.s("줬");
                    case 25:
                        return ProtectedSandApp.s("줫");
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                        sb.append(ProtectedSandApp.s("줩"));
                        sb.append(i4);
                        sb.append(ProtectedSandApp.s("줪"));
                        return sb.toString();
                }
        }
    }

    public boolean equals(@q0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.zzb == connectionResult.zzb && Objects.equal(this.zzc, connectionResult.zzc) && Objects.equal(this.zzd, connectionResult.zzd) && Objects.equal(this.zze, connectionResult.zze);
    }

    @q0
    @KeepForSdk
    public Integer getClientMethodKey() {
        return this.zze;
    }

    public int getErrorCode() {
        return this.zzb;
    }

    @q0
    public String getErrorMessage() {
        return this.zzd;
    }

    @q0
    public PendingIntent getResolution() {
        return this.zzc;
    }

    public boolean hasResolution() {
        return (this.zzb == 0 || this.zzc == null) ? false : true;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public boolean isSuccess() {
        return this.zzb == 0;
    }

    public void startResolutionForResult(@o0 Activity activity, int i4) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, null, 0, 0, 0);
        }
    }

    @o0
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add(ProtectedSandApp.s("쥇"), zza(this.zzb));
        stringHelper.add(ProtectedSandApp.s("쥈"), this.zzc);
        stringHelper.add(ProtectedSandApp.s("쥉"), this.zzd);
        stringHelper.add(ProtectedSandApp.s("쥊"), this.zze);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCode());
        SafeParcelWriter.writeParcelable(parcel, 3, getResolution(), i4, false);
        SafeParcelWriter.writeString(parcel, 4, getErrorMessage(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getClientMethodKey(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ConnectionResult(int i4) {
        this(i4, null, null);
    }

    public ConnectionResult(int i4, @q0 PendingIntent pendingIntent) {
        this(i4, pendingIntent, null);
    }

    public ConnectionResult(int i4, @q0 PendingIntent pendingIntent, @q0 String str) {
        this(1, i4, pendingIntent, str, null);
    }

    @KeepForSdk
    public ConnectionResult(int i4, @q0 PendingIntent pendingIntent, @q0 String str, @q0 Integer num) {
        this(1, i4, pendingIntent, str, num);
    }
}
