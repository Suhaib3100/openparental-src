package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PackageInfoCompat.java */
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: PackageInfoCompat.java */
    @androidx.annotation.x0(28)
    private static class a {
        private a() {
        }

        @androidx.annotation.q0
        static Signature[] a(@androidx.annotation.o0 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static long b(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @androidx.annotation.q0
        static Signature[] c(@androidx.annotation.o0 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static boolean d(@androidx.annotation.o0 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static boolean e(@androidx.annotation.o0 PackageManager packageManager, @androidx.annotation.o0 String str, @androidx.annotation.o0 byte[] bArr, int i4) {
            return packageManager.hasSigningCertificate(str, bArr, i4);
        }
    }

    private c() {
    }

    private static boolean a(@androidx.annotation.o0 byte[][] bArr, @androidx.annotation.o0 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e4);
        }
    }

    public static long c(@androidx.annotation.o0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(packageInfo) : packageInfo.versionCode;
    }

    @androidx.annotation.o0
    public static List<Signature> d(@androidx.annotation.o0 PackageManager packageManager, @androidx.annotation.o0 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArr = a.d(signingInfo) ? a.a(signingInfo) : a.c(signingInfo);
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArr == null ? Collections.emptyList() : Arrays.asList(signatureArr);
    }

    public static boolean e(@androidx.annotation.o0 PackageManager packageManager, @androidx.annotation.o0 String str, @androidx.annotation.e1(min = 1) @androidx.annotation.o0 Map<byte[], Integer> map, boolean z4) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Cert byte array cannot be null when verifying ", str));
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a("Type must be specified for cert when verifying ", str));
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> d5 = d(packageManager, str);
        if (!z4 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : keySet) {
                if (!a.e(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (d5.size() != 0 && map.size() <= d5.size() && (!z4 || map.size() == d5.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[d5.size()][];
                for (int i4 = 0; i4 < d5.size(); i4++) {
                    bArr[i4] = b(d5.get(i4).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!a(bArr, next)) {
                        return false;
                    }
                } else if (!d5.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
