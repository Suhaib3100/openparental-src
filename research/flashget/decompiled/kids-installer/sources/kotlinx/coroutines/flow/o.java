package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.m2;

/* compiled from: Collection.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "destination", "", "b", "(Lkotlinx/coroutines/flow/i;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "d", "(Lkotlinx/coroutines/flow/i;Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "C", "a", "(Lkotlinx/coroutines/flow/i;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes5.dex */
final /* synthetic */ class o {

    /* compiled from: Collection.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<T, C extends Collection<? super T>> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f28254r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f28255s;

        /* renamed from: t, reason: collision with root package name */
        int f28256t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f28255s = obj;
            this.f28256t |= Integer.MIN_VALUE;
            return o.a(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* compiled from: Collection.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "C", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class b<T> implements j {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Collection f28257o;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        b(Collection collection) {
            this.f28257o = collection;
        }

        @Override // kotlinx.coroutines.flow.j
        @d5.e
        public final Object b(T t5, @d5.d Continuation<? super m2> continuation) {
            this.f28257o.add(t5);
            return m2.f23662a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@d5.d kotlinx.coroutines.flow.i<? extends T> r4, @d5.d C r5, @d5.d kotlin.coroutines.Continuation<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.f28256t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28256t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28255s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f28256t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.f28254r
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.a1.n(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "嵵"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.a1.n(r6)
            kotlinx.coroutines.flow.o$b r6 = new kotlinx.coroutines.flow.o$b
            r6.<init>(r5)
            r0.f28254r = r5
            r0.f28256t = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.i, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    @d5.e
    public static final <T> Object b(@d5.d i<? extends T> iVar, @d5.d List<T> list, @d5.d Continuation<? super List<? extends T>> continuation) {
        return a(iVar, list, continuation);
    }

    public static Object c(i iVar, List list, Continuation continuation, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = new ArrayList();
        }
        return a(iVar, list, continuation);
    }

    @d5.e
    public static final <T> Object d(@d5.d i<? extends T> iVar, @d5.d Set<T> set, @d5.d Continuation<? super Set<? extends T>> continuation) {
        return a(iVar, set, continuation);
    }

    public static Object e(i iVar, Set set, Continuation continuation, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return a(iVar, set, continuation);
    }
}
