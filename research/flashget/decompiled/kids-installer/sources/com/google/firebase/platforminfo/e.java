package com.google.firebase.platforminfo;

import androidx.annotation.q0;
import kotlin.KotlinVersion;

/* compiled from: KotlinDetector.java */
/* loaded from: classes2.dex */
public final class e {
    private e() {
    }

    @q0
    public static String a() {
        try {
            return KotlinVersion.f27230u.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
