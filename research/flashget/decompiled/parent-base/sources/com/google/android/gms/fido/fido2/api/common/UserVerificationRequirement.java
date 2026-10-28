package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public enum UserVerificationRequirement implements Parcelable {
    zza(ProtectedSandApp.s("춧")),
    zzb(ProtectedSandApp.s("충")),
    zzc(ProtectedSandApp.s("춫"));


    @o0
    public static final Parcelable.Creator<UserVerificationRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzbb
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return UserVerificationRequirement.fromString(parcel.readString());
            } catch (zzbc e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i4) {
            return new UserVerificationRequirement[i4];
        }
    };

    @o0
    private final String zze;

    UserVerificationRequirement(@o0 String str) {
        this.zze = str;
    }

    @o0
    @KeepForSdk
    public static UserVerificationRequirement fromString(@o0 String str) throws zzbc {
        for (UserVerificationRequirement userVerificationRequirement : values()) {
            if (str.equals(userVerificationRequirement.zze)) {
                return userVerificationRequirement;
            }
        }
        throw new zzbc(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @o0
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeString(this.zze);
    }
}
