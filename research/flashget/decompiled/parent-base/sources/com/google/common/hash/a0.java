package com.google.common.hash;

import com.google.common.hash.i0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: LongAdder.java */
@k
/* loaded from: classes6.dex */
final class a0 extends i0 implements Serializable, y {

    /* renamed from: k, reason: collision with root package name */
    private static final long f56891k = 7249069246863182397L;

    private void l(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f56984d = 0;
        this.f56982b = null;
        this.f56983c = objectInputStream.readLong();
    }

    private void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(c());
    }

    @Override // com.google.common.hash.y
    public void a(long j4) {
        int length;
        i0.b bVar;
        i0.b[] bVarArr = this.f56982b;
        if (bVarArr == null) {
            long j5 = this.f56983c;
            if (e(j5, j5 + j4)) {
                return;
            }
        }
        int[] iArr = i0.f56976e.get();
        boolean z4 = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j6 = bVar.f56994h;
            z4 = bVar.a(j6, j6 + j4);
            if (z4) {
                return;
            }
        }
        j(j4, iArr, z4);
    }

    @Override // com.google.common.hash.y
    public void b() {
        a(1L);
    }

    @Override // com.google.common.hash.y
    public long c() {
        long j4 = this.f56983c;
        i0.b[] bVarArr = this.f56982b;
        if (bVarArr != null) {
            for (i0.b bVar : bVarArr) {
                if (bVar != null) {
                    j4 += bVar.f56994h;
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

    @Override // com.google.common.hash.i0
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
        long j4 = this.f56983c;
        i0.b[] bVarArr = this.f56982b;
        this.f56983c = 0L;
        if (bVarArr != null) {
            for (i0.b bVar : bVarArr) {
                if (bVar != null) {
                    j4 += bVar.f56994h;
                    bVar.f56994h = 0L;
                }
            }
        }
        return j4;
    }

    public String toString() {
        return Long.toString(c());
    }
}
