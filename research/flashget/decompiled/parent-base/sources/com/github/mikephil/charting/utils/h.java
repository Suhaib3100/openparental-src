package com.github.mikephil.charting.utils;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.utils.h.a;
import java.util.List;

/* compiled from: ObjectPool.java */
/* loaded from: classes5.dex */
public class h<T extends a> {

    /* renamed from: g, reason: collision with root package name */
    private static int f50638g;

    /* renamed from: a, reason: collision with root package name */
    private int f50639a;

    /* renamed from: b, reason: collision with root package name */
    private int f50640b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f50641c;

    /* renamed from: d, reason: collision with root package name */
    private int f50642d;

    /* renamed from: e, reason: collision with root package name */
    private T f50643e;

    /* renamed from: f, reason: collision with root package name */
    private float f50644f;

    /* compiled from: ObjectPool.java */
    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        public static int f50645c = -1;

        /* renamed from: b, reason: collision with root package name */
        int f50646b = f50645c;

        protected abstract a a();
    }

    private h(int i4, T t4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쑢"));
        }
        this.f50640b = i4;
        this.f50641c = new Object[i4];
        this.f50642d = 0;
        this.f50643e = t4;
        this.f50644f = 1.0f;
        i();
    }

    public static synchronized h a(int i4, a aVar) {
        h hVar;
        synchronized (h.class) {
            hVar = new h(i4, aVar);
            int i5 = f50638g;
            hVar.f50639a = i5;
            f50638g = i5 + 1;
        }
        return hVar;
    }

    private void i() {
        j(this.f50644f);
    }

    private void j(float f4) {
        int i4 = this.f50640b;
        int i5 = (int) (i4 * f4);
        if (i5 < 1) {
            i4 = 1;
        } else if (i5 <= i4) {
            i4 = i5;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            this.f50641c[i6] = this.f50643e.a();
        }
        this.f50642d = i4 - 1;
    }

    private void k() {
        int i4 = this.f50640b;
        int i5 = i4 * 2;
        this.f50640b = i5;
        Object[] objArr = new Object[i5];
        for (int i6 = 0; i6 < i4; i6++) {
            objArr[i6] = this.f50641c[i6];
        }
        this.f50641c = objArr;
    }

    public synchronized T b() {
        T t4;
        try {
            if (this.f50642d == -1 && this.f50644f > 0.0f) {
                i();
            }
            Object[] objArr = this.f50641c;
            int i4 = this.f50642d;
            t4 = (T) objArr[i4];
            t4.f50646b = a.f50645c;
            this.f50642d = i4 - 1;
        } catch (Throwable th) {
            throw th;
        }
        return t4;
    }

    public int c() {
        return this.f50641c.length;
    }

    public int d() {
        return this.f50642d + 1;
    }

    public int e() {
        return this.f50639a;
    }

    public float f() {
        return this.f50644f;
    }

    public synchronized void g(T t4) {
        String s4 = ProtectedSandApp.s("쑣");
        synchronized (this) {
            try {
                int i4 = t4.f50646b;
                if (i4 != a.f50645c) {
                    if (i4 == this.f50639a) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("쑤"));
                    }
                    throw new IllegalArgumentException(s4 + t4.f50646b + ProtectedSandApp.s("쑥"));
                }
                int i5 = this.f50642d + 1;
                this.f50642d = i5;
                if (i5 >= this.f50641c.length) {
                    k();
                }
                t4.f50646b = this.f50639a;
                this.f50641c[this.f50642d] = t4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void h(List<T> list) {
        while (list.size() + this.f50642d + 1 > this.f50640b) {
            try {
                k();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = list.get(i4);
            int i5 = t4.f50646b;
            if (i5 != a.f50645c) {
                if (i5 == this.f50639a) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("쑤"));
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("쑣") + t4.f50646b + ProtectedSandApp.s("쑥"));
            }
            t4.f50646b = this.f50639a;
            this.f50641c[this.f50642d + 1 + i4] = t4;
        }
        this.f50642d += size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.f50644f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.utils.h.l(float):void");
    }
}
