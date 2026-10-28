package com.google.android.gms.common.images;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i5, int i6) {
        this.zaa = i5;
        this.zab = i6;
    }

    @o0
    public static Size parseSize(@o0 String str) throws NumberFormatException {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ଠ"));
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
        throw new NumberFormatException(e0.a(new StringBuilder(str.length() + 16), ProtectedSandApp.s("ଡ"), str, ProtectedSandApp.s("ଢ")));
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
        int i5 = this.zab;
        int i6 = this.zaa;
        return i5 ^ ((i6 >>> 16) | (i6 << 16));
    }

    @o0
    public String toString() {
        int i5 = this.zaa;
        int i6 = this.zab;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i5);
        sb.append(ProtectedSandApp.s("ଣ"));
        sb.append(i6);
        return sb.toString();
    }
}
