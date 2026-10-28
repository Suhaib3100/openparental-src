package com.tencent.beacon.pack;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: JceOutputStream.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f71679a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f71680b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    protected String f71681c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f71682d;

    public b(int i4) {
        this.f71681c = ProtectedSandApp.s("㐱\u0001");
        this.f71682d = ByteBuffer.allocate(i4);
    }

    public ByteBuffer a() {
        return this.f71682d;
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f71682d.position()];
        System.arraycopy(this.f71682d.array(), 0, bArr, 0, this.f71682d.position());
        return bArr;
    }

    public void a(int i4) {
        if (this.f71682d.remaining() < i4) {
            ByteBuffer allocate = ByteBuffer.allocate((this.f71682d.capacity() + i4) * 2);
            allocate.put(this.f71682d.array(), 0, this.f71682d.position());
            this.f71682d = allocate;
        }
    }

    public void b(byte b5, int i4) {
        if (i4 < 15) {
            this.f71682d.put((byte) (b5 | (i4 << 4)));
        } else {
            if (i4 < 256) {
                this.f71682d.put((byte) (b5 | 240));
                this.f71682d.put((byte) i4);
                return;
            }
            throw new RuntimeException(android.support.v4.media.a.a(ProtectedSandApp.s("㐴\u0001"), i4));
        }
    }

    public b() {
        this(128);
    }

    public void a(boolean z4, int i4) {
        a(z4 ? (byte) 1 : (byte) 0, i4);
    }

    public void a(byte b5, int i4) {
        a(3);
        if (b5 == 0) {
            b((byte) 12, i4);
        } else {
            b((byte) 0, i4);
            this.f71682d.put(b5);
        }
    }

    public void a(short s4, int i4) {
        a(4);
        if (s4 >= -128 && s4 <= 127) {
            a((byte) s4, i4);
        } else {
            b((byte) 1, i4);
            this.f71682d.putShort(s4);
        }
    }

    public void a(int i4, int i5) {
        a(6);
        if (i4 >= -32768 && i4 <= 32767) {
            a((short) i4, i5);
        } else {
            b((byte) 2, i5);
            this.f71682d.putInt(i4);
        }
    }

    public void a(long j4, int i4) {
        a(10);
        if (j4 >= -2147483648L && j4 <= 2147483647L) {
            a((int) j4, i4);
        } else {
            b((byte) 3, i4);
            this.f71682d.putLong(j4);
        }
    }

    public void a(float f4, int i4) {
        a(6);
        b((byte) 4, i4);
        this.f71682d.putFloat(f4);
    }

    public void a(double d5, int i4) {
        a(10);
        b((byte) 5, i4);
        this.f71682d.putDouble(d5);
    }

    public void a(String str, int i4) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f71681c);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes(Charset.forName(ProtectedSandApp.s("㐳\u0001")));
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i4);
            this.f71682d.putInt(bytes.length);
            this.f71682d.put(bytes);
        } else {
            b((byte) 6, i4);
            this.f71682d.put((byte) bytes.length);
            this.f71682d.put(bytes);
        }
    }

    public <K, V> void a(Map<K, V> map, int i4) {
        a(8);
        b((byte) 8, i4);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    public void a(boolean[] zArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(zArr.length, 0);
        for (boolean z4 : zArr) {
            a(z4, 0);
        }
    }

    public void a(byte[] bArr, int i4) {
        a(bArr.length + 8);
        b((byte) 13, i4);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f71682d.put(bArr);
    }

    public void a(short[] sArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(sArr.length, 0);
        for (short s4 : sArr) {
            a(s4, 0);
        }
    }

    public void a(int[] iArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(iArr.length, 0);
        for (int i5 : iArr) {
            a(i5, 0);
        }
    }

    public void a(long[] jArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(jArr.length, 0);
        for (long j4 : jArr) {
            a(j4, 0);
        }
    }

    public void a(float[] fArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(fArr.length, 0);
        for (float f4 : fArr) {
            a(f4, 0);
        }
    }

    public void a(double[] dArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(dArr.length, 0);
        for (double d5 : dArr) {
            a(d5, 0);
        }
    }

    public <T> void a(Collection<T> collection, int i4) {
        a(8);
        b((byte) 9, i4);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                a(it.next(), 0);
            }
        }
    }

    public void a(AbstractJceStruct abstractJceStruct, int i4) {
        a(2);
        b((byte) 10, i4);
        abstractJceStruct.writeTo(this);
        a(2);
        b((byte) 11, 0);
    }

    public void a(Object obj, int i4) {
        if (obj == null) {
            obj = "";
        }
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i4);
            return;
        }
        if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue(), i4);
            return;
        }
        if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i4);
            return;
        }
        if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i4);
            return;
        }
        if (obj instanceof Long) {
            a(((Long) obj).longValue(), i4);
            return;
        }
        if (obj instanceof Float) {
            a(((Float) obj).floatValue(), i4);
            return;
        }
        if (obj instanceof Double) {
            a(((Double) obj).doubleValue(), i4);
            return;
        }
        if (obj instanceof String) {
            a((String) obj, i4);
            return;
        }
        if (obj instanceof Map) {
            a((Map) obj, i4);
            return;
        }
        if (obj instanceof List) {
            a((Collection) obj, i4);
            return;
        }
        if (obj instanceof AbstractJceStruct) {
            a((AbstractJceStruct) obj, i4);
            return;
        }
        if (obj instanceof byte[]) {
            a((byte[]) obj, i4);
            return;
        }
        if (obj instanceof boolean[]) {
            a((boolean[]) obj, i4);
            return;
        }
        if (obj instanceof short[]) {
            a((short[]) obj, i4);
            return;
        }
        if (obj instanceof int[]) {
            a((int[]) obj, i4);
            return;
        }
        if (obj instanceof long[]) {
            a((long[]) obj, i4);
            return;
        }
        if (obj instanceof float[]) {
            a((float[]) obj, i4);
            return;
        }
        if (obj instanceof double[]) {
            a((double[]) obj, i4);
            return;
        }
        if (obj.getClass().isArray()) {
            a((Object[]) obj, i4);
        } else if (obj instanceof Collection) {
            a((Collection) obj, i4);
        } else {
            throw new RuntimeException(ProtectedSandApp.s("㐲\u0001") + obj.getClass());
        }
    }

    private void a(Object[] objArr, int i4) {
        a(8);
        b((byte) 9, i4);
        a(objArr.length, 0);
        for (Object obj : objArr) {
            a(obj, 0);
        }
    }

    public int a(String str) {
        this.f71681c = str;
        return 0;
    }
}
