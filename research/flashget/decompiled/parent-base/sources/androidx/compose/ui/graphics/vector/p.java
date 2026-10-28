package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.s4;
import i0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Vector.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00105\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00106R1\u0010>\u001a\u0002082\u0006\u0010/\u001a\u0002088@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b9\u00100\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010@\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010?R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010AR\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR%\u0010G\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060D¢\u0006\u0002\bE8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u001a\u0010J\u001a\u00020H8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b9\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/vector/p;", "Landroidx/compose/ui/graphics/vector/n;", "Landroidx/compose/ui/graphics/vector/c;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/c;)V", "Lkotlin/k2;", "h", "()V", "Landroidx/compose/ui/graphics/drawscope/f;", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "colorFilter", "i", "(Landroidx/compose/ui/graphics/drawscope/f;FLandroidx/compose/ui/graphics/e2;)V", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "", "toString", "()Ljava/lang/String;", "c", "Landroidx/compose/ui/graphics/vector/c;", "n", "()Landroidx/compose/ui/graphics/vector/c;", "d", "Ljava/lang/String;", "m", "r", "(Ljava/lang/String;)V", "name", "", "e", "Z", "isDirty", "Landroidx/compose/ui/graphics/vector/a;", "f", "Landroidx/compose/ui/graphics/vector/a;", "cacheDrawScope", "Lkotlin/Function0;", "g", "Lld/a;", "l", "()Lld/a;", "q", "(Lld/a;)V", "invalidateCallback", "<set-?>", "Landroidx/compose/runtime/k2;", "k", "()Landroidx/compose/ui/graphics/e2;", "p", "(Landroidx/compose/ui/graphics/e2;)V", "intrinsicColorFilter", "Landroidx/compose/ui/graphics/e2;", "tintFilter", "Li0/n;", "j", "o", "()J", "s", "(J)V", "viewportSize", "J", "previousDrawSize", "F", "rootScaleX", "rootScaleY", "Lkotlin/Function1;", "Lkotlin/u;", "Lld/l;", "drawVectorBlock", "Landroidx/compose/ui/graphics/t4;", "()I", "cacheBitmapConfig", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,651:1\n81#2:652\n107#2,2:653\n81#2:655\n107#2,2:656\n646#3:658\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:652\n121#1:653,2\n127#1:655\n127#1:656,2\n148#1:658\n*E\n"})
/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: o, reason: collision with root package name */
    public static final int f18284o = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.vector.c root;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.vector.a cacheDrawScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.a<k2> invalidateCallback;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 intrinsicColorFilter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2 tintFilter;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 viewportSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long previousDrawSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rootScaleX;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float rootScaleY;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> drawVectorBlock;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/vector/n;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/vector/n;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<n, k2> {
        a() {
            super(1);
        }

        public final void a(@fg.l n nVar) {
            p.this.h();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(n nVar) {
            a(nVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,651:1\n179#2:652\n262#2,11:653\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n*L\n139#1:652\n139#1:653,11\n*E\n"})
    static final class b extends n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, k2> {
        b() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            androidx.compose.ui.graphics.vector.c root = p.this.getRoot();
            p pVar = p.this;
            float f4 = pVar.rootScaleX;
            float f5 = pVar.rootScaleY;
            i0.f.INSTANCE.getClass();
            long j4 = i0.f.f74147c;
            androidx.compose.ui.graphics.drawscope.d drawContext = fVar.getDrawContext();
            long e4 = drawContext.e();
            drawContext.i().C();
            drawContext.getTransform().i(f4, f5, j4);
            root.a(fVar);
            drawContext.i().o();
            drawContext.j(e4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18299b = new c(0);

        c() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public k2 invoke() {
            return k2.f75408a;
        }
    }

    public p(@fg.l androidx.compose.ui.graphics.vector.c cVar) {
        super(null);
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        this.root = cVar;
        cVar.d(new a());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new androidx.compose.ui.graphics.vector.a();
        this.invalidateCallback = c.f18299b;
        g4 = t4.g(null, null, 2, null);
        this.intrinsicColorFilter = g4;
        n.Companion companion = i0.n.INSTANCE;
        companion.getClass();
        g5 = t4.g(i0.n.c(i0.n.f74171c), null, 2, null);
        this.viewportSize = g5;
        companion.getClass();
        this.previousDrawSize = i0.n.f74172d;
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    @Override // androidx.compose.ui.graphics.vector.n
    public void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
        i(fVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(@fg.l androidx.compose.ui.graphics.drawscope.f r10, float r11, @fg.m androidx.compose.ui.graphics.e2 r12) {
        /*
            r9 = this;
            androidx.compose.ui.graphics.vector.c r0 = r9.root
            boolean r0 = r0.getIsTintable()
            if (r0 == 0) goto L36
            androidx.compose.ui.graphics.vector.c r0 = r9.root
            long r0 = r0.getTintColor()
            androidx.compose.ui.graphics.d2$a r2 = androidx.compose.ui.graphics.d2.INSTANCE
            r2.getClass()
            long r2 = androidx.compose.ui.graphics.d2.k()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L36
            androidx.compose.ui.graphics.e2 r0 = r9.k()
            boolean r0 = androidx.compose.ui.graphics.vector.u.j(r0)
            if (r0 == 0) goto L36
            boolean r0 = androidx.compose.ui.graphics.vector.u.j(r12)
            if (r0 == 0) goto L36
            androidx.compose.ui.graphics.t4$a r0 = androidx.compose.ui.graphics.t4.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.graphics.t4.a()
        L34:
            r2 = r0
            goto L40
        L36:
            androidx.compose.ui.graphics.t4$a r0 = androidx.compose.ui.graphics.t4.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.graphics.t4.b()
            goto L34
        L40:
            boolean r0 = r9.isDirty
            if (r0 != 0) goto L5a
            long r0 = r9.previousDrawSize
            long r3 = r10.e()
            boolean r0 = i0.n.k(r0, r3)
            if (r0 == 0) goto L5a
            int r0 = r9.j()
            boolean r0 = androidx.compose.ui.graphics.t4.i(r2, r0)
            if (r0 != 0) goto Ld9
        L5a:
            androidx.compose.ui.graphics.t4$a r0 = androidx.compose.ui.graphics.t4.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.graphics.t4.a()
            boolean r0 = androidx.compose.ui.graphics.t4.i(r2, r0)
            if (r0 == 0) goto L79
            androidx.compose.ui.graphics.e2$a r3 = androidx.compose.ui.graphics.e2.INSTANCE
            androidx.compose.ui.graphics.vector.c r0 = r9.root
            long r4 = r0.getTintColor()
            r7 = 2
            r8 = 0
            r6 = 0
            androidx.compose.ui.graphics.e2 r0 = androidx.compose.ui.graphics.e2.Companion.d(r3, r4, r6, r7, r8)
            goto L7a
        L79:
            r0 = 0
        L7a:
            r9.tintFilter = r0
            long r0 = r10.e()
            float r0 = i0.n.t(r0)
            long r3 = r9.o()
            float r1 = i0.n.t(r3)
            float r0 = r0 / r1
            r9.rootScaleX = r0
            long r0 = r10.e()
            float r0 = i0.n.m(r0)
            long r3 = r9.o()
            float r1 = i0.n.m(r3)
            float r0 = r0 / r1
            r9.rootScaleY = r0
            androidx.compose.ui.graphics.vector.a r1 = r9.cacheDrawScope
            long r3 = r10.e()
            float r0 = i0.n.t(r3)
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            float r0 = (float) r3
            int r0 = (int) r0
            long r3 = r10.e()
            float r3 = i0.n.m(r3)
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            long r3 = androidx.compose.ui.unit.v.a(r0, r3)
            androidx.compose.ui.unit.w r6 = r10.getLayoutDirection()
            ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> r7 = r9.drawVectorBlock
            r5 = r10
            r1.b(r2, r3, r5, r6, r7)
            r0 = 0
            r9.isDirty = r0
            long r0 = r10.e()
            r9.previousDrawSize = r0
        Ld9:
            if (r12 == 0) goto Ldc
            goto Le9
        Ldc:
            androidx.compose.ui.graphics.e2 r12 = r9.k()
            if (r12 == 0) goto Le7
            androidx.compose.ui.graphics.e2 r12 = r9.k()
            goto Le9
        Le7:
            androidx.compose.ui.graphics.e2 r12 = r9.tintFilter
        Le9:
            androidx.compose.ui.graphics.vector.a r0 = r9.cacheDrawScope
            r0.c(r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.p.i(androidx.compose.ui.graphics.drawscope.f, float, androidx.compose.ui.graphics.e2):void");
    }

    public final int j() {
        s4 mCachedImage = this.cacheDrawScope.getMCachedImage();
        if (mCachedImage != null) {
            return mCachedImage.f();
        }
        androidx.compose.ui.graphics.t4.INSTANCE.getClass();
        return androidx.compose.ui.graphics.t4.f18042c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final e2 k() {
        return (e2) this.intrinsicColorFilter.getValue();
    }

    @fg.l
    public final ld.a<k2> l() {
        return this.invalidateCallback;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final androidx.compose.ui.graphics.vector.c getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o() {
        return ((i0.n) this.viewportSize.getValue()).getPackedValue();
    }

    public final void p(@fg.m e2 e2Var) {
        this.intrinsicColorFilter.setValue(e2Var);
    }

    public final void q(@fg.l ld.a<k2> aVar) {
        this.invalidateCallback = aVar;
    }

    public final void r(@fg.l String str) {
        this.name = str;
    }

    public final void s(long j4) {
        this.viewportSize.setValue(i0.n.c(j4));
    }

    @fg.l
    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + i0.n.t(o()) + "\n\tviewportHeight: " + i0.n.m(o()) + "\n";
        l0.o(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
