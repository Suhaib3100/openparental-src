package org.threeten.bp.chrono;

import androidx.collection.r2;
import androidx.compose.material3.j4;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* compiled from: HijrahDate.java */
/* loaded from: classes9.dex */
public final class m extends b<m> implements Serializable {
    private static final String B;
    private static final HashMap<Integer, Integer[]> C;
    private static final HashMap<Integer, Integer[]> D;
    private static final HashMap<Integer, Integer[]> E;
    private static final Long[] F;
    private static final Integer[] G;
    private static final Integer[] H;
    private static final Integer[] I;
    private static final Integer[] J;
    private static final Integer[] K;
    private static final Integer[] L;
    private static final Integer[] M;
    private static final Integer[] N;
    private static final int O = 334;
    private static final int P = -492148;

    /* renamed from: l, reason: collision with root package name */
    private static final long f87987l = -5207853542612002020L;

    /* renamed from: m, reason: collision with root package name */
    public static final int f87988m = 1;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f87990o;

    /* renamed from: v, reason: collision with root package name */
    private static final int f87997v = 5;

    /* renamed from: w, reason: collision with root package name */
    private static final int f87998w = 6;

    /* renamed from: y, reason: collision with root package name */
    private static final char f88000y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f88001z;

    /* renamed from: d, reason: collision with root package name */
    private final transient n f88002d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f88003e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f88004f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f88005g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f88006h;

    /* renamed from: i, reason: collision with root package name */
    private final transient org.threeten.bp.d f88007i;

    /* renamed from: j, reason: collision with root package name */
    private final long f88008j;

