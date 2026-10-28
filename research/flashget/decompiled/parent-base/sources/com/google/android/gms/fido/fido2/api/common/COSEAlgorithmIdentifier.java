package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @o0
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();

    @o0
    private final Algorithm zza;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i4) {
            super(r2.a(ProtectedSandApp.s("촐"), i4, ProtectedSandApp.s("촑")));
        }
    }

    COSEAlgorithmIdentifier(@o0 Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0
    public static COSEAlgorithmIdentifier fromCoseValue(int i4) throws UnsupportedAlgorithmIdentifierException {
        RSAAlgorithm rSAAlgorithm;
        if (i4 == RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    for (RSAAlgorithm rSAAlgorithm2 : EC2Algorithm.values()) {
                        if (rSAAlgorithm2.getAlgoValue() == i4) {
                            rSAAlgorithm = rSAAlgorithm2;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(i4);
                }
                RSAAlgorithm rSAAlgorithm3 = values[i5];
                if (rSAAlgorithm3.getAlgoValue() == i4) {
                    rSAAlgorithm = rSAAlgorithm3;
                    break;
                }
                i5++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@q0 Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @o0
    public final String toString() {
        return d.a(ProtectedSandApp.s("촒"), String.valueOf(this.zza), ProtectedSandApp.s("촓"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
