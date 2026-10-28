package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25821b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25822c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f25823d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f25824e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f25825f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f25826g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f25827h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f25828i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f25829j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f25830k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f25831l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f25832m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f25833n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f25834o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final int f25835p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f25836q = 32;

    /* renamed from: r, reason: collision with root package name */
    public static final int f25837r = 64;

    /* renamed from: s, reason: collision with root package name */
    public static final int f25838s = 128;

    /* renamed from: t, reason: collision with root package name */
    public static final int f25839t = 256;

    /* renamed from: u, reason: collision with root package name */
    public static final int f25840u = 511;

    /* renamed from: a, reason: collision with root package name */
    private final b f25841a;

    /* compiled from: FrameMetricsAggregator.java */
    @androidx.annotation.x0(24)
    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f25842e = 1000000;

        /* renamed from: f, reason: collision with root package name */
        private static final int f25843f = 500000;

        /* renamed from: g, reason: collision with root package name */
        private static HandlerThread f25844g;

        /* renamed from: h, reason: collision with root package name */
        private static Handler f25845h;

        /* renamed from: a, reason: collision with root package name */
        int f25846a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f25847b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f25848c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f25849d = new WindowOnFrameMetricsAvailableListenerC0406a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: androidx.core.app.n$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0406a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0406a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i4) {
                a aVar = a.this;
                if ((aVar.f25846a & 1) != 0) {
                    aVar.f(aVar.f25847b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f25846a & 2) != 0) {
                    aVar2.f(aVar2.f25847b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f25846a & 4) != 0) {
                    aVar3.f(aVar3.f25847b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f25846a & 8) != 0) {
                    aVar4.f(aVar4.f25847b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f25846a & 16) != 0) {
                    aVar5.f(aVar5.f25847b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f25846a & 64) != 0) {
                    aVar6.f(aVar6.f25847b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f25846a & 32) != 0) {
                    aVar7.f(aVar7.f25847b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f25846a & 128) != 0) {
                    aVar8.f(aVar8.f25847b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f25846a & 256) != 0) {
                    aVar9.f(aVar9.f25847b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i4) {
            this.f25846a = i4;
        }

        @Override // androidx.core.app.n.b
        public void a(Activity activity) {
            if (f25844g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f25844g = handlerThread;
                handlerThread.start();
                f25845h = new Handler(f25844g.getLooper());
            }
            for (int i4 = 0; i4 <= 8; i4++) {
                SparseIntArray[] sparseIntArrayArr = this.f25847b;
                if (sparseIntArrayArr[i4] == null && (this.f25846a & (1 << i4)) != 0) {
                    sparseIntArrayArr[i4] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f25849d, f25845h);
            this.f25848c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.n.b
        public SparseIntArray[] b() {
            return this.f25847b;
        }

        @Override // androidx.core.app.n.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f25848c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f25848c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f25849d);
            return this.f25847b;
        }

        @Override // androidx.core.app.n.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f25847b;
            this.f25847b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.n.b
        public SparseIntArray[] e() {
            for (int size = this.f25848c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f25848c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f25849d);
                    this.f25848c.remove(size);
                }
            }
            return this.f25847b;
        }

        void f(SparseIntArray sparseIntArray, long j4) {
            if (sparseIntArray != null) {
                int i4 = (int) ((500000 + j4) / 1000000);
                if (j4 >= 0) {
                    sparseIntArray.put(i4, sparseIntArray.get(i4) + 1);
                }
            }
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public n() {
        this(1);
    }

    public void a(@androidx.annotation.o0 Activity activity) {
        this.f25841a.a(activity);
    }

    @androidx.annotation.q0
    public SparseIntArray[] b() {
        return this.f25841a.b();
    }

    @androidx.annotation.q0
    public SparseIntArray[] c(@androidx.annotation.o0 Activity activity) {
        return this.f25841a.c(activity);
    }

    @androidx.annotation.q0
    public SparseIntArray[] d() {
        return this.f25841a.d();
    }

    @androidx.annotation.q0
    public SparseIntArray[] e() {
        return this.f25841a.e();
    }

    public n(int i4) {
        this.f25841a = new a(i4);
    }
}
