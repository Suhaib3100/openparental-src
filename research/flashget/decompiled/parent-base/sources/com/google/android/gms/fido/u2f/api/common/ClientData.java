package com.google.android.gms.fido.u2f.api.common;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public class ClientData {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final ChannelIdValue zzd;

    @o0
    public static final String TYPE_FINISH_ENROLLMENT = ProtectedSandApp.s("췔");

    @o0
    public static final String TYPE_GET_ASSERTION = ProtectedSandApp.s("췕");

    @o0
    public static final String KEY_ORIGIN = ProtectedSandApp.s("췒");

    @o0
    public static final String KEY_CHALLENGE = ProtectedSandApp.s("췑");

    @o0
    public static final String KEY_CID_PUBKEY = ProtectedSandApp.s("췓");

    @o0
    public static final String KEY_TYPE = ProtectedSandApp.s("췐");

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class Builder implements Cloneable {
        private String zza;
        private String zzb;
        private String zzc;
        private ChannelIdValue zzd;

        Builder(String str, String str2, String str3, ChannelIdValue channelIdValue) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = channelIdValue;
        }

        @o0
        public static Builder newInstance() {
            return new Builder();
        }

        @o0
        public ClientData build() {
            return new ClientData(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @o0
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Builder m12clone() {
            return new Builder(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @o0
        public Builder setChallenge(@o0 String str) {
            this.zzb = str;
            return this;
        }

        @o0
        public Builder setChannelId(@o0 ChannelIdValue channelIdValue) {
            this.zzd = channelIdValue;
            return this;
        }

        @o0
        public Builder setOrigin(@o0 String str) {
            this.zzc = str;
            return this;
        }

        @o0
        public Builder setType(@o0 String str) {
            this.zza = str;
            return this;
        }

        Builder() {
            this.zzd = ChannelIdValue.ABSENT;
        }
    }

    ClientData(String str, String str2, String str3, ChannelIdValue channelIdValue) {
        this.zza = (String) Preconditions.checkNotNull(str);
        this.zzb = (String) Preconditions.checkNotNull(str2);
        this.zzc = (String) Preconditions.checkNotNull(str3);
        this.zzd = (ChannelIdValue) Preconditions.checkNotNull(channelIdValue);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientData)) {
            return false;
        }
        ClientData clientData = (ClientData) obj;
        return this.zza.equals(clientData.zza) && this.zzb.equals(clientData.zzb) && this.zzc.equals(clientData.zzc) && this.zzd.equals(clientData.zzd);
    }

    public int hashCode() {
        int hashCode = this.zza.hashCode() + 31;
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        int hashCode3 = this.zzc.hashCode() + (hashCode2 * 31);
        return this.zzd.hashCode() + (hashCode3 * 31);
    }

    @o0
    public String toJsonString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("췐"), this.zza);
            jSONObject.put(ProtectedSandApp.s("췑"), this.zzb);
            jSONObject.put(ProtectedSandApp.s("췒"), this.zzc);
            ChannelIdValue.ChannelIdValueType channelIdValueType = ChannelIdValue.ChannelIdValueType.ABSENT;
            int ordinal = this.zzd.getType().ordinal();
            String s4 = ProtectedSandApp.s("췓");
            if (ordinal == 1) {
                jSONObject.put(s4, this.zzd.getStringValue());
            } else if (ordinal == 2) {
                jSONObject.put(s4, this.zzd.getObjectValue());
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }
}
