package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzhu;
import com.google.android.gms.internal.fido.zzhx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC(ProtectedSandApp.s("첒")),
    BLUETOOTH_LOW_ENERGY(ProtectedSandApp.s("첔")),
    NFC(ProtectedSandApp.s("첖")),
    USB(ProtectedSandApp.s("처")),
    INTERNAL(ProtectedSandApp.s("첚")),
    HYBRID(ProtectedSandApp.s("천")),
    zza(ProtectedSandApp.s("첞"));


    @o0
    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.common.zza
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Transport.fromString(parcel.readString());
            } catch (Transport.UnsupportedTransportException e4) {
                throw new RuntimeException(e4);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i4) {
            return new Transport[i4];
        }
    };
    private final String zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedTransportException extends Exception {
        public UnsupportedTransportException(@o0 String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.zzc = str;
    }

    @o0
    public static Transport fromString(@o0 String str) throws UnsupportedTransportException {
        if (str.equals(ProtectedSandApp.s("첞")) && (!zzhu.zzb() || !zzhx.zzb())) {
            return HYBRID;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.zzc)) {
                return transport;
            }
        }
        throw new UnsupportedTransportException(String.format(ProtectedSandApp.s("첟"), str));
    }

    @o0
    public static List<Transport> parseTransports(@o0 JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            String string = jSONArray.getString(i4);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(fromString(string));
                } catch (UnsupportedTransportException unused) {
                    ProtectedSandApp.s("철").concat(string);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @o0
    public String toString() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeString(this.zzc);
    }
}
