package com.googlecode.mp4parser.util;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: IntHashMap.java */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private transient a[] f64085a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f64086b;

    /* renamed from: c, reason: collision with root package name */
    private int f64087c;

    /* renamed from: d, reason: collision with root package name */
    private float f64088d;

    /* compiled from: IntHashMap.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f64089a;

        /* renamed from: b, reason: collision with root package name */
        int f64090b;

        /* renamed from: c, reason: collision with root package name */
        Object f64091c;

        /* renamed from: d, reason: collision with root package name */
        a f64092d;

        protected a(int i4, int i5, Object obj, a aVar) {
            this.f64089a = i4;
            this.f64090b = i5;
            this.f64091c = obj;
            this.f64092d = aVar;
        }
    }

    public f() {
        this(20, 0.75f);
    }

    public synchronized void a() {
        a[] aVarArr = this.f64085a;
        int length = aVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.f64086b = 0;
            } else {
                aVarArr[length] = null;
            }
        }
    }

    public boolean b(Object obj) {
        obj.getClass();
        a[] aVarArr = this.f64085a;
        int length = aVarArr.length;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return false;
            }
            for (a aVar = aVarArr[i4]; aVar != null; aVar = aVar.f64092d) {
                if (aVar.f64091c.equals(obj)) {
                    return true;
                }
            }
            length = i4;
        }
    }

    public boolean c(int i4) {
        a[] aVarArr = this.f64085a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i4) % aVarArr.length]; aVar != null; aVar = aVar.f64092d) {
            if (aVar.f64089a == i4) {
                return true;
            }
        }
        return false;
    }

    public boolean d(Object obj) {
        return b(obj);
    }

    public Object e(int i4) {
        a[] aVarArr = this.f64085a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i4) % aVarArr.length]; aVar != null; aVar = aVar.f64092d) {
            if (aVar.f64089a == i4) {
                return aVar.f64091c;
            }
        }
        return null;
    }

    public boolean f() {
        return this.f64086b == 0;
    }

    public Object g(int i4, Object obj) {
        a[] aVarArr = this.f64085a;
        int i5 = Integer.MAX_VALUE & i4;
        int length = i5 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.f64092d) {
            if (aVar.f64089a == i4) {
                Object obj2 = aVar.f64091c;
                aVar.f64091c = obj;
                return obj2;
            }
        }
        if (this.f64086b >= this.f64087c) {
            h();
            aVarArr = this.f64085a;
            length = i5 % aVarArr.length;
        }
        aVarArr[length] = new a(i4, i4, obj, aVarArr[length]);
        this.f64086b++;
        return null;
    }

    protected void h() {
        a[] aVarArr = this.f64085a;
        int length = aVarArr.length;
        int i4 = (length * 2) + 1;
        a[] aVarArr2 = new a[i4];
        this.f64087c = (int) (i4 * this.f64088d);
        this.f64085a = aVarArr2;
        while (true) {
            int i5 = length - 1;
            if (length <= 0) {
                return;
            }
            a aVar = aVarArr[i5];
            while (aVar != null) {
                a aVar2 = aVar.f64092d;
                int i6 = (aVar.f64089a & Integer.MAX_VALUE) % i4;
                aVar.f64092d = aVarArr2[i6];
                aVarArr2[i6] = aVar;
                aVar = aVar2;
            }
            length = i5;
        }
    }

    public Object i(int i4) {
        a[] aVarArr = this.f64085a;
        int length = (Integer.MAX_VALUE & i4) % aVarArr.length;
        a aVar = null;
        for (a aVar2 = aVarArr[length]; aVar2 != null; aVar2 = aVar2.f64092d) {
            if (aVar2.f64089a == i4) {
                if (aVar != null) {
                    aVar.f64092d = aVar2.f64092d;
                } else {
                    aVarArr[length] = aVar2.f64092d;
                }
                this.f64086b--;
                Object obj = aVar2.f64091c;
                aVar2.f64091c = null;
                return obj;
            }
            aVar = aVar2;
        }
        return null;
    }

    public int j() {
        return this.f64086b;
    }

    public f(int i4) {
        this(i4, 0.75f);
    }

    public f(int i4, float f4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ᑊ\u0001"), i4));
        }
        if (f4 > 0.0f) {
            i4 = i4 == 0 ? 1 : i4;
            this.f64088d = f4;
            this.f64085a = new a[i4];
            this.f64087c = (int) (i4 * f4);
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᑉ\u0001") + f4);
    }
}
