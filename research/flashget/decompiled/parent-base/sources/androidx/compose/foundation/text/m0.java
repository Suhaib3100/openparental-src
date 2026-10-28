package androidx.compose.foundation.text;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.v1;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextDelegate.kt */
@v
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 42\u00020\u0001:\u0001%Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J,\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b4\u00105R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b%\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b)\u0010<R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?R$\u0010F\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bA\u0010C\"\u0004\bD\u0010ER$\u0010J\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010G\u001a\u0004\b-\u0010H\"\u0004\bI\u0010 R\u0014\u0010K\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010CR\u0011\u0010L\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b6\u00100R\u0011\u0010M\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b1\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/text/m0;", "", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "", "maxLines", "minLines", "", "softWrap", "Landroidx/compose/ui/text/style/t;", "overflow", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;IIZILandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/o;", "r", "(JLandroidx/compose/ui/unit/w;)Landroidx/compose/ui/text/o;", "Lkotlin/k2;", "q", "(Landroidx/compose/ui/unit/w;)V", "Landroidx/compose/ui/text/n0;", "prevResult", "o", "(JLandroidx/compose/ui/unit/w;Landroidx/compose/ui/text/n0;)Landroidx/compose/ui/text/n0;", "a", "Landroidx/compose/ui/text/e;", "n", "()Landroidx/compose/ui/text/e;", "b", "Landroidx/compose/ui/text/v0;", "m", "()Landroidx/compose/ui/text/v0;", "c", "I", "e", "()I", "d", "g", "Z", "l", "()Z", "f", "i", "Landroidx/compose/ui/unit/d;", "()Landroidx/compose/ui/unit/d;", "h", "Landroidx/compose/ui/text/font/y$b;", "()Landroidx/compose/ui/text/font/y$b;", "Ljava/util/List;", "k", "()Ljava/util/List;", "Landroidx/compose/ui/text/p;", "j", "Landroidx/compose/ui/text/p;", "()Landroidx/compose/ui/text/p;", "t", "(Landroidx/compose/ui/text/p;)V", "paragraphIntrinsics", "Landroidx/compose/ui/unit/w;", "()Landroidx/compose/ui/unit/w;", "s", "intrinsicsLayoutDirection", "nonNullIntrinsics", "minIntrinsicWidth", "maxIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: m, reason: collision with root package name */
    public static final int f7659m = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.e text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.v0 style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.unit.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y.b fontFamilyResolver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<e.b<androidx.compose.ui.text.a0>> placeholders;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.p paragraphIntrinsics;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.w intrinsicsLayoutDirection;

    /* compiled from: TextDelegate.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/m0$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/v1;", "canvas", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/v1;Landroidx/compose/ui/text/n0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.m0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final void a(@fg.l v1 canvas, @fg.l androidx.compose.ui.text.n0 textLayoutResult) {
            androidx.compose.ui.text.r0.f21295a.a(canvas, textLayoutResult);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ m0(androidx.compose.ui.text.e eVar, androidx.compose.ui.text.v0 v0Var, int i4, int i5, boolean z4, int i6, androidx.compose.ui.unit.d dVar, y.b bVar, List list, kotlin.jvm.internal.w wVar) {
        this(eVar, v0Var, i4, i5, z4, i6, dVar, bVar, list);
    }

    private final androidx.compose.ui.text.p h() {
        androidx.compose.ui.text.p pVar = this.paragraphIntrinsics;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public static /* synthetic */ androidx.compose.ui.text.n0 p(m0 m0Var, long j4, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.n0 n0Var, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            n0Var = null;
        }
        return m0Var.o(j4, wVar, n0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (androidx.compose.ui.text.style.t.g(r2, androidx.compose.ui.text.style.t.f21405d) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.text.o r(long r16, androidx.compose.ui.unit.w r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            r15.q(r1)
            int r1 = androidx.compose.ui.unit.b.r(r16)
            boolean r2 = r0.softWrap
            if (r2 != 0) goto L1f
            int r2 = r0.overflow
            androidx.compose.ui.text.style.t$a r3 = androidx.compose.ui.text.style.t.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.t.b()
            boolean r2 = androidx.compose.ui.text.style.t.g(r2, r3)
            if (r2 == 0) goto L2a
        L1f:
            boolean r2 = androidx.compose.ui.unit.b.j(r16)
            if (r2 == 0) goto L2a
            int r2 = androidx.compose.ui.unit.b.p(r16)
            goto L2d
        L2a:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L2d:
            boolean r3 = r0.softWrap
            if (r3 != 0) goto L45
            int r3 = r0.overflow
            androidx.compose.ui.text.style.t$a r4 = androidx.compose.ui.text.style.t.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.text.style.t.b()
            boolean r3 = androidx.compose.ui.text.style.t.g(r3, r4)
            if (r3 == 0) goto L45
            r3 = 1
        L43:
            r8 = r3
            goto L48
        L45:
            int r3 = r0.maxLines
            goto L43
        L48:
            if (r1 != r2) goto L4c
        L4a:
            r10 = r2
            goto L55
        L4c:
            int r3 = r15.d()
            int r2 = kotlin.ranges.s.I(r3, r1, r2)
            goto L4a
        L55:
            androidx.compose.ui.text.o r1 = new androidx.compose.ui.text.o
            androidx.compose.ui.text.p r5 = r15.h()
            int r12 = androidx.compose.ui.unit.b.o(r16)
            r13 = 5
            r14 = 0
            r9 = 0
            r11 = 0
            long r6 = androidx.compose.ui.unit.c.b(r9, r10, r11, r12, r13, r14)
            int r2 = r0.overflow
            androidx.compose.ui.text.style.t$a r3 = androidx.compose.ui.text.style.t.INSTANCE
            r3.getClass()
            int r3 = androidx.compose.ui.text.style.t.b()
            boolean r9 = androidx.compose.ui.text.style.t.g(r2, r3)
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.m0.r(long, androidx.compose.ui.unit.w):androidx.compose.ui.text.o");
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final y.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.unit.w getIntrinsicsLayoutDirection() {
        return this.intrinsicsLayoutDirection;
    }

    public final int d() {
        return n0.a(h().a());
    }

    /* renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int f() {
        return n0.a(h().b());
    }

    /* renamed from: g, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: i, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    @fg.m
    /* renamed from: j, reason: from getter */
    public final androidx.compose.ui.text.p getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @fg.l
    public final List<e.b<androidx.compose.ui.text.a0>> k() {
        return this.placeholders;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final androidx.compose.ui.text.v0 getStyle() {
        return this.style;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final androidx.compose.ui.text.e getText() {
        return this.text;
    }

    @fg.l
    public final androidx.compose.ui.text.n0 o(long constraints, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.m androidx.compose.ui.text.n0 prevResult) {
        if (prevResult != null && d1.a(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.a(new androidx.compose.ui.text.m0(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().i(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (kotlin.jvm.internal.w) null), androidx.compose.ui.unit.c.d(constraints, androidx.compose.ui.unit.v.a(n0.a(prevResult.getMultiParagraph().getWidth()), n0.a(prevResult.getMultiParagraph().getHeight()))));
        }
        androidx.compose.ui.text.o r4 = r(constraints, layoutDirection);
        return new androidx.compose.ui.text.n0(new androidx.compose.ui.text.m0(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (kotlin.jvm.internal.w) null), r4, androidx.compose.ui.unit.c.d(constraints, androidx.compose.ui.unit.v.a(n0.a(r4.getWidth()), n0.a(r4.getHeight()))), null);
    }

    public final void q(@fg.l androidx.compose.ui.unit.w layoutDirection) {
        androidx.compose.ui.text.p pVar = this.paragraphIntrinsics;
        if (pVar == null || layoutDirection != this.intrinsicsLayoutDirection || pVar.c()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            pVar = new androidx.compose.ui.text.p(this.text, androidx.compose.ui.text.w0.d(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = pVar;
    }

    public final void s(@fg.m androidx.compose.ui.unit.w wVar) {
        this.intrinsicsLayoutDirection = wVar;
    }

    public final void t(@fg.m androidx.compose.ui.text.p pVar) {
        this.paragraphIntrinsics = pVar;
    }

    private m0(androidx.compose.ui.text.e eVar, androidx.compose.ui.text.v0 v0Var, int i4, int i5, boolean z4, int i6, androidx.compose.ui.unit.d dVar, y.b bVar, List<e.b<androidx.compose.ui.text.a0>> list) {
        this.text = eVar;
        this.style = v0Var;
        this.maxLines = i4;
        this.minLines = i5;
        this.softWrap = z4;
        this.overflow = i6;
        this.density = dVar;
        this.fontFamilyResolver = bVar;
        this.placeholders = list;
        if (i4 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i5 > i4) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(androidx.compose.ui.text.e r13, androidx.compose.ui.text.v0 r14, int r15, int r16, boolean r17, int r18, androidx.compose.ui.unit.d r19, androidx.compose.ui.text.font.y.b r20, java.util.List r21, int r22, kotlin.jvm.internal.w r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 4
            if (r1 == 0) goto Lb
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = r1
            goto Lc
        Lb:
            r5 = r15
        Lc:
            r1 = r0 & 8
            r2 = 1
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r16
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L1b
            r7 = r2
            goto L1d
        L1b:
            r7 = r17
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L2c
            androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.t.a()
            r8 = r1
            goto L2e
        L2c:
            r8 = r18
        L2e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L36
            kotlin.collections.j0 r0 = kotlin.collections.j0.f74919b
            r11 = r0
            goto L38
        L36:
            r11 = r21
        L38:
            r2 = r12
            r3 = r13
            r4 = r14
            r9 = r19
            r10 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.m0.<init>(androidx.compose.ui.text.e, androidx.compose.ui.text.v0, int, int, boolean, int, androidx.compose.ui.unit.d, androidx.compose.ui.text.font.y$b, java.util.List, int, kotlin.jvm.internal.w):void");
    }
}
