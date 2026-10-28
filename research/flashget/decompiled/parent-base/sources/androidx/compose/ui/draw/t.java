package androidx.compose.ui.draw;

import androidx.compose.foundation.h0;
import androidx.compose.foundation.s1;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.p4;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.graphics.r4;
import androidx.compose.ui.graphics.r5;
import androidx.compose.ui.platform.a2;
import androidx.compose.ui.platform.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: Shadow.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aF\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "elevation", "Landroidx/compose/ui/graphics/e6;", "shape", "", "clip", "c", "(Landroidx/compose/ui/q;FLandroidx/compose/ui/graphics/e6;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/graphics/d2;", "ambientColor", "spotColor", "a", "(Landroidx/compose/ui/q;FLandroidx/compose/ui/graphics/e6;ZJJ)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
/* loaded from: classes.dex */
public final class t {

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<q4, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f17461b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e6 f17462c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f17463d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f17464e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f17465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, e6 e6Var, boolean z4, long j4, long j5) {
            super(1);
            this.f17461b = f4;
            this.f17462c = e6Var;
            this.f17463d = z4;
            this.f17464e = j4;
            this.f17465f = j5;
        }

        public final void a(@fg.l q4 q4Var) {
            q4Var.t3(q4Var.v5(this.f17461b));
            q4Var.h5(this.f17462c);
            q4Var.g2(this.f17463d);
            q4Var.T1(this.f17464e);
            q4Var.t2(this.f17465f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(q4 q4Var) {
            a(q4Var);
            return k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n1#1,170:1\n104#2,7:171\n*E\n"})
    public static final class b extends n0 implements ld.l<a2, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f17466b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e6 f17467c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f17468d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f17469e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f17470f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f4, e6 e6Var, boolean z4, long j4, long j5) {
            super(1);
            this.f17466b = f4;
            this.f17467c = e6Var;
            this.f17468d = z4;
            this.f17469e = j4;
            this.f17470f = j5;
        }

        public final void a(@fg.l a2 a2Var) {
            a2Var.d("shadow");
            s1.a(this.f17466b, a2Var.getProperties(), "elevation", a2Var).c("shape", this.f17467c);
            h0.a(this.f17468d, a2Var.getProperties(), "clip", a2Var).c("ambientColor", d2.n(this.f17469e));
            a2Var.getProperties().c("spotColor", d2.n(this.f17470f));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(a2 a2Var) {
            a(a2Var);
            return k2.f75408a;
        }
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, float f4, @fg.l e6 e6Var, boolean z4, long j4, long j5) {
        if (Float.compare(f4, androidx.compose.ui.unit.h.g(0)) > 0 || z4) {
            return y1.d(qVar, y1.e() ? new b(f4, e6Var, z4, j4, j5) : y1.b(), p4.a(androidx.compose.ui.q.INSTANCE, new a(f4, e6Var, z4, j4, j5)));
        }
        return qVar;
    }

    public static androidx.compose.ui.q b(androidx.compose.ui.q qVar, float f4, e6 e6Var, boolean z4, long j4, long j5, int i4, Object obj) {
        boolean z5;
        e6 a5 = (i4 & 2) != 0 ? r5.a() : e6Var;
        if ((i4 & 4) != 0) {
            z5 = false;
            if (Float.compare(f4, androidx.compose.ui.unit.h.g(0)) > 0) {
                z5 = true;
            }
        } else {
            z5 = z4;
        }
        return a(qVar, f4, a5, z5, (i4 & 8) != 0 ? r4.b() : j4, (i4 & 16) != 0 ? r4.b() : j5);
    }

    @x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @x0(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    public static final /* synthetic */ androidx.compose.ui.q c(androidx.compose.ui.q qVar, float f4, e6 e6Var, boolean z4) {
        return a(qVar, f4, e6Var, z4, r4.b(), r4.b());
    }

    public static androidx.compose.ui.q d(androidx.compose.ui.q qVar, float f4, e6 e6Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            e6Var = r5.a();
        }
        if ((i4 & 4) != 0) {
            z4 = false;
            if (Float.compare(f4, androidx.compose.ui.unit.h.g(0)) > 0) {
                z4 = true;
            }
        }
        return c(qVar, f4, e6Var, z4);
    }
}
