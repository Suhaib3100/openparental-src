package androidx.compose.foundation.text;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.compose.ui.text.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnnotatedStringResolveInlineContent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001af\u0010\u000e\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00002'\u0010\u0014\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\"Q\u0010\u0018\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017*:\b\u0000\u0010\u0019\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007*\u0018\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/e;", "", "", "Landroidx/compose/foundation/text/t;", "inlineContent", "Lkotlin/q0;", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Landroidx/compose/foundation/text/InlineContentRange;", "c", "(Landroidx/compose/ui/text/e;Ljava/util/Map;)Lkotlin/q0;", "", "b", "(Landroidx/compose/ui/text/e;)Z", "text", "inlineContents", "a", "(Landroidx/compose/ui/text/e;Ljava/util/List;Landroidx/compose/runtime/t;I)V", "Lkotlin/q0;", "EmptyInlineContent", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,89:1\n33#2,6:90\n33#2,4:96\n38#2:135\n76#3,14:100\n92#3:134\n456#4,8:114\n464#4,6:128\n3737#5,6:122\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt\n*L\n46#1:90,6\n75#1:96,4\n75#1:135\n76#1:100,14\n76#1:134\n76#1:114,8\n76#1:128,6\n76#1:122,6\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.q0<List<e.b<androidx.compose.ui.text.a0>>, List<e.b<ld.q<String, androidx.compose.runtime.t, Integer, k2>>>> f7116a;

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "children", "Landroidx/compose/ui/unit/b;", "constrains", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n151#2,3:90\n33#2,4:93\n154#2,2:97\n38#2:99\n156#2:100\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2\n*L\n79#1:90,3\n79#1:93,4\n79#1:97,2\n79#1:99\n79#1:100\n*E\n"})
    static final class a implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7117a = new a();

        /* compiled from: AnnotatedStringResolveInlineContent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAnnotatedStringResolveInlineContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,89:1\n33#2,6:90\n*S KotlinDebug\n*F\n+ 1 AnnotatedStringResolveInlineContent.kt\nandroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1\n*L\n81#1:90,6\n*E\n"})
        /* renamed from: androidx.compose.foundation.text.b$a$a, reason: collision with other inner class name */
        static final class C0128a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f7118b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0128a(List<? extends androidx.compose.ui.layout.i1> list) {
                super(1);
                this.f7118b = list;
            }

            public final void a(@fg.l i1.a aVar) {
                List<androidx.compose.ui.layout.i1> list = this.f7118b;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    i1.a.m(aVar, list.get(i4), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        a() {
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                i4 = androidx.compose.animation.n.a(list.get(i4), j4, arrayList, i4, 1);
            }
            return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.p(j4), androidx.compose.ui.unit.b.o(j4), null, new C0128a(arrayList), 4, null);
        }
    }

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.b$b, reason: collision with other inner class name */
    static final class C0129b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f7119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<e.b<ld.q<String, androidx.compose.runtime.t, Integer, k2>>> f7120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0129b(androidx.compose.ui.text.e eVar, List<e.b<ld.q<String, androidx.compose.runtime.t, Integer, k2>>> list, int i4) {
            super(2);
            this.f7119b = eVar;
            this.f7120c = list;
            this.f7121d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b.a(this.f7119b, this.f7120c, tVar, g3.b(this.f7121d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    static {
        kotlin.collections.j0 j0Var = kotlin.collections.j0.f74919b;
        f7116a = new kotlin.q0<>(j0Var, j0Var);
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.text.e eVar, @fg.l List<e.b<ld.q<String, androidx.compose.runtime.t, Integer, k2>>> list, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-1794596951);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1794596951, i4, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            e.b<ld.q<String, androidx.compose.runtime.t, Integer, k2>> bVar = list.get(i5);
            ld.q<String, androidx.compose.runtime.t, Integer, k2> a5 = bVar.a();
            int start = bVar.getStart();
            int end = bVar.getEnd();
            a aVar = a.f7117a;
            o4.P(-1323940314);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            m5.j(o4, aVar, companion2.f());
            m5.j(o4, B, companion2.h());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion2.b();
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(o4), o4, 2058660585);
            a5.R(eVar.subSequence(start, end).getText(), o4, 0);
            o4.p0();
            o4.H();
            o4.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new C0129b(eVar, list, i4));
        }
    }

    public static final boolean b(@fg.l androidx.compose.ui.text.e eVar) {
        return eVar.p("androidx.compose.foundation.text.inlineContent", 0, eVar.getText().length());
    }

    @fg.l
    public static final kotlin.q0<List<e.b<androidx.compose.ui.text.a0>>, List<e.b<ld.q<String, androidx.compose.runtime.t, Integer, k2>>>> c(@fg.l androidx.compose.ui.text.e eVar, @fg.m Map<String, t> map) {
        if (map == null || map.isEmpty()) {
            return f7116a;
        }
        List<e.b<String>> l4 = eVar.l("androidx.compose.foundation.text.inlineContent", 0, eVar.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = l4.size();
        for (int i4 = 0; i4 < size; i4++) {
            e.b<String> bVar = l4.get(i4);
            t tVar = map.get(bVar.h());
            if (tVar != null) {
                arrayList.add(new e.b(tVar.getPlaceholder(), bVar.i(), bVar.g()));
                arrayList2.add(new e.b(tVar.a(), bVar.i(), bVar.g()));
            }
        }
        return new kotlin.q0<>(arrayList, arrayList2);
    }
}
