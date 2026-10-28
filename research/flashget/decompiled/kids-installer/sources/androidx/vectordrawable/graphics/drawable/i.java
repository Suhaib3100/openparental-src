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
import androidx.constraintlayout.motion.widget.r;
import androidx.core.content.res.p;
import androidx.core.graphics.b2;
import androidx.core.view.y1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes3.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {
    private static final int E = 0;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;
    private static final int K = 2048;
    private static final boolean L = false;

    /* renamed from: p, reason: collision with root package name */
    private h f10224p;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuffColorFilter f10225q;

    /* renamed from: r, reason: collision with root package name */
    private ColorFilter f10226r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10227s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10228t;

    /* renamed from: u, reason: collision with root package name */
    private Drawable.ConstantState f10229u;

    /* renamed from: v, reason: collision with root package name */
    private final float[] f10230v;

    /* renamed from: w, reason: collision with root package name */
    private final Matrix f10231w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f10232x;
    private static final String A = "clip-path";
    private static final String B = "group";
    private static final String C = "path";
    private static final String D = "vector";

    /* renamed from: y, reason: collision with root package name */
    static final String f10222y = "VectorDrawableCompat";

    /* renamed from: z, reason: collision with root package name */
    static final PorterDuff.Mode f10223z = PorterDuff.Mode.SRC_IN;

    /* compiled from: VectorDrawableCompat.java */
    private static class b extends f {
        b() {
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10260b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f10259a = b2.d(string2);
            }
            this.f10261c = p.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (p.r(xmlPullParser, "pathData")) {
                TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.I);
                j(s5, xmlPullParser);
                s5.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
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
    /* loaded from: classes.dex */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f10280a;

        /* renamed from: b, reason: collision with root package name */
        g f10281b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f10282c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f10283d;

        /* renamed from: e, reason: collision with root package name */
        boolean f10284e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f10285f;

        /* renamed from: g, reason: collision with root package name */
        int[] f10286g;

        /* renamed from: h, reason: collision with root package name */
        ColorStateList f10287h;

        /* renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f10288i;

        /* renamed from: j, reason: collision with root package name */
        int f10289j;

        /* renamed from: k, reason: collision with root package name */
        boolean f10290k;

        /* renamed from: l, reason: collision with root package name */
        boolean f10291l;

        /* renamed from: m, reason: collision with root package name */
        Paint f10292m;

        public h(h hVar) {
            this.f10282c = null;
            this.f10283d = i.f10223z;
            if (hVar != null) {
                this.f10280a = hVar.f10280a;
                g gVar = new g(hVar.f10281b);
                this.f10281b = gVar;
                if (hVar.f10281b.f10268e != null) {
                    gVar.f10268e = new Paint(hVar.f10281b.f10268e);
                }
                if (hVar.f10281b.f10267d != null) {
                    this.f10281b.f10267d = new Paint(hVar.f10281b.f10267d);
                }
                this.f10282c = hVar.f10282c;
                this.f10283d = hVar.f10283d;
                this.f10284e = hVar.f10284e;
            }
        }

        public boolean a(int i5, int i6) {
            return i5 == this.f10285f.getWidth() && i6 == this.f10285f.getHeight();
        }

        public boolean b() {
            return !this.f10291l && this.f10287h == this.f10282c && this.f10288i == this.f10283d && this.f10290k == this.f10284e && this.f10289j == this.f10281b.getRootAlpha();
        }

        public void c(int i5, int i6) {
            if (this.f10285f == null || !a(i5, i6)) {
                this.f10285f = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                this.f10291l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f10285f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f10292m == null) {
                Paint paint = new Paint();
                this.f10292m = paint;
                paint.setFilterBitmap(true);
            }
            this.f10292m.setAlpha(this.f10281b.getRootAlpha());
            this.f10292m.setColorFilter(colorFilter);
            return this.f10292m;
        }

        public boolean f() {
            return this.f10281b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f10281b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10280a;
        }

        public boolean h(int[] iArr) {
            boolean g5 = this.f10281b.g(iArr);
            this.f10291l |= g5;
            return g5;
        }

        public void i() {
            this.f10287h = this.f10282c;
            this.f10288i = this.f10283d;
            this.f10289j = this.f10281b.getRootAlpha();
            this.f10290k = this.f10284e;
            this.f10291l = false;
        }

        public void j(int i5, int i6) {
            this.f10285f.eraseColor(0);
            this.f10281b.b(new Canvas(this.f10285f), i5, i6, null);
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
            this.f10282c = null;
            this.f10283d = i.f10223z;
            this.f10281b = new g();
        }
    }

    i() {
        this.f10228t = true;
        this.f10230v = new float[9];
        this.f10231w = new Matrix();
        this.f10232x = new Rect();
        this.f10224p = new h();
    }

    static int a(int i5, float f6) {
        return (i5 & y1.f5757s) | (((int) (Color.alpha(i5) * f6)) << 24);
    }

    @q0
    public static i d(@o0 Resources resources, @v int i5, @q0 Resources.Theme theme) {
        i iVar = new i();
        iVar.f10221o = androidx.core.content.res.i.g(resources, i5, theme);
        iVar.f10229u = new C0124i(iVar.f10221o.getConstantState());
        return iVar;
    }

    public static i e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void h(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f10224p;
        g gVar = hVar.f10281b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f10271h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10246b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f10279p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f10280a = cVar.f10262d | hVar.f10280a;
                    z5 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10246b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f10279p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f10280a = bVar.f10262d | hVar.f10280a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f10246b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f10279p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f10280a = dVar2.f10255k | hVar.f10280a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean i() {
        return isAutoMirrored() && androidx.core.graphics.drawable.d.f(this) == 1;
    }

    private static PorterDuff.Mode j(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
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

    private void k(d dVar, int i5) {
        String str = "";
        for (int i6 = 0; i6 < i5; i6++) {
            str = androidx.concurrent.futures.b.a(str, "    ");
        }
        dVar.getGroupName();
        dVar.getLocalMatrix().toString();
        for (int i7 = 0; i7 < dVar.f10246b.size(); i7++) {
            e eVar = dVar.f10246b.get(i7);
            if (eVar instanceof d) {
                k((d) eVar, i5 + 1);
            } else {
                ((f) eVar).g(i5 + 1);
            }
        }
    }

    private void m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f10224p;
        g gVar = hVar.f10281b;
        hVar.f10283d = j(p.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g5 = p.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g5 != null) {
            hVar.f10282c = g5;
        }
        hVar.f10284e = p.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f10284e);
        gVar.f10274k = p.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f10274k);
        float j5 = p.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f10275l);
        gVar.f10275l = j5;
        if (gVar.f10274k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (j5 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f10272i = typedArray.getDimension(3, gVar.f10272i);
        float dimension = typedArray.getDimension(2, gVar.f10273j);
        gVar.f10273j = dimension;
        if (gVar.f10272i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(p.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f10277n = string;
            gVar.f10279p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f10221o;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.d.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f10232x);
        if (this.f10232x.width() <= 0 || this.f10232x.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f10226r;
        if (colorFilter == null) {
            colorFilter = this.f10225q;
        }
        canvas.getMatrix(this.f10231w);
        this.f10231w.getValues(this.f10230v);
        float abs = Math.abs(this.f10230v[0]);
        float abs2 = Math.abs(this.f10230v[4]);
        float abs3 = Math.abs(this.f10230v[1]);
        float abs4 = Math.abs(this.f10230v[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f10232x.width() * abs));
        int min2 = Math.min(2048, (int) (this.f10232x.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f10232x;
        canvas.translate(rect.left, rect.top);
        if (i()) {
            canvas.translate(this.f10232x.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f10232x.offsetTo(0, 0);
        this.f10224p.c(min, min2);
        if (!this.f10228t) {
            this.f10224p.j(min, min2);
        } else if (!this.f10224p.b()) {
            this.f10224p.j(min, min2);
            this.f10224p.i();
        }
        this.f10224p.d(canvas, colorFilter, this.f10232x);
        canvas.restoreToCount(save);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public float f() {
        g gVar;
        h hVar = this.f10224p;
        if (hVar == null || (gVar = hVar.f10281b) == null) {
            return 1.0f;
        }
        float f6 = gVar.f10272i;
        if (f6 == 0.0f) {
            return 1.0f;
        }
        float f7 = gVar.f10273j;
        if (f7 == 0.0f) {
            return 1.0f;
        }
        float f8 = gVar.f10275l;
        if (f8 == 0.0f) {
            return 1.0f;
        }
        float f9 = gVar.f10274k;
        if (f9 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f9 / f6, f8 / f7);
    }

    Object g(String str) {
        return this.f10224p.f10281b.f10279p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f10221o;
        return drawable != null ? androidx.core.graphics.drawable.d.d(drawable) : this.f10224p.f10281b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f10224p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f10221o;
        return drawable != null ? androidx.core.graphics.drawable.d.e(drawable) : this.f10226r;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f10221o != null) {
            return new C0124i(this.f10221o.getConstantState());
        }
        this.f10224p.f10280a = getChangingConfigurations();
        return this.f10224p;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f10224p.f10281b.f10273j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f10224p.f10281b.f10272i;
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
        Drawable drawable = this.f10221o;
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f10221o;
        return drawable != null ? androidx.core.graphics.drawable.d.h(drawable) : this.f10224p.f10284e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f10224p) != null && (hVar.g() || ((colorStateList = this.f10224p.f10282c) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    void l(boolean z5) {
        this.f10228t = z5;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10227s && super.mutate() == this) {
            this.f10224p = new h(this.f10224p);
            this.f10227s = true;
        }
        return this;
    }

    PorterDuffColorFilter n(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f10224p;
        ColorStateList colorStateList = hVar.f10282c;
        if (colorStateList == null || (mode = hVar.f10283d) == null) {
            z5 = false;
        } else {
            this.f10225q = n(this.f10225q, colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z5;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else if (this.f10224p.f10281b.getRootAlpha() != i5) {
            this.f10224p.f10281b.setRootAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.j(drawable, z5);
        } else {
            this.f10224p.f10284e = z5;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i5) {
        super.setChangingConfigurations(i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i5, PorterDuff.Mode mode) {
        super.setColorFilter(i5, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z5) {
        super.setFilterBitmap(z5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f7) {
        super.setHotspot(f6, f7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i5, int i6, int i7, int i8) {
        super.setHotspotBounds(i5, i6, i7, i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i5) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i5);
        } else {
            setTintList(ColorStateList.valueOf(i5));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f10224p;
        if (hVar.f10282c != colorStateList) {
            hVar.f10282c = colorStateList;
            this.f10225q = n(this.f10225q, colorStateList, hVar.f10283d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
            return;
        }
        h hVar = this.f10224p;
        if (hVar.f10283d != mode) {
            hVar.f10283d = mode;
            this.f10225q = n(this.f10225q, hVar.f10282c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f10221o;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    @x0(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0124i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f10293a;

        public C0124i(Drawable.ConstantState constantState) {
            this.f10293a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f10293a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10293a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f10221o = (VectorDrawable) this.f10293a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f10221o = (VectorDrawable) this.f10293a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f10221o = (VectorDrawable) this.f10293a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f10226r = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class f extends e {

        /* renamed from: e, reason: collision with root package name */
        protected static final int f10258e = 0;

        /* renamed from: a, reason: collision with root package name */
        protected b2.b[] f10259a;

        /* renamed from: b, reason: collision with root package name */
        String f10260b;

        /* renamed from: c, reason: collision with root package name */
        int f10261c;

        /* renamed from: d, reason: collision with root package name */
        int f10262d;

        public f() {
            super();
            this.f10259a = null;
            this.f10261c = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(b2.b[] bVarArr) {
            String str = " ";
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                StringBuilder a6 = r.a(str);
                a6.append(bVarArr[i5].f4691a);
                a6.append(":");
                str = a6.toString();
                for (float f6 : bVarArr[i5].f4692b) {
                    StringBuilder a7 = r.a(str);
                    a7.append(f6);
                    a7.append(",");
                    str = a7.toString();
                }
            }
            return str;
        }

        public void g(int i5) {
            String str = "";
            for (int i6 = 0; i6 < i5; i6++) {
                str = androidx.concurrent.futures.b.a(str, "    ");
            }
            f(this.f10259a);
        }

        public b2.b[] getPathData() {
            return this.f10259a;
        }

        public String getPathName() {
            return this.f10260b;
        }

        public void h(Path path) {
            path.reset();
            b2.b[] bVarArr = this.f10259a;
            if (bVarArr != null) {
                b2.b.e(bVarArr, path);
            }
        }

        public void setPathData(b2.b[] bVarArr) {
            if (b2.b(this.f10259a, bVarArr)) {
                b2.k(this.f10259a, bVarArr);
            } else {
                this.f10259a = b2.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f10259a = null;
            this.f10261c = 0;
            this.f10260b = fVar.f10260b;
            this.f10262d = fVar.f10262d;
            this.f10259a = b2.f(fVar.f10259a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f10221o;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f10224p;
        hVar.f10281b = new g();
        TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10132a);
        m(s5, xmlPullParser, theme);
        s5.recycle();
        hVar.f10280a = getChangingConfigurations();
        hVar.f10291l = true;
        h(resources, xmlPullParser, attributeSet, theme);
        this.f10225q = n(this.f10225q, hVar.f10282c, hVar.f10283d);
    }

    i(@o0 h hVar) {
        this.f10228t = true;
        this.f10230v = new float[9];
        this.f10231w = new Matrix();
        this.f10232x = new Rect();
        this.f10224p = hVar;
        this.f10225q = n(this.f10225q, hVar.f10282c, hVar.f10283d);
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class c extends f {

        /* renamed from: f, reason: collision with root package name */
        private int[] f10233f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.content.res.d f10234g;

        /* renamed from: h, reason: collision with root package name */
        float f10235h;

        /* renamed from: i, reason: collision with root package name */
        androidx.core.content.res.d f10236i;

        /* renamed from: j, reason: collision with root package name */
        float f10237j;

        /* renamed from: k, reason: collision with root package name */
        float f10238k;

        /* renamed from: l, reason: collision with root package name */
        float f10239l;

        /* renamed from: m, reason: collision with root package name */
        float f10240m;

        /* renamed from: n, reason: collision with root package name */
        float f10241n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Cap f10242o;

        /* renamed from: p, reason: collision with root package name */
        Paint.Join f10243p;

        /* renamed from: q, reason: collision with root package name */
        float f10244q;

        c() {
            this.f10235h = 0.0f;
            this.f10237j = 1.0f;
            this.f10238k = 1.0f;
            this.f10239l = 0.0f;
            this.f10240m = 1.0f;
            this.f10241n = 0.0f;
            this.f10242o = Paint.Cap.BUTT;
            this.f10243p = Paint.Join.MITER;
            this.f10244q = 4.0f;
        }

        private Paint.Cap i(int i5, Paint.Cap cap) {
            return i5 != 0 ? i5 != 1 ? i5 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join j(int i5, Paint.Join join) {
            return i5 != 0 ? i5 != 1 ? i5 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f10233f = null;
            if (p.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f10260b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f10259a = b2.d(string2);
                }
                this.f10236i = p.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f10238k = p.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f10238k);
                this.f10242o = i(p.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f10242o);
                this.f10243p = j(p.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f10243p);
                this.f10244q = p.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f10244q);
                this.f10234g = p.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f10237j = p.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f10237j);
                this.f10235h = p.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f10235h);
                this.f10240m = p.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f10240m);
                this.f10241n = p.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f10241n);
                this.f10239l = p.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f10239l);
                this.f10261c = p.k(typedArray, xmlPullParser, "fillType", 13, this.f10261c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f10236i.i() || this.f10234g.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f10234g.j(iArr) | this.f10236i.j(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean d() {
            return this.f10233f != null;
        }

        float getFillAlpha() {
            return this.f10238k;
        }

        @l
        int getFillColor() {
            return this.f10236i.e();
        }

        float getStrokeAlpha() {
            return this.f10237j;
        }

        @l
        int getStrokeColor() {
            return this.f10234g.e();
        }

        float getStrokeWidth() {
            return this.f10235h;
        }

        float getTrimPathEnd() {
            return this.f10240m;
        }

        float getTrimPathOffset() {
            return this.f10241n;
        }

        float getTrimPathStart() {
            return this.f10239l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10170t);
            l(s5, xmlPullParser, theme);
            s5.recycle();
        }

        void setFillAlpha(float f6) {
            this.f10238k = f6;
        }

        void setFillColor(int i5) {
            this.f10236i.k(i5);
        }

        void setStrokeAlpha(float f6) {
            this.f10237j = f6;
        }

        void setStrokeColor(int i5) {
            this.f10234g.k(i5);
        }

        void setStrokeWidth(float f6) {
            this.f10235h = f6;
        }

        void setTrimPathEnd(float f6) {
            this.f10240m = f6;
        }

        void setTrimPathOffset(float f6) {
            this.f10241n = f6;
        }

        void setTrimPathStart(float f6) {
            this.f10239l = f6;
        }

        c(c cVar) {
            super(cVar);
            this.f10235h = 0.0f;
            this.f10237j = 1.0f;
            this.f10238k = 1.0f;
            this.f10239l = 0.0f;
            this.f10240m = 1.0f;
            this.f10241n = 0.0f;
            this.f10242o = Paint.Cap.BUTT;
            this.f10243p = Paint.Join.MITER;
            this.f10244q = 4.0f;
            this.f10233f = cVar.f10233f;
            this.f10234g = cVar.f10234g;
            this.f10235h = cVar.f10235h;
            this.f10237j = cVar.f10237j;
            this.f10236i = cVar.f10236i;
            this.f10261c = cVar.f10261c;
            this.f10238k = cVar.f10238k;
            this.f10239l = cVar.f10239l;
            this.f10240m = cVar.f10240m;
            this.f10241n = cVar.f10241n;
            this.f10242o = cVar.f10242o;
            this.f10243p = cVar.f10243p;
            this.f10244q = cVar.f10244q;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f10263q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f10264a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f10265b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f10266c;

        /* renamed from: d, reason: collision with root package name */
        Paint f10267d;

        /* renamed from: e, reason: collision with root package name */
        Paint f10268e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f10269f;

        /* renamed from: g, reason: collision with root package name */
        private int f10270g;

        /* renamed from: h, reason: collision with root package name */
        final d f10271h;

        /* renamed from: i, reason: collision with root package name */
        float f10272i;

        /* renamed from: j, reason: collision with root package name */
        float f10273j;

        /* renamed from: k, reason: collision with root package name */
        float f10274k;

        /* renamed from: l, reason: collision with root package name */
        float f10275l;

        /* renamed from: m, reason: collision with root package name */
        int f10276m;

        /* renamed from: n, reason: collision with root package name */
        String f10277n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f10278o;

        /* renamed from: p, reason: collision with root package name */
        final androidx.collection.a<String, Object> f10279p;

        public g() {
            this.f10266c = new Matrix();
            this.f10272i = 0.0f;
            this.f10273j = 0.0f;
            this.f10274k = 0.0f;
            this.f10275l = 0.0f;
            this.f10276m = 255;
            this.f10277n = null;
            this.f10278o = null;
            this.f10279p = new androidx.collection.a<>();
            this.f10271h = new d();
            this.f10264a = new Path();
            this.f10265b = new Path();
        }

        private static float a(float f6, float f7, float f8, float f9) {
            return (f6 * f9) - (f7 * f8);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i5, int i6, ColorFilter colorFilter) {
            dVar.f10245a.set(matrix);
            dVar.f10245a.preConcat(dVar.f10254j);
            canvas.save();
            for (int i7 = 0; i7 < dVar.f10246b.size(); i7++) {
                e eVar = dVar.f10246b.get(i7);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f10245a, canvas, i5, i6, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i5, i6, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i5, int i6, ColorFilter colorFilter) {
            float f6 = i5 / this.f10274k;
            float f7 = i6 / this.f10275l;
            float min = Math.min(f6, f7);
            Matrix matrix = dVar.f10245a;
            this.f10266c.set(matrix);
            this.f10266c.postScale(f6, f7);
            float e6 = e(matrix);
            if (e6 == 0.0f) {
                return;
            }
            fVar.h(this.f10264a);
            Path path = this.f10264a;
            this.f10265b.reset();
            if (fVar.e()) {
                this.f10265b.setFillType(fVar.f10261c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f10265b.addPath(path, this.f10266c);
                canvas.clipPath(this.f10265b);
                return;
            }
            c cVar = (c) fVar;
            float f8 = cVar.f10239l;
            if (f8 != 0.0f || cVar.f10240m != 1.0f) {
                float f9 = cVar.f10241n;
                float f10 = (f8 + f9) % 1.0f;
                float f11 = (cVar.f10240m + f9) % 1.0f;
                if (this.f10269f == null) {
                    this.f10269f = new PathMeasure();
                }
                this.f10269f.setPath(this.f10264a, false);
                float length = this.f10269f.getLength();
                float f12 = f10 * length;
                float f13 = f11 * length;
                path.reset();
                if (f12 > f13) {
                    this.f10269f.getSegment(f12, length, path, true);
                    this.f10269f.getSegment(0.0f, f13, path, true);
                } else {
                    this.f10269f.getSegment(f12, f13, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f10265b.addPath(path, this.f10266c);
            if (cVar.f10236i.l()) {
                androidx.core.content.res.d dVar2 = cVar.f10236i;
                if (this.f10268e == null) {
                    Paint paint = new Paint(1);
                    this.f10268e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f10268e;
                if (dVar2.h()) {
                    Shader f14 = dVar2.f();
                    f14.setLocalMatrix(this.f10266c);
                    paint2.setShader(f14);
                    paint2.setAlpha(Math.round(cVar.f10238k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f10238k));
                }
                paint2.setColorFilter(colorFilter);
                this.f10265b.setFillType(cVar.f10261c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f10265b, paint2);
            }
            if (cVar.f10234g.l()) {
                androidx.core.content.res.d dVar3 = cVar.f10234g;
                if (this.f10267d == null) {
                    Paint paint3 = new Paint(1);
                    this.f10267d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f10267d;
                Paint.Join join = cVar.f10243p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f10242o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f10244q);
                if (dVar3.h()) {
                    Shader f15 = dVar3.f();
                    f15.setLocalMatrix(this.f10266c);
                    paint4.setShader(f15);
                    paint4.setAlpha(Math.round(cVar.f10237j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f10237j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f10235h * min * e6);
                canvas.drawPath(this.f10265b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float f6 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(f6) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i5, int i6, ColorFilter colorFilter) {
            c(this.f10271h, f10263q, canvas, i5, i6, colorFilter);
        }

        public boolean f() {
            if (this.f10278o == null) {
                this.f10278o = Boolean.valueOf(this.f10271h.a());
            }
            return this.f10278o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f10271h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f10276m;
        }

        public void setAlpha(float f6) {
            setRootAlpha((int) (f6 * 255.0f));
        }

        public void setRootAlpha(int i5) {
            this.f10276m = i5;
        }

        public g(g gVar) {
            this.f10266c = new Matrix();
            this.f10272i = 0.0f;
            this.f10273j = 0.0f;
            this.f10274k = 0.0f;
            this.f10275l = 0.0f;
            this.f10276m = 255;
            this.f10277n = null;
            this.f10278o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f10279p = aVar;
            this.f10271h = new d(gVar.f10271h, aVar);
            this.f10264a = new Path(gVar.f10264a);
            this.f10265b = new Path(gVar.f10265b);
            this.f10272i = gVar.f10272i;
            this.f10273j = gVar.f10273j;
            this.f10274k = gVar.f10274k;
            this.f10275l = gVar.f10275l;
            this.f10270g = gVar.f10270g;
            this.f10276m = gVar.f10276m;
            this.f10277n = gVar.f10277n;
            String str = gVar.f10277n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f10278o = gVar.f10278o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f10245a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f10246b;

        /* renamed from: c, reason: collision with root package name */
        float f10247c;

        /* renamed from: d, reason: collision with root package name */
        private float f10248d;

        /* renamed from: e, reason: collision with root package name */
        private float f10249e;

        /* renamed from: f, reason: collision with root package name */
        private float f10250f;

        /* renamed from: g, reason: collision with root package name */
        private float f10251g;

        /* renamed from: h, reason: collision with root package name */
        private float f10252h;

        /* renamed from: i, reason: collision with root package name */
        private float f10253i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f10254j;

        /* renamed from: k, reason: collision with root package name */
        int f10255k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f10256l;

        /* renamed from: m, reason: collision with root package name */
        private String f10257m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f10245a = new Matrix();
            this.f10246b = new ArrayList<>();
            this.f10247c = 0.0f;
            this.f10248d = 0.0f;
            this.f10249e = 0.0f;
            this.f10250f = 1.0f;
            this.f10251g = 1.0f;
            this.f10252h = 0.0f;
            this.f10253i = 0.0f;
            Matrix matrix = new Matrix();
            this.f10254j = matrix;
            this.f10257m = null;
            this.f10247c = dVar.f10247c;
            this.f10248d = dVar.f10248d;
            this.f10249e = dVar.f10249e;
            this.f10250f = dVar.f10250f;
            this.f10251g = dVar.f10251g;
            this.f10252h = dVar.f10252h;
            this.f10253i = dVar.f10253i;
            this.f10256l = dVar.f10256l;
            String str = dVar.f10257m;
            this.f10257m = str;
            this.f10255k = dVar.f10255k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f10254j);
            ArrayList<e> arrayList = dVar.f10246b;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                e eVar = arrayList.get(i5);
                if (eVar instanceof d) {
                    this.f10246b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f10246b.add(bVar);
                    String str2 = bVar.f10260b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f10254j.reset();
            this.f10254j.postTranslate(-this.f10248d, -this.f10249e);
            this.f10254j.postScale(this.f10250f, this.f10251g);
            this.f10254j.postRotate(this.f10247c, 0.0f, 0.0f);
            this.f10254j.postTranslate(this.f10252h + this.f10248d, this.f10253i + this.f10249e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f10256l = null;
            this.f10247c = p.j(typedArray, xmlPullParser, "rotation", 5, this.f10247c);
            this.f10248d = typedArray.getFloat(1, this.f10248d);
            this.f10249e = typedArray.getFloat(2, this.f10249e);
            this.f10250f = p.j(typedArray, xmlPullParser, "scaleX", 3, this.f10250f);
            this.f10251g = p.j(typedArray, xmlPullParser, "scaleY", 4, this.f10251g);
            this.f10252h = p.j(typedArray, xmlPullParser, "translateX", 6, this.f10252h);
            this.f10253i = p.j(typedArray, xmlPullParser, "translateY", 7, this.f10253i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f10257m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i5 = 0; i5 < this.f10246b.size(); i5++) {
                if (this.f10246b.get(i5).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean z5 = false;
            for (int i5 = 0; i5 < this.f10246b.size(); i5++) {
                z5 |= this.f10246b.get(i5).b(iArr);
            }
            return z5;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s5 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f10152k);
            e(s5, xmlPullParser);
            s5.recycle();
        }

        public String getGroupName() {
            return this.f10257m;
        }

        public Matrix getLocalMatrix() {
            return this.f10254j;
        }

        public float getPivotX() {
            return this.f10248d;
        }

        public float getPivotY() {
            return this.f10249e;
        }

        public float getRotation() {
            return this.f10247c;
        }

        public float getScaleX() {
            return this.f10250f;
        }

        public float getScaleY() {
            return this.f10251g;
        }

        public float getTranslateX() {
            return this.f10252h;
        }

        public float getTranslateY() {
            return this.f10253i;
        }

        public void setPivotX(float f6) {
            if (f6 != this.f10248d) {
                this.f10248d = f6;
                d();
            }
        }

        public void setPivotY(float f6) {
            if (f6 != this.f10249e) {
                this.f10249e = f6;
                d();
            }
        }

        public void setRotation(float f6) {
            if (f6 != this.f10247c) {
                this.f10247c = f6;
                d();
            }
        }

        public void setScaleX(float f6) {
            if (f6 != this.f10250f) {
                this.f10250f = f6;
                d();
            }
        }

        public void setScaleY(float f6) {
            if (f6 != this.f10251g) {
                this.f10251g = f6;
                d();
            }
        }

        public void setTranslateX(float f6) {
            if (f6 != this.f10252h) {
                this.f10252h = f6;
                d();
            }
        }

        public void setTranslateY(float f6) {
            if (f6 != this.f10253i) {
                this.f10253i = f6;
                d();
            }
        }

        public d() {
            super();
            this.f10245a = new Matrix();
            this.f10246b = new ArrayList<>();
            this.f10247c = 0.0f;
            this.f10248d = 0.0f;
            this.f10249e = 0.0f;
            this.f10250f = 1.0f;
            this.f10251g = 1.0f;
            this.f10252h = 0.0f;
            this.f10253i = 0.0f;
            this.f10254j = new Matrix();
            this.f10257m = null;
        }
    }
}
