package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialParametersCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new zzaq();

    @o0
    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType zza;

    @o0
    @SafeParcelable.Field(getter = "getAlgorithmIdAsInteger", id = 3, type = "java.lang.Integer")
    private final COSEAlgorithmIdentifier zzb;

    @SafeParcelable.Constructor
    public PublicKeyCredentialParameters(@SafeParcelable.Param(id = 2) @o0 String str, @SafeParcelable.Param(id = 3) int i4) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            Preconditions.checkNotNull(Integer.valueOf(i4));
            try {
                this.zzb = COSEAlgorithmIdentifier.fromCoseValue(i4);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e4) {
                throw new IllegalArgumentException(e4);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.zza.equals(publicKeyCredentialParameters.zza) && this.zzb.equals(publicKeyCredentialParameters.zzb);
    }

    @o0
    public COSEAlgorithmIdentifier getAlgorithm() {
        return this.zzb;
    }

    public int getAlgorithmIdAsInteger() {
        return this.zzb.toCoseValue();
    }

    @o0
    public PublicKeyCredentialType getType() {
        return this.zza;
    }

    @o0
    public String getTypeAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @o0
    public final String toString() {
        COSEAlgorithmIdentifier cOSEAlgorithmIdentifier = this.zzb;
        return c.a(ProtectedSandApp.s("쵧"), String.valueOf(this.zza), ProtectedSandApp.s("쵨"), String.valueOf(cOSEAlgorithmIdentifier), ProtectedSandApp.s("쵩"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, Integer.valueOf(getAlgorithmIdAsInteger()), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
