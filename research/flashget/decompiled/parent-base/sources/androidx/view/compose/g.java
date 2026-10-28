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
import androidx.view.result.j;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: ActivityResultRegistry.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/activity/compose/g;", "", "<init>", "()V", "Landroidx/activity/result/j;", "registryOwner", "Landroidx/compose/runtime/b3;", "b", "(Landroidx/activity/result/j;)Landroidx/compose/runtime/b3;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "LocalComposition", "a", "(Landroidx/compose/runtime/t;I)Landroidx/activity/result/j;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final g f456a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final a3<j> LocalComposition = f0.e(null, a.f459b, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f458c = 0;

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/result/j;", "a", "()Landroidx/activity/result/j;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<j> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f459b = new a(0);

        a() {
            super(0);
        }

        @m
        public final j a() {
            return null;
        }

        @Override // ld.a
        public j invoke() {
            return null;
        }
    }

    private g() {
    }

    @m
    @i
    @kd.i(name = "getCurrent")
    public final j a(@m t tVar, int i4) {
        tVar.P(1418020823);
        j jVar = (j) tVar.x(LocalComposition);
        if (jVar == null) {
            Object obj = (Context) tVar.x(o0.g());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof j) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            jVar = (j) obj;
        }
        tVar.p0();
        return jVar;
    }

    @l
    public final b3<j> b(@l j registryOwner) {
        return LocalComposition.e(registryOwner);
    }
}
