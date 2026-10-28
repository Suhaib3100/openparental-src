package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public enum ResidentKeyRequirement implements Parcelable {
    RESIDENT_KEY_DISCOURAGED(ProtectedSandApp.s("춘")),
    RESIDENT_KEY_PREFERRED(ProtectedSandApp.s("춚")),
    RESIDENT_KEY_REQUIRED(ProtectedSandApp.s("출"));


    @o0
    public static final Parcelable.Creator<ResidentKeyRequirement> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zzav
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            try {
                return ResidentKeyRequirement.fromString(readString);
            } catch (ResidentKeyRequirement.UnsupportedResidentKeyRequirementException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i4) {
            return new ResidentKeyRequirement[i4];
        }
    };

    @o0
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedResidentKeyRequirementException extends Exception {
        public UnsupportedResidentKeyRequirementException(@o0 String str) {
            super(String.format(ProtectedSandApp.s("춖"), str));
        }
    }

    ResidentKeyRequirement(String str) {
        this.zzb = str;
    }

    @o0
    public static ResidentKeyRequirement fromString(@o0 String str) throws UnsupportedResidentKeyRequirementException {
        for (ResidentKeyRequirement residentKeyRequirement : values()) {
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
        }
        throw new UnsupportedResidentKeyRequirementException(str);
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
