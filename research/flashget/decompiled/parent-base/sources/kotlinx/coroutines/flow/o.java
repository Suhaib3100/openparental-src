package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Collection.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "", "destination", "", "b", "(Lkotlinx/coroutines/flow/i;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "d", "(Lkotlinx/coroutines/flow/i;Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "C", "a", "(Lkotlinx/coroutines/flow/i;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes7.dex */
final /* synthetic */ class o {

    /* compiled from: Collection.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {"destination"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<T, C extends Collection<? super T>> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f80288b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f80289c;

        /* renamed from: d, reason: collision with root package name */
        int f80290d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f80289c = obj;
            this.f80290d |= Integer.MIN_VALUE;
            return o.a(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    /* compiled from: Collection.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "C", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f80291b;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        b(Collection collection) {
            this.f80291b = collection;
        }

        @Override // kotlinx.coroutines.flow.j
        @fg.m
        public final Object emit(T t4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
            this.f80291b.add(t4);
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object a(@fg.l kotlinx.coroutines.flow.i<? extends T> r4, @fg.l C r5, @fg.l kotlin.coroutines.d<? super C> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.f80290d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f80290d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f80289c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f80290d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.f80288b
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.a1.n(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "蝕\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.a1.n(r6)
            kotlinx.coroutines.flow.o$b r6 = new kotlinx.coroutines.flow.o$b
            r6.<init>(r5)
            r0.f80288b = r5
            r0.f80290d = r3
            java.lang.Object r4 = r4.a(r6, r0)
            if (r4 != r1) goto L4b
            return r1
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.i, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.m
    public static final <T> Object b(@fg.l i<? extends T> iVar, @fg.l List<T> list, @fg.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return a(iVar, list, dVar);
    }

    public static Object c(i iVar, List list, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = new ArrayList();
        }
        return a(iVar, list, dVar);
    }

    @fg.m
    public static final <T> Object d(@fg.l i<? extends T> iVar, @fg.l Set<T> set, @fg.l kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return a(iVar, set, dVar);
    }

    public static Object e(i iVar, Set set, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            set = new LinkedHashSet();
        }
        return a(iVar, set, dVar);
    }
}
