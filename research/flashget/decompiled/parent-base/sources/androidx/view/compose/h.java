package androidx.view.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.a3;
import androidx.compose.runtime.b3;
import androidx.compose.runtime.f0;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.o0;
import androidx.view.View;
import androidx.view.b0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: ReportDrawn.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/activity/compose/h;", "", "<init>", "()V", "Landroidx/activity/b0;", "fullyDrawnReporterOwner", "Landroidx/compose/runtime/b3;", "b", "(Landroidx/activity/b0;)Landroidx/compose/runtime/b3;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "LocalFullyDrawnReporterOwner", "a", "(Landroidx/compose/runtime/t;I)Landroidx/activity/b0;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,176:1\n76#2:177\n76#2:178\n76#2:179\n23#3,8:180\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n106#1:177\n107#1:178\n108#1:179\n108#1:180,8\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final h f460a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final a3<b0> LocalFullyDrawnReporterOwner = f0.e(null, a.f463b, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f462c = 0;

    /* compiled from: ReportDrawn.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/b0;", "a", "()Landroidx/activity/b0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<b0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f463b = new a(0);

        a() {
            super(0);
        }

        @m
        public final b0 a() {
            return null;
        }

        @Override // ld.a
        public b0 invoke() {
            return null;
        }
    }

    private h() {
    }

    @m
    @i
    @kd.i(name = "getCurrent")
    public final b0 a(@m t tVar, int i4) {
        tVar.P(540186968);
        b0 b0Var = (b0) tVar.x(LocalFullyDrawnReporterOwner);
        tVar.P(1606493384);
        if (b0Var == null) {
            b0Var = View.a((android.view.View) tVar.x(o0.k()));
        }
        tVar.p0();
        if (b0Var == null) {
            Object obj = (Context) tVar.x(o0.g());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof b0) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            b0Var = (b0) obj;
        }
        tVar.p0();
        return b0Var;
    }

    @l
    public final b3<b0> b(@l b0 fullyDrawnReporterOwner) {
        return LocalFullyDrawnReporterOwner.e(fullyDrawnReporterOwner);
    }
}
