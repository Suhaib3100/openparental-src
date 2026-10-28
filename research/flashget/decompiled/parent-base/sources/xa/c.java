package xa;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ShortBuffer;

/* compiled from: Debug.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f92950a = false;

    public static void a(int i4) {
    }

    public static void b(String str) {
    }

    public static void c(short[] sArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            for (int i6 = 0; i6 < 8; i6++) {
                System.out.printf(ProtectedSandApp.s("㣕\u0001"), Short.valueOf(sArr[i4]));
                i4++;
            }
            System.out.println();
        }
    }

    public static final void d(ShortBuffer shortBuffer) {
        for (int i4 = 0; i4 < 8; i4++) {
            for (int i5 = 0; i5 < 8; i5++) {
                System.out.printf(ProtectedSandApp.s("㣕\u0001"), Short.valueOf(shortBuffer.get()));
            }
            System.out.println();
        }
    }

    public static final void e(int[] iArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            for (int i6 = 0; i6 < 8; i6++) {
                System.out.printf(ProtectedSandApp.s("㣕\u0001"), Integer.valueOf(iArr[i4]));
                i4++;
            }
            System.out.println();
        }
    }

    public static final void f(short[] sArr) {
        int i4 = 0;
        for (int i5 = 0; i5 < 8; i5++) {
            for (int i6 = 0; i6 < 8; i6++) {
                System.out.printf(ProtectedSandApp.s("㣕\u0001"), Short.valueOf(sArr[i4]));
                i4++;
            }
            System.out.println();
        }
    }

    public static void g(String str) {
    }

    public static void h(String str, Object... objArr) {
    }
}
