package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/q;", "", "ratio", "", "matchHeightConstraintsFirst", "a", "(Landroidx/compose/ui/q;FZ)Landroidx/compose/ui/q;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,236:1\n135#2:237\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n63#1:237\n*E\n"})
/* loaded from: classes.dex */
public final class j {

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n1#1,170:1\n64#2,4:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f4, boolean z4) {
            super(1);
            this.f5114b = f4;
            this.f5115c = z4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("aspectRatio");
            a2Var.getProperties().c("ratio", Float.valueOf(this.f5114b));
            a2Var.getProperties().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f5115c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f4, boolean z4) {
        return qVar.w3(new AspectRatioElement(f4, z4, androidx.compose.ui.platform.y1.e() ? new a(f4, z4) : androidx.compose.ui.platform.y1.b()));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, float f4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return a(qVar, f4, z4);
    }
}
