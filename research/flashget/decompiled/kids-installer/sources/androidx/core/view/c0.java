package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: GestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f5434a;

    /* compiled from: GestureDetectorCompat.java */
    interface a {
        boolean a(MotionEvent motionEvent);

        void b(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        void c(boolean z5);

        boolean d();
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes3.dex */
    static class b implements a {

        /* renamed from: v, reason: collision with root package name */
        private static final int f5435v = ViewConfiguration.getTapTimeout();

        /* renamed from: w, reason: collision with root package name */
        private static final int f5436w = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: x, reason: collision with root package name */
        private static final int f5437x = 1;

        /* renamed from: y, reason: collision with root package name */
        private static final int f5438y = 2;

        /* renamed from: z, reason: collision with root package name */
        private static final int f5439z = 3;

        /* renamed from: a, reason: collision with root package name */
        private int f5440a;

        /* renamed from: b, reason: collision with root package name */
        private int f5441b;

        /* renamed from: c, reason: collision with root package name */
        private int f5442c;

        /* renamed from: d, reason: collision with root package name */
        private int f5443d;

        /* renamed from: e, reason: collision with root package name */
        private final Handler f5444e;

        /* renamed from: f, reason: collision with root package name */
        final GestureDetector.OnGestureListener f5445f;

        /* renamed from: g, reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f5446g;

        /* renamed from: h, reason: collision with root package name */
        boolean f5447h;

        /* renamed from: i, reason: collision with root package name */
        boolean f5448i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f5449j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f5450k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f5451l;

        /* renamed from: m, reason: collision with root package name */
        MotionEvent f5452m;

        /* renamed from: n, reason: collision with root package name */
        private MotionEvent f5453n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f5454o;

        /* renamed from: p, reason: collision with root package name */
        private float f5455p;

        /* renamed from: q, reason: collision with root package name */
        private float f5456q;

        /* renamed from: r, reason: collision with root package name */
        private float f5457r;

        /* renamed from: s, reason: collision with root package name */
        private float f5458s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f5459t;

        /* renamed from: u, reason: collision with root package name */
        private VelocityTracker f5460u;

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f5444e = new a(handler);
            } else {
                this.f5444e = new a();
            }
            this.f5445f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                b((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        private void e() {
            this.f5444e.removeMessages(1);
            this.f5444e.removeMessages(2);
            this.f5444e.removeMessages(3);
            this.f5460u.recycle();
            this.f5460u = null;
            this.f5454o = false;
            this.f5447h = false;
            this.f5450k = false;
            this.f5451l = false;
            this.f5448i = false;
            if (this.f5449j) {
                this.f5449j = false;
            }
        }

        private void f() {
            this.f5444e.removeMessages(1);
            this.f5444e.removeMessages(2);
            this.f5444e.removeMessages(3);
            this.f5454o = false;
            this.f5450k = false;
            this.f5451l = false;
            this.f5448i = false;
            if (this.f5449j) {
                this.f5449j = false;
            }
        }

        private void h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f5445f == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f5459t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f5442c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f5443d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f5440a = scaledTouchSlop * scaledTouchSlop;
            this.f5441b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        private boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f5451l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f5436w) {
                return false;
            }
            int x5 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y5 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (y5 * y5) + (x5 * x5) < this.f5441b;
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x021b  */
        @Override // androidx.core.view.c0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 589
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.c0.b.a(android.view.MotionEvent):boolean");
        }

        @Override // androidx.core.view.c0.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f5446g = onDoubleTapListener;
        }

        @Override // androidx.core.view.c0.a
        public void c(boolean z5) {
            this.f5459t = z5;
        }

        @Override // androidx.core.view.c0.a
        public boolean d() {
            return this.f5459t;
        }

        void g() {
            this.f5444e.removeMessages(3);
            this.f5448i = false;
            this.f5449j = true;
            this.f5445f.onLongPress(this.f5452m);
        }

        /* compiled from: GestureDetectorCompat.java */
        /* loaded from: classes.dex */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i5 = message.what;
                if (i5 == 1) {
                    b bVar = b.this;
                    bVar.f5445f.onShowPress(bVar.f5452m);
                    return;
                }
                if (i5 == 2) {
                    b.this.g();
                    return;
                }
                if (i5 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                b bVar2 = b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.f5446g;
                if (onDoubleTapListener != null) {
                    if (bVar2.f5447h) {
                        bVar2.f5448i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f5452m);
                    }
                }
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes3.dex */
    static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final GestureDetector f5462a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f5462a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.c0.a
        public boolean a(MotionEvent motionEvent) {
            return this.f5462a.onTouchEvent(motionEvent);
        }

        @Override // androidx.core.view.c0.a
        public void b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f5462a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.view.c0.a
        public void c(boolean z5) {
            this.f5462a.setIsLongpressEnabled(z5);
        }

        @Override // androidx.core.view.c0.a
        public boolean d() {
            return this.f5462a.isLongpressEnabled();
        }
    }

    public c0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a() {
        return this.f5434a.d();
    }

    public boolean b(@androidx.annotation.o0 MotionEvent motionEvent) {
        return this.f5434a.a(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z5) {
        this.f5434a.c(z5);
    }

    public void d(@androidx.annotation.q0 GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f5434a.b(onDoubleTapListener);
    }

    public c0(@androidx.annotation.o0 Context context, @androidx.annotation.o0 GestureDetector.OnGestureListener onGestureListener, @androidx.annotation.q0 Handler handler) {
        this.f5434a = new c(context, onGestureListener, handler);
    }
}
