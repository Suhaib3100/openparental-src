package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import kotlin.UByte;

/* compiled from: CommonUtils.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: m, reason: collision with root package name */
    public static final int f15613m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f15614n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f15615o = 4;

    /* renamed from: p, reason: collision with root package name */
    public static final int f15616p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final int f15617q = 16;

    /* renamed from: r, reason: collision with root package name */
    public static final int f15618r = 32;

    /* renamed from: a, reason: collision with root package name */
    private static final String f15601a = ProtectedSandApp.s("Ꮾ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f15602b = ProtectedSandApp.s("Ꮿ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f15603c = ProtectedSandApp.s("Ᏸ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f15604d = ProtectedSandApp.s("Ᏹ");

    /* renamed from: e, reason: collision with root package name */
    public static final String f15605e = ProtectedSandApp.s("Ᏺ");

    /* renamed from: f, reason: collision with root package name */
    public static final String f15606f = ProtectedSandApp.s("Ᏻ");

    /* renamed from: h, reason: collision with root package name */
    static final String f15608h = ProtectedSandApp.s("Ᏼ");

    /* renamed from: i, reason: collision with root package name */
    static final String f15609i = ProtectedSandApp.s("Ᏽ");

    /* renamed from: j, reason: collision with root package name */
    static final String f15610j = ProtectedSandApp.s("\u13f6");

    /* renamed from: k, reason: collision with root package name */
    static final String f15611k = ProtectedSandApp.s("\u13f7");

    /* renamed from: l, reason: collision with root package name */
    static final String f15612l = ProtectedSandApp.s("ᏸ");

    /* renamed from: g, reason: collision with root package name */
    private static final char[] f15607g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* compiled from: CommonUtils.java */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, a> matcher;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put(ProtectedSandApp.s("Ꮹ"), aVar3);
            hashMap.put(ProtectedSandApp.s("Ꮺ"), aVar2);
            hashMap.put(ProtectedSandApp.s("Ꮻ"), aVar4);
            hashMap.put(ProtectedSandApp.s("Ꮼ"), aVar);
        }

        static a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("Ꮽ"));
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static boolean A(@androidx.annotation.q0 String str, @androidx.annotation.q0 String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String B(int i5) {
        if (i5 >= 0) {
            return String.format(Locale.US, ProtectedSandApp.s("ᏹ"), Integer.valueOf(i5)).replace(' ', '0');
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᏺ"));
    }

    public static String C(String str) {
        return s(str, ProtectedSandApp.s("ᏻ"));
    }

    public static String D(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter(ProtectedSandApp.s("ᏼ"));
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ProtectedSandApp.s("ᏽ"))).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j5;
        synchronized (i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(ProtectedSandApp.s("\u13fe"))).getMemoryInfo(memoryInfo);
            j5 = memoryInfo.totalMem;
        }
        return j5;
    }

    public static long c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(Context context) {
        if (!e(context, ProtectedSandApp.s("\u13ff"))) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(ProtectedSandApp.s("᐀"))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e6) {
                com.google.firebase.crashlytics.internal.g.f().e(str, e6);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(ProtectedSandApp.s("ᐁ"), "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return C(sb2);
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z5) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int q5 = q(context, str, ProtectedSandApp.s("ᐂ"));
            if (q5 > 0) {
                return resources.getBoolean(q5);
            }
            int q6 = q(context, str, ProtectedSandApp.s("ᐃ"));
            if (q6 > 0) {
                return Boolean.parseBoolean(context.getString(q6));
            }
        }
        return z5;
    }

    public static List<f> j(Context context) {
        ArrayList arrayList = new ArrayList();
        String s5 = ProtectedSandApp.s("ᐄ");
        String s6 = ProtectedSandApp.s("ᐅ");
        int q5 = q(context, s5, s6);
        int q6 = q(context, ProtectedSandApp.s("ᐆ"), s6);
        int q7 = q(context, ProtectedSandApp.s("ᐇ"), s6);
        if (q5 == 0 || q6 == 0 || q7 == 0) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ᐉ"), Integer.valueOf(q5), Integer.valueOf(q6), Integer.valueOf(q7)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(q5);
        String[] stringArray2 = context.getResources().getStringArray(q6);
        String[] stringArray3 = context.getResources().getStringArray(q7);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ᐈ"), Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i5 = 0; i5 < stringArray3.length; i5++) {
            arrayList.add(new f(stringArray[i5], stringArray2[i5], stringArray3[i5]));
        }
        return arrayList;
    }

    public static int k() {
        return a.getValue().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean x5 = x();
        ?? r02 = x5;
        if (z()) {
            r02 = (x5 ? 1 : 0) | 2;
        }
        return w() ? r02 | 4 : r02;
    }

    public static SharedPreferences m(Context context) {
        return context.getSharedPreferences(ProtectedSandApp.s("ᐊ"), 0);
    }

    public static String n(Context context) {
        String s5 = ProtectedSandApp.s("ᐋ");
        String s6 = ProtectedSandApp.s("ᐌ");
        int q5 = q(context, s5, s6);
        if (q5 == 0) {
            q5 = q(context, ProtectedSandApp.s("ᐍ"), s6);
        }
        if (q5 != 0) {
            return context.getResources().getString(q5);
        }
        return null;
    }

    public static boolean o(Context context) {
        return (x() || ((SensorManager) context.getSystemService(ProtectedSandApp.s("ᐎ"))).getDefaultSensor(8) == null) ? false : true;
    }

    public static String p(Context context) {
        int i5 = context.getApplicationContext().getApplicationInfo().icon;
        if (i5 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i5);
            return ProtectedSandApp.s("ᐏ").equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences(ProtectedSandApp.s("ᐐ"), 0);
    }

    private static String s(String str, String str2) {
        return t(str.getBytes(), str2);
    }

    private static String t(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return u(messageDigest.digest());
        } catch (NoSuchAlgorithmException e6) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᐑ") + str + ProtectedSandApp.s("ᐒ"), e6);
            return "";
        }
    }

    public static String u(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & UByte.f27220r;
            int i7 = i5 * 2;
            char[] cArr2 = f15607g;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    public static boolean v(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean x() {
        if (!Build.PRODUCT.contains(ProtectedSandApp.s("ᐓ"))) {
            String str = Build.HARDWARE;
            if (!str.contains(ProtectedSandApp.s("ᐔ")) && !str.contains(ProtectedSandApp.s("ᐕ"))) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static boolean y(Context context) {
        return false;
    }

    public static boolean z() {
        boolean x5 = x();
        String str = Build.TAGS;
        if ((x5 || str == null || !str.contains(ProtectedSandApp.s("ᐖ"))) && !new File(ProtectedSandApp.s("ᐗ")).exists()) {
            return !x5 && new File(ProtectedSandApp.s("ᐘ")).exists();
        }
        return true;
    }
}
