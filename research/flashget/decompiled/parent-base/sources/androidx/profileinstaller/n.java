package androidx.profileinstaller;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.compose.material3.j4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder.java */
@x0(19)
/* loaded from: classes3.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f32794a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f32795b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f32796c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static final int f32797d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f32798e = 7;

    /* renamed from: f, reason: collision with root package name */
    static final byte[] f32799f = {112, 114, 111, 0};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f32800g = {112, 114, 109, 0};

    private n() {
    }

    private static void A(@o0 InputStream inputStream) throws IOException {
        e.h(inputStream);
        int g4 = (int) e.g(inputStream, 1);
        if (g4 == 6 || g4 == 7) {
            return;
        }
        while (g4 > 0) {
            e.j(inputStream);
            for (int g5 = (int) e.g(inputStream, 1); g5 > 0; g5--) {
                e.h(inputStream);
            }
            g4--;
        }
    }

    static boolean B(@o0 OutputStream outputStream, @o0 byte[] bArr, @o0 d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f32826a)) {
            O(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f32827b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f32829d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f32828c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, p.f32830e)) {
            return false;
        }
        J(outputStream, dVarArr);
        return true;
    }

    private static void C(@o0 OutputStream outputStream, @o0 d dVar) throws IOException {
        int[] iArr = dVar.f32750h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            e.p(outputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
    }

    private static r D(@o0 d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i4 = 2;
            for (d dVar : dVarArr) {
                e.o(byteArrayOutputStream, dVar.f32745c, 4);
                e.o(byteArrayOutputStream, dVar.f32746d, 4);
                e.o(byteArrayOutputStream, dVar.f32749g, 4);
                String j4 = j(dVar.f32743a, dVar.f32744b, p.f32826a);
                int k4 = e.k(j4);
                e.p(byteArrayOutputStream, k4);
                i4 = i4 + 14 + k4;
                e.n(byteArrayOutputStream, j4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 == byteArray.length) {
                r rVar = new r(f.DEX_FILES, i4, byteArray, false);
                byteArrayOutputStream.close();
                return rVar;
            }
            throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(@o0 OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f32799f);
        outputStream.write(bArr);
    }

    private static void F(@o0 OutputStream outputStream, @o0 d dVar) throws IOException {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(@o0 OutputStream outputStream, @o0 d dVar, @o0 String str) throws IOException {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f32747e);
        e.o(outputStream, dVar.f32748f, 4);
        e.o(outputStream, dVar.f32745c, 4);
        e.o(outputStream, dVar.f32749g, 4);
        e.n(outputStream, str);
    }

    private static void H(@o0 OutputStream outputStream, @o0 d dVar) throws IOException {
        byte[] bArr = new byte[k(dVar.f32749g)];
        for (Map.Entry<Integer, Integer> entry : dVar.f32751i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(@o0 OutputStream outputStream, @o0 d dVar) throws IOException {
        int i4 = 0;
        for (Map.Entry<Integer, Integer> entry : dVar.f32751i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                e.p(outputStream, intValue - i4);
                e.p(outputStream, 0);
                i4 = intValue;
            }
        }
    }

    private static void J(@o0 OutputStream outputStream, @o0 d[] dVarArr) throws IOException {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j4 = j(dVar.f32743a, dVar.f32744b, p.f32830e);
            e.p(outputStream, e.k(j4));
            e.p(outputStream, dVar.f32751i.size());
            e.p(outputStream, dVar.f32750h.length);
            e.o(outputStream, dVar.f32745c, 4);
            e.n(outputStream, j4);
            Iterator<Integer> it = dVar.f32751i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
            }
            for (int i4 : dVar.f32750h) {
                e.p(outputStream, i4);
            }
        }
    }

    private static void K(@o0 OutputStream outputStream, @o0 d[] dVarArr) throws IOException {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f32751i.size() * 4;
            String j4 = j(dVar.f32743a, dVar.f32744b, p.f32829d);
            e.p(outputStream, e.k(j4));
            e.p(outputStream, dVar.f32750h.length);
            e.o(outputStream, size, 4);
            e.o(outputStream, dVar.f32745c, 4);
            e.n(outputStream, j4);
            Iterator<Integer> it = dVar.f32751i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
                e.p(outputStream, 0);
            }
            for (int i4 : dVar.f32750h) {
                e.p(outputStream, i4);
            }
        }
    }

    private static void L(@o0 OutputStream outputStream, @o0 d[] dVarArr) throws IOException {
        byte[] b5 = b(dVarArr, p.f32828c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b5);
    }

    private static void M(@o0 OutputStream outputStream, @o0 d[] dVarArr) throws IOException {
        byte[] b5 = b(dVarArr, p.f32827b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b5);
    }

    private static void N(@o0 OutputStream outputStream, @o0 d[] dVarArr) throws IOException {
        O(outputStream, dVarArr);
    }

    private static void O(@o0 OutputStream outputStream, @o0 d[] dVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = p.f32826a.length + f32799f.length + 4 + (arrayList.size() * 16);
        e.o(outputStream, arrayList.size(), 4);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            r rVar = (r) arrayList.get(i4);
            e.o(outputStream, rVar.f32835a.getValue(), 4);
            e.o(outputStream, length2, 4);
            if (rVar.f32838d) {
                byte[] bArr = rVar.f32837c;
                long length3 = bArr.length;
                byte[] b5 = e.b(bArr);
                arrayList2.add(b5);
                e.o(outputStream, b5.length, 4);
                e.o(outputStream, length3, 4);
                length = b5.length;
            } else {
                arrayList2.add(rVar.f32837c);
                e.o(outputStream, rVar.f32837c.length, 4);
                e.o(outputStream, 0L, 4);
                length = rVar.f32837c.length;
            }
            length2 += length;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            outputStream.write((byte[]) arrayList2.get(i5));
        }
    }

    private static int a(@o0 d dVar) {
        Iterator<Map.Entry<Integer, Integer>> it = dVar.f32751i.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 |= it.next().getValue().intValue();
        }
        return i4;
    }

    @o0
    private static byte[] b(@o0 d[] dVarArr, @o0 byte[] bArr) throws IOException {
        int i4 = 0;
        int i5 = 0;
        for (d dVar : dVarArr) {
            i5 += (dVar.f32747e * 2) + e.k(j(dVar.f32743a, dVar.f32744b, bArr)) + 16 + dVar.f32748f + k(dVar.f32749g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, p.f32828c)) {
            int length = dVarArr.length;
            while (i4 < length) {
                d dVar2 = dVarArr[i4];
                G(byteArrayOutputStream, dVar2, j(dVar2.f32743a, dVar2.f32744b, bArr));
                F(byteArrayOutputStream, dVar2);
                i4++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f32743a, dVar3.f32744b, bArr));
            }
            int length2 = dVarArr.length;
            while (i4 < length2) {
                F(byteArrayOutputStream, dVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    private static r c(@o0 d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                d dVar = dVarArr[i5];
                e.p(byteArrayOutputStream, i5);
                e.p(byteArrayOutputStream, dVar.f32747e);
                i4 = i4 + 4 + (dVar.f32747e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            r rVar = new r(f.CLASSES, i4, byteArray, true);
            byteArrayOutputStream.close();
            return rVar;
        }
        throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    private static r d(@o0 d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                d dVar = dVarArr[i5];
                int a5 = a(dVar);
                byte[] e4 = e(dVar);
                byte[] f4 = f(dVar);
                e.p(byteArrayOutputStream, i5);
                int length = e4.length + 2 + f4.length;
                e.o(byteArrayOutputStream, length, 4);
                e.p(byteArrayOutputStream, a5);
                byteArrayOutputStream.write(e4);
                byteArrayOutputStream.write(f4);
                i4 = i4 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            r rVar = new r(f.METHODS, i4, byteArray, true);
            byteArrayOutputStream.close();
            return rVar;
        }
        throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(@o0 d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(@o0 d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @o0
    private static String g(@o0 String str, @o0 String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @o0
    private static String h(@o0 String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    @q0
    private static d i(@o0 d[] dVarArr, @o0 String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h4 = h(str);
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            if (dVarArr[i4].f32744b.equals(h4)) {
                return dVarArr[i4];
            }
        }
        return null;
    }

    @o0
    private static String j(@o0 String str, @o0 String str2, @o0 byte[] bArr) {
        String a5 = p.a(bArr);
        return str.length() <= 0 ? g(str2, a5) : str2.equals("classes.dex") ? str : (str2.contains("!") || str2.contains(":")) ? g(str2, a5) : str2.endsWith(".apk") ? str2 : android.support.v4.media.c.a(j4.a(str), p.a(bArr), str2);
    }

    private static int k(int i4) {
        return y(i4 * 2) / 8;
    }

    private static int l(int i4, int i5, int i6) {
        if (i4 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i4 == 2) {
            return i5;
        }
        if (i4 == 4) {
            return i5 + i6;
        }
        throw new IllegalStateException(android.support.v4.media.a.a("Unexpected flag: ", i4));
    }

    private static int[] m(@o0 InputStream inputStream, int i4) throws IOException {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += (int) e.g(inputStream, 2);
            iArr[i6] = i5;
        }
        return iArr;
    }

    private static int n(@o0 BitSet bitSet, int i4, int i5) {
        int i6 = bitSet.get(l(2, i4, i5)) ? 2 : 0;
        return bitSet.get(l(4, i4, i5)) ? i6 | 4 : i6;
    }

    static byte[] o(@o0 InputStream inputStream, @o0 byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, p.f32827b.length);
        }
        throw new IllegalStateException("Invalid magic");
    }

    private static void p(@o0 InputStream inputStream, @o0 d dVar) throws IOException {
        int available = inputStream.available() - dVar.f32748f;
        int i4 = 0;
        while (inputStream.available() > available) {
            i4 += (int) e.g(inputStream, 2);
            dVar.f32751i.put(Integer.valueOf(i4), 1);
            for (int g4 = (int) e.g(inputStream, 2); g4 > 0; g4--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw new IllegalStateException("Read too much data during profile line parse");
        }
    }

    @o0
    static d[] q(@o0 InputStream inputStream, @o0 byte[] bArr, @o0 byte[] bArr2, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f32831f)) {
            if (Arrays.equals(p.f32826a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, p.f32832g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    @o0
    static d[] r(@o0 InputStream inputStream, @o0 byte[] bArr, d[] dVarArr) throws IOException {
        if (!Arrays.equals(bArr, p.f32831f)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int g4 = (int) e.g(inputStream, 1);
        byte[] e4 = e.e(inputStream, (int) e.g(inputStream, 4), (int) e.g(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
        try {
            d[] s4 = s(byteArrayInputStream, g4, dVarArr);
            byteArrayInputStream.close();
            return s4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @o0
    private static d[] s(@o0 InputStream inputStream, int i4, d[] dVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i4 != dVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int g4 = (int) e.g(inputStream, 2);
            iArr[i5] = (int) e.g(inputStream, 2);
            strArr[i5] = e.f(inputStream, g4);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            d dVar = dVarArr[i6];
            if (!dVar.f32744b.equals(strArr[i6])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            dVar.f32747e = i7;
            dVar.f32750h = m(inputStream, i7);
        }
        return dVarArr;
    }

    @o0
    static d[] t(@o0 InputStream inputStream, @o0 byte[] bArr, d[] dVarArr) throws IOException {
        int g4 = (int) e.g(inputStream, 2);
        byte[] e4 = e.e(inputStream, (int) e.g(inputStream, 4), (int) e.g(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
        try {
            d[] u4 = u(byteArrayInputStream, bArr, g4, dVarArr);
            byteArrayInputStream.close();
            return u4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @o0
    private static d[] u(@o0 InputStream inputStream, @o0 byte[] bArr, int i4, d[] dVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i4 != dVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            e.h(inputStream);
            String f4 = e.f(inputStream, (int) e.g(inputStream, 2));
            long g4 = e.g(inputStream, 4);
            int g5 = (int) e.g(inputStream, 2);
            d i6 = i(dVarArr, f4);
            if (i6 == null) {
                throw new IllegalStateException(androidx.constraintlayout.core.motion.key.c.a("Missing profile key: ", f4));
            }
            i6.f32746d = g4;
            int[] m4 = m(inputStream, g5);
            if (Arrays.equals(bArr, p.f32830e)) {
                i6.f32747e = g5;
                i6.f32750h = m4;
            }
        }
        return dVarArr;
    }

    private static void v(@o0 InputStream inputStream, @o0 d dVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f32749g * 2)));
        int i4 = 0;
        while (true) {
            int i5 = dVar.f32749g;
            if (i4 >= i5) {
                return;
            }
            int n4 = n(valueOf, i4, i5);
            if (n4 != 0) {
                Integer num = dVar.f32751i.get(Integer.valueOf(i4));
                if (num == null) {
                    num = 0;
                }
                dVar.f32751i.put(Integer.valueOf(i4), Integer.valueOf(n4 | num.intValue()));
            }
            i4++;
        }
    }

    @o0
    static d[] w(@o0 InputStream inputStream, @o0 byte[] bArr, @o0 String str) throws IOException {
        if (!Arrays.equals(bArr, p.f32827b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int g4 = (int) e.g(inputStream, 1);
        byte[] e4 = e.e(inputStream, (int) e.g(inputStream, 4), (int) e.g(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
        try {
            d[] x4 = x(byteArrayInputStream, str, g4);
            byteArrayInputStream.close();
            return x4;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @o0
    private static d[] x(@o0 InputStream inputStream, @o0 String str, int i4) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int g4 = (int) e.g(inputStream, 2);
            int g5 = (int) e.g(inputStream, 2);
            dVarArr[i5] = new d(str, e.f(inputStream, g4), e.g(inputStream, 4), 0L, g5, (int) e.g(inputStream, 4), (int) e.g(inputStream, 4), new int[g5], new TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            d dVar = dVarArr[i6];
            p(inputStream, dVar);
            dVar.f32750h = m(inputStream, dVar.f32747e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i4) {
        return (i4 + 7) & (-8);
    }

    private static void z(@o0 byte[] bArr, int i4, int i5, @o0 d dVar) {
        int l4 = l(i4, i5, dVar.f32749g);
        int i6 = l4 / 8;
        bArr[i6] = (byte) ((1 << (l4 % 8)) | bArr[i6]);
    }
}
