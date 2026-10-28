package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;

/* compiled from: Preconditions.java */
/* loaded from: classes.dex */
public final class l {
    private l() {
    }

    public static void a(boolean z5, @o0 String str) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    @o0
    public static String b(@q0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ȭ"));
        }
        return str;
    }

    @o0
    public static <T extends Collection<Y>, Y> T c(@o0 T t5) {
        if (t5.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ȯ"));
        }
        return t5;
    }

    @o0
    public static <T> T d(@q0 T t5) {
        return (T) e(t5, ProtectedSandApp.s("ȯ"));
    }

    @o0
    public static <T> T e(@q0 T t5, @o0 String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }
}
