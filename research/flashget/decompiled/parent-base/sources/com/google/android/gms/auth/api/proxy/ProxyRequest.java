package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.util.Patterns;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class(creator = "ProxyRequestCreator")
/* loaded from: classes5.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;

    @o0
    @SafeParcelable.Field(id = 4)
    public final byte[] body;

    @SafeParcelable.Field(id = 2)
    public final int httpMethod;

    @SafeParcelable.Field(id = 3)
    public final long timeoutMillis;

    @o0
    @SafeParcelable.Field(id = 1)
    public final String url;

    @SafeParcelable.VersionField(id = 1000)
    final int zza;

    @SafeParcelable.Field(id = 5)
    final Bundle zzb;

    @o0
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    /* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
    @ShowFirstParty
    @KeepForSdkWithMembers
    public static class Builder {
        private final String zza;
        private int zzb = ProxyRequest.HTTP_METHOD_GET;
        private long zzc = 3000;
        private byte[] zzd = new byte[0];
        private final Bundle zze = new Bundle();

        public Builder(@o0 String str) {
            Preconditions.checkNotEmpty(str);
            if (!Patterns.WEB_URL.matcher(str).matches()) {
                throw new IllegalArgumentException(d.a(ProtectedSandApp.s("쟡"), str, ProtectedSandApp.s("쟢")));
            }
            this.zza = str;
        }

        @o0
        public ProxyRequest build() {
            if (this.zzd == null) {
                this.zzd = new byte[0];
            }
            return new ProxyRequest(2, this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        @o0
        public Builder putHeader(@o0 String str, @o0 String str2) {
            Preconditions.checkNotEmpty(str, ProtectedSandApp.s("쟣"));
            Bundle bundle = this.zze;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        @o0
        public Builder setBody(@o0 byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        @o0
        public Builder setHttpMethod(int i4) {
            boolean z4 = false;
            if (i4 >= 0 && i4 <= ProxyRequest.LAST_CODE) {
                z4 = true;
            }
            Preconditions.checkArgument(z4, ProtectedSandApp.s("쟤"));
            this.zzb = i4;
            return this;
        }

        @o0
        public Builder setTimeoutMillis(long j4) {
            Preconditions.checkArgument(j4 >= 0, ProtectedSandApp.s("쟥"));
            this.zzc = j4;
            return this;
        }
    }

    @SafeParcelable.Constructor
    ProxyRequest(@SafeParcelable.Param(id = 1000) int i4, @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) long j4, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Bundle bundle) {
        this.zza = i4;
        this.url = str;
        this.httpMethod = i5;
        this.timeoutMillis = j4;
        this.body = bArr;
        this.zzb = bundle;
    }

    @o0
    public Map<String, String> getHeaderMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.zzb.size());
        for (String str : this.zzb.keySet()) {
            String string = this.zzb.getString(str);
            if (string == null) {
                string = "";
            }
            linkedHashMap.put(str, string);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @o0
    public String toString() {
        return ProtectedSandApp.s("쟦") + this.url + ProtectedSandApp.s("쟧") + this.httpMethod + ProtectedSandApp.s("쟨");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
