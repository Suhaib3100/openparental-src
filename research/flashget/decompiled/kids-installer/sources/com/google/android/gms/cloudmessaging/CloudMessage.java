package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes3.dex */
public final class CloudMessage extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @o0
    @SafeParcelable.Field(id = 1)
    Intent zza;

    @GuardedBy("this")
    private Map<String, String> zzb;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@SafeParcelable.Param(id = 1) @o0 Intent intent) {
        this.zza = intent;
    }

    private static int zza(@q0 String str) {
        if (ProtectedSandApp.s("℘").equals(str)) {
            return 1;
        }
        return ProtectedSandApp.s("ℙ").equals(str) ? 2 : 0;
    }

    @q0
    public String getCollapseKey() {
        return this.zza.getStringExtra(ProtectedSandApp.s("ℚ"));
    }

    @o0
    public synchronized Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle extras = this.zza.getExtras();
            a aVar = new a();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith(ProtectedSandApp.s("ℛ")) && !str.equals(ProtectedSandApp.s("ℜ")) && !str.equals(ProtectedSandApp.s("ℝ")) && !str.equals(ProtectedSandApp.s("℞"))) {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
            this.zzb = aVar;
        }
        return this.zzb;
    }

    @q0
    public String getFrom() {
        return this.zza.getStringExtra(ProtectedSandApp.s("℟"));
    }

    @o0
    public Intent getIntent() {
        return this.zza;
    }

    @q0
    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("℠"));
        return stringExtra == null ? this.zza.getStringExtra(ProtectedSandApp.s("℡")) : stringExtra;
    }

    @q0
    public String getMessageType() {
        return this.zza.getStringExtra(ProtectedSandApp.s("™"));
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("℣"));
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("ℤ"));
        }
        return zza(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("℥"));
        if (stringExtra == null) {
            if (ProtectedSandApp.s("℧").equals(this.zza.getStringExtra(ProtectedSandApp.s("Ω")))) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra(ProtectedSandApp.s("ℨ"));
        }
        return zza(stringExtra);
    }

    @q0
    public byte[] getRawData() {
        return this.zza.getByteArrayExtra(ProtectedSandApp.s("℩"));
    }

    @q0
    public String getSenderId() {
        return this.zza.getStringExtra(ProtectedSandApp.s("K"));
    }

    public long getSentTime() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get(ProtectedSandApp.s("Å")) : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            new StringBuilder(String.valueOf(obj).length() + 19);
            return 0L;
        }
    }

    @q0
    public String getTo() {
        return this.zza.getStringExtra(ProtectedSandApp.s("ℬ"));
    }

    public int getTtl() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get(ProtectedSandApp.s("ℭ")) : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            new StringBuilder(String.valueOf(obj).length() + 13);
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i5) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i5, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
