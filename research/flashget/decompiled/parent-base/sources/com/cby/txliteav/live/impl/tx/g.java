package com.cby.txliteav.live.impl.tx;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: URLUtils.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f46658a = ProtectedSandApp.s("ෟ");

    /* renamed from: b, reason: collision with root package name */
    public static final String f46659b = ProtectedSandApp.s("\u0de0");

    /* renamed from: c, reason: collision with root package name */
    public static final String f46660c = ProtectedSandApp.s("\u0de1");

    /* renamed from: d, reason: collision with root package name */
    public static final String f46661d = ProtectedSandApp.s("\u0de2");

    /* renamed from: e, reason: collision with root package name */
    public static final String f46662e = ProtectedSandApp.s("\u0de3");

    /* renamed from: f, reason: collision with root package name */
    public static final String f46663f = ProtectedSandApp.s("\u0de4");

    /* renamed from: g, reason: collision with root package name */
    public static final String f46664g = ProtectedSandApp.s("ී");

    public static String a(String str, String str2, int i4) {
        String s4 = ProtectedSandApp.s("ී");
        if (i4 == 0) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ු"));
            String str3 = File.separator;
            return androidx.fragment.app.c.a(sb, str3, s4, str3, str);
        }
        String s5 = ProtectedSandApp.s("\u0dd5");
        if (i4 == 1) {
            StringBuilder sb2 = new StringBuilder(s5);
            String str4 = File.separator;
            l0.a(sb2, str4, s4, str4, str);
            sb2.append(ProtectedSandApp.s("ූ"));
            return sb2.toString();
        }
        if (i4 == 2) {
            StringBuilder sb3 = new StringBuilder(s5);
            String str5 = File.separator;
            l0.a(sb3, str5, s4, str5, str);
            sb3.append(ProtectedSandApp.s("\u0dd7"));
            return sb3.toString();
        }
        if (i4 == 3) {
            StringBuilder sb4 = new StringBuilder(ProtectedSandApp.s("ෘ"));
            String str6 = File.separator;
            return androidx.fragment.app.c.a(sb4, str6, s4, str6, str);
        }
        if (i4 != 4) {
            return "";
        }
        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("ෙ"), str, ProtectedSandApp.s("ේ"), str2, ProtectedSandApp.s("ෛ"));
        a5.append(c.d(str2));
        return a5.toString();
    }

    public static String b(String str, String str2, int i4) {
        if (i4 == 0) {
            StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("ො"), str, ProtectedSandApp.s("ේ"), str2, ProtectedSandApp.s("ෛ"));
            a5.append(c.d(str2));
            return a5.toString();
        }
        String s4 = ProtectedSandApp.s("ී");
        if (i4 == 1) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ෝ"));
            String str3 = File.separator;
            l0.a(sb, str3, s4, str3, str);
            sb.append(c.e(str, Boolean.TRUE));
            return sb.toString();
        }
        if (i4 != 2) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("ෞ"));
        String str4 = File.separator;
        l0.a(sb2, str4, s4, str4, str);
        sb2.append(c.e(str, Boolean.TRUE));
        return sb2.toString();
    }
}
