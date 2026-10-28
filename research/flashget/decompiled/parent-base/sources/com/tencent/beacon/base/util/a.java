package com.tencent.beacon.base.util;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CloseUnitTestUtils.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f71361a;

    public static String a() {
        String str = f71361a;
        if (str != null) {
            return str;
        }
        try {
            f71361a = (String) Class.forName(ProtectedSandApp.s("㆓\u0001")).getDeclaredMethod(ProtectedSandApp.s("㆔\u0001"), null).invoke(null, null);
            return "";
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }
}
