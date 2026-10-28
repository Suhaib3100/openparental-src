package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.f0;
import androidx.compose.ui.input.pointer.k0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: PressDownGesture.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Landroidx/compose/foundation/text2/input/internal/selection/d;", "onDown", "Lkotlin/Function0;", "Lkotlin/k2;", "onUp", "a", "(Landroidx/compose/ui/input/pointer/k0;Landroidx/compose/foundation/text2/input/internal/selection/d;Lld/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: PressDownGesture.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {32, 38}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,44:1\n101#2,2:45\n33#2,6:47\n103#2:53\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n39#1:45,2\n39#1:47,6\n39#1:53\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.k implements p<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f8723c;

        /* renamed from: d, reason: collision with root package name */
        int f8724d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f8725e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f8726f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f8727g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, ld.a<k2> aVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f8726f = dVar;
            this.f8727g = aVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l androidx.compose.ui.input.pointer.c cVar, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f8726f, this.f8727g, dVar);
            aVar.f8725e = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:6:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r12.f8724d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r12.f8723c
                androidx.compose.ui.input.pointer.b0 r1 = (androidx.compose.ui.input.pointer.b0) r1
                java.lang.Object r4 = r12.f8725e
                androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                kotlin.a1.n(r13)
                goto L60
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                java.lang.Object r1 = r12.f8725e
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                kotlin.a1.n(r13)
                goto L41
            L28:
                kotlin.a1.n(r13)
                java.lang.Object r13 = r12.f8725e
                r1 = r13
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r12.f8725e = r1
                r12.f8724d = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = androidx.compose.foundation.gestures.z0.f(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L41
                return r0
            L41:
                androidx.compose.ui.input.pointer.b0 r13 = (androidx.compose.ui.input.pointer.b0) r13
                androidx.compose.foundation.text2.input.internal.selection.d r4 = r12.f8726f
                long r5 = r13.getPosition()
                r4.a(r5)
                ld.a<kotlin.k2> r4 = r12.f8727g
                if (r4 == 0) goto L90
                r4 = r1
                r1 = r13
            L52:
                r12.f8725e = r4
                r12.f8723c = r1
                r12.f8724d = r2
                r13 = 0
                java.lang.Object r13 = androidx.compose.ui.input.pointer.c.a1(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L60
                return r0
            L60:
                androidx.compose.ui.input.pointer.p r13 = (androidx.compose.ui.input.pointer.p) r13
                java.util.List r13 = r13.e()
                int r5 = r13.size()
                r6 = 0
            L6b:
                if (r6 >= r5) goto L8b
                java.lang.Object r7 = r13.get(r6)
                androidx.compose.ui.input.pointer.b0 r7 = (androidx.compose.ui.input.pointer.b0) r7
                long r8 = r7.getId()
                long r10 = r1.getId()
                boolean r8 = androidx.compose.ui.input.pointer.a0.d(r8, r10)
                if (r8 == 0) goto L88
                boolean r7 = r7.getPressed()
                if (r7 == 0) goto L88
                goto L52
            L88:
                int r6 = r6 + 1
                goto L6b
            L8b:
                ld.a<kotlin.k2> r13 = r12.f8727g
                r13.invoke()
            L90:
                kotlin.k2 r13 = kotlin.k2.f75408a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m
    public static final Object a(@l k0 k0Var, @l d dVar, @m ld.a<k2> aVar, @l kotlin.coroutines.d<? super k2> dVar2) {
        Object d5 = f0.d(k0Var, new a(dVar, aVar, null), dVar2);
        return d5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? d5 : k2.f75408a;
    }

    public static /* synthetic */ Object b(k0 k0Var, d dVar, ld.a aVar, kotlin.coroutines.d dVar2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        return a(k0Var, dVar, aVar, dVar2);
    }
}
