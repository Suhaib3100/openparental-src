package com.google.android.gms.internal.common;

import androidx.appcompat.view.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes2.dex */
public final class zzy {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i6 >= length) {
                break;
            }
            Object obj = objArr[i6];
            if (obj == null) {
                sb = ProtectedSandApp.s("\u0cf6");
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e6) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger(ProtectedSandApp.s("\u0cf7")).logp(Level.WARNING, ProtectedSandApp.s("\u0cf8"), ProtectedSandApp.s("\u0cf9"), ProtectedSandApp.s("\u0cfa").concat(str2), (Throwable) e6);
                    StringBuilder a6 = g.a(ProtectedSandApp.s("\u0cfb"), str2, ProtectedSandApp.s("\u0cfc"));
                    a6.append(e6.getClass().getName());
                    a6.append(ProtectedSandApp.s("\u0cfd"));
                    sb = a6.toString();
                }
            }
            objArr[i6] = sb;
            i6++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i5 >= length2 || (indexOf = str.indexOf(ProtectedSandApp.s("\u0cfe"), i7)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i7, indexOf);
            sb2.append(objArr[i5]);
            i7 = indexOf + 2;
            i5++;
        }
        sb2.append((CharSequence) str, i7, str.length());
        if (i5 < length2) {
            sb2.append(ProtectedSandApp.s("\u0cff"));
            sb2.append(objArr[i5]);
            for (int i8 = i5 + 1; i8 < objArr.length; i8++) {
                sb2.append(ProtectedSandApp.s("ഀ"));
                sb2.append(objArr[i8]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
