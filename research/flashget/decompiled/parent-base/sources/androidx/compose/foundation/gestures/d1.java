package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a>\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/gestures/f1;", "state", "", "lockRotationOnZoomPan", "enabled", "d", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/f1;ZZ)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Li0/f;", "canPan", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/gestures/f1;Lld/l;ZZ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/c;", "panZoomLock", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/gestures/a1;", "channel", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/input/pointer/c;ZLkotlinx/coroutines/channels/l;Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,277:1\n101#2,2:278\n33#2,6:280\n103#2:286\n33#2,6:287\n101#2,2:293\n33#2,6:295\n103#2:301\n101#2,2:302\n33#2,6:304\n103#2:310\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n219#1:278,2\n219#1:280,6\n219#1:286\n253#1:287,6\n264#1:293,2\n264#1:295,6\n264#1:301\n265#1:302,2\n265#1:304,6\n265#1:310\n*E\n"})
/* loaded from: classes.dex */
public final class d1 {

    /* compiled from: Transformable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {216, 218, 262}, m = "detectZoom", n = {"$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "channel", "canPan", "event", "panZoomLock", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, s = {"L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f3871b;

        /* renamed from: c, reason: collision with root package name */
        Object f3872c;

        /* renamed from: d, reason: collision with root package name */
        Object f3873d;

        /* renamed from: e, reason: collision with root package name */
        Object f3874e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3875f;

        /* renamed from: g, reason: collision with root package name */
        float f3876g;

        /* renamed from: h, reason: collision with root package name */
        float f3877h;

        /* renamed from: i, reason: collision with root package name */
        float f3878i;

        /* renamed from: j, reason: collision with root package name */
        long f3879j;

        /* renamed from: k, reason: collision with root package name */
        int f3880k;

        /* renamed from: l, reason: collision with root package name */
        int f3881l;

        /* renamed from: m, reason: collision with root package name */
        int f3882m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f3883n;

        /* renamed from: o, reason: collision with root package name */
        int f3884o;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f3883n = obj;
            this.f3884o |= Integer.MIN_VALUE;
            return d1.b(null, false, null, null, this);
        }
    }

    /* compiled from: Transformable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "", "a", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i0.f, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3885b = new b(1);

        b() {
            super(1);
        }

        @fg.l
        public final Boolean a(long j4) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(i0.f fVar) {
            fVar.getPackedValue();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x029f, code lost:
    
        if (r5 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02a1, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f4, code lost:
    
        if (r13.invoke(i0.f.d(r1)).booleanValue() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a6 A[EDGE_INSN: B:97:0x02a6->B:96:0x02a6 BREAK  A[LOOP:0: B:13:0x0291->B:16:0x02a3], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0278 -> B:12:0x0284). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.c r29, boolean r30, kotlinx.coroutines.channels.l<androidx.compose.foundation.gestures.a1> r31, ld.l<? super i0.f, java.lang.Boolean> r32, kotlin.coroutines.d<? super kotlin.k2> r33) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d1.b(androidx.compose.ui.input.pointer.c, boolean, kotlinx.coroutines.channels.l, ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @androidx.compose.foundation.z0
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l f1 f1Var, @fg.l ld.l<? super i0.f, Boolean> lVar, boolean z4, boolean z5) {
        return qVar.w3(new TransformableElement(f1Var, lVar, z4, z5));
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l f1 f1Var, boolean z4, boolean z5) {
        return c(qVar, f1Var, b.f3885b, z4, z5);
    }

    public static /* synthetic */ androidx.compose.ui.q e(androidx.compose.ui.q qVar, f1 f1Var, ld.l lVar, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        if ((i4 & 8) != 0) {
            z5 = true;
        }
        return c(qVar, f1Var, lVar, z4, z5);
    }

    public static androidx.compose.ui.q f(androidx.compose.ui.q qVar, f1 f1Var, boolean z4, boolean z5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            z5 = true;
        }
        return c(qVar, f1Var, b.f3885b, z4, z5);
    }
}
