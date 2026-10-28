package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes5.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @o0
    @SafeParcelable.Field(id = 1)
    final Intent zza;
    private Map zzb;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public CloudMessage(@SafeParcelable.Param(id = 1) @o0 Intent intent) {
        this.zza = intent;
    }

    private static int zzb(@q0 String str) {
        if (Objects.equals(str, ProtectedSandApp.s("좣"))) {
            return 1;
        }
        return Objects.equals(str, ProtectedSandApp.s("좤")) ? 2 : 0;
    }

    @q0
    public String getCollapseKey() {
        return this.zza.getStringExtra(ProtectedSandApp.s("좥"));
    }

    @o0
    public synchronized Map<String, String> getData() {
        try {
            if (this.zzb == null) {
                Bundle extras = this.zza.getExtras();
                a aVar = new a();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith(ProtectedSandApp.s("좦")) && !str.equals(ProtectedSandApp.s("좧")) && !str.equals(ProtectedSandApp.s("좨")) && !str.equals(ProtectedSandApp.s("좥"))) {
                                aVar.put(str, str2);
                            }
                        }
                    }
                }
                this.zzb = aVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }

    @q0
    public String getFrom() {
        return this.zza.getStringExtra(ProtectedSandApp.s("좧"));
    }

    @o0
    public Intent getIntent() {
        return this.zza;
    }

    @q0
    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("좩"));
        return stringExtra == null ? this.zza.getStringExtra(ProtectedSandApp.s("좪")) : stringExtra;
    }

    @q0
    public String getMessageType() {
        return this.zza.getStringExtra(ProtectedSandApp.s("좨"));
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("좫"));
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("좬"));
        }
        return zzb(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("좭"));
        if (stringExtra == null) {
            if (Objects.equals(this.zza.getStringExtra(ProtectedSandApp.s("좮")), ProtectedSandApp.s("좯"))) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("좬"));
        }
        return zzb(stringExtra);
    }

    @q0
    public byte[] getRawData() {
        return this.zza.getByteArrayExtra(ProtectedSandApp.s("좰"));
    }

    @q0
    public String getSenderId() {
        return this.zza.getStringExtra(ProtectedSandApp.s("좱"));
    }

    public long getSentTime() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get(ProtectedSandApp.s("좲")) : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            ProtectedSandApp.s("좳").concat(String.valueOf(obj));
            return 0L;
        }
    }

    @q0
    public String getTo() {
        return this.zza.getStringExtra(ProtectedSandApp.s("좴"));
    }

    public int getTtl() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get(ProtectedSandApp.s("좵")) : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            ProtectedSandApp.s("좶").concat(String.valueOf(obj));
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i4, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @q0
    final Integer zza() {
        Intent intent = this.zza;
        String s4 = ProtectedSandApp.s("좷");
        if (intent.hasExtra(s4)) {
            return Integer.valueOf(this.zza.getIntExtra(s4, 0));
        }
        return null;
    }
}
