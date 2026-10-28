package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: WindowInsetsSize.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/layout/n2;", "insets", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/layout/n2;)Landroidx/compose/ui/q;", "b", "d", "a", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,214:1\n135#2:215\n135#2:216\n135#2:217\n135#2:218\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n50#1:215\n75#1:216\n98#1:217\n117#1:218\n*E\n"})
/* loaded from: classes.dex */
public final class h3 {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n118#2,3:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2 f5065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2 n2Var) {
            super(1);
            this.f5065b = n2Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("insetsBottomHeight");
            a2Var.getProperties().c("insets", this.f5065b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsSize.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/d;", "it", "", "a", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/unit/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<n2, androidx.compose.ui.unit.d, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f5066b = new b(2);

        b() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l n2 n2Var, @fg.l androidx.compose.ui.unit.d dVar) {
            return Integer.valueOf(n2Var.c(dVar));
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n76#2,3:171\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2 f5067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n2 n2Var) {
            super(1);
            this.f5067b = n2Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("insetsEndWidth");
            a2Var.getProperties().c("insets", this.f5067b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsSize.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "", "a", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.q<n2, androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f5068b = new d(3);

        d() {
            super(3);
        }

        @Override // ld.q
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer R(@fg.l n2 n2Var, @fg.l androidx.compose.ui.unit.w wVar, @fg.l androidx.compose.ui.unit.d dVar) {
            return Integer.valueOf(wVar == androidx.compose.ui.unit.w.Rtl ? n2Var.d(dVar, wVar) : n2Var.b(dVar, wVar));
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n51#2,3:171\n*E\n"})
    public static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2 f5069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(n2 n2Var) {
            super(1);
            this.f5069b = n2Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("insetsStartWidth");
            a2Var.getProperties().c("insets", this.f5069b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsSize.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "", "a", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<n2, androidx.compose.ui.unit.w, androidx.compose.ui.unit.d, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f5070b = new f(3);

        f() {
            super(3);
        }

        @Override // ld.q
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer R(@fg.l n2 n2Var, @fg.l androidx.compose.ui.unit.w wVar, @fg.l androidx.compose.ui.unit.d dVar) {
            return Integer.valueOf(wVar == androidx.compose.ui.unit.w.Ltr ? n2Var.d(dVar, wVar) : n2Var.b(dVar, wVar));
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n1#1,170:1\n99#2,3:171\n*E\n"})
    public static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2 f5071b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n2 n2Var) {
            super(1);
            this.f5071b = n2Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("insetsTopHeight");
            a2Var.getProperties().c("insets", this.f5071b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: WindowInsetsSize.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "Landroidx/compose/ui/unit/d;", "it", "", "a", "(Landroidx/compose/foundation/layout/n2;Landroidx/compose/ui/unit/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<n2, androidx.compose.ui.unit.d, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f5072b = new h(2);

        h() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@fg.l n2 n2Var, @fg.l androidx.compose.ui.unit.d dVar) {
            return Integer.valueOf(n2Var.a(dVar));
        }
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l n2 n2Var) {
        return qVar.w3(new y(n2Var, androidx.compose.ui.platform.y1.e() ? new a(n2Var) : androidx.compose.ui.platform.y1.b(), b.f5066b));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l n2 n2Var) {
        return qVar.w3(new z(n2Var, androidx.compose.ui.platform.y1.e() ? new c(n2Var) : androidx.compose.ui.platform.y1.b(), d.f5068b));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l n2 n2Var) {
        return qVar.w3(new z(n2Var, androidx.compose.ui.platform.y1.e() ? new e(n2Var) : androidx.compose.ui.platform.y1.b(), f.f5070b));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l n2 n2Var) {
        return qVar.w3(new y(n2Var, androidx.compose.ui.platform.y1.e() ? new g(n2Var) : androidx.compose.ui.platform.y1.b(), h.f5072b));
    }
}
