package com.google.android.gms.internal.common;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import org.jspecify.nullness.NullMarked;
import x1.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes2.dex */
public final class zzah {
    @a
    static Object[] zza(Object[] objArr, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (objArr[i6] == null) {
                throw new NullPointerException(s.a(ProtectedSandApp.s("೨"), i6));
            }
        }
        return objArr;
    }
}
