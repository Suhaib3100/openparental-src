package com.tencent.beacon.base.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.paging.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.j;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CoreUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Random f71362a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f71363b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private static final SimpleDateFormat f71364c = new SimpleDateFormat(ProtectedSandApp.s("㆕\u0001"), Locale.US);

    public static boolean a(long j4, long j5) {
        SimpleDateFormat simpleDateFormat = f71364c;
        return simpleDateFormat.format(Long.valueOf(j4)).equals(simpleDateFormat.format(Long.valueOf(j5)));
    }

    public static byte[] b(byte[] bArr, int i4, String str) {
        if (bArr == null || bArr.length <= 0 || i4 == -1) {
            return bArr;
        }
        try {
            return com.tencent.beacon.base.net.b.c.a(i4, str, bArr);
        } catch (Throwable th) {
            String s4 = ProtectedSandApp.s("ㆩ\u0001");
            StringBuilder sb = new StringBuilder(s4);
            int length = bArr.length;
            String s5 = ProtectedSandApp.s("ㆤ\u0001");
            String s6 = ProtectedSandApp.s("ㆪ\u0001");
            l.a(sb, length, s5, i4, s6);
            sb.append(str);
            sb.append(ProtectedSandApp.s("ㆰ\u0001"));
            sb.append(th.getMessage());
            c.e(sb.toString(), new Object[0]);
            j e4 = j.e();
            StringBuilder sb2 = new StringBuilder(s4);
            l.a(sb2, bArr.length, s5, i4, s6);
            sb2.append(str);
            e4.a(ProtectedSandApp.s("ㆱ\u0001"), sb2.toString(), th);
            return null;
        }
    }

    public static long c() {
        return new Date().getTime();
    }

    public static long d() {
        return com.tencent.beacon.a.c.c.c().j() + new Date().getTime();
    }

    public static String e() {
        try {
            return new SimpleDateFormat(ProtectedSandApp.s("㆕\u0001"), Locale.US).format(new Date());
        } catch (Throwable th) {
            c.a(th);
            return "";
        }
    }

    public static byte[] a(Object obj) {
        ObjectOutputStream objectOutputStream;
        if (!(obj instanceof Serializable)) {
            c.b(ProtectedSandApp.s("ㆡ\u0001"), new Object[0]);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a(objectOutputStream);
                a(byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th) {
                th = th;
                try {
                    c.a(th);
                    c.b(th.getMessage(), new Object[0]);
                    j.e().a(ProtectedSandApp.s("㆖\u0001"), th.getMessage(), th);
                    a(objectOutputStream);
                    a(byteArrayOutputStream);
                    return null;
                } catch (Throwable th2) {
                    a(objectOutputStream);
                    a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            objectOutputStream = null;
        }
    }

    public static String c(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("ㆳ\u0001")).digest(str.getBytes(Charset.forName(ProtectedSandApp.s("㆜\u0001"))));
            StringBuilder sb = new StringBuilder();
            for (byte b5 : digest) {
                int i4 = b5 & 255;
                if (i4 < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toHexString(i4));
            }
            return sb.toString();
        } catch (Exception e4) {
            c.a(e4);
            return str;
        }
    }

    private static String c(int i4) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < i4; i5++) {
            stringBuffer.append(ProtectedSandApp.s("ㆲ\u0001").charAt(random.nextInt(16)));
        }
        return stringBuffer.toString();
    }

    public static Object a(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object readObject = objectInputStream.readObject();
                a(objectInputStream);
                a(byteArrayInputStream);
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                try {
                    c.a(th);
                    c.b(th.getMessage(), new Object[0]);
                    j.e().a(ProtectedSandApp.s("㆖\u0001"), th.getMessage(), th);
                    a(objectInputStream);
                    a(byteArrayInputStream);
                    return null;
                } catch (Throwable th3) {
                    a(objectInputStream);
                    a(byteArrayInputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = null;
        }
    }

    public static byte[] b(byte[] bArr, int i4) {
        if (bArr == null || i4 == -1) {
            return bArr;
        }
        c.a(ProtectedSandApp.s("ㆭ\u0001"), Integer.valueOf(i4), Integer.valueOf(bArr.length));
        try {
            return com.tencent.beacon.base.net.b.a.a(i4, bArr);
        } catch (Throwable th) {
            j.e().a(ProtectedSandApp.s("ㆥ\u0001"), ProtectedSandApp.s("ㆮ\u0001") + bArr.length + ProtectedSandApp.s("ㆤ\u0001") + i4, th);
            c.a(th);
            c.b(ProtectedSandApp.s("ㆯ\u0001"), th.toString());
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i4, int i5, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return a(b(bArr, i4), i5, str);
        } catch (Throwable th) {
            c.a(th);
            return null;
        }
    }

    public static String b(String str) {
        String c5 = c(str);
        if (c5 == null) {
            return c5;
        }
        try {
            return c5.substring(8, 24);
        } catch (Exception e4) {
            c.a(e4);
            return c5;
        }
    }

    public static String b() {
        String str;
        com.tencent.beacon.a.c.c c5 = com.tencent.beacon.a.c.c.c();
        if (c5 != null) {
            str = c5.e();
        } else {
            str = "";
        }
        String d5 = com.tencent.beacon.a.c.e.l().d();
        int nextInt = f71362a.nextInt(2147473647) + 1000;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String s4 = ProtectedSandApp.s("ㆬ\u0001");
        sb.append(s4);
        sb.append(d5);
        sb.append(s4);
        sb.append(c());
        sb.append(s4);
        sb.append(nextInt);
        return b(sb.toString());
    }

    public static byte[] a(byte[] bArr, int i4, String str) {
        if (bArr == null || i4 == -1) {
            return bArr;
        }
        c.a(ProtectedSandApp.s("ㆧ\u0001"), ProtectedSandApp.s("ㆨ\u0001"), Integer.valueOf(bArr.length), Integer.valueOf(i4));
        try {
            return com.tencent.beacon.base.net.b.c.b(i4, str, bArr);
        } catch (Throwable th) {
            c.a(th);
            j e4 = j.e();
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ㆩ\u0001"));
            l.a(sb, bArr.length, ProtectedSandApp.s("ㆤ\u0001"), i4, ProtectedSandApp.s("ㆪ\u0001"));
            sb.append(str);
            e4.a(ProtectedSandApp.s("ㆫ\u0001"), sb.toString(), th);
            return null;
        }
    }

    public static boolean b(int i4) {
        return f71362a.nextInt(10000) < i4;
    }

    public static byte[] a(byte[] bArr, int i4) {
        if (bArr == null || i4 == -1) {
            return bArr;
        }
        c.a(ProtectedSandApp.s("ㆢ\u0001"), Integer.valueOf(i4), Integer.valueOf(bArr.length));
        try {
            return com.tencent.beacon.base.net.b.a.b(i4, bArr);
        } catch (Throwable th) {
            j.e().a(ProtectedSandApp.s("ㆥ\u0001"), ProtectedSandApp.s("ㆣ\u0001") + bArr.length + ProtectedSandApp.s("ㆤ\u0001") + i4, th);
            c.a(th);
            c.b(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("ㆦ\u0001"))), new Object[0]);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i4, int i5, String str) {
        try {
            return a(b(bArr, i5, str), i4);
        } catch (Exception e4) {
            c.a(e4);
            return null;
        }
    }

    public static ArrayList<String> a(String[] strArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        String s4 = ProtectedSandApp.s("㆜\u0001");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName(s4)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = null;
                }
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getErrorStream(), Charset.forName(s4)));
            while (true) {
                try {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 != null) {
                        arrayList.add(readLine2);
                    } else {
                        a(bufferedReader);
                        a(bufferedReader2);
                        return arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c.a(th);
                        a(bufferedReader);
                        a(bufferedReader2);
                        return null;
                    } catch (Throwable th3) {
                        a(bufferedReader);
                        a(bufferedReader2);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            bufferedReader2 = null;
        }
    }

    public static HashSet<String> a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>(arrayList.size());
        hashSet.addAll(arrayList);
        return hashSet;
    }

    public static int a(String str, int i4, int i5, int i6) {
        int i7;
        if (str == null) {
            return i4;
        }
        try {
            i7 = Integer.parseInt(str);
        } catch (Exception e4) {
            c.a(e4);
            i7 = i4;
        }
        return (i7 < i5 || i7 > i6) ? i4 : i7;
    }

    public static long a(String str, long j4, long j5, long j6) {
        long j7;
        if (str == null) {
            return j4;
        }
        try {
            j7 = Long.parseLong(str);
        } catch (Exception e4) {
            c.a(e4);
            j7 = j4;
        }
        return (j7 < j5 || j7 > j6) ? j4 : j7;
    }

    public static boolean a(String str, boolean z4) {
        if (str == null) {
            return z4;
        }
        if (str.toLowerCase().equals(ProtectedSandApp.s("㆟\u0001"))) {
            return true;
        }
        if (str.toLowerCase().equals(ProtectedSandApp.s("ㆠ\u0001"))) {
            return false;
        }
        return z4;
    }

    public static boolean a(String str) {
        return str.startsWith(ProtectedSandApp.s("㆞\u0001"));
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder sb = new StringBuilder();
        sb.append(th.getMessage());
        String s4 = ProtectedSandApp.s("㆗\u0001");
        sb.append(s4);
        sb.append(stringWriter.getBuffer().toString());
        String sb2 = sb.toString();
        String s5 = ProtectedSandApp.s("㆘\u0001");
        String s6 = ProtectedSandApp.s("㆙\u0001");
        String replace = sb2.replace(s5, s6).replace(s4, s6).replace(ProtectedSandApp.s("㆚\u0001"), ProtectedSandApp.s("㆛\u0001"));
        return replace.length() > 10240 ? replace.substring(0, androidx.work.f.f35970d) : replace;
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e4) {
                    c.a(e4);
                }
            }
        }
    }

    public static boolean a(SharedPreferences.Editor editor) {
        if (editor != null) {
            return true;
        }
        c.b(ProtectedSandApp.s("㆝\u0001"), new Object[0]);
        return false;
    }

    public static String a() {
        return c(16);
    }

    public static boolean a(int i4) {
        if (com.tencent.beacon.a.c.c.c().b() == null) {
            return false;
        }
        String d5 = com.tencent.beacon.a.c.e.l().d();
        return !TextUtils.isEmpty(d5) && ((double) Math.abs(d5.hashCode() % 10000)) < ((double) i4) * 1.0d;
    }
}
