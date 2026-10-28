package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE(ProtectedSandApp.s("첪")),
    INDIRECT(ProtectedSandApp.s("첬")),
    DIRECT(ProtectedSandApp.s("첮"));


    @o0
    public static final Parcelable.Creator<AttestationConveyancePreference> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzb
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return AttestationConveyancePreference.fromString(parcel.readString());
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i4) {
            return new AttestationConveyancePreference[i4];
        }
    };

    @o0
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedAttestationConveyancePreferenceException extends Exception {
        public UnsupportedAttestationConveyancePreferenceException(@o0 String str) {
            super(String.format(ProtectedSandApp.s("첨"), str));
        }
    }

    AttestationConveyancePreference(String str) {
        this.zzb = str;
    }

    @o0
    public static AttestationConveyancePreference fromString(@o0 String str) throws UnsupportedAttestationConveyancePreferenceException {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
            }
        }
        throw new UnsupportedAttestationConveyancePreferenceException(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @o0
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeString(this.zzb);
    }
}
