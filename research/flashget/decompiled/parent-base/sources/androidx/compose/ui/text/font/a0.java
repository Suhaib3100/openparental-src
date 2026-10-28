package androidx.compose.ui.text.font;

import androidx.compose.runtime.b5;
import androidx.compose.ui.text.font.s1;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FontFamilyResolver.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/text/font/a0;", "Landroidx/compose/ui/text/font/y$b;", "Landroidx/compose/ui/text/font/u0;", "platformFontLoader", "Landroidx/compose/ui/text/font/v0;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/r1;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/g0;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/t0;", "platformFamilyTypefaceAdapter", "<init>", "(Landroidx/compose/ui/text/font/u0;Landroidx/compose/ui/text/font/v0;Landroidx/compose/ui/text/font/r1;Landroidx/compose/ui/text/font/g0;Landroidx/compose/ui/text/font/t0;)V", "Landroidx/compose/ui/text/font/q1;", "typefaceRequest", "Landroidx/compose/runtime/b5;", "", "i", "(Landroidx/compose/ui/text/font/q1;)Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/text/font/y;", "fontFamily", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/font/y;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/l0;", "fontSynthesis", "b", "(Landroidx/compose/ui/text/font/y;Landroidx/compose/ui/text/font/o0;II)Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/text/font/u0;", "h", "()Landroidx/compose/ui/text/font/u0;", "Landroidx/compose/ui/text/font/v0;", "c", "Landroidx/compose/ui/text/font/r1;", "d", "Landroidx/compose/ui/text/font/g0;", "e", "Landroidx/compose/ui/text/font/t0;", "Lkotlin/Function1;", "f", "Lld/l;", "createDefaultTypeface", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,256:1\n151#2,3:257\n33#2,4:260\n154#2,2:264\n38#2:266\n156#2:267\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:257,3\n47#1:260,4\n47#1:264,2\n47#1:266\n47#1:267\n*E\n"})
/* loaded from: classes.dex */
public final class a0 implements y.b {

