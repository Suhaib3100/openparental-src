package androidx.compose.ui;

import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u1;
import kotlin.k2;

/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a^\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001ah\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ar\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001al\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0016\"\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0000*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u00020\u0000*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/runtime/i;", "factory", "e", "(Landroidx/compose/ui/q;Lld/l;Lld/q;)Landroidx/compose/ui/q;", "", "fullyQualifiedName", "", "key1", "c", "(Landroidx/compose/ui/q;Ljava/lang/String;Ljava/lang/Object;Lld/l;Lld/q;)Landroidx/compose/ui/q;", "key2", "b", "(Landroidx/compose/ui/q;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lld/l;Lld/q;)Landroidx/compose/ui/q;", "key3", "a", "(Landroidx/compose/ui/q;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lld/l;Lld/q;)Landroidx/compose/ui/q;", "", "keys", "d", "(Landroidx/compose/ui/q;Ljava/lang/String;[Ljava/lang/Object;Lld/l;Lld/q;)Landroidx/compose/ui/q;", "Landroidx/compose/runtime/t;", "modifier", "l", "(Landroidx/compose/runtime/t;Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "k", "m", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/q$c;", "it", "", "a", "(Landroidx/compose/ui/q$c;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<q.c, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18505b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l q.c cVar) {
            return Boolean.valueOf(!(cVar instanceof h));
        }
    }

    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/q;", "acc", "Landroidx/compose/ui/q$c;", "element", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/q$c;)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.p<q, q.c, q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.t f18506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.t tVar) {
            super(2);
            this.f18506b = tVar;
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q invoke(@fg.l q qVar, @fg.l q.c cVar) {
            boolean z4 = cVar instanceof h;
            q qVar2 = cVar;
            if (z4) {
                ld.q<q, androidx.compose.runtime.t, Integer, q> j4 = ((h) cVar).j();
                l0.n(j4, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                qVar2 = i.l(this.f18506b, (q) ((ld.q) u1.q(j4, 3)).R(q.INSTANCE, this.f18506b, 0));
            }
            return qVar.w3(qVar2);
        }
    }

    @fg.l
    @k
    public static final q a(@fg.l q qVar, @fg.l String str, @fg.m Object obj, @fg.m Object obj2, @fg.m Object obj3, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar2) {
        return qVar.w3(new o(str, obj, obj2, obj3, lVar, qVar2));
    }

    @fg.l
    @k
    public static final q b(@fg.l q qVar, @fg.l String str, @fg.m Object obj, @fg.m Object obj2, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar2) {
        return qVar.w3(new n(str, obj, obj2, lVar, qVar2));
    }

    @fg.l
    @k
    public static final q c(@fg.l q qVar, @fg.l String str, @fg.m Object obj, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar2) {
        return qVar.w3(new m(str, obj, lVar, qVar2));
    }

    @fg.l
    @k
    public static final q d(@fg.l q qVar, @fg.l String str, @fg.l Object[] objArr, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar2) {
        return qVar.w3(new p(str, objArr, lVar, qVar2));
    }

    @fg.l
    public static final q e(@fg.l q qVar, @fg.l ld.l<? super a2, k2> lVar, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, ? extends q> qVar2) {
        return qVar.w3(new h(lVar, qVar2));
    }

    public static /* synthetic */ q f(q qVar, String str, Object obj, Object obj2, Object obj3, ld.l lVar, ld.q qVar2, int i4, Object obj4) {
        if ((i4 & 16) != 0) {
            lVar = y1.b();
        }
        return a(qVar, str, obj, obj2, obj3, lVar, qVar2);
    }

    public static /* synthetic */ q g(q qVar, String str, Object obj, Object obj2, ld.l lVar, ld.q qVar2, int i4, Object obj3) {
        if ((i4 & 8) != 0) {
            lVar = y1.b();
        }
        return b(qVar, str, obj, obj2, lVar, qVar2);
    }

    public static /* synthetic */ q h(q qVar, String str, Object obj, ld.l lVar, ld.q qVar2, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            lVar = y1.b();
        }
        return c(qVar, str, obj, lVar, qVar2);
    }

    public static /* synthetic */ q i(q qVar, String str, Object[] objArr, ld.l lVar, ld.q qVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            lVar = y1.b();
        }
        return d(qVar, str, objArr, lVar, qVar2);
    }

    public static /* synthetic */ q j(q qVar, ld.l lVar, ld.q qVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = y1.b();
        }
        return e(qVar, lVar, qVar2);
    }

    @fg.l
    @kd.i(name = "materializeModifier")
    public static final q l(@fg.l androidx.compose.runtime.t tVar, @fg.l q qVar) {
        if (qVar.Z(a.f18505b)) {
            return qVar;
        }
        tVar.P(1219399079);
        q qVar2 = (q) qVar.I(q.INSTANCE, new b(tVar));
        tVar.p0();
        return qVar2;
    }

    @fg.l
    public static final q m(@fg.l androidx.compose.runtime.t tVar, @fg.l q qVar) {
        return qVar == q.INSTANCE ? qVar : l(tVar, new CompositionLocalMapInjectionElement(tVar.B()).w3(qVar));
    }
}
