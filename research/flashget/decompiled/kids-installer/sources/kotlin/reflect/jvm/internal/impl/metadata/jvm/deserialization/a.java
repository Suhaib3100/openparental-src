package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.UByte;

/* compiled from: BitEncoding.java */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f25551a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f25552b = false;

    static {
        String str;
        try {
            str = System.getProperty(ProtectedSandApp.s("䶃"));
        } catch (SecurityException unused) {
            str = null;
        }
        f25551a = ProtectedSandApp.s("䶄").equals(str);
    }

    private a() {
    }

    private static /* synthetic */ void a(int i5) {
        String s5 = (i5 == 1 || i5 == 3 || i5 == 6 || i5 == 8 || i5 == 10 || i5 == 12 || i5 == 14) ? ProtectedSandApp.s("䶆") : ProtectedSandApp.s("䶅");
        Object[] objArr = new Object[(i5 == 1 || i5 == 3 || i5 == 6 || i5 == 8 || i5 == 10 || i5 == 12 || i5 == 14) ? 2 : 3];
        String s6 = ProtectedSandApp.s("䶇");
        if (i5 == 1 || i5 == 3 || i5 == 6 || i5 == 8 || i5 == 10 || i5 == 12 || i5 == 14) {
            objArr[0] = s6;
        } else {
            objArr[0] = ProtectedSandApp.s("䶈");
        }
        String s7 = ProtectedSandApp.s("䶉");
        String s8 = ProtectedSandApp.s("䶊");
        String s9 = ProtectedSandApp.s("䶋");
        String s10 = ProtectedSandApp.s("䶌");
        String s11 = ProtectedSandApp.s("䶍");
        String s12 = ProtectedSandApp.s("䶎");
        String s13 = ProtectedSandApp.s("䶏");
        if (i5 == 1) {
            objArr[1] = s13;
        } else if (i5 == 3) {
            objArr[1] = s12;
        } else if (i5 == 6) {
            objArr[1] = s11;
        } else if (i5 == 8) {
            objArr[1] = s10;
        } else if (i5 == 10) {
            objArr[1] = s9;
        } else if (i5 == 12) {
            objArr[1] = s8;
        } else if (i5 != 14) {
            objArr[1] = s6;
        } else {
            objArr[1] = s7;
        }
        switch (i5) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = s12;
                break;
            case 4:
                objArr[2] = ProtectedSandApp.s("䶐");
                break;
            case 5:
                objArr[2] = s11;
                break;
            case 7:
                objArr[2] = s10;
                break;
            case 9:
                objArr[2] = s9;
                break;
            case 11:
                objArr[2] = s8;
                break;
            case 13:
                objArr[2] = s7;
                break;
            default:
                objArr[2] = s13;
                break;
        }
        String format = String.format(s5, objArr);
        if (i5 != 1 && i5 != 3 && i5 != 6 && i5 != 8 && i5 != 10 && i5 != 12 && i5 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    private static void b(@d5.d byte[] bArr, int i5) {
        if (bArr == null) {
            a(4);
        }
        int length = bArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            bArr[i6] = (byte) ((bArr[i6] + i5) & 127);
        }
    }

    @d5.d
    private static byte[] c(@d5.d String[] strArr) {
        if (strArr == null) {
            a(11);
        }
        int i5 = 0;
        for (String str : strArr) {
            i5 += str.length();
        }
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i7 = 0;
            while (i7 < length) {
                bArr[i6] = (byte) str2.charAt(i7);
                i7++;
                i6++;
            }
        }
        return bArr;
    }

    @d5.d
    private static byte[] d(@d5.d byte[] bArr) {
        if (bArr == null) {
            a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = (bArr[i5] & UByte.f27220r) >>> i6;
            i5++;
            int i9 = i6 + 1;
            bArr2[i7] = (byte) (i8 + ((bArr[i5] & ((1 << i9) - 1)) << (7 - i6)));
            if (i6 == 6) {
                i5++;
                i6 = 0;
            } else {
                i6 = i9;
            }
        }
        return bArr2;
    }

    @d5.d
    public static byte[] e(@d5.d String[] strArr) {
        if (strArr == null) {
            a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] a6 = j.a(f(strArr));
                if (a6 == null) {
                    a(8);
                }
                return a6;
            }
            if (charAt == 65535) {
                strArr = f(strArr);
            }
        }
        byte[] c6 = c(strArr);
        b(c6, 127);
        return d(c6);
    }

    @d5.d
    private static String[] f(@d5.d String[] strArr) {
        if (strArr == null) {
            a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
