package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;

/* compiled from: Preconditions.java */
/* loaded from: classes3.dex */
public final class m {
    private m() {
    }

    public static void a(boolean z4) {
        b(z4, "");
    }

    public static void b(boolean z4, @o0 String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    @o0
    public static String c(@q0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ઠ"));
        }
        return str;
    }

    @o0
    public static <T extends Collection<Y>, Y> T d(@o0 T t4) {
        if (t4.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ડ"));
        }
        return t4;
    }

    @o0
    public static <T> T e(@q0 T t4) {
        return (T) f(t4, ProtectedSandApp.s("ઢ"));
    }

    @o0
    public static <T> T f(@q0 T t4, @o0 String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }
}
