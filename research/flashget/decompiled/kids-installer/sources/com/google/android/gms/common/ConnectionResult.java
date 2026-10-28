package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.solver.f;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@SafeParcelable.Class(creator = "ConnectionResultCreator")
/* loaded from: classes3.dex */
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

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final ConnectionResult RESULT_SUCCESS = new ConnectionResult(0);

    @o0
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new zzb();

    @SafeParcelable.Constructor
    ConnectionResult(@SafeParcelable.Param(id = 1) int i5, @SafeParcelable.Param(id = 2) int i6, @q0 @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @q0 @SafeParcelable.Param(id = 4) String str) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = pendingIntent;
        this.zzd = str;
    }

    @o0
    static String zza(int i5) {
        if (i5 == 99) {
            return ProtectedSandApp.s("⅐");
        }
        if (i5 == 1500) {
            return ProtectedSandApp.s("⅏");
        }
        switch (i5) {
            case -1:
                return ProtectedSandApp.s("⅂");
            case 0:
                return ProtectedSandApp.s("⅁");
            case 1:
                return ProtectedSandApp.s("⅀");
            case 2:
                return ProtectedSandApp.s("ℿ");
            case 3:
                return ProtectedSandApp.s("ℾ");
            case 4:
                return ProtectedSandApp.s("ℽ");
            case 5:
                return ProtectedSandApp.s("ℼ");
            case 6:
                return ProtectedSandApp.s("℻");
            case 7:
                return ProtectedSandApp.s("℺");
            case 8:
                return ProtectedSandApp.s("ℹ");
            case 9:
                return ProtectedSandApp.s("ℸ");
            case 10:
                return ProtectedSandApp.s("ℷ");
            case 11:
                return ProtectedSandApp.s("ℶ");
            default:
                switch (i5) {
                    case 13:
                        return ProtectedSandApp.s("ⅎ");
                    case 14:
                        return ProtectedSandApp.s("⅍");
                    case 15:
                        return ProtectedSandApp.s("⅌");
                    case 16:
                        return ProtectedSandApp.s("⅋");
                    case 17:
                        return ProtectedSandApp.s("⅊");
                    case 18:
                        return ProtectedSandApp.s("ⅉ");
                    case 19:
                        return ProtectedSandApp.s("ⅈ");
                    case 20:
                        return ProtectedSandApp.s("ⅇ");
                    case 21:
                        return ProtectedSandApp.s("ⅆ");
                    case 22:
                        return ProtectedSandApp.s("ⅅ");
                    case 23:
                        return ProtectedSandApp.s("⅄");
                    case 24:
                        return ProtectedSandApp.s("⅃");
                    default:
                        return f.a(ProtectedSandApp.s("ℴ"), i5, ProtectedSandApp.s("ℵ"));
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
        return this.zzb == connectionResult.zzb && Objects.equal(this.zzc, connectionResult.zzc) && Objects.equal(this.zzd, connectionResult.zzd);
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
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public boolean isSuccess() {
        return this.zzb == 0;
    }

    public void startResolutionForResult(@o0 Activity activity, int i5) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i5, null, 0, 0, 0);
        }
    }

    @o0
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add(ProtectedSandApp.s("⅑"), zza(this.zzb));
        stringHelper.add(ProtectedSandApp.s("⅒"), this.zzc);
        stringHelper.add(ProtectedSandApp.s("⅓"), this.zzd);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCode());
        SafeParcelWriter.writeParcelable(parcel, 3, getResolution(), i5, false);
        SafeParcelWriter.writeString(parcel, 4, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ConnectionResult(int i5) {
        this(i5, null, null);
    }

    public ConnectionResult(int i5, @q0 PendingIntent pendingIntent) {
        this(i5, pendingIntent, null);
    }

    public ConnectionResult(int i5, @q0 PendingIntent pendingIntent, @q0 String str) {
        this(1, i5, pendingIntent, str);
    }
}
