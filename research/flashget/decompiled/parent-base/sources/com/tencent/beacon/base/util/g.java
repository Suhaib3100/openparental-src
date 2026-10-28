package com.tencent.beacon.base.util;

import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RootUtil.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f71371a;

    public static boolean a() {
        ArrayList<String> e4 = e();
        if (e4 == null || e4.size() <= 0) {
            c.a(ProtectedSandApp.s("㇂\u0001"), new Object[0]);
            return false;
        }
        Iterator<String> it = e4.iterator();
        while (it.hasNext()) {
            String next = it.next();
            c.a(next, new Object[0]);
            if (next.contains(ProtectedSandApp.s("㇀\u0001"))) {
                return false;
            }
        }
        c.a(ProtectedSandApp.s("㇁\u0001"), new Object[0]);
        return true;
    }

    public static boolean b() {
        try {
            if (new File(ProtectedSandApp.s("㇃\u0001")).exists()) {
                c.a(ProtectedSandApp.s("㇄\u0001"), new Object[0]);
                return true;
            }
        } catch (Exception e4) {
            c.a(e4);
        }
        return false;
    }

    public static boolean c() {
        String str = Build.TAGS;
        if (str == null || !str.contains(ProtectedSandApp.s("㇅\u0001"))) {
            return false;
        }
        c.a(ProtectedSandApp.s("㇆\u0001"), new Object[0]);
        return true;
    }

    public static boolean d() {
        boolean z4 = true;
        if (f71371a) {
            return true;
        }
        if (!c() && !b() && !a()) {
            z4 = false;
        }
        f71371a = z4;
        return z4;
    }

    private static ArrayList<String> e() {
        String s4 = ProtectedSandApp.s("㇇\u0001");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process exec = Runtime.getRuntime().exec(new String[]{ProtectedSandApp.s("㇈\u0001"), ProtectedSandApp.s("㇉\u0001"), ProtectedSandApp.s("㇊\u0001")});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName(s4)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getErrorStream(), Charset.forName(s4)));
            while (true) {
                String readLine2 = bufferedReader2.readLine();
                if (readLine2 == null) {
                    return arrayList;
                }
                arrayList.add(readLine2);
            }
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }
}
