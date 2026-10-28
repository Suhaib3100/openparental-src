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
/* loaded from: classes.dex */
public final class h {

    /* compiled from: PackageInfoCompat.java */
    @androidx.annotation.x0(28)
    private static class a {
        private a() {
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        static Signature[] a(@androidx.annotation.o0 SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            return apkContentsSigners;
        }

        @androidx.annotation.u
        static long b(PackageInfo packageInfo) {
            long longVersionCode;
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        static Signature[] c(@androidx.annotation.o0 SigningInfo signingInfo) {
            Signature[] signingCertificateHistory;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }

        @androidx.annotation.u
        static boolean d(@androidx.annotation.o0 SigningInfo signingInfo) {
            boolean hasMultipleSigners;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return hasMultipleSigners;
        }

        @androidx.annotation.u
        static boolean e(@androidx.annotation.o0 PackageManager packageManager, @androidx.annotation.o0 String str, @androidx.annotation.o0 byte[] bArr, int i5) {
            boolean hasSigningCertificate;
            hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i5);
            return hasSigningCertificate;
        }
    }

    private h() {
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
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e6);
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

    public static boolean e(@androidx.annotation.o0 PackageManager packageManager, @androidx.annotation.o0 String str, @androidx.annotation.e1(min = 1) @androidx.annotation.o0 Map<byte[], Integer> map, boolean z5) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a("Cert byte array cannot be null when verifying ", str));
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a("Type must be specified for cert when verifying ", str));
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> d6 = d(packageManager, str);
        if (!z5 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : keySet) {
                if (!a.e(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (d6.size() != 0 && map.size() <= d6.size() && (!z5 || map.size() == d6.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[d6.size()][];
                for (int i5 = 0; i5 < d6.size(); i5++) {
                    bArr[i5] = b(d6.get(i5).toByteArray());
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
                } else if (!d6.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
