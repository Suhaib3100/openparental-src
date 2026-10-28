package androidx.compose.runtime;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001aT\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002<\u0010\n\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001¢\u0006\u0002\b\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006 "}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/r0;", "Landroidx/compose/runtime/i3;", "Lkotlin/r0;", "name", "recomposer", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "e", "(Lld/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "K", "V", "", "", "key", "value", "", "c", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "d", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "I", "RecomposerCompoundHashKey", "b", "Ljava/lang/Object;", "ProduceAnotherFrame", "FramePending", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1564:1\n361#2,7:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1555#1:1565,7\n*E\n"})
/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16846a = 1000;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Object f16847b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Object f16848c = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Recomposer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {71, 73}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f16849b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<kotlinx.coroutines.r0, i3, kotlin.coroutines.d<? super R>, Object> f16851d;

        /* compiled from: Recomposer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.runtime.m3$a$a, reason: collision with other inner class name */
        static final class C0316a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f16852b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ i3 f16853c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0316a(i3 i3Var, kotlin.coroutines.d<? super C0316a> dVar) {
                super(2, dVar);
                this.f16853c = i3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0316a(this.f16853c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f16852b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    i3 i3Var = this.f16853c;
                    this.f16852b = 1;
                    if (i3Var.Y0(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0316a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.q<? super kotlinx.coroutines.r0, ? super i3, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f16851d = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f16851d, dVar);
            aVar.f16850c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            i3 i3Var;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f16849b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f16850c;
                i3Var = new i3(r0Var.getCoroutineContext());
                kotlinx.coroutines.k.f(r0Var, null, null, new C0316a(i3Var, null), 3, null);
                ld.q<kotlinx.coroutines.r0, i3, kotlin.coroutines.d<? super R>, Object> qVar = this.f16851d;
                this.f16850c = i3Var;
                this.f16849b = 1;
                obj = qVar.R(r0Var, i3Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f16850c;
                    kotlin.a1.n(obj);
                    return obj2;
                }
                i3Var = (i3) this.f16850c;
                kotlin.a1.n(obj);
            }
            i3Var.q0();
            this.f16850c = obj;
            this.f16849b = 2;
            return i3Var.G0(this) == aVar ? aVar : obj;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super R> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    public static final <K, V> boolean c(@fg.l Map<K, List<V>> map, K k4, V v4) {
        List<V> list = map.get(k4);
        if (list == null) {
            list = l3.a(map, k4);
        }
        return list.add(v4);
    }

    @fg.m
    public static final <K, V> V d(@fg.l Map<K, List<V>> map, K k4) {
        List<V> list = map.get(k4);
        if (list == null) {
            return null;
        }
        V v4 = (V) kotlin.collections.w.M0(list);
        if (!list.isEmpty()) {
            return v4;
        }
        map.remove(k4);
        return v4;
    }

    @fg.m
    public static final <R> Object e(@fg.l ld.q<? super kotlinx.coroutines.r0, ? super i3, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        return kotlinx.coroutines.s0.g(new a(qVar, null), dVar);
    }
}
