package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.c;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.style.t;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import androidx.compose.ui.unit.v;
import androidx.compose.ui.unit.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: MultiParagraphLayoutCache.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J(\u0010$\u001a\u00020\n*\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b4\u00103R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u0010;R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010<R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010;R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010;R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010?R\u001c\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010BR.\u0010J\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010F\u001a\u0004\b5\u0010G\"\u0004\bH\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010OR\u0016\u0010Q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010;R\u0016\u0010S\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010;R\u0011\u0010U\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b9\u0010TR\u0013\u0010V\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b7\u0010T\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/foundation/text/modifiers/f;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;IZIILjava/util/List;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/b;", "finalConstraints", "Landroidx/compose/ui/text/o;", "multiParagraph", "Landroidx/compose/ui/text/n0;", "n", "(Landroidx/compose/ui/unit/w;JLandroidx/compose/ui/text/o;)Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/text/p;", "m", "(Landroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/p;", "constraints", "e", "(JLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/o;", "k", "(Landroidx/compose/ui/text/n0;JLandroidx/compose/ui/unit/w;)Z", "i", "(J)I", "Lkotlin/k2;", "g", "()V", "f", "(JLandroidx/compose/ui/unit/w;)Z", "width", "d", "(ILandroidx/compose/ui/unit/w;)I", "o", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;IZIILjava/util/List;)V", "h", "(Landroidx/compose/ui/unit/w;)I", "j", "a", "Landroidx/compose/ui/text/e;", "b", "Landroidx/compose/ui/text/v0;", "c", "Landroidx/compose/ui/text/font/y$b;", "I", "Z", "Ljava/util/List;", "Landroidx/compose/foundation/text/modifiers/c;", "Landroidx/compose/foundation/text/modifiers/c;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/a;", "J", "lastDensity", "Landroidx/compose/ui/unit/d;", "value", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "l", "(Landroidx/compose/ui/unit/d;)V", "density", "Landroidx/compose/ui/text/p;", "paragraphIntrinsics", "Landroidx/compose/ui/unit/w;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/text/n0;", "layoutCache", "cachedIntrinsicHeightInputWidth", "p", "cachedIntrinsicHeight", "()Landroidx/compose/ui/text/n0;", "textLayoutResult", "layoutOrNull", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: q, reason: collision with root package name */
    public static final int f7729q = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.e text;

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
    @fg.m
    private List<e.b<a0>> placeholders;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private c mMinLinesConstrainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long lastDensity;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.d density;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p paragraphIntrinsics;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private w intrinsicsLayoutDirection;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private n0 layoutCache;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    public /* synthetic */ f(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, List list, kotlin.jvm.internal.w wVar) {
        this(eVar, v0Var, bVar, i4, z4, i5, i6, list);
    }

    private final androidx.compose.ui.text.o e(long constraints, w layoutDirection) {
        p m4 = m(layoutDirection);
        long a5 = b.a(constraints, this.softWrap, this.overflow, m4.a());
        int b5 = b.b(this.softWrap, this.overflow, this.maxLines);
        int i4 = this.overflow;
        t.INSTANCE.getClass();
        return new androidx.compose.ui.text.o(m4, a5, b5, t.g(i4, t.f21405d), null);
    }

    private final void g() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final int i(long constraints) {
        boolean z4 = this.softWrap;
        int i4 = this.overflow;
        p pVar = this.paragraphIntrinsics;
        l0.m(pVar);
        return b.c(constraints, z4, i4, pVar.a());
    }

    private final boolean k(n0 n0Var, long j4, w wVar) {
        if (n0Var == null || n0Var.getMultiParagraph().getIntrinsics().c() || wVar != n0Var.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (androidx.compose.ui.unit.b.g(j4, n0Var.getLayoutInput().getConstraints())) {
            return false;
        }
        return androidx.compose.ui.unit.b.p(j4) != androidx.compose.ui.unit.b.p(n0Var.getLayoutInput().getConstraints()) || ((float) androidx.compose.ui.unit.b.o(j4)) < n0Var.getMultiParagraph().getHeight() || n0Var.getMultiParagraph().getDidExceedMaxLines();
    }

    private final p m(w layoutDirection) {
        p pVar = this.paragraphIntrinsics;
        if (pVar == null || layoutDirection != this.intrinsicsLayoutDirection || pVar.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            androidx.compose.ui.text.e eVar = this.text;
            v0 d5 = w0.d(this.style, layoutDirection);
            androidx.compose.ui.unit.d dVar = this.density;
            l0.m(dVar);
            y.b bVar = this.fontFamilyResolver;
            List list = this.placeholders;
            if (list == null) {
                list = j0.f74919b;
            }
            pVar = new p(eVar, d5, (List<e.b<a0>>) list, dVar, bVar);
        }
        this.paragraphIntrinsics = pVar;
        return pVar;
    }

    private final n0 n(w layoutDirection, long finalConstraints, androidx.compose.ui.text.o multiParagraph) {
        float min = Math.min(multiParagraph.getIntrinsics().a(), multiParagraph.getWidth());
        androidx.compose.ui.text.e eVar = this.text;
        v0 v0Var = this.style;
        List list = this.placeholders;
        if (list == null) {
            list = j0.f74919b;
        }
        List list2 = list;
        int i4 = this.maxLines;
        boolean z4 = this.softWrap;
        int i5 = this.overflow;
        androidx.compose.ui.unit.d dVar = this.density;
        l0.m(dVar);
        return new n0(new m0(eVar, v0Var, list2, i4, z4, i5, dVar, layoutDirection, this.fontFamilyResolver, finalConstraints, (kotlin.jvm.internal.w) null), multiParagraph, androidx.compose.ui.unit.c.d(finalConstraints, v.a(androidx.compose.foundation.text.n0.a(min), androidx.compose.foundation.text.n0.a(multiParagraph.getHeight()))), null);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final n0 getLayoutCache() {
        return this.layoutCache;
    }

    @fg.l
    public final n0 c() {
        n0 n0Var = this.layoutCache;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int width, @fg.l w layoutDirection) {
        int i4 = this.cachedIntrinsicHeightInputWidth;
        int i5 = this.cachedIntrinsicHeight;
        if (width == i4 && i4 != -1) {
            return i5;
        }
        int a5 = androidx.compose.foundation.text.n0.a(e(androidx.compose.ui.unit.c.a(0, width, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = a5;
        return a5;
    }

    public final boolean f(long constraints, @fg.l w layoutDirection) {
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
        if (k(this.layoutCache, constraints, layoutDirection)) {
            this.layoutCache = n(layoutDirection, constraints, e(constraints, layoutDirection));
            return true;
        }
        n0 n0Var = this.layoutCache;
        l0.m(n0Var);
        if (androidx.compose.ui.unit.b.g(constraints, n0Var.getLayoutInput().getConstraints())) {
            return false;
        }
        n0 n0Var2 = this.layoutCache;
        l0.m(n0Var2);
        this.layoutCache = n(layoutDirection, constraints, n0Var2.getMultiParagraph());
        return true;
    }

    public final int h(@fg.l w layoutDirection) {
        return androidx.compose.foundation.text.n0.a(m(layoutDirection).a());
    }

    public final int j(@fg.l w layoutDirection) {
        return androidx.compose.foundation.text.n0.a(m(layoutDirection).b());
    }

    public final void l(@fg.m androidx.compose.ui.unit.d dVar) {
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
            g();
        }
    }

    public final void o(@fg.l androidx.compose.ui.text.e text, @fg.l v0 style, @fg.l y.b fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, @fg.m List<e.b<a0>> placeholders) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        g();
    }

    private f(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, int i4, boolean z4, int i5, int i6, List<e.b<a0>> list) {
        this.text = eVar;
        this.style = v0Var;
        this.fontFamilyResolver = bVar;
        this.overflow = i4;
        this.softWrap = z4;
        this.maxLines = i5;
        this.minLines = i6;
        this.placeholders = list;
        a.INSTANCE.getClass();
        this.lastDensity = a.f7710c;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(androidx.compose.ui.text.e r12, androidx.compose.ui.text.v0 r13, androidx.compose.ui.text.font.y.b r14, int r15, boolean r16, int r17, int r18, java.util.List r19, int r20, kotlin.jvm.internal.w r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L11
            androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.t.a()
            r6 = r1
            goto L12
        L11:
            r6 = r15
        L12:
            r1 = r0 & 16
            r2 = 1
            if (r1 == 0) goto L19
            r7 = r2
            goto L1b
        L19:
            r7 = r16
        L1b:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2147483647(0x7fffffff, float:NaN)
            r8 = r1
            goto L26
        L24:
            r8 = r17
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2c
            r9 = r2
            goto L2e
        L2c:
            r9 = r18
        L2e:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L35
            r0 = 0
            r10 = r0
            goto L37
        L35:
            r10 = r19
        L37:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.f.<init>(androidx.compose.ui.text.e, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, int, boolean, int, int, java.util.List, int, kotlin.jvm.internal.w):void");
    }
}
