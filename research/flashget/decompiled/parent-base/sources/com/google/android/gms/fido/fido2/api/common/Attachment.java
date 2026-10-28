package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.fido.fido2.api.common.Attachment;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public enum Attachment implements Parcelable {
    PLATFORM(ProtectedSandApp.s("첥")),
    CROSS_PLATFORM(ProtectedSandApp.s("첧"));


    @o0
    public static final Parcelable.Creator<Attachment> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.fido2.api.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Attachment.fromString(parcel.readString());
            } catch (Attachment.UnsupportedAttachmentException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i4) {
            return new Attachment[i4];
        }
    };

    @o0
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedAttachmentException extends Exception {
        public UnsupportedAttachmentException(@o0 String str) {
            super(String.format(ProtectedSandApp.s("첣"), str));
        }
    }

    Attachment(String str) {
        this.zzb = str;
    }

    @o0
    public static Attachment fromString(@o0 String str) throws UnsupportedAttachmentException {
        for (Attachment attachment : values()) {
            if (str.equals(attachment.zzb)) {
                return attachment;
            }
        }
        throw new UnsupportedAttachmentException(str);
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
