package com.google.android.gms.common.images;

import android.support.v4.media.d;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i4, int i5) {
        this.zaa = i4;
        this.zab = i5;
    }

    @o0
    public static Size parseSize(@o0 String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쪶"));
        }
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw zaa(str);
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(d.a(ProtectedSandApp.s("쪷"), str, ProtectedSandApp.s("쪸")));
    }

    public boolean equals(@q0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i4 = this.zaa;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.zab;
    }

    @o0
    public String toString() {
        return this.zaa + ProtectedSandApp.s("쪹") + this.zab;
    }
}
