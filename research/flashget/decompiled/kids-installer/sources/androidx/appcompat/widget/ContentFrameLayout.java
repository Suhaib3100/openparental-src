package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.core.view.y1;

@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private TypedValue f929o;

    /* renamed from: p, reason: collision with root package name */
    private TypedValue f930p;

    /* renamed from: q, reason: collision with root package name */
    private TypedValue f931q;

    /* renamed from: r, reason: collision with root package name */
    private TypedValue f932r;

    /* renamed from: s, reason: collision with root package name */
    private TypedValue f933s;

    /* renamed from: t, reason: collision with root package name */
    private TypedValue f934t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f935u;

    /* renamed from: v, reason: collision with root package name */
    private a f936v;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue b() {
        if (this.f933s == null) {
            this.f933s = new TypedValue();
        }
        return this.f933s;
    }

    public TypedValue c() {
        if (this.f934t == null) {
            this.f934t = new TypedValue();
        }
        return this.f934t;
    }

    public TypedValue d() {
        if (this.f931q == null) {
            this.f931q = new TypedValue();
        }
        return this.f931q;
    }

    public TypedValue e() {
        if (this.f932r == null) {
            this.f932r = new TypedValue();
        }
        return this.f932r;
    }

    public TypedValue f() {
        if (this.f929o == null) {
            this.f929o = new TypedValue();
        }
        return this.f929o;
    }

    public TypedValue g() {
        if (this.f930p == null) {
            this.f930p = new TypedValue();
        }
        return this.f930p;
    }

    public void h(a aVar) {
        this.f936v = aVar;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void i(int i5, int i6, int i7, int i8) {
        this.f935u.set(i5, i6, i7, i8);
        if (y1.U0(this)) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f936v;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f936v;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f935u = new Rect();
    }
}
