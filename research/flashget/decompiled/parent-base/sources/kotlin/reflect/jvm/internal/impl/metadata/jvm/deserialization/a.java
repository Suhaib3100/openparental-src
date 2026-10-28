package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;

/* compiled from: BitEncoding.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f77532a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f77533b = false;

    static {
        String str;
        try {
            str = System.getProperty(ProtectedSandApp.s("畃\u0001"));
        } catch (SecurityException unused) {
            str = null;
        }
        f77532a = ProtectedSandApp.s("畄\u0001").equals(str);
    }

    private a() {
    }

    private static /* synthetic */ void a(int i4) {
        String s4 = (i4 == 1 || i4 == 3 || i4 == 6 || i4 == 8 || i4 == 10 || i4 == 12 || i4 == 14) ? ProtectedSandApp.s("畆\u0001") : ProtectedSandApp.s("畅\u0001");
        Object[] objArr = new Object[(i4 == 1 || i4 == 3 || i4 == 6 || i4 == 8 || i4 == 10 || i4 == 12 || i4 == 14) ? 2 : 3];
        String s5 = ProtectedSandApp.s("畇\u0001");
        if (i4 == 1 || i4 == 3 || i4 == 6 || i4 == 8 || i4 == 10 || i4 == 12 || i4 == 14) {
            objArr[0] = s5;
        } else {
            objArr[0] = ProtectedSandApp.s("畈\u0001");
        }
        String s6 = ProtectedSandApp.s("畉\u0001");
        String s7 = ProtectedSandApp.s("畊\u0001");
        String s10 = ProtectedSandApp.s("畋\u0001");
        String s11 = ProtectedSandApp.s("界\u0001");
        String s12 = ProtectedSandApp.s("畍\u0001");
        String s13 = ProtectedSandApp.s("畎\u0001");
        String s14 = ProtectedSandApp.s("畏\u0001");
        if (i4 == 1) {
            objArr[1] = s6;
        } else if (i4 == 3) {
            objArr[1] = s7;
        } else if (i4 == 6) {
            objArr[1] = s10;
        } else if (i4 == 8) {
            objArr[1] = s11;
        } else if (i4 == 10) {
            objArr[1] = s12;
        } else if (i4 == 12) {
            objArr[1] = s13;
        } else if (i4 != 14) {
            objArr[1] = s5;
        } else {
            objArr[1] = s14;
        }
        switch (i4) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = s7;
                break;
            case 4:
                objArr[2] = ProtectedSandApp.s("畐\u0001");
                break;
            case 5:
                objArr[2] = s10;
                break;
            case 7:
                objArr[2] = s11;
                break;
            case 9:
                objArr[2] = s12;
                break;
            case 11:
                objArr[2] = s13;
                break;
            case 13:
                objArr[2] = s14;
                break;
            default:
                objArr[2] = s6;
                break;
        }
        String format = String.format(s4, objArr);
        if (i4 != 1 && i4 != 3 && i4 != 6 && i4 != 8 && i4 != 10 && i4 != 12 && i4 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    private static void b(@l byte[] bArr, int i4) {
        if (bArr == null) {
            a(4);
        }
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            bArr[i5] = (byte) ((bArr[i5] + i4) & 127);
        }
    }

    @l
    private static byte[] c(@l String[] strArr) {
        if (strArr == null) {
            a(11);
        }
        int i4 = 0;
        for (String str : strArr) {
            i4 += str.length();
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i6 = 0;
            while (i6 < length) {
                bArr[i5] = (byte) str2.charAt(i6);
                i6++;
                i5++;
            }
        }
        return bArr;
    }

    @l
    private static byte[] d(@l byte[] bArr) {
        if (bArr == null) {
            a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i4 + 1;
            int i10 = i5 + 1;
            bArr2[i6] = (byte) (((bArr[i4] & 255) >>> i5) + ((bArr[i7] & ((1 << i10) - 1)) << (7 - i5)));
            if (i5 == 6) {
                i4 += 2;
                i5 = 0;
            } else {
                i4 = i7;
                i5 = i10;
            }
        }
        return bArr2;
    }

    @l
    public static byte[] e(@l String[] strArr) {
        if (strArr == null) {
            a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] a5 = j.a(f(strArr));
                if (a5 == null) {
                    a(8);
                }
                return a5;
            }
            if (charAt == 65535) {
                strArr = f(strArr);
            }
        }
        byte[] c5 = c(strArr);
        b(c5, 127);
        return d(c5);
    }

    @l
    private static String[] f(@l String[] strArr) {
        if (strArr == null) {
            a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
