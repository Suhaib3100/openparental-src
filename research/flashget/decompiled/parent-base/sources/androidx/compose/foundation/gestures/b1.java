package androidx.compose.foundation.gestures;

import i0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TransformGestureDetector.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0080\u0001\u0010\u000e\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\t*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\t*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\t*\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0011\u0010\u0016\u001a\u00020\u0004*\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "", "panZoomLock", "Lkotlin/Function4;", "Li0/f;", "Lkotlin/r0;", "name", "centroid", "pan", "", "zoom", "rotation", "Lkotlin/k2;", "onGesture", "i", "(Landroidx/compose/ui/input/pointer/k0;ZLld/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/p;", "g", "(Landroidx/compose/ui/input/pointer/p;)F", "a", "(J)F", "h", "f", "(Landroidx/compose/ui/input/pointer/p;)J", "useCurrent", "d", "(Landroidx/compose/ui/input/pointer/p;Z)F", "b", "(Landroidx/compose/ui/input/pointer/p;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
/* loaded from: classes.dex */
public final class b1 {

    /* compiled from: TransformGestureDetector.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", "rotation", "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        float f3856c;

        /* renamed from: d, reason: collision with root package name */
        float f3857d;

        /* renamed from: e, reason: collision with root package name */
        float f3858e;

        /* renamed from: f, reason: collision with root package name */
        long f3859f;

        /* renamed from: g, reason: collision with root package name */
        int f3860g;

        /* renamed from: h, reason: collision with root package name */
        int f3861h;

        /* renamed from: i, reason: collision with root package name */
        int f3862i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f3863j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f3864k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.r<i0.f, i0.f, Float, Float, k2> f3865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z4, ld.r<? super i0.f, ? super i0.f, ? super Float, ? super Float, k2> rVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3864k = z4;
            this.f3865l = rVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.c cVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f3864k, this.f3865l, dVar);
            aVar.f3863j = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0144, code lost:
        
            if (i0.f.l(r11, i0.f.f74147c) == false) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009e -> B:6:0x00a1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final float a(long j4) {
        if (i0.f.p(j4) == 0.0f && i0.f.r(j4) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(i0.f.p(j4), i0.f.r(j4)))) * 180.0f) / 3.1415927f;
    }

    public static final long b(@fg.l androidx.compose.ui.input.pointer.p pVar, boolean z4) {
        i0.f.INSTANCE.getClass();
        long j4 = i0.f.f74147c;
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        int size = e4.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            androidx.compose.ui.input.pointer.b0 b0Var = e4.get(i5);
            if (b0Var.getPressed() && b0Var.getPreviousPressed()) {
                j4 = i0.f.v(j4, z4 ? b0Var.getPosition() : b0Var.getPreviousPosition());
                i4++;
            }
        }
        if (i4 != 0) {
            return i0.f.j(j4, i4);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    public static /* synthetic */ long c(androidx.compose.ui.input.pointer.p pVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return b(pVar, z4);
    }

    public static final float d(@fg.l androidx.compose.ui.input.pointer.p pVar, boolean z4) {
        long b5 = b(pVar, z4);
        i0.f.INSTANCE.getClass();
        float f4 = 0.0f;
        if (i0.f.l(b5, i0.f.f74149e)) {
            return 0.0f;
        }
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        int size = e4.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            androidx.compose.ui.input.pointer.b0 b0Var = e4.get(i5);
            if (b0Var.getPressed() && b0Var.getPreviousPressed()) {
                i4++;
                f4 = i0.f.m(i0.f.u(z4 ? b0Var.getPosition() : b0Var.getPreviousPosition(), b5)) + f4;
            }
        }
        return f4 / i4;
    }

    public static /* synthetic */ float e(androidx.compose.ui.input.pointer.p pVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return d(pVar, z4);
    }

    public static final long f(@fg.l androidx.compose.ui.input.pointer.p pVar) {
        long b5 = b(pVar, true);
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        if (!i0.f.l(b5, i0.f.f74149e)) {
            return i0.f.u(b5, b(pVar, false));
        }
        companion.getClass();
        return i0.f.f74147c;
    }

    public static final float g(@fg.l androidx.compose.ui.input.pointer.p pVar) {
        List<androidx.compose.ui.input.pointer.b0> e4 = pVar.e();
        int size = e4.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i4 >= size) {
                break;
            }
            androidx.compose.ui.input.pointer.b0 b0Var = e4.get(i4);
            if (!b0Var.getPreviousPressed() || !b0Var.getPressed()) {
                i6 = 0;
            }
            i5 += i6;
            i4++;
        }
        if (i5 < 2) {
            return 0.0f;
        }
        long b5 = b(pVar, true);
        long b6 = b(pVar, false);
        List<androidx.compose.ui.input.pointer.b0> e5 = pVar.e();
        int size2 = e5.size();
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i7 = 0; i7 < size2; i7++) {
            androidx.compose.ui.input.pointer.b0 b0Var2 = e5.get(i7);
            if (b0Var2.getPressed() && b0Var2.getPreviousPressed()) {
                long position = b0Var2.getPosition();
                long u4 = i0.f.u(b0Var2.getPreviousPosition(), b6);
                long u5 = i0.f.u(position, b5);
                float a5 = a(u5) - a(u4);
                float m4 = i0.f.m(i0.f.v(u5, u4)) / 2.0f;
                if (a5 > 180.0f) {
                    a5 -= 360.0f;
                } else if (a5 < -180.0f) {
                    a5 += 360.0f;
                }
                f5 += a5 * m4;
                f4 += m4;
            }
        }
        if (f4 == 0.0f) {
            return 0.0f;
        }
        return f5 / f4;
    }

    public static final float h(@fg.l androidx.compose.ui.input.pointer.p pVar) {
        float d5 = d(pVar, true);
        float d6 = d(pVar, false);
        if (d5 == 0.0f || d6 == 0.0f) {
            return 1.0f;
        }
        return d5 / d6;
    }

    @fg.m
    public static final Object i(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, boolean z4, @fg.l ld.r<? super i0.f, ? super i0.f, ? super Float, ? super Float, k2> rVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object d5 = f0.d(k0Var, new a(z4, rVar, null), dVar);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    public static /* synthetic */ Object j(androidx.compose.ui.input.pointer.k0 k0Var, boolean z4, ld.r rVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return i(k0Var, z4, rVar, dVar);
    }
}
