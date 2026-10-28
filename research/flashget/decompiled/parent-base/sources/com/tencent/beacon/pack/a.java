package com.tencent.beacon.pack;

import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: JceInputStream.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    protected String f71675a = ProtectedSandApp.s("㐢\u0001");

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f71676b;

    /* compiled from: JceInputStream.java */
    /* renamed from: com.tencent.beacon.pack.a$a, reason: collision with other inner class name */
    public static class C1001a {

        /* renamed from: a, reason: collision with root package name */
        public byte f71677a;

        /* renamed from: b, reason: collision with root package name */
        public int f71678b;
    }

    public a() {
    }

    public static int a(C1001a c1001a, ByteBuffer byteBuffer) {
        byte b5 = byteBuffer.get();
        c1001a.f71677a = (byte) (b5 & com.google.common.base.c.f54871q);
        int i4 = (b5 & 240) >> 4;
        c1001a.f71678b = i4;
        if (i4 != 15) {
            return 1;
        }
        c1001a.f71678b = byteBuffer.get() & 255;
        return 2;
    }

    private void b() {
        a(d.a(this).f71677a);
    }

    public a(byte[] bArr) {
        this.f71676b = ByteBuffer.wrap(bArr);
    }

    public void a(C1001a c1001a) {
        a(c1001a, this.f71676b);
    }

    public a(byte[] bArr, int i4) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f71676b = wrap;
        wrap.position(i4);
    }

    private int b(C1001a c1001a) {
        return a(c1001a, this.f71676b.duplicate());
    }

    public void a(byte[] bArr) {
        this.f71676b = ByteBuffer.wrap(bArr);
    }

    private void b(int i4) {
        ByteBuffer byteBuffer = this.f71676b;
        byteBuffer.position(byteBuffer.position() + i4);
    }

    public boolean a(int i4) {
        try {
            C1001a c1001a = new C1001a();
            while (true) {
                int b5 = b(c1001a);
                if (c1001a.f71677a == 11) {
                    return false;
                }
                int i5 = c1001a.f71678b;
                if (i4 <= i5) {
                    return i4 == i5;
                }
                b(b5);
                a(c1001a.f71677a);
            }
        } catch (BufferUnderflowException e4) {
            com.tencent.beacon.base.util.c.a(e4);
            return false;
        } catch (RuntimeException e5) {
            com.tencent.beacon.base.util.c.a(e5);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t4, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t4.getClass(), a5));
                for (int i5 = 0; i5 < a5; i5++) {
                    tArr[i5] = a((a) t4, 0, true);
                }
                return tArr;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public void a() {
        C1001a c1001a = new C1001a();
        do {
            a(c1001a);
            a(c1001a.f71677a);
        } while (c1001a.f71677a != 11);
    }

    private void a(byte b5) {
        int i4 = 0;
        switch (b5) {
            case 0:
                b(1);
                return;
            case 1:
                b(2);
                return;
            case 2:
                b(4);
                return;
            case 3:
                b(8);
                return;
            case 4:
                b(4);
                return;
            case 5:
                b(8);
                return;
            case 6:
                int i5 = this.f71676b.get();
                if (i5 < 0) {
                    i5 += 256;
                }
                b(i5);
                return;
            case 7:
                b(this.f71676b.getInt());
                return;
            case 8:
                int a5 = a(0, 0, true);
                while (i4 < a5 * 2) {
                    b();
                    i4++;
                }
                return;
            case 9:
                int a6 = a(0, 0, true);
                while (i4 < a6) {
                    b();
                    i4++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                C1001a a7 = d.a(this);
                if (a7.f71677a == 0) {
                    b(a(0, 0, true));
                    return;
                } else {
                    StringBuilder a8 = s.a(ProtectedSandApp.s("㐧\u0001"), b5, ProtectedSandApp.s("㐨\u0001"));
                    a8.append((int) a7.f71677a);
                    throw new RuntimeException(a8.toString());
                }
            default:
                throw new RuntimeException(ProtectedSandApp.s("㐦\u0001"));
        }
    }

    public boolean a(boolean z4, int i4, boolean z5) {
        return a((byte) 0, i4, z5) != 0;
    }

    public byte a(byte b5, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return b5;
        }
        byte b6 = d.a(this).f71677a;
        if (b6 == 0) {
            return this.f71676b.get();
        }
        if (b6 == 12) {
            return (byte) 0;
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public short a(short s4, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return s4;
        }
        byte b5 = d.a(this).f71677a;
        if (b5 == 0) {
            return this.f71676b.get();
        }
        if (b5 == 1) {
            return this.f71676b.getShort();
        }
        if (b5 == 12) {
            return (short) 0;
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public int a(int i4, int i5, boolean z4) {
        if (!a(i5)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return i4;
        }
        byte b5 = d.a(this).f71677a;
        if (b5 == 0) {
            return this.f71676b.get();
        }
        if (b5 == 1) {
            return this.f71676b.getShort();
        }
        if (b5 == 2) {
            return this.f71676b.getInt();
        }
        if (b5 == 12) {
            return 0;
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public long a(long j4, int i4, boolean z4) {
        int i5;
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return j4;
        }
        byte b5 = d.a(this).f71677a;
        if (b5 == 12) {
            return 0L;
        }
        if (b5 == 0) {
            i5 = this.f71676b.get();
        } else if (b5 == 1) {
            i5 = this.f71676b.getShort();
        } else {
            if (b5 != 2) {
                if (b5 == 3) {
                    return this.f71676b.getLong();
                }
                throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
            }
            i5 = this.f71676b.getInt();
        }
        return i5;
    }

    public float a(float f4, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return f4;
        }
        byte b5 = d.a(this).f71677a;
        if (b5 == 4) {
            return this.f71676b.getFloat();
        }
        if (b5 == 12) {
            return 0.0f;
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public double a(double d5, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return d5;
        }
        byte b5 = d.a(this).f71677a;
        if (b5 == 4) {
            return this.f71676b.getFloat();
        }
        if (b5 == 5) {
            return this.f71676b.getDouble();
        }
        if (b5 == 12) {
            return p.f60679p;
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public boolean[] a(boolean[] zArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                boolean[] zArr2 = new boolean[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    zArr2[i5] = a(zArr2[0], 0, true);
                }
                return zArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public byte[] a(byte[] bArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        C1001a a5 = d.a(this);
        byte b5 = a5.f71677a;
        if (b5 == 9) {
            int a6 = a(0, 0, true);
            if (a6 >= 0 && a6 <= this.f71676b.capacity()) {
                byte[] bArr2 = new byte[a6];
                for (int i5 = 0; i5 < a6; i5++) {
                    bArr2[i5] = a(bArr2[0], 0, true);
                }
                return bArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a6));
        }
        if (b5 == 13) {
            C1001a a7 = d.a(this);
            byte b6 = a7.f71677a;
            String s4 = ProtectedSandApp.s("㐨\u0001");
            String s5 = ProtectedSandApp.s("㐬\u0001");
            if (b6 == 0) {
                int a8 = a(0, 0, true);
                if (a8 >= 0 && a8 <= this.f71676b.capacity()) {
                    byte[] bArr3 = new byte[a8];
                    this.f71676b.get(bArr3);
                    return bArr3;
                }
                StringBuilder a10 = s.a(ProtectedSandApp.s("㐭\u0001"), i4, s5);
                a10.append((int) a5.f71677a);
                a10.append(s4);
                a10.append((int) a7.f71677a);
                a10.append(ProtectedSandApp.s("㐮\u0001"));
                a10.append(a8);
                throw new RuntimeException(a10.toString());
            }
            StringBuilder a11 = s.a(ProtectedSandApp.s("㐯\u0001"), i4, s5);
            a11.append((int) a5.f71677a);
            a11.append(s4);
            a11.append((int) a7.f71677a);
            throw new RuntimeException(a11.toString());
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public short[] a(short[] sArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                short[] sArr2 = new short[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    sArr2[i5] = a(sArr2[0], 0, true);
                }
                return sArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public int[] a(int[] iArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                int[] iArr2 = new int[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    iArr2[i5] = a(iArr2[0], 0, true);
                }
                return iArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public long[] a(long[] jArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                long[] jArr2 = new long[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    jArr2[i5] = a(jArr2[0], 0, true);
                }
                return jArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public float[] a(float[] fArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                float[] fArr2 = new float[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    fArr2[i5] = a(fArr2[0], 0, true);
                }
                return fArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public double[] a(double[] dArr, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        if (d.a(this).f71677a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                double[] dArr2 = new double[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    dArr2[i5] = a(dArr2[0], 0, true);
                }
                return dArr2;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public AbstractJceStruct a(AbstractJceStruct abstractJceStruct, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        try {
            AbstractJceStruct abstractJceStruct2 = (AbstractJceStruct) abstractJceStruct.getClass().newInstance();
            if (d.a(this).f71677a == 10) {
                abstractJceStruct2.readFrom(this);
                a();
                return abstractJceStruct2;
            }
            throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
        } catch (Exception e4) {
            throw new RuntimeException(e4.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> Object a(T t4, int i4, boolean z4) {
        if (t4 instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i4, z4));
        }
        if (t4 instanceof Boolean) {
            return Boolean.valueOf(a(false, i4, z4));
        }
        if (t4 instanceof Short) {
            return Short.valueOf(a((short) 0, i4, z4));
        }
        if (t4 instanceof Integer) {
            return Integer.valueOf(a(0, i4, z4));
        }
        if (t4 instanceof Long) {
            return Long.valueOf(a(0L, i4, z4));
        }
        if (t4 instanceof Float) {
            return Float.valueOf(a(0.0f, i4, z4));
        }
        if (t4 instanceof Double) {
            return Double.valueOf(a(p.f60679p, i4, z4));
        }
        if (t4 instanceof String) {
            return a(i4, z4);
        }
        if (t4 instanceof Map) {
            return a((Map) t4, i4, z4);
        }
        if (t4 instanceof List) {
            return a((List) t4, i4, z4);
        }
        if (t4 instanceof AbstractJceStruct) {
            return a((AbstractJceStruct) t4, i4, z4);
        }
        if (t4.getClass().isArray()) {
            if (!(t4 instanceof byte[]) && !(t4 instanceof Byte[])) {
                if (t4 instanceof boolean[]) {
                    return a((boolean[]) null, i4, z4);
                }
                if (t4 instanceof short[]) {
                    return a((short[]) null, i4, z4);
                }
                if (t4 instanceof int[]) {
                    return a((int[]) null, i4, z4);
                }
                if (t4 instanceof long[]) {
                    return a((long[]) null, i4, z4);
                }
                if (t4 instanceof float[]) {
                    return a((float[]) null, i4, z4);
                }
                if (t4 instanceof double[]) {
                    return a((double[]) null, i4, z4);
                }
                return a((Object[]) t4, i4, z4);
            }
            return a((byte[]) null, i4, z4);
        }
        throw new RuntimeException(ProtectedSandApp.s("㐩\u0001"));
    }

    public String a(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return null;
        }
        byte b5 = d.a(this).f71677a;
        String s4 = ProtectedSandApp.s("㐪\u0001");
        if (b5 == 6) {
            int i5 = this.f71676b.get();
            if (i5 < 0) {
                i5 += 256;
            }
            byte[] bArr = new byte[i5];
            this.f71676b.get(bArr);
            try {
                return new String(bArr, this.f71675a);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr, Charset.forName(s4));
            }
        }
        if (b5 == 7) {
            int i6 = this.f71676b.getInt();
            if (i6 <= 104857600 && i6 >= 0 && i6 <= this.f71676b.capacity()) {
                byte[] bArr2 = new byte[i6];
                this.f71676b.get(bArr2);
                try {
                    return new String(bArr2, this.f71675a);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2, Charset.forName(s4));
                }
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐫\u0001"), i6));
        }
        throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
    }

    public <K, V> HashMap<K, V> a(Map<K, V> map, int i4, boolean z4) {
        return (HashMap) a(new HashMap(), map, i4, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i4, boolean z4) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (a(i4)) {
                if (d.a(this).f71677a == 8) {
                    int a5 = a(0, 0, true);
                    if (a5 < 0) {
                        throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐣\u0001"), a5));
                    }
                    for (int i5 = 0; i5 < a5; i5++) {
                        map.put(a((a) key, 0, true), a((a) value, 1, true));
                    }
                } else {
                    throw new RuntimeException(ProtectedSandApp.s("㐤\u0001"));
                }
            } else if (z4) {
                throw new RuntimeException(ProtectedSandApp.s("㐥\u0001"));
            }
            return map;
        }
        return new HashMap();
    }

    public <T> T[] a(T[] tArr, int i4, boolean z4) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) b(tArr[0], i4, z4);
        }
        throw new RuntimeException(ProtectedSandApp.s("㐰\u0001"));
    }

    public <T> List<T> a(List<T> list, int i4, boolean z4) {
        if (list != null && !list.isEmpty()) {
            Object[] b5 = b(list.get(0), i4, z4);
            if (b5 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : b5) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    public int a(String str) {
        this.f71675a = str;
        return 0;
    }
}
