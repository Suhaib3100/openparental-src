package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x0;
import androidx.compose.material3.j4;
import androidx.compose.runtime.changelist.j;
import androidx.core.content.res.n;
import androidx.core.graphics.j0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes3.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* renamed from: r, reason: collision with root package name */
    private static final int f35354r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f35355s = 1;

    /* renamed from: t, reason: collision with root package name */
    private static final int f35356t = 2;

    /* renamed from: u, reason: collision with root package name */
    private static final int f35357u = 0;

    /* renamed from: v, reason: collision with root package name */
    private static final int f35358v = 1;

    /* renamed from: w, reason: collision with root package name */
    private static final int f35359w = 2;

    /* renamed from: x, reason: collision with root package name */
    private static final int f35360x = 2048;

    /* renamed from: y, reason: collision with root package name */
    private static final boolean f35361y = false;

    /* renamed from: c, reason: collision with root package name */
    private h f35362c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f35363d;

    /* renamed from: e, reason: collision with root package name */
    private ColorFilter f35364e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35365f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35366g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable.ConstantState f35367h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f35368i;

    /* renamed from: j, reason: collision with root package name */
    private final Matrix f35369j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f35370k;

    /* renamed from: p, reason: collision with root package name */
    private static final String f35352p = "path";

    /* renamed from: q, reason: collision with root package name */
    private static final String f35353q = "vector";

    /* renamed from: l, reason: collision with root package name */
    static final String f35348l = "VectorDrawableCompat";

    /* renamed from: n, reason: collision with root package name */
    private static final String f35350n = "clip-path";

    /* renamed from: o, reason: collision with root package name */
    private static final String f35351o = "group";

    /* renamed from: m, reason: collision with root package name */
    static final PorterDuff.Mode f35349m = PorterDuff.Mode.SRC_IN;

    /* compiled from: VectorDrawableCompat.java */
    private static class b extends f {
        b() {
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f35398b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f35397a = j0.d(string2);
            }
            this.f35399c = n.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.r(xmlPullParser, "pathData")) {
                TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.I);
                j(s4, xmlPullParser);
                s4.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f35418a;

        /* renamed from: b, reason: collision with root package name */
        g f35419b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f35420c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f35421d;

        /* renamed from: e, reason: collision with root package name */
        boolean f35422e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f35423f;

        /* renamed from: g, reason: collision with root package name */
        int[] f35424g;

        /* renamed from: h, reason: collision with root package name */
        ColorStateList f35425h;

        /* renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f35426i;

        /* renamed from: j, reason: collision with root package name */
        int f35427j;

        /* renamed from: k, reason: collision with root package name */
        boolean f35428k;

        /* renamed from: l, reason: collision with root package name */
        boolean f35429l;

        /* renamed from: m, reason: collision with root package name */
        Paint f35430m;

        public h(h hVar) {
            this.f35420c = null;
            this.f35421d = i.f35349m;
            if (hVar != null) {
                this.f35418a = hVar.f35418a;
                g gVar = new g(hVar.f35419b);
                this.f35419b = gVar;
                if (hVar.f35419b.f35406e != null) {
                    gVar.f35406e = new Paint(hVar.f35419b.f35406e);
                }
                if (hVar.f35419b.f35405d != null) {
                    this.f35419b.f35405d = new Paint(hVar.f35419b.f35405d);
                }
                this.f35420c = hVar.f35420c;
                this.f35421d = hVar.f35421d;
                this.f35422e = hVar.f35422e;
            }
        }

        public boolean a(int i4, int i5) {
            return i4 == this.f35423f.getWidth() && i5 == this.f35423f.getHeight();
        }

        public boolean b() {
            return !this.f35429l && this.f35425h == this.f35420c && this.f35426i == this.f35421d && this.f35428k == this.f35422e && this.f35427j == this.f35419b.getRootAlpha();
        }

        public void c(int i4, int i5) {
            if (this.f35423f == null || !a(i4, i5)) {
                this.f35423f = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                this.f35429l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f35423f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f35430m == null) {
                Paint paint = new Paint();
                this.f35430m = paint;
                paint.setFilterBitmap(true);
            }
            this.f35430m.setAlpha(this.f35419b.getRootAlpha());
            this.f35430m.setColorFilter(colorFilter);
            return this.f35430m;
        }

        public boolean f() {
            return this.f35419b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f35419b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f35418a;
        }

        public boolean h(int[] iArr) {
            boolean g4 = this.f35419b.g(iArr);
            this.f35429l |= g4;
            return g4;
        }

        public void i() {
            this.f35425h = this.f35420c;
            this.f35426i = this.f35421d;
            this.f35427j = this.f35419b.getRootAlpha();
            this.f35428k = this.f35422e;
            this.f35429l = false;
        }

        public void j(int i4, int i5) {
            this.f35423f.eraseColor(0);
            this.f35419b.b(new Canvas(this.f35423f), i4, i5, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f35420c = null;
            this.f35421d = i.f35349m;
            this.f35419b = new g();
        }
    }

    i() {
        this.f35366g = true;
        this.f35368i = new float[9];
        this.f35369j = new Matrix();
        this.f35370k = new Rect();
        this.f35362c = new h();
    }

    static int a(int i4, float f4) {
        return (i4 & 16777215) | (((int) (Color.alpha(i4) * f4)) << 24);
    }

    @q0
    public static i c(@o0 Resources resources, @v int i4, @q0 Resources.Theme theme) {
        i iVar = new i();
        iVar.f35347b = androidx.core.content.res.i.g(resources, i4, theme);
        iVar.f35367h = new C0634i(iVar.f35347b.getConstantState());
        return iVar;
    }

    public static i f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void i(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f35362c;
        g gVar = hVar.f35419b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f35409h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z4 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f35384b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f35417p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f35418a = cVar.f35400d | hVar.f35418a;
                    z4 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f35384b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f35417p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f35418a = bVar.f35400d | hVar.f35418a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f35384b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f35417p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f35418a = dVar2.f35393k | hVar.f35418a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z4) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean j() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    private static PorterDuff.Mode k(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void l(d dVar, int i4) {
        String str = "";
        for (int i5 = 0; i5 < i4; i5++) {
            str = j.a(str, "    ");
        }
        dVar.getGroupName();
        dVar.getLocalMatrix().toString();
        for (int i6 = 0; i6 < dVar.f35384b.size(); i6++) {
            e eVar = dVar.f35384b.get(i6);
            if (eVar instanceof d) {
                l((d) eVar, i4 + 1);
            } else {
                ((f) eVar).g(i4 + 1);
            }
        }
    }

    private void n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f35362c;
        g gVar = hVar.f35419b;
        hVar.f35421d = k(n.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g4 = n.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g4 != null) {
            hVar.f35420c = g4;
        }
        hVar.f35422e = n.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f35422e);
        gVar.f35412k = n.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f35412k);
        float j4 = n.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f35413l);
        gVar.f35413l = j4;
        if (gVar.f35412k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (j4 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f35410i = typedArray.getDimension(3, gVar.f35410i);
        float dimension = typedArray.getDimension(2, gVar.f35411j);
        gVar.f35411j = dimension;
        if (gVar.f35410i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(n.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f35415n = string;
            gVar.f35417p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f35347b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f35370k);
        if (this.f35370k.width() <= 0 || this.f35370k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f35364e;
        if (colorFilter == null) {
            colorFilter = this.f35363d;
        }
        canvas.getMatrix(this.f35369j);
        this.f35369j.getValues(this.f35368i);
        float abs = Math.abs(this.f35368i[0]);
        float abs2 = Math.abs(this.f35368i[4]);
        float abs3 = Math.abs(this.f35368i[1]);
        float abs4 = Math.abs(this.f35368i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f35370k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f35370k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f35370k;
        canvas.translate(rect.left, rect.top);
        if (j()) {
            canvas.translate(this.f35370k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f35370k.offsetTo(0, 0);
        this.f35362c.c(min, min2);
        if (!this.f35366g) {
            this.f35362c.j(min, min2);
        } else if (!this.f35362c.b()) {
            this.f35362c.j(min, min2);
            this.f35362c.i();
        }
        this.f35362c.d(canvas, colorFilter, this.f35370k);
        canvas.restoreToCount(save);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public float g() {
        g gVar;
        h hVar = this.f35362c;
        if (hVar == null || (gVar = hVar.f35419b) == null) {
            return 1.0f;
        }
        float f4 = gVar.f35410i;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        float f5 = gVar.f35411j;
        if (f5 == 0.0f) {
            return 1.0f;
        }
        float f6 = gVar.f35413l;
        if (f6 == 0.0f) {
            return 1.0f;
        }
        float f7 = gVar.f35412k;
        if (f7 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f7 / f4, f6 / f5);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getAlpha() : this.f35362c.f35419b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f35362c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getColorFilter() : this.f35364e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f35347b != null) {
            return new C0634i(this.f35347b.getConstantState());
        }
        this.f35362c.f35418a = getChangingConfigurations();
        return this.f35362c;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f35362c.f35419b.f35411j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f35362c.f35419b.f35410i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    Object h(String str) {
        return this.f35362c.f35419b.f35417p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.isAutoMirrored() : this.f35362c.f35422e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f35362c) != null && (hVar.g() || ((colorStateList = this.f35362c.f35420c) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    void m(boolean z4) {
        this.f35366g = z4;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f35365f && super.mutate() == this) {
            this.f35362c = new h(this.f35362c);
            this.f35365f = true;
        }
        return this;
    }

    PorterDuffColorFilter o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f35362c;
        ColorStateList colorStateList = hVar.f35420c;
        if (colorStateList == null || (mode = hVar.f35421d) == null) {
            z4 = false;
        } else {
            this.f35363d = o(this.f35363d, colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z4;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f35362c.f35419b.getRootAlpha() != i4) {
            this.f35362c.f35419b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f35362c.f35422e = z4;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z4) {
        super.setFilterBitmap(z4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f35362c;
        if (hVar.f35420c != colorStateList) {
            hVar.f35420c = colorStateList;
            this.f35363d = o(this.f35363d, colorStateList, hVar.f35421d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
            return;
        }
        h hVar = this.f35362c;
        if (hVar.f35421d != mode) {
            hVar.f35421d = mode;
            this.f35363d = o(this.f35363d, hVar.f35420c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    @x0(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i, reason: collision with other inner class name */
    private static class C0634i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f35431a;

        public C0634i(Drawable.ConstantState constantState) {
            this.f35431a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f35431a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f35431a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f35347b = (VectorDrawable) this.f35431a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f35347b = (VectorDrawable) this.f35431a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f35347b = (VectorDrawable) this.f35431a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f35364e = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class f extends e {

        /* renamed from: e, reason: collision with root package name */
        protected static final int f35396e = 0;

        /* renamed from: a, reason: collision with root package name */
        protected j0.b[] f35397a;

        /* renamed from: b, reason: collision with root package name */
        String f35398b;

        /* renamed from: c, reason: collision with root package name */
        int f35399c;

        /* renamed from: d, reason: collision with root package name */
        int f35400d;

        public f() {
            super();
            this.f35397a = null;
            this.f35399c = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(j0.b[] bVarArr) {
            String str = " ";
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                StringBuilder a5 = j4.a(str);
                a5.append(bVarArr[i4].f26274a);
                a5.append(":");
                str = a5.toString();
                for (float f4 : bVarArr[i4].f26275b) {
                    str = androidx.compose.foundation.shape.j.a(j4.a(str), f4, ",");
                }
            }
            return str;
        }

        public void g(int i4) {
            String str = "";
            for (int i5 = 0; i5 < i4; i5++) {
                str = j.a(str, "    ");
            }
            f(this.f35397a);
        }

        public j0.b[] getPathData() {
            return this.f35397a;
        }

        public String getPathName() {
            return this.f35398b;
        }

        public void h(Path path) {
            path.reset();
            j0.b[] bVarArr = this.f35397a;
            if (bVarArr != null) {
                j0.l(bVarArr, path);
            }
        }

        public void setPathData(j0.b[] bVarArr) {
            if (j0.b(this.f35397a, bVarArr)) {
                j0.m(this.f35397a, bVarArr);
            } else {
                this.f35397a = j0.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f35397a = null;
            this.f35399c = 0;
            this.f35398b = fVar.f35398b;
            this.f35400d = fVar.f35400d;
            this.f35397a = j0.f(fVar.f35397a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f35362c;
        hVar.f35419b = new g();
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35258a);
        n(s4, xmlPullParser, theme);
        s4.recycle();
        hVar.f35418a = getChangingConfigurations();
        hVar.f35429l = true;
        i(resources, xmlPullParser, attributeSet, theme);
        this.f35363d = o(this.f35363d, hVar.f35420c, hVar.f35421d);
    }

    i(@o0 h hVar) {
        this.f35366g = true;
        this.f35368i = new float[9];
        this.f35369j = new Matrix();
        this.f35370k = new Rect();
        this.f35362c = hVar;
        this.f35363d = o(this.f35363d, hVar.f35420c, hVar.f35421d);
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class c extends f {

        /* renamed from: f, reason: collision with root package name */
        private int[] f35371f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.content.res.d f35372g;

        /* renamed from: h, reason: collision with root package name */
        float f35373h;

        /* renamed from: i, reason: collision with root package name */
        androidx.core.content.res.d f35374i;

        /* renamed from: j, reason: collision with root package name */
        float f35375j;

        /* renamed from: k, reason: collision with root package name */
        float f35376k;

        /* renamed from: l, reason: collision with root package name */
        float f35377l;

        /* renamed from: m, reason: collision with root package name */
        float f35378m;

        /* renamed from: n, reason: collision with root package name */
        float f35379n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Cap f35380o;

        /* renamed from: p, reason: collision with root package name */
        Paint.Join f35381p;

        /* renamed from: q, reason: collision with root package name */
        float f35382q;

        c() {
            this.f35373h = 0.0f;
            this.f35375j = 1.0f;
            this.f35376k = 1.0f;
            this.f35377l = 0.0f;
            this.f35378m = 1.0f;
            this.f35379n = 0.0f;
            this.f35380o = Paint.Cap.BUTT;
            this.f35381p = Paint.Join.MITER;
            this.f35382q = 4.0f;
        }

        private Paint.Cap i(int i4, Paint.Cap cap) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join j(int i4, Paint.Join join) {
            return i4 != 0 ? i4 != 1 ? i4 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f35371f = null;
            if (n.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f35398b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f35397a = j0.d(string2);
                }
                this.f35374i = n.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f35376k = n.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f35376k);
                this.f35380o = i(n.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f35380o);
                this.f35381p = j(n.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f35381p);
                this.f35382q = n.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f35382q);
                this.f35372g = n.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f35375j = n.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f35375j);
                this.f35373h = n.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f35373h);
                this.f35378m = n.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f35378m);
                this.f35379n = n.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f35379n);
                this.f35377l = n.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f35377l);
                this.f35399c = n.k(typedArray, xmlPullParser, "fillType", 13, this.f35399c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f35374i.i() || this.f35372g.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f35372g.j(iArr) | this.f35374i.j(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean d() {
            return this.f35371f != null;
        }

        float getFillAlpha() {
            return this.f35376k;
        }

        @l
        int getFillColor() {
            return this.f35374i.e();
        }

        float getStrokeAlpha() {
            return this.f35375j;
        }

        @l
        int getStrokeColor() {
            return this.f35372g.e();
        }

        float getStrokeWidth() {
            return this.f35373h;
        }

        float getTrimPathEnd() {
            return this.f35378m;
        }

        float getTrimPathOffset() {
            return this.f35379n;
        }

        float getTrimPathStart() {
            return this.f35377l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35296t);
            l(s4, xmlPullParser, theme);
            s4.recycle();
        }

        void setFillAlpha(float f4) {
            this.f35376k = f4;
        }

        void setFillColor(int i4) {
            this.f35374i.k(i4);
        }

        void setStrokeAlpha(float f4) {
            this.f35375j = f4;
        }

        void setStrokeColor(int i4) {
            this.f35372g.k(i4);
        }

        void setStrokeWidth(float f4) {
            this.f35373h = f4;
        }

        void setTrimPathEnd(float f4) {
            this.f35378m = f4;
        }

        void setTrimPathOffset(float f4) {
            this.f35379n = f4;
        }

        void setTrimPathStart(float f4) {
            this.f35377l = f4;
        }

        c(c cVar) {
            super(cVar);
            this.f35373h = 0.0f;
            this.f35375j = 1.0f;
            this.f35376k = 1.0f;
            this.f35377l = 0.0f;
            this.f35378m = 1.0f;
            this.f35379n = 0.0f;
            this.f35380o = Paint.Cap.BUTT;
            this.f35381p = Paint.Join.MITER;
            this.f35382q = 4.0f;
            this.f35371f = cVar.f35371f;
            this.f35372g = cVar.f35372g;
            this.f35373h = cVar.f35373h;
            this.f35375j = cVar.f35375j;
            this.f35374i = cVar.f35374i;
            this.f35399c = cVar.f35399c;
            this.f35376k = cVar.f35376k;
            this.f35377l = cVar.f35377l;
            this.f35378m = cVar.f35378m;
            this.f35379n = cVar.f35379n;
            this.f35380o = cVar.f35380o;
            this.f35381p = cVar.f35381p;
            this.f35382q = cVar.f35382q;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f35401q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f35402a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f35403b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f35404c;

        /* renamed from: d, reason: collision with root package name */
        Paint f35405d;

        /* renamed from: e, reason: collision with root package name */
        Paint f35406e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f35407f;

        /* renamed from: g, reason: collision with root package name */
        private int f35408g;

        /* renamed from: h, reason: collision with root package name */
        final d f35409h;

        /* renamed from: i, reason: collision with root package name */
        float f35410i;

        /* renamed from: j, reason: collision with root package name */
        float f35411j;

        /* renamed from: k, reason: collision with root package name */
        float f35412k;

        /* renamed from: l, reason: collision with root package name */
        float f35413l;

        /* renamed from: m, reason: collision with root package name */
        int f35414m;

        /* renamed from: n, reason: collision with root package name */
        String f35415n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f35416o;

        /* renamed from: p, reason: collision with root package name */
        final androidx.collection.a<String, Object> f35417p;

        public g() {
            this.f35404c = new Matrix();
            this.f35410i = 0.0f;
            this.f35411j = 0.0f;
            this.f35412k = 0.0f;
            this.f35413l = 0.0f;
            this.f35414m = 255;
            this.f35415n = null;
            this.f35416o = null;
            this.f35417p = new androidx.collection.a<>();
            this.f35409h = new d();
            this.f35402a = new Path();
            this.f35403b = new Path();
        }

        private static float a(float f4, float f5, float f6, float f7) {
            return (f4 * f7) - (f5 * f6);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            dVar.f35383a.set(matrix);
            dVar.f35383a.preConcat(dVar.f35392j);
            canvas.save();
            for (int i6 = 0; i6 < dVar.f35384b.size(); i6++) {
                e eVar = dVar.f35384b.get(i6);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f35383a, canvas, i4, i5, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i4, i5, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            float f4 = i4 / this.f35412k;
            float f5 = i5 / this.f35413l;
            float min = Math.min(f4, f5);
            Matrix matrix = dVar.f35383a;
            this.f35404c.set(matrix);
            this.f35404c.postScale(f4, f5);
            float e4 = e(matrix);
            if (e4 == 0.0f) {
                return;
            }
            fVar.h(this.f35402a);
            Path path = this.f35402a;
            this.f35403b.reset();
            if (fVar.e()) {
                this.f35403b.setFillType(fVar.f35399c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f35403b.addPath(path, this.f35404c);
                canvas.clipPath(this.f35403b);
                return;
            }
            c cVar = (c) fVar;
            float f6 = cVar.f35377l;
            if (f6 != 0.0f || cVar.f35378m != 1.0f) {
                float f7 = cVar.f35379n;
                float f10 = (f6 + f7) % 1.0f;
                float f11 = (cVar.f35378m + f7) % 1.0f;
                if (this.f35407f == null) {
                    this.f35407f = new PathMeasure();
                }
                this.f35407f.setPath(this.f35402a, false);
                float length = this.f35407f.getLength();
                float f12 = f10 * length;
                float f13 = f11 * length;
                path.reset();
                if (f12 > f13) {
                    this.f35407f.getSegment(f12, length, path, true);
                    this.f35407f.getSegment(0.0f, f13, path, true);
                } else {
                    this.f35407f.getSegment(f12, f13, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f35403b.addPath(path, this.f35404c);
            if (cVar.f35374i.l()) {
                androidx.core.content.res.d dVar2 = cVar.f35374i;
                if (this.f35406e == null) {
                    Paint paint = new Paint(1);
                    this.f35406e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f35406e;
                if (dVar2.h()) {
                    Shader f14 = dVar2.f();
                    f14.setLocalMatrix(this.f35404c);
                    paint2.setShader(f14);
                    paint2.setAlpha(Math.round(cVar.f35376k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f35376k));
                }
                paint2.setColorFilter(colorFilter);
                this.f35403b.setFillType(cVar.f35399c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f35403b, paint2);
            }
            if (cVar.f35372g.l()) {
                androidx.core.content.res.d dVar3 = cVar.f35372g;
                if (this.f35405d == null) {
                    Paint paint3 = new Paint(1);
                    this.f35405d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f35405d;
                Paint.Join join = cVar.f35381p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f35380o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f35382q);
                if (dVar3.h()) {
                    Shader f15 = dVar3.f();
                    f15.setLocalMatrix(this.f35404c);
                    paint4.setShader(f15);
                    paint4.setAlpha(Math.round(cVar.f35375j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f35375j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f35373h * min * e4);
                canvas.drawPath(this.f35403b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a5 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a5) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            c(this.f35409h, f35401q, canvas, i4, i5, colorFilter);
        }

        public boolean f() {
            if (this.f35416o == null) {
                this.f35416o = Boolean.valueOf(this.f35409h.a());
            }
            return this.f35416o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f35409h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f35414m;
        }

        public void setAlpha(float f4) {
            setRootAlpha((int) (f4 * 255.0f));
        }

        public void setRootAlpha(int i4) {
            this.f35414m = i4;
        }

        public g(g gVar) {
            this.f35404c = new Matrix();
            this.f35410i = 0.0f;
            this.f35411j = 0.0f;
            this.f35412k = 0.0f;
            this.f35413l = 0.0f;
            this.f35414m = 255;
            this.f35415n = null;
            this.f35416o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f35417p = aVar;
            this.f35409h = new d(gVar.f35409h, aVar);
            this.f35402a = new Path(gVar.f35402a);
            this.f35403b = new Path(gVar.f35403b);
            this.f35410i = gVar.f35410i;
            this.f35411j = gVar.f35411j;
            this.f35412k = gVar.f35412k;
            this.f35413l = gVar.f35413l;
            this.f35408g = gVar.f35408g;
            this.f35414m = gVar.f35414m;
            this.f35415n = gVar.f35415n;
            String str = gVar.f35415n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f35416o = gVar.f35416o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f35383a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f35384b;

        /* renamed from: c, reason: collision with root package name */
        float f35385c;

        /* renamed from: d, reason: collision with root package name */
        private float f35386d;

        /* renamed from: e, reason: collision with root package name */
        private float f35387e;

        /* renamed from: f, reason: collision with root package name */
        private float f35388f;

        /* renamed from: g, reason: collision with root package name */
        private float f35389g;

        /* renamed from: h, reason: collision with root package name */
        private float f35390h;

        /* renamed from: i, reason: collision with root package name */
        private float f35391i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f35392j;

        /* renamed from: k, reason: collision with root package name */
        int f35393k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f35394l;

        /* renamed from: m, reason: collision with root package name */
        private String f35395m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f35383a = new Matrix();
            this.f35384b = new ArrayList<>();
            this.f35385c = 0.0f;
            this.f35386d = 0.0f;
            this.f35387e = 0.0f;
            this.f35388f = 1.0f;
            this.f35389g = 1.0f;
            this.f35390h = 0.0f;
            this.f35391i = 0.0f;
            Matrix matrix = new Matrix();
            this.f35392j = matrix;
            this.f35395m = null;
            this.f35385c = dVar.f35385c;
            this.f35386d = dVar.f35386d;
            this.f35387e = dVar.f35387e;
            this.f35388f = dVar.f35388f;
            this.f35389g = dVar.f35389g;
            this.f35390h = dVar.f35390h;
            this.f35391i = dVar.f35391i;
            this.f35394l = dVar.f35394l;
            String str = dVar.f35395m;
            this.f35395m = str;
            this.f35393k = dVar.f35393k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f35392j);
            ArrayList<e> arrayList = dVar.f35384b;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                e eVar = arrayList.get(i4);
                if (eVar instanceof d) {
                    this.f35384b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((f) eVar);
                    }
                    this.f35384b.add(bVar);
                    String str2 = bVar.f35398b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f35392j.reset();
            this.f35392j.postTranslate(-this.f35386d, -this.f35387e);
            this.f35392j.postScale(this.f35388f, this.f35389g);
            this.f35392j.postRotate(this.f35385c, 0.0f, 0.0f);
            this.f35392j.postTranslate(this.f35390h + this.f35386d, this.f35391i + this.f35387e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f35394l = null;
            this.f35385c = n.j(typedArray, xmlPullParser, "rotation", 5, this.f35385c);
            this.f35386d = typedArray.getFloat(1, this.f35386d);
            this.f35387e = typedArray.getFloat(2, this.f35387e);
            this.f35388f = n.j(typedArray, xmlPullParser, "scaleX", 3, this.f35388f);
            this.f35389g = n.j(typedArray, xmlPullParser, "scaleY", 4, this.f35389g);
            this.f35390h = n.j(typedArray, xmlPullParser, "translateX", 6, this.f35390h);
            this.f35391i = n.j(typedArray, xmlPullParser, "translateY", 7, this.f35391i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f35395m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i4 = 0; i4 < this.f35384b.size(); i4++) {
                if (this.f35384b.get(i4).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f35384b.size(); i4++) {
                z4 |= this.f35384b.get(i4).b(iArr);
            }
            return z4;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f35278k);
            e(s4, xmlPullParser);
            s4.recycle();
        }

        public String getGroupName() {
            return this.f35395m;
        }

        public Matrix getLocalMatrix() {
            return this.f35392j;
        }

        public float getPivotX() {
            return this.f35386d;
        }

        public float getPivotY() {
            return this.f35387e;
        }

        public float getRotation() {
            return this.f35385c;
        }

        public float getScaleX() {
            return this.f35388f;
        }

        public float getScaleY() {
            return this.f35389g;
        }

        public float getTranslateX() {
            return this.f35390h;
        }

        public float getTranslateY() {
            return this.f35391i;
        }

        public void setPivotX(float f4) {
            if (f4 != this.f35386d) {
                this.f35386d = f4;
                d();
            }
        }

        public void setPivotY(float f4) {
            if (f4 != this.f35387e) {
                this.f35387e = f4;
                d();
            }
        }

        public void setRotation(float f4) {
            if (f4 != this.f35385c) {
                this.f35385c = f4;
                d();
            }
        }

        public void setScaleX(float f4) {
            if (f4 != this.f35388f) {
                this.f35388f = f4;
                d();
            }
        }

        public void setScaleY(float f4) {
            if (f4 != this.f35389g) {
                this.f35389g = f4;
                d();
            }
        }

        public void setTranslateX(float f4) {
            if (f4 != this.f35390h) {
                this.f35390h = f4;
                d();
            }
        }

        public void setTranslateY(float f4) {
            if (f4 != this.f35391i) {
                this.f35391i = f4;
                d();
            }
        }

        public d() {
            super();
            this.f35383a = new Matrix();
            this.f35384b = new ArrayList<>();
            this.f35385c = 0.0f;
            this.f35386d = 0.0f;
            this.f35387e = 0.0f;
            this.f35388f = 1.0f;
            this.f35389g = 1.0f;
            this.f35390h = 0.0f;
            this.f35391i = 0.0f;
            this.f35392j = new Matrix();
            this.f35395m = null;
        }
    }
}
