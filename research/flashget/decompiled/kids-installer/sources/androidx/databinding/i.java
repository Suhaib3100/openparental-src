package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* compiled from: CallbackRegistry.java */
/* loaded from: classes.dex */
public class i<C, T, A> implements Cloneable {

    /* renamed from: t, reason: collision with root package name */
    private static final String f6121t = "CallbackRegistry";

    /* renamed from: o, reason: collision with root package name */
    private List<C> f6122o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private long f6123p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long[] f6124q;

    /* renamed from: r, reason: collision with root package name */
    private int f6125r;

    /* renamed from: s, reason: collision with root package name */
    private final a<C, T, A> f6126s;

    /* compiled from: CallbackRegistry.java */
    public static abstract class a<C, T, A> {
        public abstract void a(C callback, T sender, int arg, A arg2);
    }

    public i(a<C, T, A> notifier) {
        this.f6126s = notifier;
    }

    private boolean i(int index) {
        int i5;
        if (index < 64) {
            return ((1 << index) & this.f6123p) != 0;
        }
        long[] jArr = this.f6124q;
        if (jArr != null && (i5 = (index / 64) - 1) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i5]) != 0;
        }
        return false;
    }

    private void k(T t5, int i5, A a6, int i6, int i7, long j5) {
        long j6 = 1;
        while (i6 < i7) {
            if ((j5 & j6) == 0) {
                this.f6126s.a(this.f6122o.get(i6), t5, i5, a6);
            }
            j6 <<= 1;
            i6++;
        }
    }

    private void l(T sender, int arg, A arg2) {
        k(sender, arg, arg2, 0, Math.min(64, this.f6122o.size()), this.f6123p);
    }

    private void m(T sender, int arg, A arg2) {
        int size = this.f6122o.size();
        int length = this.f6124q == null ? -1 : r0.length - 1;
        n(sender, arg, arg2, length);
        k(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    private void n(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            l(sender, arg, arg2);
            return;
        }
        long j5 = this.f6124q[remainderIndex];
        int i5 = (remainderIndex + 1) * 64;
        int min = Math.min(this.f6122o.size(), i5 + 64);
        n(sender, arg, arg2, remainderIndex - 1);
        k(sender, arg, arg2, i5, min, j5);
    }

    private void p(int startIndex, long removed) {
        long j5 = Long.MIN_VALUE;
        for (int i5 = (startIndex + 64) - 1; i5 >= startIndex; i5--) {
            if ((removed & j5) != 0) {
                this.f6122o.remove(i5);
            }
            j5 >>>= 1;
        }
    }

    private void q(int index) {
        if (index < 64) {
            this.f6123p = (1 << index) | this.f6123p;
            return;
        }
        int i5 = (index / 64) - 1;
        long[] jArr = this.f6124q;
        if (jArr == null) {
            this.f6124q = new long[this.f6122o.size() / 64];
        } else if (jArr.length <= i5) {
            long[] jArr2 = new long[this.f6122o.size() / 64];
            long[] jArr3 = this.f6124q;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f6124q = jArr2;
        }
        long j5 = 1 << (index % 64);
        long[] jArr4 = this.f6124q;
        jArr4[i5] = j5 | jArr4[i5];
    }

    public synchronized void a(C callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        int lastIndexOf = this.f6122o.lastIndexOf(callback);
        if (lastIndexOf < 0 || i(lastIndexOf)) {
            this.f6122o.add(callback);
        }
    }

    public synchronized void b() {
        if (this.f6125r == 0) {
            this.f6122o.clear();
        } else if (!this.f6122o.isEmpty()) {
            for (int size = this.f6122o.size() - 1; size >= 0; size--) {
                q(size);
            }
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized i<C, T, A> clone() {
        i<C, T, A> iVar;
        CloneNotSupportedException e6;
        try {
            iVar = (i) super.clone();
            try {
                iVar.f6123p = 0L;
                iVar.f6124q = null;
                iVar.f6125r = 0;
                iVar.f6122o = new ArrayList();
                int size = this.f6122o.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (!i(i5)) {
                        iVar.f6122o.add(this.f6122o.get(i5));
                    }
                }
            } catch (CloneNotSupportedException e7) {
                e6 = e7;
                e6.printStackTrace();
                return iVar;
            }
        } catch (CloneNotSupportedException e8) {
            iVar = null;
            e6 = e8;
        }
        return iVar;
    }

    public synchronized ArrayList<C> d() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f6122o.size());
        int size = this.f6122o.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!i(i5)) {
                arrayList.add(this.f6122o.get(i5));
            }
        }
        return arrayList;
    }

    public synchronized void e(List<C> callbacks) {
        callbacks.clear();
        int size = this.f6122o.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!i(i5)) {
                callbacks.add(this.f6122o.get(i5));
            }
        }
    }

    public synchronized boolean f() {
        if (this.f6122o.isEmpty()) {
            return true;
        }
        if (this.f6125r == 0) {
            return false;
        }
        int size = this.f6122o.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!i(i5)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void j(T sender, int arg, A arg2) {
        this.f6125r++;
        m(sender, arg, arg2);
        int i5 = this.f6125r - 1;
        this.f6125r = i5;
        if (i5 == 0) {
            long[] jArr = this.f6124q;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j5 = this.f6124q[length];
                    if (j5 != 0) {
                        p((length + 1) * 64, j5);
                        this.f6124q[length] = 0;
                    }
                }
            }
            long j6 = this.f6123p;
            if (j6 != 0) {
                p(0, j6);
                this.f6123p = 0L;
            }
        }
    }

    public synchronized void o(C callback) {
        if (this.f6125r == 0) {
            this.f6122o.remove(callback);
        } else {
            int lastIndexOf = this.f6122o.lastIndexOf(callback);
            if (lastIndexOf >= 0) {
                q(lastIndexOf);
            }
        }
    }
}
