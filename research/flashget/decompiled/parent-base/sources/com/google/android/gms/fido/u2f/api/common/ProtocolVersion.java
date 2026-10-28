package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.io.UnsupportedEncodingException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class ProtocolVersion implements Parcelable {

    @o0
    public static final Parcelable.Creator<ProtocolVersion> CREATOR;

    @o0
    public static final ProtocolVersion UNKNOWN;

    @o0
    public static final ProtocolVersion V1;

    @o0
    public static final ProtocolVersion V2;
    private static final /* synthetic */ ProtocolVersion[] zza;
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedProtocolException extends Exception {
        public UnsupportedProtocolException(@o0 String str) {
            super(String.format(ProtectedSandApp.s("취"), str));
        }
    }

    static {
        String s4 = ProtectedSandApp.s("췩");
        ProtocolVersion protocolVersion = new ProtocolVersion(s4, 0, s4);
        UNKNOWN = protocolVersion;
        ProtocolVersion protocolVersion2 = new ProtocolVersion(ProtectedSandApp.s("췪"), 1, ProtectedSandApp.s("췫"));
        V1 = protocolVersion2;
        ProtocolVersion protocolVersion3 = new ProtocolVersion(ProtectedSandApp.s("췬"), 2, ProtectedSandApp.s("췭"));
        V2 = protocolVersion3;
        zza = new ProtocolVersion[]{protocolVersion, protocolVersion2, protocolVersion3};
        CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.zzf
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                try {
                    return ProtocolVersion.fromString(parcel.readString());
                } catch (ProtocolVersion.UnsupportedProtocolException e4) {
                    throw new RuntimeException(e4);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i4) {
                return new ProtocolVersion[i4];
            }
        };
    }

    private ProtocolVersion(String str, int i4, String str2) {
        this.zzb = str2;
    }

    @o0
    public static ProtocolVersion fromBytes(@o0 byte[] bArr) throws UnsupportedProtocolException {
        try {
            return fromString(new String(bArr, ProtectedSandApp.s("췮")));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }

    @o0
    public static ProtocolVersion fromString(@o0 String str) throws UnsupportedProtocolException {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.zzb)) {
                return protocolVersion;
            }
        }
        throw new UnsupportedProtocolException(str);
    }

    @o0
    public static ProtocolVersion valueOf(@o0 String str) {
        return (ProtocolVersion) Enum.valueOf(ProtocolVersion.class, str);
    }

    @o0
    public static ProtocolVersion[] values() {
        return (ProtocolVersion[]) zza.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isCompatible(@o0 ProtocolVersion protocolVersion) {
        ProtocolVersion protocolVersion2 = UNKNOWN;
        if (equals(protocolVersion2) || protocolVersion.equals(protocolVersion2)) {
            return true;
        }
        return equals(protocolVersion);
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
