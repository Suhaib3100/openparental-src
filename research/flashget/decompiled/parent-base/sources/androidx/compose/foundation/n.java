package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.r5;
import kotlin.Metadata;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/e6;", "shape", "c", "(Landroidx/compose/ui/q;JLandroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/t1;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/graphics/t1;Landroidx/compose/ui/graphics/e6;F)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,182:1\n135#2:183\n135#2:184\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n55#1:183\n86#1:184\n*E\n"})
/* loaded from: classes.dex */
public final class n {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,170:1\n87#2,5:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f6606b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.t1 f6607c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e6 f6608d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f4, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var) {
            super(1);
            this.f6606b = f4;
            this.f6607c = t1Var;
            this.f6608d = e6Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("background");
            a2Var.getProperties().c("alpha", Float.valueOf(this.f6606b));
            a2Var.getProperties().c("brush", this.f6607c);
            a2Var.getProperties().c("shape", this.f6608d);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n1#1,170:1\n56#2,5:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f6609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e6 f6610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j4, e6 e6Var) {
            super(1);
            this.f6609b = j4;
            this.f6610c = e6Var;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("background");
            a2Var.e(androidx.compose.ui.graphics.d2.n(this.f6609b));
            a2Var.getProperties().c("color", androidx.compose.ui.graphics.d2.n(this.f6609b));
            a2Var.getProperties().c("shape", this.f6610c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.graphics.t1 t1Var, @fg.l e6 e6Var, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        return qVar.w3(new BackgroundElement(0L, t1Var, f4, e6Var, androidx.compose.ui.platform.y1.e() ? new a(f4, t1Var, e6Var) : androidx.compose.ui.platform.y1.b(), 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, androidx.compose.ui.graphics.t1 t1Var, e6 e6Var, float f4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            e6Var = r5.a();
        }
        if ((i4 & 4) != 0) {
            f4 = 1.0f;
        }
        return a(qVar, t1Var, e6Var, f4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, long j4, @fg.l e6 e6Var) {
        return qVar.w3(new BackgroundElement(j4, null, 1.0f, e6Var, androidx.compose.ui.platform.y1.e() ? new b(j4, e6Var) : androidx.compose.ui.platform.y1.b(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.q d(androidx.compose.ui.q qVar, long j4, e6 e6Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            e6Var = r5.a();
        }
        return c(qVar, j4, e6Var);
    }
}
