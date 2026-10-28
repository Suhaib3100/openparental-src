package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* compiled from: FrameSeqDecoder.java */
/* loaded from: classes5.dex */
public abstract class b<R extends Reader, W extends com.github.penfeizhou.animation.io.f> {

    /* renamed from: v, reason: collision with root package name */
    protected static final double f50757v = 1048576.0d;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f50759x = false;

    /* renamed from: a, reason: collision with root package name */
    private final int f50760a;

    /* renamed from: b, reason: collision with root package name */
    private final com.github.penfeizhou.animation.loader.d f50761b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f50762c;

    /* renamed from: f, reason: collision with root package name */
    private int f50765f;

    /* renamed from: h, reason: collision with root package name */
    private final Set<j> f50767h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f50768i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f50769j;

    /* renamed from: k, reason: collision with root package name */
    protected int f50770k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<Bitmap> f50771l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f50772m;

    /* renamed from: n, reason: collision with root package name */
    protected Map<Bitmap, Canvas> f50773n;

    /* renamed from: o, reason: collision with root package name */
    protected ByteBuffer f50774o;

    /* renamed from: p, reason: collision with root package name */
    protected volatile Rect f50775p;

    /* renamed from: q, reason: collision with root package name */
    private W f50776q;

    /* renamed from: r, reason: collision with root package name */
    private R f50777r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f50778s;

    /* renamed from: t, reason: collision with root package name */
    private volatile k f50779t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f50756u = ProtectedSandApp.s("쑪");

    /* renamed from: w, reason: collision with root package name */
    private static final Rect f50758w = new Rect();

    /* renamed from: d, reason: collision with root package name */
    protected List<com.github.penfeizhou.animation.decode.a<R, W>> f50763d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    protected int f50764e = -1;

    /* renamed from: g, reason: collision with root package name */
    private Integer f50766g = null;

    /* compiled from: FrameSeqDecoder.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f50768i.get()) {
                return;
            }
            if (!b.this.q()) {
                b.this.W();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long V = b.this.V();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            b.this.f50762c.removeCallbacks(b.this.f50769j);
            b.this.f50762c.postDelayed(this, Math.max(0L, V - currentTimeMillis2));
            for (j jVar : b.this.f50767h) {
                ByteBuffer byteBuffer = b.this.f50774o;
                if (byteBuffer != null) {
                    jVar.a(byteBuffer);
                }
            }
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    /* renamed from: com.github.penfeizhou.animation.decode.b$b, reason: collision with other inner class name */
    class RunnableC0779b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f50781b;

