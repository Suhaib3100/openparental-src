package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.Class(creator = "TokenBindingCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public class TokenBinding extends AbstractSafeParcelable {

    @o0
    @SafeParcelable.Field(getter = "getTokenBindingStatusAsString", id = 2, type = "java.lang.String")
    private final TokenBindingStatus zza;

    @q0
    @SafeParcelable.Field(getter = "getTokenBindingId", id = 3)
    private final String zzb;

    @o0
    public static final Parcelable.Creator<TokenBinding> CREATOR = new zzaz();

    @o0
    public static final TokenBinding SUPPORTED = new TokenBinding(TokenBindingStatus.SUPPORTED.toString(), null);

    @o0
    public static final TokenBinding NOT_SUPPORTED = new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.toString(), null);

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT(ProtectedSandApp.s("춞")),
        SUPPORTED(ProtectedSandApp.s("춠")),
        NOT_SUPPORTED(ProtectedSandApp.s("춢"));


        @o0
        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new zzay();

        @o0
        private final String zzb;

        TokenBindingStatus(@o0 String str) {
            this.zzb = str;
        }

        @o0
        public static TokenBindingStatus fromString(@o0 String str) throws UnsupportedTokenBindingStatusException {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.zzb)) {
                    return tokenBindingStatus;
                }
            }
            throw new UnsupportedTokenBindingStatusException(str);
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

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedTokenBindingStatusException extends Exception {
        public UnsupportedTokenBindingStatusException(@o0 String str) {
            super(String.format(ProtectedSandApp.s("춣"), str));
        }
    }

    public TokenBinding(@o0 String str) {
        this(TokenBindingStatus.PRESENT.toString(), (String) Preconditions.checkNotNull(str));
    }

    public boolean equals(@q0 Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return zzbk.zza(this.zza, tokenBinding.zza) && zzbk.zza(this.zzb, tokenBinding.zzb);
    }

    @q0
    public String getTokenBindingId() {
        return this.zzb;
    }

    @o0
    public String getTokenBindingStatusAsString() {
        return this.zza.toString();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    @o0
    public JSONObject toJsonObject() throws JSONException {
        try {
            return new JSONObject().put(ProtectedSandApp.s("춤"), this.zza).put(ProtectedSandApp.s("춥"), this.zzb);
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getTokenBindingStatusAsString(), false);
        SafeParcelWriter.writeString(parcel, 3, getTokenBindingId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    TokenBinding(@SafeParcelable.Param(id = 2) @o0 String str, @q0 @SafeParcelable.Param(id = 3) String str2) {
        Preconditions.checkNotNull(str);
        try {
            this.zza = TokenBindingStatus.fromString(str);
            this.zzb = str2;
        } catch (UnsupportedTokenBindingStatusException e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
