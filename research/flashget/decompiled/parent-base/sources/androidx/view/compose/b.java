package androidx.view.compose;

import androidx.core.app.e;
import androidx.view.result.h;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/activity/compose/b;", "I", "", "<init>", "()V", "input", "Landroidx/core/app/e;", "options", "Lkotlin/k2;", "b", "(Ljava/lang/Object;Landroidx/core/app/e;)V", "d", "Landroidx/activity/result/h;", "a", "Landroidx/activity/result/h;", "()Landroidx/activity/result/h;", "c", "(Landroidx/activity/result/h;)V", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b<I> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private h<I> launcher;

    @m
    public final h<I> a() {
        return this.launcher;
    }

    public final void b(@m I input, @m e options) {
        k2 k2Var;
        h<I> hVar = this.launcher;
        if (hVar != null) {
            hVar.c(input, options);
            k2Var = k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void c(@m h<I> hVar) {
        this.launcher = hVar;
    }

    public final void d() {
        k2 k2Var;
        h<I> hVar = this.launcher;
        if (hVar != null) {
            hVar.d();
            k2Var = k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
