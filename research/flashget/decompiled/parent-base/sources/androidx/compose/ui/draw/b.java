package androidx.compose.ui.draw;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.e6;
import androidx.compose.ui.graphics.n6;
import androidx.compose.ui.graphics.p4;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.graphics.r5;
import androidx.compose.ui.graphics.t5;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Blur.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a0\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "radiusX", "radiusY", "Landroidx/compose/ui/draw/c;", "edgeTreatment", "a", "(Landroidx/compose/ui/q;FFLandroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/q;", "radius", "c", "(Landroidx/compose/ui/q;FLandroidx/compose/ui/graphics/e6;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,154:1\n154#2:155\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:155\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: Blur.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<q4, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f17427b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f17428c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17429d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e6 f17430e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f17431f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f4, float f5, int i4, e6 e6Var, boolean z4) {
            super(1);
            this.f17427b = f4;
            this.f17428c = f5;
            this.f17429d = i4;
            this.f17430e = e6Var;
            this.f17431f = z4;
        }

        public final void a(@fg.l q4 q4Var) {
            float v5 = q4Var.v5(this.f17427b);
            float v52 = q4Var.v5(this.f17428c);
            q4Var.D((v5 <= 0.0f || v52 <= 0.0f) ? null : t5.a(v5, v52, this.f17429d));
            e6 e6Var = this.f17430e;
            if (e6Var == null) {
                e6Var = r5.a();
            }
            q4Var.h5(e6Var);
            q4Var.g2(this.f17431f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(q4 q4Var) {
            a(q4Var);
            return k2.f75408a;
        }
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, float f4, float f5, @fg.l e6 e6Var) {
        boolean z4;
        int i4;
        if (e6Var != null) {
            n6.INSTANCE.getClass();
            i4 = n6.f17973c;
            z4 = true;
        } else {
            n6.INSTANCE.getClass();
            z4 = false;
            i4 = n6.f17976f;
        }
        float f6 = 0;
        return ((Float.compare(f4, androidx.compose.ui.unit.h.g(f6)) <= 0 || Float.compare(f5, f6) <= 0) && !z4) ? qVar : p4.a(qVar, new a(f4, f5, i4, e6Var, z4));
    }

    public static androidx.compose.ui.q b(androidx.compose.ui.q qVar, float f4, float f5, c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            c.INSTANCE.getClass();
            cVar = c.c(c.f17433c);
        }
        return a(qVar, f4, f5, cVar.j());
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, float f4, @fg.l e6 e6Var) {
        return a(qVar, f4, f4, e6Var);
    }

    public static androidx.compose.ui.q d(androidx.compose.ui.q qVar, float f4, c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            c.INSTANCE.getClass();
            cVar = c.c(c.f17433c);
        }
        return a(qVar, f4, f4, cVar.j());
    }
}
