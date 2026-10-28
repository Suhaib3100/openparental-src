package androidx.compose.foundation;

import android.view.Surface;
import com.android.internal.telephony.cdma.UserData;
import kotlin.Metadata;
import kotlinx.coroutines.k2;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jw\u0010\u0015\u001a\u00020\u00112f\u0010\u0014\u001ab\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0007¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JV\u0010\u0019\u001a\u00020\u0011*\u00020\t2A\u0010\u0018\u001a=\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00110\u0017¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001d\u001a\u00020\u0011*\u00020\t2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u001b¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&Rx\u0010\u0014\u001ad\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0007¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'RS\u0010*\u001a?\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R)\u0010-\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b¢\u0006\u0002\b\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/¨\u00061"}, d2 = {"Landroidx/compose/foundation/p;", "Landroidx/compose/foundation/g;", "Landroidx/compose/foundation/z2;", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Lkotlin/Function5;", "Landroidx/compose/foundation/y2;", "Landroid/view/Surface;", "Lkotlin/r0;", "name", "surface", "", "width", "height", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "onSurface", "a", "(Lld/s;)V", "Lkotlin/Function3;", "onChanged", "c", "(Landroid/view/Surface;Lld/q;)V", "Lkotlin/Function1;", "onDestroyed", "b", "(Landroid/view/Surface;Lld/l;)V", "g", "(Landroid/view/Surface;II)V", "f", "h", "(Landroid/view/Surface;)V", "Lkotlinx/coroutines/r0;", "i", "()Lkotlinx/coroutines/r0;", "Lld/s;", "d", "Lld/q;", "onSurfaceChanged", "e", "Lld/l;", "onSurfaceDestroyed", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/k2;", "job", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class p implements g, z2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.r0 scope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.s<? super y2, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> onSurface;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.q<? super Surface, ? super Integer, ? super Integer, kotlin.k2> onSurfaceChanged;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super Surface, kotlin.k2> onSurfaceDestroyed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private kotlinx.coroutines.k2 job;

    /* compiled from: AndroidExternalSurface.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {UserData.IS91_MSG_TYPE_CLI, 137}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f6630b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f6631c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Surface f6633e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6634f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6635g;

        /* compiled from: AndroidExternalSurface.android.kt */
        @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003JW\u0010\u000e\u001a\u00020\u000b*\u00020\u00042A\u0010\r\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\u00020\u000b*\u00020\u00042\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"androidx/compose/foundation/p$a$a", "Landroidx/compose/foundation/y2;", "Landroidx/compose/foundation/z2;", "Lkotlinx/coroutines/r0;", "Landroid/view/Surface;", "Lkotlin/Function3;", "", "Lkotlin/r0;", "name", "width", "height", "Lkotlin/k2;", "Lkotlin/u;", "onChanged", "c", "(Landroid/view/Surface;Lld/q;)V", "Lkotlin/Function1;", "onDestroyed", "b", "(Landroid/view/Surface;Lld/l;)V", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.p$a$a, reason: collision with other inner class name */
        public static final class C0115a implements y2, z2, kotlinx.coroutines.r0 {

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ p f6636b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ kotlinx.coroutines.r0 f6637c;

            C0115a(p pVar, kotlinx.coroutines.r0 r0Var) {
                this.f6636b = pVar;
                this.f6637c = r0Var;
            }

            @Override // androidx.compose.foundation.z2
            public void b(@fg.l Surface surface, @fg.l ld.l<? super Surface, kotlin.k2> lVar) {
                this.f6636b.b(surface, lVar);
            }

            @Override // androidx.compose.foundation.z2
            public void c(@fg.l Surface surface, @fg.l ld.q<? super Surface, ? super Integer, ? super Integer, kotlin.k2> qVar) {
                this.f6636b.c(surface, qVar);
            }

            @Override // kotlinx.coroutines.r0
            @fg.l
            /* renamed from: q */
            public kotlin.coroutines.g getCoroutineContext() {
                return this.f6637c.getCoroutineContext();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Surface surface, int i4, int i5, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f6633e = surface;
            this.f6634f = i4;
            this.f6635g = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = p.this.new a(this.f6633e, this.f6634f, this.f6635g, dVar);
            aVar.f6631c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlinx.coroutines.r0 r0Var;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f6630b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                r0Var = (kotlinx.coroutines.r0) this.f6631c;
                kotlinx.coroutines.k2 k2Var = p.this.job;
                if (k2Var != null) {
                    this.f6631c = r0Var;
                    this.f6630b = 1;
                    if (kotlinx.coroutines.n2.l(k2Var, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.k2.f75408a;
                }
                r0Var = (kotlinx.coroutines.r0) this.f6631c;
                kotlin.a1.n(obj);
            }
            C0115a c0115a = new C0115a(p.this, r0Var);
            ld.s sVar = p.this.onSurface;
            if (sVar != null) {
                Surface surface = this.f6633e;
                Integer num = new Integer(this.f6634f);
                Integer num2 = new Integer(this.f6635g);
                this.f6631c = null;
                this.f6630b = 2;
                if (sVar.a0(c0115a, surface, num, num2, this) == aVar) {
                    return aVar;
                }
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public p(@fg.l kotlinx.coroutines.r0 r0Var) {
        this.scope = r0Var;
    }

    @Override // androidx.compose.foundation.g
    public void a(@fg.l ld.s<? super y2, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> onSurface) {
        this.onSurface = onSurface;
    }

    @Override // androidx.compose.foundation.z2
    public void b(@fg.l Surface surface, @fg.l ld.l<? super Surface, kotlin.k2> lVar) {
        this.onSurfaceDestroyed = lVar;
    }

    @Override // androidx.compose.foundation.z2
    public void c(@fg.l Surface surface, @fg.l ld.q<? super Surface, ? super Integer, ? super Integer, kotlin.k2> qVar) {
        this.onSurfaceChanged = qVar;
    }

    public final void f(@fg.l Surface surface, int width, int height) {
        ld.q<? super Surface, ? super Integer, ? super Integer, kotlin.k2> qVar = this.onSurfaceChanged;
        if (qVar != null) {
            qVar.R(surface, Integer.valueOf(width), Integer.valueOf(height));
        }
    }

    public final void g(@fg.l Surface surface, int width, int height) {
        kotlinx.coroutines.k2 f4;
        if (this.onSurface != null) {
            f4 = kotlinx.coroutines.k.f(this.scope, null, kotlinx.coroutines.t0.UNDISPATCHED, new a(surface, width, height, null), 1, null);
            this.job = f4;
        }
    }

    public final void h(@fg.l Surface surface) {
        ld.l<? super Surface, kotlin.k2> lVar = this.onSurfaceDestroyed;
        if (lVar != null) {
            lVar.invoke(surface);
        }
        kotlinx.coroutines.k2 k2Var = this.job;
        if (k2Var != null) {
            k2.a.b(k2Var, null, 1, null);
        }
        this.job = null;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final kotlinx.coroutines.r0 getScope() {
        return this.scope;
    }
}
