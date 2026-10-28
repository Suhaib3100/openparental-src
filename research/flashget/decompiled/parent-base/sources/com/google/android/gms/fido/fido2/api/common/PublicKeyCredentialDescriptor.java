package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import android.util.Base64;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "PublicKeyCredentialDescriptorCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {

    @o0
    @SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final PublicKeyCredentialType zzb;

    @o0
    @SafeParcelable.Field(getter = "getId", id = 3, type = "byte[]")
    private final zzgx zzc;

    @q0
    @SafeParcelable.Field(getter = "getTransports", id = 4)
    private final List zzd;
    private static final zzcf zza = zzcf.zzm(com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);

    @o0
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new zzap();

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
        public UnsupportedPubKeyCredDescriptorException(@o0 String str) {
            super(str);
        }

        public UnsupportedPubKeyCredDescriptorException(@o0 String str, @o0 Throwable th) {
            super(str, th);
        }
    }

    public PublicKeyCredentialDescriptor(String str, zzgx zzgxVar, @q0 List<Transport> list) {
        Preconditions.checkNotNull(str);
        try {
            this.zzb = PublicKeyCredentialType.fromString(str);
            this.zzc = (zzgx) Preconditions.checkNotNull(zzgxVar);
            this.zzd = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @o0
    public static PublicKeyCredentialDescriptor zza(@o0 JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(ProtectedSandApp.s("쵠"));
        byte[] decode = Base64.decode(jSONObject.getString(ProtectedSandApp.s("쵡")), 11);
        String s4 = ProtectedSandApp.s("쵢");
        return new PublicKeyCredentialDescriptor(string, decode, jSONObject.has(s4) ? Transport.parseTransports(jSONObject.getJSONArray(s4)) : null);
    }

    public boolean equals(@q0 Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !Objects.equal(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && publicKeyCredentialDescriptor.zzd == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.zzd) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.zzd.containsAll(this.zzd);
    }

    @o0
    public byte[] getId() {
        return this.zzc.zzm();
    }

    public zzgx getIdAsByteString() {
        return this.zzc;
    }

    @q0
    public List<Transport> getTransports() {
        return this.zzd;
    }

    @o0
    public PublicKeyCredentialType getType() {
        return this.zzb;
    }

    @o0
    public String getTypeAsString() {
        return this.zzb.toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd);
    }

    @o0
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(getId());
        return c.a(b.a(ProtectedSandApp.s("쵣"), valueOf, ProtectedSandApp.s("쵤"), encodeUrlSafeNoPadding, ProtectedSandApp.s("쵥")), String.valueOf(this.zzd), ProtectedSandApp.s("쵦"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTypeAsString(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getId(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SafeParcelable.Constructor
    public PublicKeyCredentialDescriptor(@SafeParcelable.Param(id = 2) @o0 String str, @SafeParcelable.Param(id = 3) @o0 byte[] bArr, @q0 @SafeParcelable.Param(id = 4) List<Transport> list) {
        this(str, zzgx.zzl(bArr, 0, bArr.length), list);
        zzgx zzgxVar = zzgx.zzb;
    }
}
