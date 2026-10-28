package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.constraintlayout.core.parser.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "BrowserPublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @o0
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new zzo();

    @o0
    @SafeParcelable.Field(getter = "getPublicKeyCredentialRequestOptions", id = 2)
    private final PublicKeyCredentialRequestOptions zza;

    @o0
    @SafeParcelable.Field(getter = "getOrigin", id = 3)
    private final Uri zzb;

    @q0
    @SafeParcelable.Field(getter = "getClientDataHash", id = 4)
    private final byte[] zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class Builder {
        private PublicKeyCredentialRequestOptions zza;
        private Uri zzb;
        private byte[] zzc;

        @o0
        public BrowserPublicKeyCredentialRequestOptions build() {
            return new BrowserPublicKeyCredentialRequestOptions(this.zza, this.zzb, this.zzc);
        }

        @o0
        public Builder setClientDataHash(@o0 byte[] bArr) {
            BrowserPublicKeyCredentialRequestOptions.zzb(bArr);
            this.zzc = bArr;
            return this;
        }

        @o0
        public Builder setOrigin(@o0 Uri uri) {
            BrowserPublicKeyCredentialRequestOptions.zza(uri);
            this.zzb = uri;
            return this;
        }

        @o0
        public Builder setPublicKeyCredentialRequestOptions(@o0 PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            this.zza = (PublicKeyCredentialRequestOptions) Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
            return this;
        }
    }

    @SafeParcelable.Constructor
    BrowserPublicKeyCredentialRequestOptions(@SafeParcelable.Param(id = 2) @o0 PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, @SafeParcelable.Param(id = 3) @o0 Uri uri, @q0 @SafeParcelable.Param(id = 4) byte[] bArr) {
        this.zza = (PublicKeyCredentialRequestOptions) Preconditions.checkNotNull(publicKeyCredentialRequestOptions);
        zzc(uri);
        this.zzb = uri;
        zzd(bArr);
        this.zzc = bArr;
    }

    @o0
    public static BrowserPublicKeyCredentialRequestOptions deserializeFromBytes(@o0 byte[] bArr) {
        return (BrowserPublicKeyCredentialRequestOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    static /* bridge */ /* synthetic */ Uri zza(Uri uri) {
        zzc(uri);
        return uri;
    }

    static /* bridge */ /* synthetic */ byte[] zzb(byte[] bArr) {
        zzd(bArr);
        return bArr;
    }

    private static Uri zzc(Uri uri) {
        Preconditions.checkNotNull(uri);
        Preconditions.checkArgument(uri.getScheme() != null, ProtectedSandApp.s("촉"));
        Preconditions.checkArgument(uri.getAuthority() != null, ProtectedSandApp.s("촊"));
        return uri;
    }

    private static byte[] zzd(byte[] bArr) {
        boolean z4 = true;
        if (bArr != null && bArr.length != 32) {
            z4 = false;
        }
        Preconditions.checkArgument(z4, ProtectedSandApp.s("촋"));
        return bArr;
    }

    public boolean equals(@o0 Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return Objects.equal(this.zza, browserPublicKeyCredentialRequestOptions.zza) && Objects.equal(this.zzb, browserPublicKeyCredentialRequestOptions.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.zza.getAuthenticationExtensions();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @o0
    public byte[] getChallenge() {
        return this.zza.getChallenge();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    @q0
    public byte[] getClientDataHash() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions
    @o0
    public Uri getOrigin() {
        return this.zzb;
    }

    @o0
    public PublicKeyCredentialRequestOptions getPublicKeyCredentialRequestOptions() {
        return this.zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public Integer getRequestId() {
        return this.zza.getRequestId();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public Double getTimeoutSeconds() {
        return this.zza.getTimeoutSeconds();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @q0
    public TokenBinding getTokenBinding() {
        return this.zza.getTokenBinding();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @o0
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @o0
    public final String toString() {
        byte[] bArr = this.zzc;
        Uri uri = this.zzb;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(uri);
        return c.a(b.a(ProtectedSandApp.s("촌"), valueOf, ProtectedSandApp.s("촍"), valueOf2, ProtectedSandApp.s("촎")), Base64Utils.encodeUrlSafeNoPadding(bArr), ProtectedSandApp.s("촏"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPublicKeyCredentialRequestOptions(), i4, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getOrigin(), i4, false);
        SafeParcelWriter.writeByteArray(parcel, 4, getClientDataHash(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
