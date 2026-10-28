package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: DifferentialMotionFlingController.java */
/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27437a;

    /* renamed from: b, reason: collision with root package name */
    private final w f27438b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27439c;

    /* renamed from: d, reason: collision with root package name */
    private final a f27440d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.q0
    private VelocityTracker f27441e;

    /* renamed from: f, reason: collision with root package name */
    private float f27442f;

    /* renamed from: g, reason: collision with root package name */
    private int f27443g;

    /* renamed from: h, reason: collision with root package name */
    private int f27444h;

    /* renamed from: i, reason: collision with root package name */
    private int f27445i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f27446j;

    /* compiled from: DifferentialMotionFlingController.java */
    @androidx.annotation.m1
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4);
    }

    /* compiled from: DifferentialMotionFlingController.java */
    @androidx.annotation.m1
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i4);
    }

    public v(@androidx.annotation.o0 Context context, @androidx.annotation.o0 w wVar) {
        this(context, wVar, new t(), new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = b2.i(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
        iArr[1] = b2.h(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i4) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f27444h == source && this.f27445i == deviceId && this.f27443g == i4) {
            return false;
        }
        this.f27439c.a(this.f27437a, this.f27446j, motionEvent, i4);
        this.f27444h = source;
        this.f27445i = deviceId;
        this.f27443g = i4;
        return true;
    }

    private float e(MotionEvent motionEvent, int i4) {
        if (this.f27441e == null) {
            this.f27441e = VelocityTracker.obtain();
        }
        return this.f27440d.a(this.f27441e, motionEvent, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4) {
        u1.a(velocityTracker, motionEvent);
        u1.c(velocityTracker, 1000);
        return u1.e(velocityTracker, i4);
    }

    public void g(@androidx.annotation.o0 MotionEvent motionEvent, int i4) {
        boolean d5 = d(motionEvent, i4);
        if (this.f27446j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f27441e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f27441e = null;
                return;
            }
            return;
        }
        float b5 = this.f27438b.b() * e(motionEvent, i4);
        float signum = Math.signum(b5);
        if (d5 || (signum != Math.signum(this.f27442f) && signum != 0.0f)) {
            this.f27438b.c();
        }
        float abs = Math.abs(b5);
        int[] iArr = this.f27446j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r5, Math.min(b5, iArr[1]));
        this.f27442f = this.f27438b.a(max) ? max : 0.0f;
    }

    @androidx.annotation.m1
    v(Context context, w wVar, b bVar, a aVar) {
        this.f27443g = -1;
        this.f27444h = -1;
        this.f27445i = -1;
        this.f27446j = new int[]{Integer.MAX_VALUE, 0};
        this.f27437a = context;
        this.f27438b = wVar;
        this.f27439c = bVar;
        this.f27440d = aVar;
    }
}
