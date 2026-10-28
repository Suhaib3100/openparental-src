package com.flashget.parentalcontrol;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import com.google.common.base.c;
import com.google.common.primitives.u;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.io.encoding.a;

/* loaded from: classes.dex */
public class ProtectedSandApp extends Application {

    /* renamed from: a, reason: collision with root package name */
    private static Object f49132a;

    public ProtectedSandApp() {
        f49132a = this;
    }

    public static native InputStream a(Object obj, String str);

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = {-78, 103, -10, 34, -22, 55, -77, c.f54880z, -47, 51, -71, -7, c.f54880z, 92, -94, 106, -72, -25, 4, 34, 47, -16, 2, 11, -71, 55, 97, 8, -26, 4, -34, 26, 58, -120, -87, 53, 121, -7, -36, 114, 75, -19, -123, -60, -57, -64, -112, -120, -88, -73, 4, -5, -6, -105, 53, -63, 102, -115, -124, 50, 99, 1, -90, -64, 19, 11, c.f54879y, 7, c.F, 65, -103, -74, 115, 110, -99, 40, -9, 110, 92, -114, 19, 1, -1, -74, 73, 13, -40, -52, 0, 121, -67, 92, 10, -45, -107, 101, 121, -32, 73, 106, 101, -98, 59, 60, u.f57540a, 99, -12, -67, 38, -72, 60, 19, -35, -104, 49, Byte.MAX_VALUE, 112, 112, -120, -22, 5, -104, 13, -67, 111, 109, 36, -89, 7, -119, 107, -126, -100, 57, 70, -82, -117, -20, -26, -49, -59, 79, 113, 74, 107, -38, -92, 69, c.F, 106, a.f75126h, 56, 123, -80, -77, c.H, -47, 46, -89, -7, 71, 82, -125, 89, 39, 94, -29, -63, 34, -71, 74, -115, c.B, -62, -44, 86, -120, -119, 96, -118, 123, 70, 36, 73, 17, c.A, -32, -58, -9, 83, -41, -82, -115, 89, 48, -11, 85, 27, c.f54875u, 1, -119, 44, -119, u.f57540a, c.f54879y, -96, 98, 17, 33, a.f75126h, -93, 98, -124, -40, -78, 51, c.f54871q, 2, -33, -96, 17, c.G, -11, 41, 39, 58, -29, 1, 72, -58, 9, 59, -56, -44, 94, -34, -103, 0, 93, -57, 73, 60, 70, -89, -103, 49, 67, -29, 52, -62, 97, -38, -84, 50, Byte.MAX_VALUE, 113};
        byte[] bArr3 = {c.B, -92, 100, -97, -66, 105, 113, c.f54878x, 66, -81, 95, 97, 84, 123, 121, -86, 44, -111, 81, 74, -2, 10, 89, 48, -16, -19, 100, -122, -52, 75, -84, 103, 118, -34, -89, -43, 125, 32, 115, 116, 119, -23, c.A, 8, 55, 94, -104, 105, -92, 98, 10, c.f54878x, c.B, 124, c.f54880z, 51, -96, 118, 37, 55, -27, 103, 48, 108, 26, c.f54872r, -47, -76, 9, 13, 0, 46, 45, 51, -64, -83, -69, 121, 42, -122, -70, -43, -24, -27, -101, -82, 83, 89, -70, -26, -11, -18, -73, -78, -12, 44, 45, c.f54875u, 17, 110, 83, -68, 7, -39, 106, 102, 34, -112, -80, 78, 38, -67, 93, 120, 92, 42, -30, -12, 6, -30, -66, 7, -88, 120, -120, -15, -93, 39, 47, 8, -97, Byte.MIN_VALUE, 49, -8, -62, -100, -103, -51, 73, 4, 37, -71, -25, 86, -10, 126, -26, -16, 90, -22, 98, -91, 35, 98, -57, 116, -106, 121, -7, -12, 14, 125, -110, 47, -24, -42, -92, -116, 114, 72, -38, 97, -55, -45, -7, -73, 124, 124, 3, 9, -26, 51, -105, 6, 111, -65, c.G, -61, 43, 91, 53, -20, 76, 113, -29, -74, 118, 66, -57, -1, 38, 10, -9, -9, 99, -46, -58, -127, c.F, 54, -17, 81, 36, -102, -38, -81, 70, 12, 47, 89, -123, c.I, -22, 54, 51, -124, Byte.MAX_VALUE, -35, Byte.MIN_VALUE, 40, -107, 49, 53, -116, -8, -105, 2, -38, 92, -70, -104, -8, 84, -85, -49, 92, 83, -125, -16, 88, 108, c.f54872r, 53, -60, -78, 57};
        byte[] bArr4 = new byte[32];
        for (int i4 = 0; i4 < 32; i4++) {
            bArr4[i4] = bArr2[bArr3[bArr[i4] & 255] & 255];
        }
        return bArr4;
    }

    private void b() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Signature[] signatureArr = getPackageManager().getPackageInfo(getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            throw new RuntimeException("Signing certificates not found");
        }
        if (signatureArr.length != 1) {
            throw new RuntimeException("Package is signed by multiple signing certificates [" + signatureArr.length + "]");
        }
        String bigInteger = new BigInteger(1, messageDigest.digest(signatureArr[0].toByteArray())).toString(16);
        if (!"54655fcdbf37499d223e7732514aa534a6b4d5b61e91561110b3915a9983968e".equals(bigInteger)) {
            throw new RuntimeException("Certificate mismatch. Expecting sha256[54655fcdbf37499d223e7732514aa534a6b4d5b61e91561110b3915a9983968e], current sha256[" + bigInteger + "]");
        }
    }

    private static native void c();

    public static native String s(String str);

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        b();
        System.loadLibrary("dexprotector");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        c();
    }
}
