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
import com.flashget.parentalcontrol.ProtectedSandApp;
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

/* compiled from: CommonUtils.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: m, reason: collision with root package name */
    public static final int f58724m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f58725n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f58726o = 4;

    /* renamed from: p, reason: collision with root package name */
    public static final int f58727p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final int f58728q = 16;

    /* renamed from: r, reason: collision with root package name */
    public static final int f58729r = 32;

    /* renamed from: a, reason: collision with root package name */
    private static final String f58712a = ProtectedSandApp.s("ﰵ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f58713b = ProtectedSandApp.s("ﰶ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f58714c = ProtectedSandApp.s("ﰷ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f58715d = ProtectedSandApp.s("ﰸ");

    /* renamed from: e, reason: collision with root package name */
    public static final String f58716e = ProtectedSandApp.s("ﰹ");

    /* renamed from: f, reason: collision with root package name */
    public static final String f58717f = ProtectedSandApp.s("ﰺ");

    /* renamed from: h, reason: collision with root package name */
    static final String f58719h = ProtectedSandApp.s("ﰻ");

    /* renamed from: i, reason: collision with root package name */
    static final String f58720i = ProtectedSandApp.s("ﰼ");

    /* renamed from: j, reason: collision with root package name */
    static final String f58721j = ProtectedSandApp.s("ﰽ");

    /* renamed from: k, reason: collision with root package name */
    static final String f58722k = ProtectedSandApp.s("ﰾ");

    /* renamed from: l, reason: collision with root package name */
    static final String f58723l = ProtectedSandApp.s("ﰿ");

    /* renamed from: g, reason: collision with root package name */
    private static final char[] f58718g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.crashlytics.internal.common.i$a, still in use, count: 1, list:
      (r0v0 com.google.firebase.crashlytics.internal.common.i$a) from 0x00bc: INVOKE 
      (r5v8 java.util.HashMap)
      (wrap:java.lang.String:0x00b8: INVOKE ("ﰨ") STATIC call: com.flashget.parentalcontrol.ProtectedSandApp.s(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (m), WRAPPED] (LINE:131))
      (r0v0 com.google.firebase.crashlytics.internal.common.i$a)
     INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: CommonUtils.java */
    static final class a {
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
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put(ProtectedSandApp.s("ﰥ"), new a());
            hashMap.put(ProtectedSandApp.s("ﰦ"), new a());
            hashMap.put(ProtectedSandApp.s("ﰧ"), new a());
            hashMap.put(ProtectedSandApp.s("ﰨ"), new a());
        }

        private a() {
        }

        static a getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﰩ"));
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static boolean A(@androidx.annotation.q0 String str, @androidx.annotation.q0 String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String B(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ﱁ"));
        }
        return String.format(Locale.US, ProtectedSandApp.s("ﱀ"), Integer.valueOf(i4)).replace(' ', '0');
    }

    public static String C(String str) {
        return s(str, ProtectedSandApp.s("ﰵ"));
    }

    public static String D(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter(ProtectedSandApp.s("ﱂ"));
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ProtectedSandApp.s("ﱃ"))).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j4;
        synchronized (i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(ProtectedSandApp.s("ﱃ"))).getMemoryInfo(memoryInfo);
            j4 = memoryInfo.totalMem;
        }
        return j4;
    }

    public static long c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(Context context) {
        if (!e(context, ProtectedSandApp.s("ﱄ"))) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(ProtectedSandApp.s("ﱅ"))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e4) {
                com.google.firebase.crashlytics.internal.g.f().e(str, e4);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
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
                arrayList.add(str.replace(ProtectedSandApp.s("ﱆ"), "").toLowerCase(Locale.US));
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
            return s(sb2, ProtectedSandApp.s("ﰵ"));
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z4) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int q4 = q(context, str, ProtectedSandApp.s("ﱇ"));
            if (q4 > 0) {
                return resources.getBoolean(q4);
            }
            int q5 = q(context, str, ProtectedSandApp.s("ﱈ"));
            if (q5 > 0) {
                return Boolean.parseBoolean(context.getString(q5));
            }
        }
        return z4;
    }

    public static List<f> j(Context context) {
        ArrayList arrayList = new ArrayList();
        String s4 = ProtectedSandApp.s("ﰽ");
        String s5 = ProtectedSandApp.s("ﱉ");
        int q4 = q(context, s4, s5);
        int q5 = q(context, ProtectedSandApp.s("ﰾ"), s5);
        int q6 = q(context, ProtectedSandApp.s("ﰿ"), s5);
        if (q4 == 0 || q5 == 0 || q6 == 0) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ﱋ"), Integer.valueOf(q4), Integer.valueOf(q5), Integer.valueOf(q6)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(q4);
        String[] stringArray2 = context.getResources().getStringArray(q5);
        String[] stringArray3 = context.getResources().getStringArray(q6);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            com.google.firebase.crashlytics.internal.g.f().b(String.format(ProtectedSandApp.s("ﱊ"), Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i4 = 0; i4 < stringArray3.length; i4++) {
            arrayList.add(new f(stringArray[i4], stringArray2[i4], stringArray3[i4]));
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
        boolean x4 = x();
        ?? r02 = x4;
        if (z()) {
            r02 = (x4 ? 1 : 0) | 2;
        }
        return w() ? r02 | 4 : r02;
    }

    public static SharedPreferences m(Context context) {
        return context.getSharedPreferences(ProtectedSandApp.s("ﰺ"), 0);
    }

    public static String n(Context context) {
        String s4 = ProtectedSandApp.s("ﰻ");
        String s5 = ProtectedSandApp.s("ﱈ");
        int q4 = q(context, s4, s5);
        if (q4 == 0) {
            q4 = q(context, ProtectedSandApp.s("ﰼ"), s5);
        }
        if (q4 != 0) {
            return context.getResources().getString(q4);
        }
        return null;
    }

    public static boolean o(Context context) {
        return (x() || ((SensorManager) context.getSystemService(ProtectedSandApp.s("ﱌ"))).getDefaultSensor(8) == null) ? false : true;
    }

    public static String p(Context context) {
        int i4 = context.getApplicationContext().getApplicationInfo().icon;
        if (i4 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i4);
            return ProtectedSandApp.s("ﱍ").equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences(ProtectedSandApp.s("ﰹ"), 0);
    }

    private static String s(String str, String str2) {
        return t(str.getBytes(), str2);
    }

    private static String t(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return u(messageDigest.digest());
        } catch (NoSuchAlgorithmException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﱎ") + str + ProtectedSandApp.s("ﱏ"), e4);
            return "";
        }
    }

    public static String u(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b5 = bArr[i4];
            int i5 = i4 * 2;
            char[] cArr2 = f58718g;
            cArr[i5] = cArr2[(b5 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b5 & com.google.common.base.c.f54871q];
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
        if (!Build.PRODUCT.contains(ProtectedSandApp.s("ﰸ"))) {
            String str = Build.HARDWARE;
            if (!str.contains(ProtectedSandApp.s("ﰶ")) && !str.contains(ProtectedSandApp.s("ﰷ"))) {
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
        boolean x4 = x();
        String str = Build.TAGS;
        if ((x4 || str == null || !str.contains(ProtectedSandApp.s("ﱐ"))) && !com.cby.shareboard.utils.a.a(ProtectedSandApp.s("ﱑ"))) {
            return !x4 && new File(ProtectedSandApp.s("ﱒ")).exists();
        }
        return true;
    }
}
