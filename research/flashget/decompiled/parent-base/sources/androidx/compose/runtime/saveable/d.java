package androidx.compose.runtime.saveable;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.m4;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.snapshots.a0;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import ld.p;

/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0011\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"", "T", "", "inputs", "Landroidx/compose/runtime/saveable/l;", "saver", "", "key", "Lkotlin/Function0;", "init", "d", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/l;Ljava/lang/String;Lld/a;Landroidx/compose/runtime/t;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/k2;", "c", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/l;Ljava/lang/String;Lld/a;Landroidx/compose/runtime/t;II)Landroidx/compose/runtime/k2;", "inner", "b", "(Landroidx/compose/runtime/saveable/l;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/runtime/saveable/i;", "value", "Lkotlin/k2;", "e", "(Landroidx/compose/runtime/saveable/i;Ljava/lang/Object;)V", "", "a", "I", "MaxSupportedRadix", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,271:1\n74#2:272\n25#3:273\n1116#4,6:274\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:272\n84#1:273\n84#1:274,6\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16963a = 36;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RememberSaveable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/runtime/k2;", "state", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/runtime/k2;)Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class a<T> extends n0 implements p<n, k2<T>, k2<Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T, Object> f16964b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l<T, Object> lVar) {
            super(2);
            this.f16964b = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2<Object> invoke(@fg.l n nVar, @fg.l k2<T> k2Var) {
            if (!(k2Var instanceof a0)) {
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
            }
            Object a5 = this.f16964b.a(nVar, k2Var.getValue());
            if (a5 == null) {
                return null;
            }
            m4<T> e4 = ((a0) k2Var).e();
            l0.n(e4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return androidx.compose.runtime.b.e(a5, e4);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RememberSaveable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/runtime/k2;", "", "it", "a", "(Landroidx/compose/runtime/k2;)Landroidx/compose/runtime/k2;"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends n0 implements ld.l<k2<Object>, k2<T>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<T, Object> f16965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<T, Object> lVar) {
            super(1);
            this.f16965b = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2<T> invoke(@fg.l k2<Object> k2Var) {
            T t4;
            if (!(k2Var instanceof a0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (k2Var.getValue() != null) {
                l<T, Object> lVar = this.f16965b;
                Object value = k2Var.getValue();
                l0.m(value);
                t4 = lVar.b(value);
            } else {
                t4 = null;
            }
            m4<T> e4 = ((a0) k2Var).e();
            l0.n(e4, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2?>");
            a0 e5 = androidx.compose.runtime.b.e(t4, e4);
            l0.n(e5, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$2>");
            return e5;
        }
    }

    /* compiled from: RememberSaveable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T> f16966b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<T, ? extends Object> f16967c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f16968d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f16969e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f16970f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object[] f16971g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e<T> eVar, l<T, ? extends Object> lVar, i iVar, String str, T t4, Object[] objArr) {
            super(0);
            this.f16966b = eVar;
            this.f16967c = lVar;
            this.f16968d = iVar;
            this.f16969e = str;
            this.f16970f = t4;
            this.f16971g = objArr;
        }

        public final void a() {
            this.f16966b.i(this.f16967c, this.f16968d, this.f16969e, this.f16970f, this.f16971g);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    private static final <T> l<k2<T>, k2<Object>> b(l<T, ? extends Object> lVar) {
        l0.n(lVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return m.a(new a(lVar), new b(lVar));
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T> k2<T> c(@fg.l Object[] objArr, @fg.l l<T, ? extends Object> lVar, @fg.m String str, @fg.l ld.a<? extends k2<T>> aVar, @fg.m t tVar, int i4, int i5) {
        tVar.P(-202053668);
        if ((i5 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (x.b0()) {
            x.r0(-202053668, i4, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:127)");
        }
        k2<T> k2Var = (k2) d(Arrays.copyOf(objArr, objArr.length), b(lVar), str2, aVar, tVar, (i4 & 896) | 8 | (i4 & 7168), 0);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final <T> T d(@fg.l Object[] objArr, @fg.m l<T, ? extends Object> lVar, @fg.m String str, @fg.l ld.a<? extends T> aVar, @fg.m t tVar, int i4, int i5) {
        Object f4;
        tVar.P(441892779);
        if ((i5 & 2) != 0) {
            lVar = m.b();
        }
        T t4 = null;
        if ((i5 & 4) != 0) {
            str = null;
        }
        if (x.b0()) {
            x.r0(441892779, i4, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(j4, kotlin.text.c.a(f16963a));
            l0.o(str, "toString(this, checkRadix(radix))");
        }
        l0.n(lVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        i iVar = (i) tVar.x(k.b());
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            if (iVar != null && (f4 = iVar.f(str)) != null) {
                t4 = lVar.b(f4);
            }
            Q = new e(lVar, iVar, str, t4 == null ? aVar.invoke() : t4, objArr);
            tVar.E(Q);
        }
        tVar.p0();
        e eVar = (e) Q;
        T t5 = (T) eVar.g(objArr);
        if (t5 == null) {
            t5 = aVar.invoke();
        }
        a1.k(new c(eVar, lVar, iVar, str, t5, objArr), tVar, 0);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return t5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(i iVar, Object obj) {
        String str;
        if (obj == null || iVar.a(obj)) {
            return;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (a0Var.e() == o4.m() || a0Var.e() == o4.x() || a0Var.e() == o4.t()) {
                str = "MutableState containing " + a0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