    /* renamed from: g, reason: collision with root package name */
    public static final int f20666g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u0 platformFontLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final v0 platformResolveInterceptor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r1 typefaceRequestCache;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 fontListFontFamilyTypefaceAdapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t0 platformFamilyTypefaceAdapter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<q1, Object> createDefaultTypeface;

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/q1;", "it", "", "a", "(Landroidx/compose/ui/text/font/q1;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<q1, Object> {
        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l q1 q1Var) {
            return a0.this.i(q1.g(q1Var, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {45}, m = "preload", n = {"this", "fontFamily"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f20674b;

        /* renamed from: c, reason: collision with root package name */
        Object f20675c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f20676d;

        /* renamed from: f, reason: collision with root package name */
        int f20678f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20676d = obj;
            this.f20678f |= Integer.MIN_VALUE;
            return a0.this.a(null, this);
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/q1;", "typeRequest", "Landroidx/compose/ui/text/font/s1;", "a", "(Landroidx/compose/ui/text/font/q1;)Landroidx/compose/ui/text/font/s1;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<q1, s1> {

        /* compiled from: FontFamilyResolver.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/s1$b;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/font/s1$b;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<s1.b, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f20680b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l s1.b bVar) {
            }

            @Override // ld.l
            public k2 invoke(s1.b bVar) {
                return k2.f75408a;
            }
        }

        /* compiled from: FontFamilyResolver.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/s1$b;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/font/s1$b;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<s1.b, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f20681b = new b(1);

            b() {
                super(1);
            }

            public final void a(@fg.l s1.b bVar) {
            }

            @Override // ld.l
            public k2 invoke(s1.b bVar) {
                return k2.f75408a;
            }
        }

        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1 invoke(@fg.l q1 q1Var) {
            s1 a5 = a0.this.fontListFontFamilyTypefaceAdapter.a(q1Var, a0.this.getPlatformFontLoader(), a.f20680b, a0.this.createDefaultTypeface);
            if (a5 == null && (a5 = a0.this.platformFamilyTypefaceAdapter.a(q1Var, a0.this.getPlatformFontLoader(), b.f20681b, a0.this.createDefaultTypeface)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return a5;
        }
    }

    /* compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/text/font/s1;", "Lkotlin/k2;", "onAsyncCompletion", "a", "(Lld/l;)Landroidx/compose/ui/text/font/s1;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<ld.l<? super s1, ? extends k2>, s1> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q1 f20683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(q1 q1Var) {
            super(1);
            this.f20683c = q1Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1 invoke(@fg.l ld.l<? super s1, k2> lVar) {
            s1 a5 = a0.this.fontListFontFamilyTypefaceAdapter.a(this.f20683c, a0.this.getPlatformFontLoader(), lVar, a0.this.createDefaultTypeface);
            if (a5 == null && (a5 = a0.this.platformFamilyTypefaceAdapter.a(this.f20683c, a0.this.getPlatformFontLoader(), lVar, a0.this.createDefaultTypeface)) == null) {
                throw new IllegalStateException("Could not load font");
            }
            return a5;
        }
    }

    public a0(@fg.l u0 u0Var, @fg.l v0 v0Var, @fg.l r1 r1Var, @fg.l g0 g0Var, @fg.l t0 t0Var) {
        this.platformFontLoader = u0Var;
        this.platformResolveInterceptor = v0Var;
        this.typefaceRequestCache = r1Var;
        this.fontListFontFamilyTypefaceAdapter = g0Var;
        this.platformFamilyTypefaceAdapter = t0Var;
        this.createDefaultTypeface = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b5<Object> i(q1 typefaceRequest) {
        return this.typefaceRequestCache.f(typefaceRequest, new d(typefaceRequest));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[LOOP:0: B:11:0x0068->B:12:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.text.font.y.b
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.l androidx.compose.ui.text.font.y r14, @fg.l kotlin.coroutines.d<? super kotlin.k2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof androidx.compose.ui.text.font.a0.b
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.ui.text.font.a0$b r0 = (androidx.compose.ui.text.font.a0.b) r0
            int r1 = r0.f20678f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20678f = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.a0$b r0 = new androidx.compose.ui.text.font.a0$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f20676d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f20678f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r14 = r0.f20675c
            androidx.compose.ui.text.font.y r14 = (androidx.compose.ui.text.font.y) r14
            java.lang.Object r0 = r0.f20674b
            androidx.compose.ui.text.font.a0 r0 = (androidx.compose.ui.text.font.a0) r0
            kotlin.a1.n(r15)
            goto L53
        L2f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L37:
            kotlin.a1.n(r15)
            boolean r15 = r14 instanceof androidx.compose.ui.text.font.f0
            if (r15 != 0) goto L41
            kotlin.k2 r14 = kotlin.k2.f75408a
            return r14
        L41:
            androidx.compose.ui.text.font.g0 r15 = r13.fontListFontFamilyTypefaceAdapter
            androidx.compose.ui.text.font.u0 r2 = r13.platformFontLoader
            r0.f20674b = r13
            r0.f20675c = r14
            r0.f20678f = r3
            java.lang.Object r15 = r15.e(r14, r2, r0)
            if (r15 != r1) goto L52
            return r1
        L52:
            r0 = r13
        L53:
            r15 = r14
            androidx.compose.ui.text.font.f0 r15 = (androidx.compose.ui.text.font.f0) r15
            java.util.List r15 = r15.s()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            int r2 = r15.size()
            r3 = 0
        L68:
            if (r3 >= r2) goto La6
            java.lang.Object r4 = r15.get(r3)
            androidx.compose.ui.text.font.x r4 = (androidx.compose.ui.text.font.x) r4
            androidx.compose.ui.text.font.q1 r12 = new androidx.compose.ui.text.font.q1
            androidx.compose.ui.text.font.v0 r5 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.y r6 = r5.d(r14)
            androidx.compose.ui.text.font.v0 r5 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.o0 r7 = r4.getWeight()
            androidx.compose.ui.text.font.o0 r7 = r5.a(r7)
            androidx.compose.ui.text.font.v0 r5 = r0.platformResolveInterceptor
            int r4 = r4.getStyle()
            int r8 = r5.b(r4)
            androidx.compose.ui.text.font.l0$a r4 = androidx.compose.ui.text.font.l0.INSTANCE
            r4.getClass()
            int r9 = androidx.compose.ui.text.font.l0.a()
            androidx.compose.ui.text.font.u0 r4 = r0.platformFontLoader
            java.lang.Object r10 = r4.getCacheKey()
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L68
        La6:
            androidx.compose.ui.text.font.r1 r14 = r0.typefaceRequestCache
            androidx.compose.ui.text.font.a0$c r15 = new androidx.compose.ui.text.font.a0$c
            r15.<init>()
            r14.e(r1, r15)
            kotlin.k2 r14 = kotlin.k2.f75408a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.a0.a(androidx.compose.ui.text.font.y, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.y.b
    @fg.l
    public b5<Object> b(@fg.m y fontFamily, @fg.l o0 fontWeight, int fontStyle, int fontSynthesis) {
        return i(new q1(this.platformResolveInterceptor.d(fontFamily), this.platformResolveInterceptor.a(fontWeight), this.platformResolveInterceptor.b(fontStyle), this.platformResolveInterceptor.c(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final u0 getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a0(u0 u0Var, v0 v0Var, r1 r1Var, g0 g0Var, t0 t0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(u0Var, (i4 & 2) != 0 ? v0.INSTANCE.a() : v0Var, (i4 & 4) != 0 ? b0.b() : r1Var, (i4 & 8) != 0 ? new g0(b0.a(), null, 2, 0 == true ? 1 : 0) : g0Var, (i4 & 16) != 0 ? new t0() : t0Var);
    }
}
