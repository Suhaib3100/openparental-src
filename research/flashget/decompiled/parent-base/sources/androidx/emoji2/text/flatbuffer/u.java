package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Table.java */
/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    protected int f29384a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f29385b;

    /* renamed from: c, reason: collision with root package name */
    private int f29386c;

    /* renamed from: d, reason: collision with root package name */
    private int f29387d;

    /* renamed from: e, reason: collision with root package name */
    w f29388e = w.d();

    /* compiled from: Table.java */
    class a implements Comparator<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f29389b;

        a(ByteBuffer byteBuffer) {
            this.f29389b = byteBuffer;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return u.this.s(num, num2, this.f29389b);
        }
    }

    protected static boolean a(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (str.charAt(i4) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i4))) {
                return false;
            }
        }
        return true;
    }

    protected static int c(int i4, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i4) + i4;
    }

    protected static int e(int i4, int i5, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i5;
        return byteBuffer.getShort((i4 + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    protected static String i(int i4, ByteBuffer byteBuffer, w wVar) {
        int i5 = byteBuffer.getInt(i4) + i4;
        return wVar.a(byteBuffer, i5 + 4, byteBuffer.getInt(i5));
    }

    protected static u k(u uVar, int i4, ByteBuffer byteBuffer) {
        uVar.g(byteBuffer.getInt(i4) + i4, byteBuffer);
        return uVar;
    }

    protected static int p(int i4, int i5, ByteBuffer byteBuffer) {
        int i6 = byteBuffer.getInt(i4) + i4;
        int i7 = byteBuffer.getInt(i5) + i5;
        int i10 = byteBuffer.getInt(i6);
        int i11 = byteBuffer.getInt(i7);
        int i12 = i6 + 4;
        int i13 = i7 + 4;
        int min = Math.min(i10, i11);
        for (int i14 = 0; i14 < min; i14++) {
            int i15 = i14 + i12;
            int i16 = i14 + i13;
            if (byteBuffer.get(i15) != byteBuffer.get(i16)) {
                return byteBuffer.get(i15) - byteBuffer.get(i16);
            }
        }
        return i10 - i11;
    }

    protected static int q(int i4, byte[] bArr, ByteBuffer byteBuffer) {
        int i5 = byteBuffer.getInt(i4) + i4;
        int i6 = byteBuffer.getInt(i5);
        int length = bArr.length;
        int i7 = i5 + 4;
        int min = Math.min(i6, length);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = i10 + i7;
            if (byteBuffer.get(i11) != bArr[i10]) {
                return byteBuffer.get(i11) - bArr[i10];
            }
        }
        return i6 - length;
    }

    protected int b(int i4) {
        return this.f29385b.getInt(i4) + i4;
    }

    protected int d(int i4) {
        if (i4 < this.f29387d) {
            return this.f29385b.getShort(this.f29386c + i4);
        }
        return 0;
    }

    public void f() {
        g(0, null);
    }

    protected void g(int i4, ByteBuffer byteBuffer) {
        this.f29385b = byteBuffer;
        if (byteBuffer == null) {
            this.f29384a = 0;
            this.f29386c = 0;
            this.f29387d = 0;
        } else {
            this.f29384a = i4;
            int i5 = i4 - byteBuffer.getInt(i4);
            this.f29386c = i5;
            this.f29387d = this.f29385b.getShort(i5);
        }
    }

    protected String h(int i4) {
        return i(i4, this.f29385b, this.f29388e);
    }

    protected u j(u uVar, int i4) {
        return k(uVar, i4, this.f29385b);
    }

    protected int l(int i4) {
        int i5 = i4 + this.f29384a;
        return this.f29385b.getInt(i5) + i5 + 4;
    }

    protected ByteBuffer m(int i4, int i5) {
        int d5 = d(i4);
        if (d5 == 0) {
            return null;
        }
        ByteBuffer order = this.f29385b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int l4 = l(d5);
        order.position(l4);
        order.limit((o(d5) * i5) + l4);
        return order;
    }

    protected ByteBuffer n(ByteBuffer byteBuffer, int i4, int i5) {
        int d5 = d(i4);
        if (d5 == 0) {
            return null;
        }
        int l4 = l(d5);
        byteBuffer.rewind();
        byteBuffer.limit((o(d5) * i5) + l4);
        byteBuffer.position(l4);
        return byteBuffer;
    }

    protected int o(int i4) {
        int i5 = i4 + this.f29384a;
        return this.f29385b.getInt(this.f29385b.getInt(i5) + i5);
    }

    public ByteBuffer r() {
        return this.f29385b;
    }

    protected int s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected void t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        Arrays.sort(numArr, new a(byteBuffer));
        for (int i5 = 0; i5 < iArr.length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
    }
}
