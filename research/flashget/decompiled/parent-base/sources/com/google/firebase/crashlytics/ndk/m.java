package com.google.firebase.crashlytics.ndk;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: SessionMetadataJsonSerializer.java */
/* loaded from: classes6.dex */
class m {
    private m() {
    }

    private static String a(@q0 String str) {
        return str == null ? "" : str;
    }

    static String b(String str, String str2, long j4) {
        HashMap a5 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s("+\u0001"), str, ProtectedSandApp.s(",\u0001"), str2);
        a5.put(ProtectedSandApp.s("-\u0001"), Long.valueOf(j4));
        return new JSONObject(a5).toString();
    }

    static String c(String str, String str2, String str3, String str4, int i4, @q0 String str5, @q0 String str6) {
        HashMap a5 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s(".\u0001"), str, ProtectedSandApp.s("/\u0001"), str2);
        a5.put(ProtectedSandApp.s("0\u0001"), str3);
        a5.put(ProtectedSandApp.s("1\u0001"), str4);
        a5.put(ProtectedSandApp.s("2\u0001"), Integer.valueOf(i4));
        if (str5 == null) {
            str5 = "";
        }
        a5.put(ProtectedSandApp.s("3\u0001"), str5);
        if (str6 == null) {
            str6 = "";
        }
        a5.put(ProtectedSandApp.s("4\u0001"), str6);
        return new JSONObject(a5).toString();
    }

    static String d(int i4, String str, int i5, long j4, long j5, boolean z4, int i6, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("5\u0001"), Integer.valueOf(i4));
        hashMap.put(ProtectedSandApp.s("6\u0001"), str);
        hashMap.put(ProtectedSandApp.s("7\u0001"), Integer.valueOf(i5));
        hashMap.put(ProtectedSandApp.s("8\u0001"), Long.valueOf(j4));
        hashMap.put(ProtectedSandApp.s("9\u0001"), Long.valueOf(j5));
        hashMap.put(ProtectedSandApp.s(":\u0001"), Boolean.valueOf(z4));
        hashMap.put(ProtectedSandApp.s(";\u0001"), Integer.valueOf(i6));
        hashMap.put(ProtectedSandApp.s("<\u0001"), str2);
        hashMap.put(ProtectedSandApp.s("=\u0001"), str3);
        return new JSONObject(hashMap).toString();
    }

    static String e(String str, String str2, boolean z4) {
        HashMap a5 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s(">\u0001"), str, ProtectedSandApp.s("?\u0001"), str2);
        a5.put(ProtectedSandApp.s("@\u0001"), Boolean.valueOf(z4));
        return new JSONObject(a5).toString();
    }
}
