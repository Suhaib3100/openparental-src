package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: DragStartHelper.java */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f5427a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5428b;

    /* renamed from: c, reason: collision with root package name */
    private int f5429c;

    /* renamed from: d, reason: collision with root package name */
    private int f5430d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5431e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnLongClickListener f5432f = new View.OnLongClickListener() { // from class: androidx.core.view.z
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return b0.this.d(view);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private final View.OnTouchListener f5433g = new View.OnTouchListener() { // from class: androidx.core.view.a0
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return b0.this.e(view, motionEvent);
        }
    };

    /* compiled from: DragStartHelper.java */
    public interface a {
        boolean a(@androidx.annotation.o0 View view, @androidx.annotation.o0 b0 b0Var);
    }

    public b0(@androidx.annotation.o0 View view, @androidx.annotation.o0 a aVar) {
        this.f5427a = view;
        this.f5428b = aVar;
    }

    public void a() {
        this.f5427a.setOnLongClickListener(this.f5432f);
        this.f5427a.setOnTouchListener(this.f5433g);
    }

    public void b() {
        this.f5427a.setOnLongClickListener(null);
        this.f5427a.setOnTouchListener(null);
    }

    public void c(@androidx.annotation.o0 Point point) {
        point.set(this.f5429c, this.f5430d);
    }

    public boolean d(@androidx.annotation.o0 View view) {
        return this.f5428b.a(view, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r2 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(@androidx.annotation.o0 android.view.View r7, @androidx.annotation.o0 android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.f1.l(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f5431e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f5429c
            if (r8 != r0) goto L39
            int r8 = r6.f5430d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f5429c = r0
            r6.f5430d = r1
            androidx.core.view.b0$a r8 = r6.f5428b
            boolean r7 = r8.a(r7, r6)
            r6.f5431e = r7
            return r7
        L46:
            r6.f5431e = r3
            goto L4d
        L49:
            r6.f5429c = r0
            r6.f5430d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.b0.e(android.view.View, android.view.MotionEvent):boolean");
    }
}
