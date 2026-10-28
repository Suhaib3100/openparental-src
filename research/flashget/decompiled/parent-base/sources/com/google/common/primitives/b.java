package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Bytes.java */
@f
@d9.b
/* loaded from: classes6.dex */
public final class b {

    /* compiled from: Bytes.java */
    @d9.b
    private static class a extends AbstractList<Byte> implements RandomAccess, Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f57466e = 0;

        /* renamed from: b, reason: collision with root package name */
        final byte[] f57467b;

        /* renamed from: c, reason: collision with root package name */
        final int f57468c;

        /* renamed from: d, reason: collision with root package name */
        final int f57469d;

        a(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte get(int i4) {
            l0.C(i4, size());
            return Byte.valueOf(this.f57467b[this.f57468c + i4]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Byte set(int i4, Byte b5) {
            l0.C(i4, size());
            byte[] bArr = this.f57467b;
            int i5 = this.f57468c;
            byte b6 = bArr[i5 + i4];
            b5.getClass();
            bArr[i5 + i4] = b5.byteValue();
            return Byte.valueOf(b6);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@zc.a Object obj) {
            return (obj instanceof Byte) && b.i(this.f57467b, ((Byte) obj).byteValue(), this.f57468c, this.f57469d) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f57467b[this.f57468c + i4] != aVar.f57467b[aVar.f57468c + i4]) {
                    return false;
                }
            }
            return true;
        }

        byte[] f() {
            return Arrays.copyOfRange(this.f57467b, this.f57468c, this.f57469d);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i4 = 1;
            for (int i5 = this.f57468c; i5 < this.f57469d; i5++) {
                i4 = (i4 * 31) + this.f57467b[i5];
            }
            return i4;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@zc.a Object obj) {
            int i4;
            if (!(obj instanceof Byte) || (i4 = b.i(this.f57467b, ((Byte) obj).byteValue(), this.f57468c, this.f57469d)) < 0) {
                return -1;
            }
            return i4 - this.f57468c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int l4;
            if (!(obj instanceof Byte) || (l4 = b.l(this.f57467b, ((Byte) obj).byteValue(), this.f57468c, this.f57469d)) < 0) {
                return -1;
            }
            return l4 - this.f57468c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f57469d - this.f57468c;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i4, int i5) {
            l0.f0(i4, i5, size());
            if (i4 == i5) {
                return Collections.emptyList();
            }
            byte[] bArr = this.f57467b;
            int i6 = this.f57468c;
            return new a(bArr, i4 + i6, i6 + i5);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.f57467b[this.f57468c]);
            int i4 = this.f57468c;
            while (true) {
                i4++;
                if (i4 >= this.f57469d) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(ProtectedSandApp.s("\uf882"));
                sb.append((int) this.f57467b[i4]);
            }
        }

        a(byte[] bArr, int i4, int i5) {
            this.f57467b = bArr;
            this.f57468c = i4;
            this.f57469d = i5;
        }
    }

    private b() {
    }

    public static List<Byte> c(byte... bArr) {
        return bArr.length == 0 ? Collections.emptyList() : new a(bArr);
    }

    public static byte[] d(byte[]... bArr) {
        int i4 = 0;
        for (byte[] bArr2 : bArr) {
            i4 += bArr2.length;
        }
        byte[] bArr3 = new byte[i4];
        int i5 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i5, bArr4.length);
            i5 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean e(byte[] bArr, byte b5) {
        for (byte b6 : bArr) {
            if (b6 == b5) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] bArr, int i4, int i5) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf883"), i4);
        l0.k(i5 >= 0, ProtectedSandApp.s("\uf884"), i5);
        return bArr.length < i4 ? Arrays.copyOf(bArr, i4 + i5) : bArr;
    }

    public static int g(byte b5) {
        return b5;
    }

    public static int h(byte[] bArr, byte b5) {
        return i(bArr, b5, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(byte[] bArr, byte b5, int i4, int i5) {
        while (i4 < i5) {
            if (bArr[i4] == b5) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(byte[] r5, byte[] r6) {
        /*
            java.lang.String r0 = "\uf885"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r5, r0)
            java.lang.String r0 = "\uf886"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            com.google.common.base.l0.F(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            r0 = r1
        L18:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L32
            r2 = r1
        L20:
            int r3 = r6.length
            if (r2 >= r3) goto L31
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L2e
            int r0 = r0 + 1
            goto L18
        L2e:
            int r2 = r2 + 1
            goto L20
        L31:
            return r0
        L32:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.b.j(byte[], byte[]):int");
    }

    public static int k(byte[] bArr, byte b5) {
        return l(bArr, b5, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, byte b5, int i4, int i5) {
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            if (bArr[i6] == b5) {
                return i6;
            }
        }
        return -1;
    }

    public static void m(byte[] bArr) {
        bArr.getClass();
        n(bArr, 0, bArr.length);
    }

    public static void n(byte[] bArr, int i4, int i5) {
        bArr.getClass();
        l0.f0(i4, i5, bArr.length);
        for (int i6 = i5 - 1; i4 < i6; i6--) {
            byte b5 = bArr[i4];
            bArr[i4] = bArr[i6];
            bArr[i6] = b5;
            i4++;
        }
    }

    public static byte[] o(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).f();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = array[i4];
            obj.getClass();
            bArr[i4] = ((Number) obj).byteValue();
        }
        return bArr;
    }
}