    /* renamed from: k, reason: collision with root package name */
    private final transient boolean f88009k;
    private static final String A = "hijrah_deviation.cfg";

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f87991p = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f87992q = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f87993r = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f87994s = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int f87989n = 9999;

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f87995t = {1, f87989n, 11, 51, 5, 29, 354};

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f87996u = {1, f87989n, 11, 52, 6, 30, 355};

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f87999x = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* compiled from: HijrahDate.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88010a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f88010a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f88010a[org.threeten.bp.temporal.a.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int i4 = 0;
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        f87990o = iArr;
        char c5 = File.separatorChar;
        f88000y = c5;
        f88001z = File.pathSeparator;
        B = "org" + c5 + "threeten" + c5 + "bp" + c5 + "chrono";
        C = new HashMap<>();
        D = new HashMap<>();
        E = new HashMap<>();
        J = new Integer[iArr.length];
        int i5 = 0;
        while (true) {
            int[] iArr2 = f87990o;
            if (i5 >= iArr2.length) {
                break;
            }
            J[i5] = Integer.valueOf(iArr2[i5]);
            i5++;
        }
        K = new Integer[f87991p.length];
        int i6 = 0;
        while (true) {
            int[] iArr3 = f87991p;
            if (i6 >= iArr3.length) {
                break;
            }
            K[i6] = Integer.valueOf(iArr3[i6]);
            i6++;
        }
        L = new Integer[f87992q.length];
        int i7 = 0;
        while (true) {
            int[] iArr4 = f87992q;
            if (i7 >= iArr4.length) {
                break;
            }
            L[i7] = Integer.valueOf(iArr4[i7]);
            i7++;
        }
        M = new Integer[f87993r.length];
        int i10 = 0;
        while (true) {
            int[] iArr5 = f87993r;
            if (i10 >= iArr5.length) {
                break;
            }
            M[i10] = Integer.valueOf(iArr5[i10]);
            i10++;
        }
        N = new Integer[f87999x.length];
        int i11 = 0;
        while (true) {
            int[] iArr6 = f87999x;
            if (i11 >= iArr6.length) {
                break;
            }
            N[i11] = Integer.valueOf(iArr6[i11]);
            i11++;
        }
        F = new Long[O];
        int i12 = 0;
        while (true) {
            Long[] lArr = F;
            if (i12 >= lArr.length) {
                break;
            }
            lArr[i12] = Long.valueOf(i12 * 10631);
            i12++;
        }
        G = new Integer[f87994s.length];
        int i13 = 0;
        while (true) {
            int[] iArr7 = f87994s;
            if (i13 >= iArr7.length) {
                break;
            }
            G[i13] = Integer.valueOf(iArr7[i13]);
            i13++;
        }
        H = new Integer[f87995t.length];
        int i14 = 0;
        while (true) {
            int[] iArr8 = f87995t;
            if (i14 >= iArr8.length) {
                break;
            }
            H[i14] = Integer.valueOf(iArr8[i14]);
            i14++;
        }
        I = new Integer[f87996u.length];
        while (true) {
            int[] iArr9 = f87996u;
            if (i4 >= iArr9.length) {
                try {
                    W0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                I[i4] = Integer.valueOf(iArr9[i4]);
                i4++;
            }
        }
    }

    private m(long j4) {
        int[] t02 = t0(j4);
        c0(t02[1]);
        b0(t02[2]);
        Z(t02[3]);
        a0(t02[4]);
        this.f88002d = n.of(t02[0]);
        int i4 = t02[1];
        this.f88003e = i4;
        this.f88004f = t02[2];
        this.f88005g = t02[3];
        this.f88006h = t02[4];
        this.f88007i = org.threeten.bp.d.of(t02[5]);
        this.f88008j = j4;
        this.f88009k = D0(i4);
    }

    static int A0() {
        return H[6].intValue();
    }

    private static int B0(int i4, long j4) {
        Integer[] e02 = e0(i4);
        int i5 = 0;
        if (j4 == 0) {
            return 0;
        }
        if (j4 > 0) {
            while (i5 < e02.length) {
                if (j4 < e02[i5].intValue()) {
                    return i5 - 1;
                }
                i5++;
            }
            return 29;
        }
        long j5 = -j4;
        while (i5 < e02.length) {
            if (j5 <= e02[i5].intValue()) {
                return i5 - 1;
            }
            i5++;
        }
        return 29;
    }

    static int C0(int i4) {
        Integer[] numArr;
        int i5 = i4 - 1;
        int i6 = i5 / 30;
        try {
            numArr = E.get(Integer.valueOf(i6));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return D0((long) i4) ? 355 : 354;
        }
        int i7 = i5 % 30;
        if (i7 != 29) {
            return numArr[i7 + 1].intValue() - numArr[i7].intValue();
        }
        Long[] lArr = F;
        return (lArr[i6 + 1].intValue() - lArr[i6].intValue()) - numArr[i7].intValue();
    }

    static boolean D0(long j4) {
        if (j4 <= 0) {
            j4 = -j4;
        }
        return ((j4 * 11) + 14) % 30 < 11;
    }

    public static m G0() {
        return l.f87981f.g(org.threeten.bp.a.g());
    }

    public static m H0(org.threeten.bp.a aVar) {
        return l.f87981f.g(aVar);
    }

    public static m I0(org.threeten.bp.r rVar) {
        return l.f87981f.g(org.threeten.bp.a.f(rVar));
    }

    public static m J0(int i4, int i5, int i6) {
        return i4 >= 1 ? N0(n.AH, i4, i5, i6) : N0(n.BEFORE_AH, 1 - i4, i5, i6);
    }

    static m L0(org.threeten.bp.g gVar) {
        return new m(gVar.E());
    }

    static m N0(n nVar, int i4, int i5, int i6) {
        ng.d.j(nVar, "era");
        c0(i4);
        b0(i5);
        Z(i6);
        return new m(s0(nVar.prolepticYear(i4), i5, i6));
    }

    static m P0(long j4) {
        return new m(j4);
    }

    private static void Q0(String str, int i4) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf == -1) {
                throw new ParseException(r2.a("Offset has incorrect format at line ", i4, "."), i4);
            }
            try {
                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                int indexOf2 = nextToken.indexOf(45);
                if (indexOf2 == -1) {
                    throw new ParseException(r2.a("Start and end year/month has incorrect format at line ", i4, "."), i4);
                }
                String substring = nextToken.substring(0, indexOf2);
                String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                int indexOf3 = substring.indexOf(47);
                int indexOf4 = substring2.indexOf(47);
                if (indexOf3 == -1) {
                    throw new ParseException(r2.a("Start year/month has incorrect format at line ", i4, "."), i4);
                }
                String substring3 = substring.substring(0, indexOf3);
                String substring4 = substring.substring(indexOf3 + 1, substring.length());
                try {
                    int parseInt2 = Integer.parseInt(substring3);
                    try {
                        int parseInt3 = Integer.parseInt(substring4);
                        if (indexOf4 == -1) {
                            throw new ParseException(r2.a("End year/month has incorrect format at line ", i4, "."), i4);
                        }
                        String substring5 = substring2.substring(0, indexOf4);
                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                        try {
                            int parseInt4 = Integer.parseInt(substring5);
                            try {
                                int parseInt5 = Integer.parseInt(substring6);
                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                    throw new ParseException(r2.a("Unknown error at line ", i4, "."), i4);
                                }
                                Y(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                            } catch (NumberFormatException unused) {
                                throw new ParseException(r2.a("End month is not properly set at line ", i4, "."), i4);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException(r2.a("End year is not properly set at line ", i4, "."), i4);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException(r2.a("Start month is not properly set at line ", i4, "."), i4);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException(r2.a("Start year is not properly set at line ", i4, "."), i4);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException(r2.a("Offset is not properly set at line ", i4, "."), i4);
            }
        }
    }

    private static void W0() throws IOException, ParseException {
        InputStream i02 = i0();
        if (i02 == null) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(i02));
            int i4 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i4++;
                        Q0(readLine.trim(), i4);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static c X0(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        byte readByte = dataInput.readByte();
        byte readByte2 = dataInput.readByte();
        l.f87981f.getClass();
        return J0(readInt, readByte, readByte2);
    }

    private static void Y(int i4, int i5, int i6, int i7, int i10) {
        if (i4 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        }
        if (i6 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        }
        if (i5 < 0 || i5 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        }
        if (i7 < 0 || i7 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        }
        if (i6 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        }
        if (i6 < i4) {
            throw new IllegalArgumentException("startYear > endYear");
        }
        if (i6 == i4 && i7 < i5) {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
        boolean D0 = D0(i4);
        Integer[] numArr = C.get(Integer.valueOf(i4));
        if (numArr == null) {
            if (!D0) {
                numArr = new Integer[f87990o.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = f87990o;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    numArr[i11] = Integer.valueOf(iArr[i11]);
                    i11++;
                }
            } else {
                numArr = new Integer[f87991p.length];
                int i12 = 0;
                while (true) {
                    int[] iArr2 = f87991p;
                    if (i12 >= iArr2.length) {
                        break;
                    }
                    numArr[i12] = Integer.valueOf(iArr2[i12]);
                    i12++;
                }
            }
        }
        Integer[] numArr2 = new Integer[numArr.length];
        for (int i13 = 0; i13 < 12; i13++) {
            if (i13 > i5) {
                numArr2[i13] = Integer.valueOf(numArr[i13].intValue() - i10);
            } else {
                Integer num = numArr[i13];
                num.intValue();
                numArr2[i13] = num;
            }
        }
        C.put(Integer.valueOf(i4), numArr2);
        Integer[] numArr3 = D.get(Integer.valueOf(i4));
        if (numArr3 == null) {
            if (!D0) {
                numArr3 = new Integer[f87992q.length];
                int i14 = 0;
                while (true) {
                    int[] iArr3 = f87992q;
                    if (i14 >= iArr3.length) {
                        break;
                    }
                    numArr3[i14] = Integer.valueOf(iArr3[i14]);
                    i14++;
                }
            } else {
                numArr3 = new Integer[f87993r.length];
                int i15 = 0;
                while (true) {
                    int[] iArr4 = f87993r;
                    if (i15 >= iArr4.length) {
                        break;
                    }
                    numArr3[i15] = Integer.valueOf(iArr4[i15]);
                    i15++;
                }
            }
        }
        Integer[] numArr4 = new Integer[numArr3.length];
        for (int i16 = 0; i16 < 12; i16++) {
            if (i16 == i5) {
                numArr4[i16] = Integer.valueOf(numArr3[i16].intValue() - i10);
            } else {
                Integer num2 = numArr3[i16];
                num2.intValue();
                numArr4[i16] = num2;
            }
        }
        D.put(Integer.valueOf(i4), numArr4);
        if (i4 != i6) {
            int i17 = i4 - 1;
            int i18 = i17 / 30;
            int i19 = i17 % 30;
            Integer[] numArr5 = E.get(Integer.valueOf(i18));
            if (numArr5 == null) {
                int length = f87999x.length;
                Integer[] numArr6 = new Integer[length];
                for (int i20 = 0; i20 < length; i20++) {
                    numArr6[i20] = Integer.valueOf(f87999x[i20]);
                }
                numArr5 = numArr6;
            }
            for (int i21 = i19 + 1; i21 < f87999x.length; i21++) {
                numArr5[i21] = Integer.valueOf(numArr5[i21].intValue() - i10);
            }
            E.put(Integer.valueOf(i18), numArr5);
            int i22 = i6 - 1;
            int i23 = i22 / 30;
            if (i18 != i23) {
                int i24 = i18 + 1;
                while (true) {
                    Long[] lArr = F;
                    if (i24 >= lArr.length) {
                        break;
                    }
                    lArr[i24] = Long.valueOf(lArr[i24].longValue() - i10);
                    i24++;
                }
                int i25 = i23 + 1;
                while (true) {
                    Long[] lArr2 = F;
                    if (i25 >= lArr2.length) {
                        break;
                    }
                    lArr2[i25] = Long.valueOf(lArr2[i25].longValue() + i10);
                    i25++;
                    i23 = i23;
                }
            }
            int i26 = i23;
            int i27 = i22 % 30;
            Integer[] numArr7 = E.get(Integer.valueOf(i26));
            if (numArr7 == null) {
                int length2 = f87999x.length;
                Integer[] numArr8 = new Integer[length2];
                for (int i28 = 0; i28 < length2; i28++) {
                    numArr8[i28] = Integer.valueOf(f87999x[i28]);
                }
                numArr7 = numArr8;
            }
            for (int i29 = i27 + 1; i29 < f87999x.length; i29++) {
                numArr7[i29] = Integer.valueOf(numArr7[i29].intValue() + i10);
            }
            E.put(Integer.valueOf(i26), numArr7);
        }
        boolean D02 = D0(i6);
        Integer[] numArr9 = C.get(Integer.valueOf(i6));
        if (numArr9 == null) {
            if (!D02) {
                numArr9 = new Integer[f87990o.length];
                int i30 = 0;
                while (true) {
                    int[] iArr5 = f87990o;
                    if (i30 >= iArr5.length) {
                        break;
                    }
                    numArr9[i30] = Integer.valueOf(iArr5[i30]);
                    i30++;
                }
            } else {
                numArr9 = new Integer[f87991p.length];
                int i31 = 0;
                while (true) {
                    int[] iArr6 = f87991p;
                    if (i31 >= iArr6.length) {
                        break;
                    }
                    numArr9[i31] = Integer.valueOf(iArr6[i31]);
                    i31++;
                }
            }
        }
        Integer[] numArr10 = new Integer[numArr9.length];
        for (int i32 = 0; i32 < 12; i32++) {
            if (i32 > i7) {
                numArr10[i32] = Integer.valueOf(numArr9[i32].intValue() + i10);
            } else {
                Integer num3 = numArr9[i32];
                num3.intValue();
                numArr10[i32] = num3;
            }
        }
        C.put(Integer.valueOf(i6), numArr10);
        Integer[] numArr11 = D.get(Integer.valueOf(i6));
        if (numArr11 == null) {
            if (!D02) {
                numArr11 = new Integer[f87992q.length];
                int i33 = 0;
                while (true) {
                    int[] iArr7 = f87992q;
                    if (i33 >= iArr7.length) {
                        break;
                    }
                    numArr11[i33] = Integer.valueOf(iArr7[i33]);
                    i33++;
                }
            } else {
                numArr11 = new Integer[f87993r.length];
                int i34 = 0;
                while (true) {
                    int[] iArr8 = f87993r;
                    if (i34 >= iArr8.length) {
                        break;
                    }
                    numArr11[i34] = Integer.valueOf(iArr8[i34]);
                    i34++;
                }
            }
        }
        Integer[] numArr12 = new Integer[numArr11.length];
        for (int i35 = 0; i35 < 12; i35++) {
            if (i35 == i7) {
                numArr12[i35] = Integer.valueOf(numArr11[i35].intValue() + i10);
            } else {
                Integer num4 = numArr11[i35];
                num4.intValue();
                numArr12[i35] = num4;
            }
        }
        HashMap<Integer, Integer[]> hashMap = D;
        hashMap.put(Integer.valueOf(i6), numArr12);
        Integer[] numArr13 = hashMap.get(Integer.valueOf(i4));
        Integer[] numArr14 = hashMap.get(Integer.valueOf(i6));
        HashMap<Integer, Integer[]> hashMap2 = C;
        Integer[] numArr15 = hashMap2.get(Integer.valueOf(i4));
        Integer[] numArr16 = hashMap2.get(Integer.valueOf(i6));
        int intValue = numArr13[i5].intValue();
        int intValue2 = numArr14[i7].intValue();
        int intValue3 = numArr13[11].intValue() + numArr15[11].intValue();
        int intValue4 = numArr14[11].intValue() + numArr16[11].intValue();
        Integer[] numArr17 = I;
        int intValue5 = numArr17[5].intValue();
        Integer[] numArr18 = H;
        int intValue6 = numArr18[5].intValue();
        if (intValue5 < intValue) {
            intValue5 = intValue;
        }
        if (intValue5 < intValue2) {
            intValue5 = intValue2;
        }
        numArr17[5] = Integer.valueOf(intValue5);
        if (intValue6 <= intValue) {
            intValue = intValue6;
        }
        if (intValue <= intValue2) {
            intValue2 = intValue;
        }
        numArr18[5] = Integer.valueOf(intValue2);
        int intValue7 = numArr17[6].intValue();
        int intValue8 = numArr18[6].intValue();
        if (intValue7 < intValue3) {
            intValue7 = intValue3;
        }
        if (intValue7 < intValue4) {
            intValue7 = intValue4;
        }
        numArr17[6] = Integer.valueOf(intValue7);
        if (intValue8 <= intValue3) {
            intValue3 = intValue8;
        }
        if (intValue3 <= intValue4) {
            intValue4 = intValue3;
        }
        numArr18[6] = Integer.valueOf(intValue4);
    }

    private static m Y0(int i4, int i5, int i6) {
        int w02 = w0(i5 - 1, i4);
        if (i6 > w02) {
            i6 = w02;
        }
        return J0(i4, i5, i6);
    }

    private static void Z(int i4) {
        if (i4 < 1 || i4 > u0()) {
            throw new DateTimeException(android.support.v4.media.b.a(androidx.collection.s.a("Invalid day of month of Hijrah date, day ", i4, " greater than "), u0(), " or less than 1"));
        }
    }

    private static void a0(int i4) {
        if (i4 < 1 || i4 > v0()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    private static void b0(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    private static void c0(int i4) {
        if (i4 < 1 || i4 > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    private static long c1(int i4) {
        Long l4;
        int i5 = i4 - 1;
        int i6 = i5 / 30;
        int i7 = i5 % 30;
        int intValue = e0(i6)[Math.abs(i7)].intValue();
        if (i7 < 0) {
            intValue = -intValue;
        }
        try {
            l4 = F[i6];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l4 = null;
        }
        if (l4 == null) {
            l4 = Long.valueOf(i6 * 10631);
        }
        return (l4.longValue() + intValue) - 492149;
    }

    public static m d0(org.threeten.bp.temporal.f fVar) {
        return l.f87981f.d(fVar);
    }

    private static Integer[] e0(int i4) {
        Integer[] numArr;
        try {
            numArr = E.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? N : numArr;
    }

    private static Integer[] f0(int i4) {
        Integer[] numArr;
        try {
            numArr = C.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? D0((long) i4) ? K : J : numArr;
    }

    private static Integer[] g0(int i4) {
        Integer[] numArr;
        try {
            numArr = D.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? D0((long) i4) ? M : L : numArr;
    }

    private static InputStream i0() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                StringBuilder a5 = j4.a(property2);
                a5.append(System.getProperty("file.separator"));
                property2 = a5.toString();
            }
            StringBuilder a6 = j4.a(property2);
            a6.append(f88000y);
            a6.append(property);
            File file = new File(a6.toString());
            if (file.exists()) {
                return new FileInputStream(file);
            }
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f88001z);
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            File file2 = new File(nextToken);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    StringBuilder a7 = j4.a(nextToken);
                    char c5 = f88000y;
                    a7.append(c5);
                    String str = B;
                    a7.append(str);
                    if (new File(a7.toString(), property).exists()) {
                        return new FileInputStream(nextToken + c5 + str + c5 + property);
                    }
                } else {
                    try {
                        zipFile = new ZipFile(file2);
                    } catch (IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(B);
                        char c6 = f88000y;
                        sb.append(c6);
                        sb.append(property);
                        String sb2 = sb.toString();
                        ZipEntry entry = zipFile.getEntry(sb2);
                        if (entry == null) {
                            if (c6 == '/') {
                                sb2 = sb2.replace('/', '\\');
                            } else if (c6 == '\\') {
                                sb2 = sb2.replace('\\', '/');
                            }
                            entry = zipFile.getEntry(sb2);
                        }
                        if (entry != null) {
                            return zipFile.getInputStream(entry);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private static int k0(long j4) {
        Long[] lArr = F;
        for (int i4 = 0; i4 < lArr.length; i4++) {
            try {
                if (j4 < lArr[i4].longValue()) {
                    return i4 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j4) / 10631;
            }
        }
        return ((int) j4) / 10631;
    }

    private static int l0(long j4, int i4) {
        Long l4;
        try {
            l4 = F[i4];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l4 = null;
        }
        if (l4 == null) {
            l4 = Long.valueOf(i4 * 10631);
        }
        return (int) (j4 - l4.longValue());
    }

    private static int m0(int i4, int i5, int i6) {
        int intValue;
        Integer[] f02 = f0(i6);
        if (i4 < 0) {
            i4 = D0((long) i6) ? i4 + 355 : i4 + 354;
            if (i5 <= 0) {
                return i4;
            }
            intValue = f02[i5].intValue();
        } else {
            if (i5 <= 0) {
                return i4;
            }
            intValue = f02[i5].intValue();
        }
        return i4 - intValue;
    }

    private static int o0(int i4, int i5, int i6) {
        Integer[] e02 = e0(i4);
        return i5 > 0 ? i5 - e02[i6].intValue() : e02[i6].intValue() + i5;
    }

    private Object readResolve() {
        return new m(this.f88008j);
    }

    private static long s0(int i4, int i5, int i6) {
        return c1(i4) + w0(i5 - 1, i4) + i6;
    }

    private static int[] t0(long j4) {
        int i4;
        int i5;
        int y02;
        int m02;
        int value;
        long j5 = j4 - (-492148);
        if (j5 >= 0) {
            int k02 = k0(j5);
            int l02 = l0(j5, k02);
            int B0 = B0(k02, l02);
            i5 = o0(k02, l02, B0);
            i4 = (k02 * 30) + B0 + 1;
            y02 = y0(i5, i4);
            m02 = m0(i5, y02, i4) + 1;
            value = n.AH.getValue();
        } else {
            int i6 = (int) j5;
            int i7 = i6 / 10631;
            int i10 = i6 % 10631;
            if (i10 == 0) {
                i7++;
                i10 = -10631;
            }
            int B02 = B0(i7, i10);
            int o02 = o0(i7, i10, B02);
            i4 = 1 - ((i7 * 30) - B02);
            i5 = D0((long) i4) ? o02 + 355 : o02 + 354;
            y02 = y0(i5, i4);
            m02 = m0(i5, y02, i4) + 1;
            value = n.BEFORE_AH.getValue();
        }
        int i11 = (int) ((j4 - (-492153)) % 7);
        return new int[]{value, i4, y02 + 1, m02, i5 + 1, i11 + (i11 <= 0 ? 7 : 0)};
    }

    static int u0() {
        return I[5].intValue();
    }

    static int v0() {
        return I[6].intValue();
    }

    private static int w0(int i4, int i5) {
        return f0(i5)[i4].intValue();
    }

    private Object writeReplace() {
        return new w((byte) 3, this);
    }

    static int x0(int i4, int i5) {
        return g0(i5)[i4].intValue();
    }

    private static int y0(int i4, int i5) {
        Integer[] f02 = f0(i5);
        int i6 = 0;
        if (i4 >= 0) {
            while (i6 < f02.length) {
                if (i4 < f02[i6].intValue()) {
                    return i6 - 1;
                }
                i6++;
            }
            return 11;
        }
        int i7 = D0((long) i5) ? i4 + 355 : i4 + 354;
        while (i6 < f02.length) {
            if (i7 < f02[i6].intValue()) {
                return i6 - 1;
            }
            i6++;
        }
        return 11;
    }

    static int z0() {
        return H[5].intValue();
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    /* renamed from: A */
    public c v(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.v(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: B */
    public c g(org.threeten.bp.temporal.i iVar) {
        return (m) super.g(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public long E() {
        return s0(this.f88003e, this.f88004f, this.f88005g);
    }

    public m E0(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.t(j4, mVar);
    }

    public m F0(org.threeten.bp.temporal.i iVar) {
        return (m) super.c(iVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public /* bridge */ /* synthetic */ f G(c cVar) {
        return super.G(cVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: J */
    public c i(org.threeten.bp.temporal.g gVar) {
        return (m) super.i(gVar);
    }

    public m R0(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.v(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: S */
    public b<m> v(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.v(j4, mVar);
    }

    public m S0(org.threeten.bp.temporal.i iVar) {
        return (m) super.g(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public m T(long j4) {
        return new m(this.f88008j + j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public m U(long j4) {
        if (j4 == 0) {
            return this;
        }
        int i4 = (this.f88004f - 1) + ((int) j4);
        int i5 = i4 / 12;
        int i6 = i4 % 12;
        while (i6 < 0) {
            i6 += 12;
            i5 = ng.d.p(i5, 1);
        }
        return N0(this.f88002d, ng.d.k(this.f88003e, i5), i6 + 1, this.f88005g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public m W(long j4) {
        if (j4 == 0) {
            return this;
        }
        return N0(this.f88002d, ng.d.k(this.f88003e, (int) j4), this.f88004f, this.f88005g);
    }

    public m Z0(org.threeten.bp.temporal.g gVar) {
        return (m) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public m b(org.threeten.bp.temporal.j jVar, long j4) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (m) jVar.adjustInto(this, j4);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.checkValidValue(j4);
        int i4 = (int) j4;
        switch (a.f88010a[aVar.ordinal()]) {
            case 1:
                return Y0(this.f88003e, this.f88004f, i4);
            case 2:
                int i5 = i4 - 1;
                return Y0(this.f88003e, (i5 / 30) + 1, (i5 % 30) + 1);
            case 3:
                return T((j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f88003e < 1) {
                    i4 = 1 - i4;
                }
                return Y0(i4, this.f88004f, this.f88005g);
            case 5:
                return T(j4 - this.f88007i.getValue());
            case 6:
                return T(j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return T(j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new m(i4);
            case 9:
                return T((j4 - getLong(org.threeten.bp.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return Y0(this.f88003e, i4, this.f88005g);
            case 11:
                return Y0(i4, this.f88004f, this.f88005g);
            case 12:
                return Y0(1 - this.f88003e, this.f88004f, this.f88005g);
            default:
                throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
    }

    void b1(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(org.threeten.bp.temporal.a.YEAR));
        dataOutput.writeByte(get(org.threeten.bp.temporal.a.MONTH_OF_YEAR));
        dataOutput.writeByte(get(org.threeten.bp.temporal.a.DAY_OF_MONTH));
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.i iVar) {
        return (m) super.c(iVar);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    /* renamed from: e */
    public org.threeten.bp.temporal.e t(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.t(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.e
    public /* bridge */ /* synthetic */ long f(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        return super.f(eVar, mVar);
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e g(org.threeten.bp.temporal.i iVar) {
        return (m) super.g(iVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long getLong(org.threeten.bp.temporal.j jVar) {
        int i4;
        int i5;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.getFrom(this);
        }
        switch (a.f88010a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                i4 = this.f88005g;
                return i4;
            case 2:
                i4 = this.f88006h;
                return i4;
            case 3:
                i4 = androidx.appcompat.widget.a.a(this.f88005g, 1, 7, 1);
                return i4;
            case 4:
                i4 = this.f88003e;
                return i4;
            case 5:
                i4 = this.f88007i.getValue();
                return i4;
            case 6:
                i5 = (this.f88005g - 1) % 7;
                i4 = i5 + 1;
                return i4;
            case 7:
                i5 = (this.f88006h - 1) % 7;
                i4 = i5 + 1;
                return i4;
            case 8:
                return E();
            case 9:
                i4 = androidx.appcompat.widget.a.a(this.f88006h, 1, 7, 1);
                return i4;
            case 10:
                i4 = this.f88004f;
                return i4;
            case 11:
                i4 = this.f88003e;
                return i4;
            case 12:
                i4 = this.f88002d.getValue();
                return i4;
            default:
                throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
    }

    public l h0() {
        return l.f87981f;
    }

    @Override // org.threeten.bp.chrono.c, ng.b, org.threeten.bp.temporal.e
    public org.threeten.bp.temporal.e i(org.threeten.bp.temporal.g gVar) {
        return (m) super.i(gVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* renamed from: k */
    public org.threeten.bp.temporal.e v(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.v(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<m> l(org.threeten.bp.i iVar) {
        return e.J(this, iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public j p() {
        return l.f87981f;
    }

    public n p0() {
        return this.f88002d;
    }

    @Override // org.threeten.bp.chrono.c
    public k q() {
        return this.f88002d;
    }

    @Override // ng.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.n range(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.rangeRefinedBy(this);
        }
        if (!isSupported(jVar)) {
            throw new UnsupportedTemporalTypeException(org.threeten.bp.c.a("Unsupported field: ", jVar));
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i4 = a.f88010a[aVar.ordinal()];
        if (i4 == 1) {
            return org.threeten.bp.temporal.n.k(1L, v());
        }
        if (i4 == 2) {
            return org.threeten.bp.temporal.n.k(1L, C0(this.f88003e));
        }
        if (i4 == 3) {
            return org.threeten.bp.temporal.n.k(1L, 5L);
        }
        if (i4 == 4) {
            return org.threeten.bp.temporal.n.k(1L, 1000L);
        }
        l.f87981f.getClass();
        return aVar.range();
    }

    @Override // org.threeten.bp.chrono.c
    public boolean u() {
        return this.f88009k;
    }

    @Override // org.threeten.bp.chrono.c
    public int v() {
        return x0(this.f88004f - 1, this.f88003e);
    }

    @Override // org.threeten.bp.chrono.c
    public int w() {
        return C0(this.f88003e);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: y */
    public c t(long j4, org.threeten.bp.temporal.m mVar) {
        return (m) super.t(j4, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* renamed from: z */
    public c c(org.threeten.bp.temporal.i iVar) {
        return (m) super.c(iVar);
    }
}
