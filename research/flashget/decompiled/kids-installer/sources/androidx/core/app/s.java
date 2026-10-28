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
/* loaded from: classes.dex */
public class s {

    /* renamed from: b, reason: collision with root package name */
    public static final int f4151b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4152c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4153d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4154e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4155f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4156g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4157h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4158i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f4159j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f4160k = 8;

    /* renamed from: l, reason: collision with root package name */
    public static final int f4161l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f4162m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4163n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4164o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4165p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f4166q = 32;

    /* renamed from: r, reason: collision with root package name */
    public static final int f4167r = 64;

    /* renamed from: s, reason: collision with root package name */
    public static final int f4168s = 128;

    /* renamed from: t, reason: collision with root package name */
    public static final int f4169t = 256;

    /* renamed from: u, reason: collision with root package name */
    public static final int f4170u = 511;

    /* renamed from: a, reason: collision with root package name */
    private final b f4171a;

    /* compiled from: FrameMetricsAggregator.java */
    @androidx.annotation.x0(24)
    /* loaded from: classes3.dex */
    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f4172e = 1000000;

        /* renamed from: f, reason: collision with root package name */
        private static final int f4173f = 500000;

        /* renamed from: g, reason: collision with root package name */
        private static HandlerThread f4174g;

        /* renamed from: h, reason: collision with root package name */
        private static Handler f4175h;

        /* renamed from: a, reason: collision with root package name */
        int f4176a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f4177b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f4178c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f4179d = new WindowOnFrameMetricsAvailableListenerC0028a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: androidx.core.app.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class WindowOnFrameMetricsAvailableListenerC0028a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0028a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i5) {
                a aVar = a.this;
                if ((aVar.f4176a & 1) != 0) {
                    aVar.f(aVar.f4177b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f4176a & 2) != 0) {
                    aVar2.f(aVar2.f4177b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f4176a & 4) != 0) {
                    aVar3.f(aVar3.f4177b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f4176a & 8) != 0) {
                    aVar4.f(aVar4.f4177b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f4176a & 16) != 0) {
                    aVar5.f(aVar5.f4177b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f4176a & 64) != 0) {
                    aVar6.f(aVar6.f4177b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f4176a & 32) != 0) {
                    aVar7.f(aVar7.f4177b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f4176a & 128) != 0) {
                    aVar8.f(aVar8.f4177b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f4176a & 256) != 0) {
                    aVar9.f(aVar9.f4177b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i5) {
            this.f4176a = i5;
        }

        @Override // androidx.core.app.s.b
        public void a(Activity activity) {
            if (f4174g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f4174g = handlerThread;
                handlerThread.start();
                f4175h = new Handler(f4174g.getLooper());
            }
            for (int i5 = 0; i5 <= 8; i5++) {
                SparseIntArray[] sparseIntArrayArr = this.f4177b;
                if (sparseIntArrayArr[i5] == null && (this.f4176a & (1 << i5)) != 0) {
                    sparseIntArrayArr[i5] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f4179d, f4175h);
            this.f4178c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.s.b
        public SparseIntArray[] b() {
            return this.f4177b;
        }

        @Override // androidx.core.app.s.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f4178c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f4178c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f4179d);
            return this.f4177b;
        }

        @Override // androidx.core.app.s.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f4177b;
            this.f4177b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.s.b
        public SparseIntArray[] e() {
            for (int size = this.f4178c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f4178c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f4179d);
                    this.f4178c.remove(size);
                }
            }
            return this.f4177b;
        }

        void f(SparseIntArray sparseIntArray, long j5) {
            if (sparseIntArray != null) {
                int i5 = (int) ((500000 + j5) / 1000000);
                if (j5 >= 0) {
                    sparseIntArray.put(i5, sparseIntArray.get(i5) + 1);
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
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public s() {
        this(1);
    }

    public void a(@androidx.annotation.o0 Activity activity) {
        this.f4171a.a(activity);
    }

    @androidx.annotation.q0
    public SparseIntArray[] b() {
        return this.f4171a.b();
    }

    @androidx.annotation.q0
    public SparseIntArray[] c(@androidx.annotation.o0 Activity activity) {
        return this.f4171a.c(activity);
    }

    @androidx.annotation.q0
    public SparseIntArray[] d() {
        return this.f4171a.d();
    }

    @androidx.annotation.q0
    public SparseIntArray[] e() {
        return this.f4171a.e();
    }

    public s(int i5) {
        this.f4171a = new a(i5);
    }
}