        RunnableC0779b(j jVar) {
            this.f50781b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f50767h.add(this.f50781b);
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f50783b;

        c(j jVar) {
            this.f50783b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f50767h.remove(this.f50783b);
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f50767h.size() == 0) {
                b.this.W();
            }
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Thread f50786b;

        e(Thread thread) {
            this.f50786b = thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (b.this.f50775p == null) {
                        if (b.this.f50777r == null) {
                            b bVar = b.this;
                            bVar.f50777r = bVar.B(bVar.f50761b.a());
                        } else {
                            b.this.f50777r.reset();
                        }
                        b bVar2 = b.this;
                        bVar2.E(bVar2.L(bVar2.f50777r));
                    }
                } catch (Throwable th) {
                    LockSupport.unpark(this.f50786b);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                b.this.f50775p = b.f50758w;
                LockSupport.unpark(this.f50786b);
            } catch (OutOfMemoryError e5) {
                e = e5;
                e.printStackTrace();
                b.this.f50775p = b.f50758w;
                LockSupport.unpark(this.f50786b);
            }
            LockSupport.unpark(this.f50786b);
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.G();
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f50765f = 0;
            b bVar = b.this;
            bVar.f50764e = -1;
            bVar.f50778s = false;
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    class i implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f50792c;

        i(int i4, boolean z4) {
            this.f50791b = i4;
            this.f50792c = z4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            b.this.G();
            try {
                b bVar = b.this;
                bVar.f50770k = this.f50791b;
                bVar.E(bVar.L(bVar.B(bVar.f50761b.a())));
                if (this.f50792c) {
                    b.this.F();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* compiled from: FrameSeqDecoder.java */
    public interface j {
        void a(ByteBuffer byteBuffer);

        void c();

        void onStart();
    }

    /* compiled from: FrameSeqDecoder.java */
    private enum k {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public b(com.github.penfeizhou.animation.loader.d dVar, @q0 j jVar) {
        HashSet hashSet = new HashSet();
        this.f50767h = hashSet;
        this.f50768i = new AtomicBoolean(true);
        this.f50769j = new a();
        this.f50770k = 1;
        this.f50771l = new HashSet();
        this.f50772m = new Object();
        this.f50773n = new WeakHashMap();
        this.f50776q = D();
        this.f50777r = null;
        this.f50778s = false;
        this.f50779t = k.IDLE;
        this.f50761b = dVar;
        if (jVar != null) {
            hashSet.add(jVar);
        }
        int a5 = com.github.penfeizhou.animation.executor.a.b().a();
        this.f50760a = a5;
        this.f50762c = new Handler(com.github.penfeizhou.animation.executor.a.b().c(a5));
    }

    private int A() {
        Integer num = this.f50766g;
        return num != null ? num.intValue() : y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Rect rect) {
        this.f50775p = rect;
        long width = rect.width() * rect.height();
        int i4 = this.f50770k;
        long j4 = ((width / (i4 * i4)) + 1) * 4;
        try {
            this.f50774o = ByteBuffer.allocate((int) j4);
            if (this.f50776q == null) {
                this.f50776q = D();
            }
        } catch (OutOfMemoryError e4) {
            String.format(ProtectedSandApp.s("쑫"), Double.valueOf(j4 / f50757v), Long.valueOf(j4));
            this.f50774o = null;
            this.f50775p = f50758w;
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public void F() {
        this.f50768i.compareAndSet(true, false);
        System.currentTimeMillis();
        try {
            if (w() == 0) {
                try {
                    R r4 = this.f50777r;
                    if (r4 == null) {
                        this.f50777r = B(this.f50761b.a());
                    } else {
                        r4.reset();
                    }
                    E(L(this.f50777r));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            System.currentTimeMillis();
            this.f50779t = k.RUNNING;
            if (A() == 0 || !this.f50778s) {
                this.f50764e = -1;
                this.f50762c.removeCallbacks(this.f50769j);
                this.f50769j.run();
                Iterator<j> it = this.f50767h.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
            }
        } catch (Throwable th2) {
            System.currentTimeMillis();
            this.f50779t = k.RUNNING;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public void G() {
        this.f50762c.removeCallbacks(this.f50769j);
        this.f50763d.clear();
        synchronized (this.f50772m) {
            try {
                for (Bitmap bitmap : this.f50771l) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f50771l.clear();
            } finally {
            }
        }
        if (this.f50774o != null) {
            this.f50774o = null;
        }
        this.f50773n.clear();
        try {
            R r4 = this.f50777r;
            if (r4 != null) {
                r4.close();
                this.f50777r = null;
            }
            W w4 = this.f50776q;
            if (w4 != null) {
                w4.close();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        N();
        this.f50779t = k.IDLE;
        Iterator<j> it = this.f50767h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public long V() {
        int i4 = this.f50764e + 1;
        this.f50764e = i4;
        if (i4 >= w()) {
            this.f50764e = 0;
            this.f50765f++;
        }
        com.github.penfeizhou.animation.decode.a<R, W> u4 = u(this.f50764e);
        if (u4 == null) {
            return 0L;
        }
        P(u4);
        return u4.frameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (!I() || w() == 0) {
            return false;
        }
        if (A() <= 0 || this.f50765f < A() - 1) {
            return true;
        }
        if (this.f50765f == A() - 1 && this.f50764e < w() - 1) {
            return true;
        }
        this.f50778s = true;
        return false;
    }

    private String r() {
        return "";
    }

    protected abstract R B(Reader reader);

    public int C() {
        return this.f50770k;
    }

    protected abstract W D();

    public boolean H() {
        return this.f50768i.get();
    }

    public boolean I() {
        return this.f50779t == k.RUNNING || this.f50779t == k.INITIALIZING;
    }

    protected Bitmap J(int i4, int i5) {
        synchronized (this.f50772m) {
            try {
                Iterator<Bitmap> it = this.f50771l.iterator();
                Bitmap bitmap = null;
                while (it.hasNext()) {
                    int i6 = i4 * i5 * 4;
                    Bitmap next = it.next();
                    if (next != null && next.getAllocationByteCount() >= i6) {
                        it.remove();
                        if (next.getWidth() == i4) {
                            if (next.getHeight() != i5) {
                            }
                            next.eraseColor(0);
                            return next;
                        }
                        if (i4 > 0 && i5 > 0) {
                            next.reconfigure(i4, i5, Bitmap.Config.ARGB_8888);
                        }
                        next.eraseColor(0);
                        return next;
                    }
                    bitmap = next;
                }
                if (i4 <= 0 || i5 <= 0) {
                    return null;
                }
                try {
                    try {
                        bitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                } catch (OutOfMemoryError e5) {
                    e5.printStackTrace();
                }
                return bitmap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void K() {
        this.f50762c.removeCallbacks(this.f50769j);
        this.f50768i.compareAndSet(false, true);
    }

    protected abstract Rect L(R r4) throws IOException;

    protected void M(Bitmap bitmap) {
        synchronized (this.f50772m) {
            if (bitmap != null) {
                try {
                    this.f50771l.add(bitmap);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected abstract void N();

    public void O(j jVar) {
        this.f50762c.post(new c(jVar));
    }

    protected abstract void P(com.github.penfeizhou.animation.decode.a<R, W> aVar);

    public void Q() {
        this.f50762c.post(new h());
    }

    public void R() {
        this.f50768i.compareAndSet(true, false);
        this.f50762c.removeCallbacks(this.f50769j);
        this.f50762c.post(this.f50769j);
    }

    public int S(int i4, int i5) {
        int t4 = t(i4, i5);
        if (t4 != C()) {
            boolean I = I();
            this.f50762c.removeCallbacks(this.f50769j);
            this.f50762c.post(new i(t4, I));
        }
        return t4;
    }

    public void T(int i4) {
        this.f50766g = Integer.valueOf(i4);
    }

    public void U() {
        if (this.f50775p == f50758w || this.f50779t == k.RUNNING) {
            return;
        }
        k kVar = this.f50779t;
        k kVar2 = k.INITIALIZING;
        if (kVar == kVar2) {
            return;
        }
        if (this.f50779t == k.FINISHING) {
            Objects.toString(this.f50779t);
        }
        this.f50779t = kVar2;
        if (Looper.myLooper() == this.f50762c.getLooper()) {
            F();
        } else {
            this.f50762c.post(new f());
        }
    }

    public void W() {
        if (this.f50775p == f50758w) {
            return;
        }
        k kVar = this.f50779t;
        k kVar2 = k.FINISHING;
        if (kVar == kVar2 || this.f50779t == k.IDLE) {
            return;
        }
        if (this.f50779t == k.INITIALIZING) {
            Objects.toString(this.f50779t);
        }
        this.f50779t = kVar2;
        if (Looper.myLooper() == this.f50762c.getLooper()) {
            G();
        } else {
            this.f50762c.post(new g());
        }
    }

    public void X() {
        this.f50762c.post(new d());
    }

    public void p(j jVar) {
        this.f50762c.post(new RunnableC0779b(jVar));
    }

    public Rect s() {
        if (this.f50775p == null) {
            k kVar = k.FINISHING;
            Thread currentThread = Thread.currentThread();
            this.f50762c.post(new e(currentThread));
            LockSupport.park(currentThread);
        }
        return this.f50775p == null ? f50758w : this.f50775p;
    }

    protected int t(int i4, int i5) {
        int i6 = 1;
        if (i4 != 0 && i5 != 0) {
            int min = Math.min(s().width() / i4, s().height() / i5);
            while (true) {
                int i7 = i6 * 2;
                if (i7 > min) {
                    break;
                }
                i6 = i7;
            }
        }
        return i6;
    }

    public com.github.penfeizhou.animation.decode.a<R, W> u(int i4) {
        if (i4 < 0 || i4 >= this.f50763d.size()) {
            return null;
        }
        return this.f50763d.get(i4);
    }

    public Bitmap v(int i4) throws IOException {
        if (this.f50779t != k.IDLE) {
            return null;
        }
        this.f50779t = k.RUNNING;
        this.f50768i.compareAndSet(true, false);
        if (this.f50763d.size() == 0) {
            R r4 = this.f50777r;
            if (r4 == null) {
                this.f50777r = B(this.f50761b.a());
            } else {
                r4.reset();
            }
            E(L(this.f50777r));
        }
        if (i4 < 0) {
            i4 += this.f50763d.size();
        }
        int i5 = i4 >= 0 ? i4 : 0;
        this.f50764e = -1;
        while (this.f50764e < i5 && q()) {
            V();
        }
        this.f50774o.rewind();
        Bitmap createBitmap = Bitmap.createBitmap(s().width() / C(), s().height() / C(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(this.f50774o);
        G();
        return createBitmap;
    }

    public int w() {
        return this.f50763d.size();
    }

    public int x() {
        return this.f50764e;
    }

    protected abstract int y();

    public int z() {
        int i4;
        synchronized (this.f50772m) {
            try {
                i4 = 0;
                for (Bitmap bitmap : this.f50771l) {
                    if (!bitmap.isRecycled()) {
                        i4 += bitmap.getAllocationByteCount();
                    }
                }
                ByteBuffer byteBuffer = this.f50774o;
                if (byteBuffer != null) {
                    i4 += byteBuffer.capacity();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }
}
