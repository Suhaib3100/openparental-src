package androidx.compose.ui.text.font;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.font.s1;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/compose/ui/text/font/n;", "Landroidx/compose/runtime/b5;", "", "", "Landroidx/compose/ui/text/font/x;", "fontList", "initialType", "Landroidx/compose/ui/text/font/q1;", "typefaceRequest", "Landroidx/compose/ui/text/font/o;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/s1$b;", "Lkotlin/k2;", "onCompletion", "Landroidx/compose/ui/text/font/u0;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/q1;Landroidx/compose/ui/text/font/o;Lld/l;Landroidx/compose/ui/text/font/u0;)V", "l", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "m", "(Landroidx/compose/ui/text/font/x;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Ljava/util/List;", "c", "Landroidx/compose/ui/text/font/q1;", "d", "Landroidx/compose/ui/text/font/o;", "e", "Lld/l;", "f", "Landroidx/compose/ui/text/font/u0;", "<set-?>", "g", "Landroidx/compose/runtime/k2;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "h", "Z", "i", "()Z", "q", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
/* loaded from: classes.dex */
public final class n implements b5<Object> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f20765i = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<x> fontList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q1 typefaceRequest;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o asyncTypefaceCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<s1.b, k2> onCompletion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u0 platformFontLoader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 value;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {272, 285}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f20773b;

        /* renamed from: c, reason: collision with root package name */
        Object f20774c;

        /* renamed from: d, reason: collision with root package name */
        Object f20775d;

        /* renamed from: e, reason: collision with root package name */
        int f20776e;

        /* renamed from: f, reason: collision with root package name */
        int f20777f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f20778g;

        /* renamed from: i, reason: collision with root package name */
        int f20780i;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20778g = obj;
            this.f20780i |= Integer.MIN_VALUE;
            return n.this.l(this);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.l<kotlin.coroutines.d<? super Object>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f20781b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f20783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x xVar, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f20783d = xVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m kotlin.coroutines.d<Object> dVar) {
            return ((b) create(dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> dVar) {
            return n.this.new b(this.f20783d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f20781b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                n nVar = n.this;
                x xVar = this.f20783d;
                this.f20781b = 1;
                obj = nVar.m(xVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return obj;
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {304}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f20784b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f20785c;

        /* renamed from: e, reason: collision with root package name */
        int f20787e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f20785c = obj;
            this.f20787e |= Integer.MIN_VALUE;
            return n.this.m(null, this);
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {305}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "", "<anonymous>", "(Lkotlinx/coroutines/r0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super Object>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f20788b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f20790d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x xVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f20790d = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return n.this.new d(this.f20790d, dVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.r0 r0Var, kotlin.coroutines.d<? super Object> dVar) {
            return invoke2(r0Var, (kotlin.coroutines.d<Object>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f20788b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                u0 u0Var = n.this.platformFontLoader;
                x xVar = this.f20790d;
                this.f20788b = 1;
                obj = u0Var.c(xVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return obj;
        }

        @fg.m
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<Object> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@fg.l List<? extends x> list, @fg.l Object obj, @fg.l q1 q1Var, @fg.l o oVar, @fg.l ld.l<? super s1.b, k2> lVar, @fg.l u0 u0Var) {
        androidx.compose.runtime.k2 g4;
        this.fontList = list;
        this.typefaceRequest = q1Var;
        this.asyncTypefaceCache = oVar;
        this.onCompletion = lVar;
        this.platformFontLoader = u0Var;
        g4 = t4.g(obj, null, 2, null);
        this.value = g4;
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.b5
    @fg.l
    public Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: i, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:20:0x0073, B:22:0x008d, B:27:0x00bf, B:31:0x00f8), top: B:19:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8 A[Catch: all -> 0x00f5, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:20:0x0073, B:22:0x008d, B:27:0x00bf, B:31:0x00f8), top: B:19:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010b -> B:13:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0110 -> B:14:0x0112). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@fg.l kotlin.coroutines.d<? super kotlin.k2> r20) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.n.l(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@fg.l androidx.compose.ui.text.font.x r7, @fg.l kotlin.coroutines.d<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.n.c
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.n$c r0 = (androidx.compose.ui.text.font.n.c) r0
            int r1 = r0.f20787e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20787e = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.n$c r0 = new androidx.compose.ui.text.font.n$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20785c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f20787e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f20784b
            androidx.compose.ui.text.font.x r7 = (androidx.compose.ui.text.font.x) r7
            kotlin.a1.n(r8)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            goto L4d
        L2c:
            r8 = move-exception
            goto L4f
        L2e:
            r7 = move-exception
            goto L78
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.a1.n(r8)
            androidx.compose.ui.text.font.n$d r8 = new androidx.compose.ui.text.font.n$d     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f20784b = r7     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f20787e = r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.u3.e(r2, r8, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r4 = r8
            goto L82
        L4f:
            kotlin.coroutines.g r1 = r0.getF75269b()
            kotlinx.coroutines.n0$b r2 = kotlinx.coroutines.n0.INSTANCE
            kotlin.coroutines.g$b r1 = r1.c(r2)
            kotlinx.coroutines.n0 r1 = (kotlinx.coroutines.n0) r1
            if (r1 == 0) goto L82
            kotlin.coroutines.g r0 = r0.getF75269b()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.N(r0, r2)
            goto L82
        L78:
            kotlin.coroutines.g r8 = r0.getF75269b()
            boolean r8 = kotlinx.coroutines.n2.C(r8)
            if (r8 == 0) goto L83
        L82:
            return r4
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.n.m(androidx.compose.ui.text.font.x, kotlin.coroutines.d):java.lang.Object");
    }

    public final void q(boolean z4) {
        this.cacheable = z4;
    }
}
