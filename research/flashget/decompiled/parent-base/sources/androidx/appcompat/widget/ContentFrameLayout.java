package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.core.view.x1;

@androidx.annotation.c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f1525b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1526c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f1527d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1528e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f1529f;

    /* renamed from: g, reason: collision with root package name */
    private TypedValue f1530g;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f1531h;

    /* renamed from: i, reason: collision with root package name */
    private a f1532i;

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
        if (this.f1529f == null) {
            this.f1529f = new TypedValue();
        }
        return this.f1529f;
    }

    public TypedValue c() {
        if (this.f1530g == null) {
            this.f1530g = new TypedValue();
        }
        return this.f1530g;
    }

    public TypedValue d() {
        if (this.f1527d == null) {
            this.f1527d = new TypedValue();
        }
        return this.f1527d;
    }

    public TypedValue e() {
        if (this.f1528e == null) {
            this.f1528e = new TypedValue();
        }
        return this.f1528e;
    }

    public TypedValue f() {
        if (this.f1525b == null) {
            this.f1525b = new TypedValue();
        }
        return this.f1525b;
    }

    public TypedValue g() {
        if (this.f1526c == null) {
            this.f1526c = new TypedValue();
        }
        return this.f1526c;
    }

    public void h(a aVar) {
        this.f1532i = aVar;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void i(int i4, int i5, int i6, int i7) {
        this.f1531h.set(i4, i5, i6, i7);
        if (x1.Y0(this)) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1532i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1532i;
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

    public ContentFrameLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1531h = new Rect();
    }
}
