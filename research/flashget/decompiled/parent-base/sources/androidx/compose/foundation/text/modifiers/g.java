package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.c;
import androidx.compose.foundation.text.n0;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.s;
import androidx.compose.ui.text.style.t;
import androidx.compose.ui.text.v;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import androidx.compose.ui.unit.w;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ParagraphLayoutCache.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b \u0010\u001cJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b+\u0010*R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u001c\u00108\u001a\u0002068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u00107R.\u0010?\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u0001098\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010;\u001a\u0004\b,\u0010<\"\u0004\b=\u0010>R$\u0010D\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010@\u001a\u0004\b4\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b.\u0010E\"\u0004\bF\u0010GR(\u0010M\u001a\u00020I8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001b\u00107\u001a\u0004\b0\u0010J\"\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010SR\u001c\u0010U\u001a\u00020\u00168\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bK\u00107R\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00103R\u0016\u0010W\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00103R\u0014\u0010Y\u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/text/modifiers/g;", "", "", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;IZIILkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/v;", "o", "(Landroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/v;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/text/s;", "g", "(JLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/s;", "l", "(JLandroidx/compose/ui/unit/w;)Z", "Lkotlin/k2;", "i", "()V", "h", "width", "f", "(ILandroidx/compose/ui/unit/w;)I", "s", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;IZII)V", "Landroidx/compose/ui/text/n0;", "r", "(Landroidx/compose/ui/text/v0;)Landroidx/compose/ui/text/n0;", "k", "(Landroidx/compose/ui/unit/w;)I", "j", "a", "Ljava/lang/String;", "b", "Landroidx/compose/ui/text/v0;", "c", "Landroidx/compose/ui/text/font/y$b;", "d", "I", "e", "Z", "Landroidx/compose/foundation/text/modifiers/a;", "J", "lastDensity", "Landroidx/compose/ui/unit/d;", "value", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "m", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/ui/text/s;", "()Landroidx/compose/ui/text/s;", "q", "(Landroidx/compose/ui/text/s;)V", "paragraph", "()Z", "n", "(Z)V", "didOverflow", "Landroidx/compose/ui/unit/u;", "()J", "p", "(J)V", "layoutSize", "Landroidx/compose/foundation/text/modifiers/c;", "Landroidx/compose/foundation/text/modifiers/c;", "mMinLinesConstrainer", "Landroidx/compose/ui/text/v;", "paragraphIntrinsics", "Landroidx/compose/ui/unit/w;", "intrinsicsLayoutDirection", "prevConstraints", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "()Lkotlin/k2;", "observeFontChanges", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n1#2:395\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: s, reason: collision with root package name */
    public static final int f7746s = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private v0 style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private y.b fontFamilyResolver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.d density;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s paragraph;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean didOverflow;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long layoutSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private c mMinLinesConstrainer;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private v paragraphIntrinsics;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private w intrinsicsLayoutDirection;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long prevConstraints;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ g(String str, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, kotlin.jvm.internal.w wVar) {
        this(str, v0Var, bVar, i4, z4, i5, i6);
    }

    private final s g(long constraints, w layoutDirection) {
        v o4 = o(layoutDirection);
        long a5 = b.a(constraints, this.softWrap, this.overflow, o4.a());
        int b5 = b.b(this.softWrap, this.overflow, this.maxLines);
        int i4 = this.overflow;
        t.INSTANCE.getClass();
        return androidx.compose.ui.text.platform.i.b(o4, b5, t.g(i4, t.f21405d), a5);
    }

    private final void i() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = androidx.compose.ui.unit.b.INSTANCE.c(0, 0);
        this.layoutSize = androidx.compose.ui.unit.v.a(0, 0);
        this.didOverflow = false;
    }

    private final boolean l(long constraints, w layoutDirection) {
        v vVar;
        s sVar = this.paragraph;
        if (sVar == null || (vVar = this.paragraphIntrinsics) == null || vVar.c() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (androidx.compose.ui.unit.b.g(constraints, this.prevConstraints)) {
            return false;
        }
        return androidx.compose.ui.unit.b.p(constraints) != androidx.compose.ui.unit.b.p(this.prevConstraints) || ((float) androidx.compose.ui.unit.b.o(constraints)) < sVar.getHeight() || sVar.r();
    }

    private final v o(w layoutDirection) {
        v vVar = this.paragraphIntrinsics;
        if (vVar == null || layoutDirection != this.intrinsicsLayoutDirection || vVar.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            v0 d5 = w0.d(this.style, layoutDirection);
            androidx.compose.ui.unit.d dVar = this.density;
            l0.m(dVar);
            vVar = androidx.compose.ui.text.w.d(str, d5, null, null, dVar, this.fontFamilyResolver, 12, null);
        }
        this.paragraphIntrinsics = vVar;
        return vVar;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* renamed from: c, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    @fg.l
    public final k2 d() {
        v vVar = this.paragraphIntrinsics;
        if (vVar != null) {
            vVar.c();
        }
        return k2.f75408a;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final s getParagraph() {
        return this.paragraph;
    }

    public final int f(int width, @fg.l w layoutDirection) {
        int i4 = this.cachedIntrinsicHeightInputWidth;
        int i5 = this.cachedIntrinsicHeight;
        if (width == i4 && i4 != -1) {
            return i5;
        }
        int a5 = n0.a(g(androidx.compose.ui.unit.c.a(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = a5;
        return a5;
    }

    public final boolean h(long constraints, @fg.l w layoutDirection) {
        boolean z4 = true;
        if (this.minLines > 1) {
            c.Companion companion = c.INSTANCE;
            c cVar = this.mMinLinesConstrainer;
            v0 v0Var = this.style;
            androidx.compose.ui.unit.d dVar = this.density;
            l0.m(dVar);
            c a5 = companion.a(cVar, layoutDirection, v0Var, dVar, this.fontFamilyResolver);
            this.mMinLinesConstrainer = a5;
            constraints = a5.c(constraints, this.minLines);
        }
        boolean z5 = false;
        if (l(constraints, layoutDirection)) {
            s g4 = g(constraints, layoutDirection);
            this.prevConstraints = constraints;
            this.layoutSize = androidx.compose.ui.unit.c.d(constraints, androidx.compose.ui.unit.v.a(n0.a(g4.getWidth()), n0.a(g4.getHeight())));
            int i4 = this.overflow;
            t.INSTANCE.getClass();
            if (!t.g(i4, t.f21406e) && (androidx.compose.ui.unit.u.m(r9) < g4.getWidth() || ((int) (r9 & 4294967295L)) < g4.getHeight())) {
                z5 = true;
            }
            this.didOverflow = z5;
            this.paragraph = g4;
            return true;
        }
        if (!androidx.compose.ui.unit.b.g(constraints, this.prevConstraints)) {
            s sVar = this.paragraph;
            l0.m(sVar);
            this.layoutSize = androidx.compose.ui.unit.c.d(constraints, androidx.compose.ui.unit.v.a(n0.a(Math.min(sVar.a(), sVar.getWidth())), n0.a(sVar.getHeight())));
            int i5 = this.overflow;
            t.INSTANCE.getClass();
            if (t.g(i5, t.f21406e) || (androidx.compose.ui.unit.u.m(r5) >= sVar.getWidth() && ((int) (4294967295L & r5)) >= sVar.getHeight())) {
                z4 = false;
            }
            this.didOverflow = z4;
            this.prevConstraints = constraints;
        }
        return false;
    }

    public final int j(@fg.l w layoutDirection) {
        return n0.a(o(layoutDirection).a());
    }

    public final int k(@fg.l w layoutDirection) {
        return n0.a(o(layoutDirection).b());
    }

    public final void m(@fg.m androidx.compose.ui.unit.d dVar) {
        long j4;
        androidx.compose.ui.unit.d dVar2 = this.density;
        if (dVar != null) {
            j4 = a.e(dVar);
        } else {
            a.INSTANCE.getClass();
            j4 = a.f7710c;
        }
        if (dVar2 == null) {
            this.density = dVar;
            this.lastDensity = j4;
        } else if (dVar == null || !a.g(this.lastDensity, j4)) {
            this.density = dVar;
            this.lastDensity = j4;
            i();
        }
    }

    public final void n(boolean z4) {
        this.didOverflow = z4;
    }

    public final void p(long j4) {
        this.layoutSize = j4;
    }

    public final void q(@fg.m s sVar) {
        this.paragraph = sVar;
    }

    @fg.m
    public final androidx.compose.ui.text.n0 r(@fg.l v0 style) {
        androidx.compose.ui.unit.d dVar;
        w wVar = this.intrinsicsLayoutDirection;
        if (wVar == null || (dVar = this.density) == null) {
            return null;
        }
        androidx.compose.ui.text.e eVar = new androidx.compose.ui.text.e(this.text, null, null, 6, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long e4 = androidx.compose.ui.unit.b.e(this.prevConstraints, 0, 0, 0, 0, 10, null);
        j0 j0Var = j0.f74919b;
        m0 m0Var = new m0(eVar, style, j0Var, this.maxLines, this.softWrap, this.overflow, dVar, wVar, this.fontFamilyResolver, e4, (kotlin.jvm.internal.w) null);
        p pVar = new p(eVar, style, j0Var, dVar, this.fontFamilyResolver);
        int i4 = this.maxLines;
        int i5 = this.overflow;
        t.INSTANCE.getClass();
        return new androidx.compose.ui.text.n0(m0Var, new androidx.compose.ui.text.o(pVar, e4, i4, t.g(i5, t.f21405d), null), this.layoutSize, null);
    }

    public final void s(@fg.l String text, @fg.l v0 style, @fg.l y.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        i();
    }

    private g(String str, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6) {
        this.text = str;
        this.style = v0Var;
        this.fontFamilyResolver = bVar;
        this.overflow = i4;
        this.softWrap = z4;
        this.maxLines = i5;
        this.minLines = i6;
        a.INSTANCE.getClass();
        this.lastDensity = a.f7710c;
        this.layoutSize = androidx.compose.ui.unit.v.a(0, 0);
        this.prevConstraints = androidx.compose.ui.unit.b.INSTANCE.c(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.String r10, androidx.compose.ui.text.v0 r11, androidx.compose.ui.text.font.y.b r12, int r13, boolean r14, int r15, int r16, int r17, kotlin.jvm.internal.w r18) {
        /*
            r9 = this;
            r0 = r17 & 8
            if (r0 == 0) goto Lf
            androidx.compose.ui.text.style.t$a r0 = androidx.compose.ui.text.style.t.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.text.style.t.a()
            r5 = r0
            goto L10
        Lf:
            r5 = r13
        L10:
            r0 = r17 & 16
            r1 = 1
            if (r0 == 0) goto L17
            r6 = r1
            goto L18
        L17:
            r6 = r14
        L18:
            r0 = r17 & 32
            if (r0 == 0) goto L21
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7 = r0
            goto L22
        L21:
            r7 = r15
        L22:
            r0 = r17 & 64
            if (r0 == 0) goto L28
            r8 = r1
            goto L2a
        L28:
            r8 = r16
        L2a:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.g.<init>(java.lang.String, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, int, boolean, int, int, int, kotlin.jvm.internal.w):void");
    }
}
