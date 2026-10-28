package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.result.IntentSenderRequest;
import androidx.view.result.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@SafeParcelable.Class(creator = "StatusCreator")
/* loaded from: classes5.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private final int zza;

    @q0
    @SafeParcelable.Field(getter = "getStatusMessage", id = 2)
    private final String zzb;

    @q0
    @SafeParcelable.Field(getter = "getPendingIntent", id = 3)
    private final PendingIntent zzc;

    @q0
    @SafeParcelable.Field(getter = "getConnectionResult", id = 4)
    private final ConnectionResult zzd;

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);

    @ShowFirstParty
    @o0
    @KeepForSdk
    public static final Status RESULT_API_NOT_CONNECTED = new Status(17);

    @o0
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);

    @o0
    public static final Parcelable.Creator<Status> CREATOR = new zze();

    @SafeParcelable.Constructor
    Status(@SafeParcelable.Param(id = 1) int i4, @q0 @SafeParcelable.Param(id = 2) String str, @q0 @SafeParcelable.Param(id = 3) PendingIntent pendingIntent, @q0 @SafeParcelable.Param(id = 4) ConnectionResult connectionResult) {
        this.zza = i4;
        this.zzb = str;
        this.zzc = pendingIntent;
        this.zzd = connectionResult;
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zza == status.zza && Objects.equal(this.zzb, status.zzb) && Objects.equal(this.zzc, status.zzc) && Objects.equal(this.zzd, status.zzd);
    }

    @q0
    public ConnectionResult getConnectionResult() {
        return this.zzd;
    }

    @q0
    public PendingIntent getResolution() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    @o0
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.zza;
    }

    @q0
    public String getStatusMessage() {
        return this.zzb;
    }

    public boolean hasResolution() {
        return this.zzc != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd);
    }

    public boolean isCanceled() {
        return this.zza == 16;
    }

    public boolean isInterrupted() {
        return this.zza == 14;
    }

    public boolean isSuccess() {
        return this.zza <= 0;
    }

    public void startResolutionForResult(@o0 Activity activity, int i4) throws IntentSender.SendIntentException {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (hasResolution()) {
            if (PlatformVersion.isAtLeastU()) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            PendingIntent pendingIntent = this.zzc;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, null, 0, 0, 0, bundle2);
        }
    }

    @o0
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add(ProtectedSandApp.s("짚"), zza());
        stringHelper.add(ProtectedSandApp.s("짛"), this.zzc);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i4, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @o0
    public final String zza() {
        String str = this.zzb;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.zza);
    }

    public Status(int i4) {
        this(i4, (String) null);
    }

    public Status(@o0 ConnectionResult connectionResult, @o0 String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i4, @q0 String str) {
        this(i4, str, (PendingIntent) null);
    }

    @KeepForSdk
    @Deprecated
    public Status(@o0 ConnectionResult connectionResult, @o0 String str, int i4) {
        this(i4, str, connectionResult.getResolution(), connectionResult);
    }

    public Status(int i4, @q0 String str, @q0 PendingIntent pendingIntent) {
        this(i4, str, pendingIntent, null);
    }

    public void startResolutionForResult(@o0 h<IntentSenderRequest> hVar) {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zzc;
            Preconditions.checkNotNull(pendingIntent);
            hVar.b(new IntentSenderRequest.a(pendingIntent.getIntentSender()).a());
        }
    }
}
