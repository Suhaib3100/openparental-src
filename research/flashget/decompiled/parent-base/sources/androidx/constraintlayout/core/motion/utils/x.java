package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    static a f22589a;

    /* compiled from: Utils.java */
    public interface a {
        void a(String str);
    }

    private static int a(int i4) {
        int i5 = (i4 & (~(i4 >> 31))) - 255;
        return (i5 & (i5 >> 31)) + 255;
    }

    public static void c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")" + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + " " + str);
        a aVar = f22589a;
        if (aVar != null) {
            aVar.a(str2 + " " + str);
        }
    }

    public static void d(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void e(String str, int i4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i4, stackTrace.length - 1);
        String str2 = " ";
        for (int i5 = 1; i5 <= min; i5++) {
            StackTraceElement stackTraceElement = stackTrace[i5];
            String str3 = ".(" + stackTrace[i5].getFileName() + ":" + stackTrace[i5].getLineNumber() + ") " + stackTrace[i5].getMethodName();
            str2 = androidx.compose.runtime.changelist.j.a(str2, " ");
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static void f(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int g(float f4, float f5, float f6, float f7) {
        int a5 = a((int) (f4 * 255.0f));
        int a6 = a((int) (f5 * 255.0f));
        return (a5 << 16) | (a((int) (f7 * 255.0f)) << 24) | (a6 << 8) | a((int) (f6 * 255.0f));
    }

    public static void h(a aVar) {
        f22589a = aVar;
    }

    public static void i(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public int b(float[] fArr) {
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
