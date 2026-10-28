package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@SafeParcelable.Class(creator = "WebImageCreator")
/* loaded from: classes5.dex */
public final class WebImage extends AbstractSafeParcelable {

    @o0
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getUrl", id = 2)
    private final Uri zab;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getHeight", id = 4)
    private final int zad;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i5, @SafeParcelable.Param(id = 4) int i6) {
        this.zaa = i4;
        this.zab = uri;
        this.zac = i5;
        this.zad = i6;
    }

    public boolean equals(@q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.equal(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    @o0
    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Objects.hashCode(this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad));
    }

    @o0
    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ProtectedSandApp.s("쪼"), this.zab.toString());
            jSONObject.put(ProtectedSandApp.s("쪽"), this.zac);
            jSONObject.put(ProtectedSandApp.s("쪾"), this.zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @o0
    public String toString() {
        return String.format(Locale.US, ProtectedSandApp.s("쪿"), Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i4) {
        int i5 = this.zaa;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i4, false);
        SafeParcelWriter.writeInt(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WebImage(@o0 Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(@o0 Uri uri, int i4, int i5) throws IllegalArgumentException {
        this(1, uri, i4, i5);
        if (uri == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쪻"));
        }
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쪺"));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WebImage(@androidx.annotation.o0 org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "쪼"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L16
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L16
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L16
        L16:
            java.lang.String r1 = "쪽"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "쪾"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }
}
