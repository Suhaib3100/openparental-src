package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.semantics.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\b\u001a!\u0010\u0016\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010!\u001a\u0004\u0018\u00010\u001f*\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0018\u0010$\u001a\u0004\u0018\u00010\u000f*\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010(\u001a\u0004\u0018\u00010'*\u00020&2\u0006\u0010 \u001a\u00020\u001aH\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\u00020\u0002*\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0002¢\u0006\u0004\b+\u0010,\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"0\u0010:\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107\"\u001e\u0010>\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\b\"\u0019\u0010@\u001a\u00020\u0002*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\b\"\u0019\u0010B\u001a\u00020\u0002*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\b\"\u0019\u0010D\u001a\u00020\u0002*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\b\"\u0019\u0010F\u001a\u00020\u0002*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\b\"\u0019\u0010J\u001a\u00020G*\u00020\u00068Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\"\u001a\u0010L\u001a\u0004\u0018\u00010\u000f*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "", "selector", "s", "(Landroidx/compose/ui/node/h0;Lld/l;)Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/semantics/p;", "p", "(Landroidx/compose/ui/semantics/p;)Z", "C", "Landroidx/compose/ui/semantics/l;", "oldConfig", "J", "(Landroidx/compose/ui/semantics/p;Landroidx/compose/ui/semantics/l;)Z", "A", "", "y", "(Landroidx/compose/ui/semantics/p;)Ljava/lang/String;", "q", "Landroidx/compose/ui/semantics/a;", "", "other", "o", "(Landroidx/compose/ui/semantics/a;Ljava/lang/Object;)Z", "Landroidx/compose/ui/semantics/r;", "", "", "Landroidx/compose/ui/platform/e5;", "t", "(Landroidx/compose/ui/semantics/r;)Ljava/util/Map;", "", "Landroidx/compose/ui/platform/d5;", "id", "r", "(Ljava/util/List;I)Landroidx/compose/ui/platform/d5;", "Landroidx/compose/ui/semantics/i;", "M", "(I)Ljava/lang/String;", "Landroidx/compose/ui/platform/z0;", "Landroid/view/View;", "K", "(Landroidx/compose/ui/platform/z0;I)Landroid/view/View;", "node", "B", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/node/h0;)Z", "Li0/i;", "a", "Li0/i;", "DefaultFakeNodeBounds", "<set-?>", "b", "Z", "v", "()Z", "L", "(Z)V", "w", "()V", "DisableContentCapture", "H", "I", "(Landroidx/compose/ui/semantics/p;)V", "isVisible", "D", "isPassword", "F", "isTextField", "E", "isRtl", "G", "isTraversalGroup", "", "z", "(Landroidx/compose/ui/semantics/p;)F", "traversalIndex", "x", "infoContentDescriptionOrNull", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3790:1\n3585#1:3791\n288#2,2:3792\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n3599#1:3791\n3771#1:3792,2\n*E\n"})
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final i0.i f19782a = new i0.i(0.0f, 0.0f, 10.0f, 10.0f);

    /* renamed from: b, reason: collision with root package name */
    private static boolean f19783b;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/h0;", "it", "", "a", "(Landroidx/compose/ui/node/h0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19784b = new a(1);

        a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r3.f(androidx.compose.ui.semantics.k.f20321a.y()) != false) goto L10;
         */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(@fg.l androidx.compose.ui.node.h0 r3) {
            /*
                r2 = this;
                androidx.compose.ui.semantics.l r3 = r3.Z()
                if (r3 == 0) goto L1a
                boolean r0 = r3.getIsMergingSemanticsOfDescendants()
                r1 = 1
                if (r0 != r1) goto L1a
                androidx.compose.ui.semantics.k r0 = androidx.compose.ui.semantics.k.f20321a
                androidx.compose.ui.semantics.y r0 = r0.y()
                boolean r3 = r3.f(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.c0.a.invoke(androidx.compose.ui.node.h0):java.lang.Boolean");
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1\n*L\n1#1,3790:1\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19785b = new b(0);

        public b() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.FALSE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1\n*L\n1#1,3790:1\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.a<Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f19786b = new c(0);

        public c() {
            super(0);
        }

        @fg.l
        public final Float a() {
            return Float.valueOf(0.0f);
        }

        @Override // ld.a
        public Float invoke() {
            return Float.valueOf(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(androidx.compose.ui.semantics.p pVar) {
        return pVar.n().f(androidx.compose.ui.semantics.t.f20369a.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(androidx.compose.ui.node.h0 h0Var, androidx.compose.ui.node.h0 h0Var2) {
        androidx.compose.ui.node.h0 B0 = h0Var2.B0();
        if (B0 == null) {
            return false;
        }
        return kotlin.jvm.internal.l0.g(B0, h0Var) || B(h0Var, B0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(androidx.compose.ui.semantics.p pVar) {
        return pVar.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || pVar.getUnmergedConfig().h();
    }

    private static final boolean D(androidx.compose.ui.semantics.p pVar) {
        return pVar.n().f(androidx.compose.ui.semantics.t.f20369a.v());
    }

    private static final boolean E(androidx.compose.ui.semantics.p pVar) {
        return pVar.p().getLayoutDirection() == androidx.compose.ui.unit.w.Rtl;
    }

    private static final boolean F(androidx.compose.ui.semantics.p pVar) {
        return pVar.getUnmergedConfig().f(androidx.compose.ui.semantics.k.f20321a.y());
    }

    private static final boolean G(androidx.compose.ui.semantics.p pVar) {
        return ((Boolean) pVar.n().l(androidx.compose.ui.semantics.t.f20369a.s(), b.f19785b)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean H(androidx.compose.ui.semantics.p pVar) {
        return (pVar.E() || pVar.getUnmergedConfig().f(androidx.compose.ui.semantics.t.f20369a.l())) ? false : true;
    }

    private static /* synthetic */ void I(androidx.compose.ui.semantics.p pVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(androidx.compose.ui.semantics.p pVar, androidx.compose.ui.semantics.l lVar) {
        Iterator<Map.Entry<? extends androidx.compose.ui.semantics.y<?>, ? extends Object>> it = lVar.iterator();
        while (it.hasNext()) {
            if (!pVar.n().f(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    @fg.m
    public static final View K(@fg.l z0 z0Var, int i4) {
        Object obj;
        Iterator<T> it = z0Var.c().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((androidx.compose.ui.node.h0) ((Map.Entry) obj).getKey()).getSemanticsId() == i4) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.c) entry.getValue();
        }
        return null;
    }

    @androidx.compose.ui.k
    public static final void L(boolean z4) {
        f19783b = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M(int i4) {
        i.Companion companion = androidx.compose.ui.semantics.i.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.semantics.i.k(i4, androidx.compose.ui.semantics.i.f20309c)) {
            return "android.widget.Button";
        }
        companion.getClass();
        if (androidx.compose.ui.semantics.i.k(i4, androidx.compose.ui.semantics.i.f20310d)) {
            return "android.widget.CheckBox";
        }
        companion.getClass();
        if (androidx.compose.ui.semantics.i.k(i4, androidx.compose.ui.semantics.i.f20312f)) {
            return "android.widget.RadioButton";
        }
        companion.getClass();
        if (androidx.compose.ui.semantics.i.k(i4, androidx.compose.ui.semantics.i.f20314h)) {
            return "android.widget.ImageView";
        }
        companion.getClass();
        if (androidx.compose.ui.semantics.i.k(i4, androidx.compose.ui.semantics.i.f20315i)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(androidx.compose.ui.semantics.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.semantics.a)) {
            return false;
        }
        androidx.compose.ui.semantics.a aVar2 = (androidx.compose.ui.semantics.a) obj;
        if (!kotlin.jvm.internal.l0.g(aVar.getLabel(), aVar2.getLabel())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(androidx.compose.ui.semantics.p pVar) {
        return androidx.compose.ui.semantics.m.a(pVar.n(), androidx.compose.ui.semantics.t.f20369a.d()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(androidx.compose.ui.semantics.p pVar) {
        if (pVar.getUnmergedConfig().f(androidx.compose.ui.semantics.k.f20321a.y()) && !kotlin.jvm.internal.l0.g(androidx.compose.ui.semantics.m.a(pVar.getUnmergedConfig(), androidx.compose.ui.semantics.t.f20369a.g()), Boolean.TRUE)) {
            return true;
        }
        androidx.compose.ui.node.h0 s4 = s(pVar.getLayoutNode(), a.f19784b);
        if (s4 != null) {
            androidx.compose.ui.semantics.l Z = s4.Z();
            if (!(Z != null ? kotlin.jvm.internal.l0.g(androidx.compose.ui.semantics.m.a(Z, androidx.compose.ui.semantics.t.f20369a.g()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d5 r(List<d5> list, int i4) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (list.get(i5).getSemanticsNodeId() == i4) {
                return list.get(i5);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.node.h0 s(androidx.compose.ui.node.h0 h0Var, ld.l<? super androidx.compose.ui.node.h0, Boolean> lVar) {
        for (androidx.compose.ui.node.h0 B0 = h0Var.B0(); B0 != null; B0 = B0.B0()) {
            if (lVar.invoke(B0).booleanValue()) {
                return B0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, e5> t(androidx.compose.ui.semantics.r rVar) {
        androidx.compose.ui.semantics.p b5 = rVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b5.getLayoutNode().l() && b5.getLayoutNode().f()) {
            i0.i j4 = b5.j();
            u(new Region(kotlin.math.b.L0(j4.t()), kotlin.math.b.L0(j4.getTop()), kotlin.math.b.L0(j4.x()), kotlin.math.b.L0(j4.j())), b5, linkedHashMap, b5, new Region());
        }
        return linkedHashMap;
    }

    private static final void u(Region region, androidx.compose.ui.semantics.p pVar, Map<Integer, e5> map, androidx.compose.ui.semantics.p pVar2, Region region2) {
        androidx.compose.ui.layout.z p4;
        boolean z4 = (pVar2.getLayoutNode().l() && pVar2.getLayoutNode().f()) ? false : true;
        if (!region.isEmpty() || pVar2.getId() == pVar.getId()) {
            if (!z4 || pVar2.getIsFake()) {
                i0.i z5 = pVar2.z();
                int L0 = kotlin.math.b.L0(z5.t());
                int L02 = kotlin.math.b.L0(z5.getTop());
                int L03 = kotlin.math.b.L0(z5.x());
                int L04 = kotlin.math.b.L0(z5.j());
                region2.set(L0, L02, L03, L04);
                int id2 = pVar2.getId() == pVar.getId() ? -1 : pVar2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (pVar2.getIsFake()) {
                        androidx.compose.ui.semantics.p t4 = pVar2.t();
                        i0.i j4 = (t4 == null || (p4 = t4.p()) == null || !p4.l()) ? f19782a : t4.j();
                        map.put(Integer.valueOf(id2), new e5(pVar2, new Rect(kotlin.math.b.L0(j4.t()), kotlin.math.b.L0(j4.getTop()), kotlin.math.b.L0(j4.x()), kotlin.math.b.L0(j4.j()))));
                        return;
                    } else {
                        if (id2 == -1) {
                            map.put(Integer.valueOf(id2), new e5(pVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                map.put(Integer.valueOf(id2), new e5(pVar2, region2.getBounds()));
                List<androidx.compose.ui.semantics.p> w4 = pVar2.w();
                for (int size = w4.size() - 1; -1 < size; size--) {
                    u(region, pVar, map, w4.get(size), region2);
                }
                if (C(pVar2)) {
                    region.op(L0, L02, L03, L04, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    @androidx.compose.ui.k
    public static final boolean v() {
        return f19783b;
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(androidx.compose.ui.semantics.p pVar) {
        List list = (List) androidx.compose.ui.semantics.m.a(pVar.getUnmergedConfig(), androidx.compose.ui.semantics.t.f20369a.c());
        if (list != null) {
            return (String) kotlin.collections.w.G2(list);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String y(androidx.compose.ui.semantics.p pVar) {
        List list = (List) androidx.compose.ui.semantics.m.a(pVar.getUnmergedConfig(), androidx.compose.ui.semantics.t.f20369a.C());
        if (list != null) {
            return androidx.compose.ui.util.c.q(list, "\n", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    private static final float z(androidx.compose.ui.semantics.p pVar) {
        return ((Number) pVar.n().l(androidx.compose.ui.semantics.t.f20369a.G(), c.f19786b)).floatValue();
    }
}
