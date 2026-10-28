package org.minidns.util;

/* compiled from: PlatformDetection.java */
/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f87569a;

    public static boolean a() {
        if (f87569a == null) {
            try {
                Class.forName("android.Manifest");
                f87569a = Boolean.TRUE;
            } catch (Exception unused) {
                f87569a = Boolean.FALSE;
            }
        }
        return f87569a.booleanValue();
    }
}
