package androidx.view.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.a3;
import androidx.compose.runtime.b3;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.o0;
import androidx.view.C1412m0;
import androidx.view.f0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: BackHandler.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/activity/compose/i;", "", "<init>", "()V", "Landroidx/activity/f0;", "dispatcherOwner", "Landroidx/compose/runtime/b3;", "b", "(Landroidx/activity/f0;)Landroidx/compose/runtime/b3;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "LocalOnBackPressedDispatcherOwner", "a", "(Landroidx/compose/runtime/t;I)Landroidx/activity/f0;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final i f464a = new i();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final a3<f0> LocalOnBackPressedDispatcherOwner = androidx.compose.runtime.f0.e(null, a.f467b, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f466c = 0;

    /* compiled from: BackHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/f0;", "a", "()Landroidx/activity/f0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<f0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f467b = new a(0);

        a() {
            super(0);
        }

        @m
        public final f0 a() {
            return null;
        }

        @Override // ld.a
        public f0 invoke() {
            return null;
        }
    }

    private i() {
    }

    @m
    @androidx.compose.runtime.i
    @kd.i(name = "getCurrent")
    public final f0 a(@m t tVar, int i4) {
        tVar.P(-2068013981);
        f0 f0Var = (f0) tVar.x(LocalOnBackPressedDispatcherOwner);
        tVar.P(1680121597);
        if (f0Var == null) {
            f0Var = C1412m0.a((View) tVar.x(o0.k()));
        }
        tVar.p0();
        if (f0Var == null) {
            Object obj = (Context) tVar.x(o0.g());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof f0) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            f0Var = (f0) obj;
        }
        tVar.p0();
        return f0Var;
    }

    @l
    public final b3<f0> b(@l f0 dispatcherOwner) {
        return LocalOnBackPressedDispatcherOwner.e(dispatcherOwner);
    }
}
