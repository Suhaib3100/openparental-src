package androidx.compose.ui.text;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TextMeasurer.kt */
@m1
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u008a\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!Jt\u0010#\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/text/o0;", "", "Landroidx/compose/ui/text/font/y$b;", "defaultFontFamilyResolver", "Landroidx/compose/ui/unit/d;", "defaultDensity", "Landroidx/compose/ui/unit/w;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Landroidx/compose/ui/text/font/y$b;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;I)V", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "maxLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Landroidx/compose/ui/unit/b;", "constraints", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Landroidx/compose/ui/text/n0;", "c", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;IZILjava/util/List;JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Z)Landroidx/compose/ui/text/n0;", "", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/v0;IZIJLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Z)Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/text/font/y$b;", "b", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/w;", "d", "I", "Landroidx/compose/ui/text/l0;", "e", "Landroidx/compose/ui/text/l0;", "textLayoutCache", "f", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    public static final int f21212g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b defaultFontFamilyResolver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d defaultDensity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.w defaultLayoutDirection;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int cacheSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final l0 textLayoutCache;

    /* compiled from: TextMeasurer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/o0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/m0;", "textLayoutInput", "Landroidx/compose/ui/text/n0;", "b", "(Landroidx/compose/ui/text/m0;)Landroidx/compose/ui/text/n0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.o0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
        
            if (androidx.compose.ui.text.style.t.g(r1, androidx.compose.ui.text.style.t.f21405d) != false) goto L6;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.text.n0 b(androidx.compose.ui.text.m0 r18) {
            /*
                r17 = this;
                androidx.compose.ui.text.e r1 = r18.getText()
                androidx.compose.ui.text.v0 r0 = r18.getStyle()
                androidx.compose.ui.unit.w r2 = r18.getLayoutDirection()
                androidx.compose.ui.text.v0 r2 = androidx.compose.ui.text.w0.d(r0, r2)
                androidx.compose.ui.unit.d r4 = r18.getDensity()
                androidx.compose.ui.text.font.y$b r5 = r18.getFontFamilyResolver()
                java.util.List r3 = r18.i()
                androidx.compose.ui.text.p r7 = new androidx.compose.ui.text.p
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                long r0 = r18.getConstraints()
                int r0 = androidx.compose.ui.unit.b.r(r0)
                boolean r1 = r18.getSoftWrap()
                if (r1 != 0) goto L43
                int r1 = r18.getOverflow()
                androidx.compose.ui.text.style.t$a r2 = androidx.compose.ui.text.style.t.INSTANCE
                r2.getClass()
                int r2 = androidx.compose.ui.text.style.t.b()
                boolean r1 = androidx.compose.ui.text.style.t.g(r1, r2)
                if (r1 == 0) goto L56
            L43:
                long r1 = r18.getConstraints()
                boolean r1 = androidx.compose.ui.unit.b.j(r1)
                if (r1 == 0) goto L56
                long r1 = r18.getConstraints()
                int r1 = androidx.compose.ui.unit.b.p(r1)
                goto L59
            L56:
                r1 = 2147483647(0x7fffffff, float:NaN)
            L59:
                boolean r2 = r18.getSoftWrap()
                if (r2 != 0) goto L75
                int r2 = r18.getOverflow()
                androidx.compose.ui.text.style.t$a r3 = androidx.compose.ui.text.style.t.INSTANCE
                r3.getClass()
                int r3 = androidx.compose.ui.text.style.t.b()
                boolean r2 = androidx.compose.ui.text.style.t.g(r2, r3)
                if (r2 == 0) goto L75
                r2 = 1
            L73:
                r10 = r2
                goto L7a
            L75:
                int r2 = r18.getMaxLines()
                goto L73
            L7a:
                if (r0 != r1) goto L7e
            L7c:
                r12 = r1
                goto L8b
            L7e:
                float r2 = r7.a()
                int r2 = androidx.compose.ui.text.x.k(r2)
                int r1 = kotlin.ranges.s.I(r2, r0, r1)
                goto L7c
            L8b:
                androidx.compose.ui.text.o r2 = new androidx.compose.ui.text.o
                long r0 = r18.getConstraints()
                int r14 = androidx.compose.ui.unit.b.o(r0)
                r15 = 5
                r16 = 0
                r11 = 0
                r13 = 0
                long r8 = androidx.compose.ui.unit.c.b(r11, r12, r13, r14, r15, r16)
                int r0 = r18.getOverflow()
                androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
                r1.getClass()
                int r1 = androidx.compose.ui.text.style.t.b()
                boolean r11 = androidx.compose.ui.text.style.t.g(r0, r1)
                r12 = 0
                r6 = r2
                r6.<init>(r7, r8, r10, r11, r12)
                androidx.compose.ui.text.n0 r6 = new androidx.compose.ui.text.n0
                long r0 = r18.getConstraints()
                float r3 = r2.getWidth()
                double r3 = (double) r3
                double r3 = java.lang.Math.ceil(r3)
                float r3 = (float) r3
                int r3 = (int) r3
                float r4 = r2.getHeight()
                double r4 = (double) r4
                double r4 = java.lang.Math.ceil(r4)
                float r4 = (float) r4
                int r4 = (int) r4
                long r3 = androidx.compose.ui.unit.v.a(r3, r4)
                long r3 = androidx.compose.ui.unit.c.d(r0, r3)
                r5 = 0
                r0 = r6
                r1 = r18
                r0.<init>(r1, r2, r3, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.o0.Companion.b(androidx.compose.ui.text.m0):androidx.compose.ui.text.n0");
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public o0(@fg.l y.b bVar, @fg.l androidx.compose.ui.unit.d dVar, @fg.l androidx.compose.ui.unit.w wVar, int i4) {
        this.defaultFontFamilyResolver = bVar;
        this.defaultDensity = dVar;
        this.defaultLayoutDirection = wVar;
        this.cacheSize = i4;
        this.textLayoutCache = i4 > 0 ? new l0(i4) : null;
    }

    public static n0 b(o0 o0Var, String str, v0 v0Var, int i4, boolean z4, int i5, long j4, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar, y.b bVar, boolean z5, int i6, Object obj) {
        v0 v0Var2;
        int i7;
        if ((i6 & 2) != 0) {
            v0.INSTANCE.getClass();
            v0Var2 = v0.f21425f;
        } else {
            v0Var2 = v0Var;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.t.f21404c;
        } else {
            i7 = i4;
        }
        return o0Var.a(str, v0Var2, i7, (i6 & 8) != 0 ? true : z4, (i6 & 16) != 0 ? Integer.MAX_VALUE : i5, (i6 & 32) != 0 ? androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null) : j4, (i6 & 64) != 0 ? o0Var.defaultLayoutDirection : wVar, (i6 & 128) != 0 ? o0Var.defaultDensity : dVar, (i6 & 256) != 0 ? o0Var.defaultFontFamilyResolver : bVar, (i6 & 512) != 0 ? false : z5);
    }

    public static n0 d(o0 o0Var, e eVar, v0 v0Var, int i4, boolean z4, int i5, List list, long j4, androidx.compose.ui.unit.w wVar, androidx.compose.ui.unit.d dVar, y.b bVar, boolean z5, int i6, Object obj) {
        v0 v0Var2;
        int i7;
        if ((i6 & 2) != 0) {
            v0.INSTANCE.getClass();
            v0Var2 = v0.f21425f;
        } else {
            v0Var2 = v0Var;
        }
        if ((i6 & 4) != 0) {
            androidx.compose.ui.text.style.t.INSTANCE.getClass();
            i7 = androidx.compose.ui.text.style.t.f21404c;
        } else {
            i7 = i4;
        }
        return o0Var.c(eVar, v0Var2, i7, (i6 & 8) != 0 ? true : z4, (i6 & 16) != 0 ? Integer.MAX_VALUE : i5, (i6 & 32) != 0 ? kotlin.collections.j0.f74919b : list, (i6 & 64) != 0 ? androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null) : j4, (i6 & 128) != 0 ? o0Var.defaultLayoutDirection : wVar, (i6 & 256) != 0 ? o0Var.defaultDensity : dVar, (i6 & 512) != 0 ? o0Var.defaultFontFamilyResolver : bVar, (i6 & 1024) != 0 ? false : z5);
    }

    @x4
    @fg.l
    public final n0 a(@fg.l String text, @fg.l v0 style, int overflow, boolean softWrap, int maxLines, long constraints, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density, @fg.l y.b fontFamilyResolver, boolean skipCache) {
        return d(this, new e(text, null, null, 6, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    @x4
    @fg.l
    public final n0 c(@fg.l e text, @fg.l v0 style, int overflow, boolean softWrap, int maxLines, @fg.l List<e.b<a0>> placeholders, long constraints, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density, @fg.l y.b fontFamilyResolver, boolean skipCache) {
        l0 l0Var;
        m0 m0Var = new m0(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (kotlin.jvm.internal.w) null);
        n0 a5 = (skipCache || (l0Var = this.textLayoutCache) == null) ? null : l0Var.a(m0Var);
        if (a5 != null) {
            return a5.a(m0Var, androidx.compose.ui.unit.c.d(constraints, androidx.compose.ui.unit.v.a(x.k(a5.getMultiParagraph().getWidth()), x.k(a5.getMultiParagraph().getHeight()))));
        }
        n0 b5 = INSTANCE.b(m0Var);
        l0 l0Var2 = this.textLayoutCache;
        if (l0Var2 == null) {
            return b5;
        }
        l0Var2.b(m0Var, b5);
        return b5;
    }

    public /* synthetic */ o0(y.b bVar, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, int i4, int i5, kotlin.jvm.internal.w wVar2) {
        this(bVar, dVar, wVar, (i5 & 8) != 0 ? q0.f21294a : i4);
    }
}
