package com.google.common.cache;

import com.google.common.cache.w;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: LongAdder.java */
@g
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class n extends w implements Serializable, l {

    /* renamed from: k, reason: collision with root package name */
    private static final long f55290k = 7249069246863182397L;

    private void l(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f55305d = 0;
        this.f55303b = null;
        this.f55304c = objectInputStream.readLong();
    }

    private void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(c());
    }

    @Override // com.google.common.cache.l
    public void a(long j4) {
        int length;
        w.b bVar;
        w.b[] bVarArr = this.f55303b;
        if (bVarArr == null) {
            long j5 = this.f55304c;
            if (e(j5, j5 + j4)) {
                return;
            }
        }
        int[] iArr = w.f55297e.get();
        boolean z4 = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j6 = bVar.f55315h;
            z4 = bVar.a(j6, j6 + j4);
            if (z4) {
                return;
            }
        }
        j(j4, iArr, z4);
    }

    @Override // com.google.common.cache.l
    public void b() {
        a(1L);
    }

    @Override // com.google.common.cache.l
    public long c() {
        long j4 = this.f55304c;
        w.b[] bVarArr = this.f55303b;
        if (bVarArr != null) {
            for (w.b bVar : bVarArr) {
                if (bVar != null) {
                    j4 += bVar.f55315h;
                }
            }
        }
        return j4;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return c();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return c();
    }

    @Override // com.google.common.cache.w
    final long g(long j4, long j5) {
        return j4 + j5;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) c();
    }

    public void k() {
        a(-1L);
    }

    @Override // java.lang.Number
    public long longValue() {
        return c();
    }

    public void m() {
        i(0L);
    }

    public long n() {
        long j4 = this.f55304c;
        w.b[] bVarArr = this.f55303b;
        this.f55304c = 0L;
        if (bVarArr != null) {
            for (w.b bVar : bVarArr) {
                if (bVar != null) {
                    j4 += bVar.f55315h;
                    bVar.f55315h = 0L;
                }
            }
        }
        return j4;
    }

    public String toString() {
        return Long.toString(c());
    }
}
