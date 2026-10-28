package androidx.view.compose;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.internal.u;
import androidx.core.app.e;
import androidx.view.result.h;
import b.a;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k;

/* compiled from: ActivityResultRegistry.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/activity/compose/j;", "I", "O", "Landroidx/activity/result/h;", "Landroidx/activity/compose/b;", "launcher", "Landroidx/compose/runtime/b5;", "Lb/a;", "contract", "<init>", "(Landroidx/activity/compose/b;Landroidx/compose/runtime/b5;)V", "Lkotlin/k2;", "d", "()V", "input", "Landroidx/core/app/e;", "options", "c", "(Ljava/lang/Object;Landroidx/core/app/e;)V", "a", "()Lb/a;", "Landroidx/activity/compose/b;", "b", "Landroidx/compose/runtime/b5;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j<I, O> extends h<I> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f468c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final b<I> launcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final b5<a<I, O>> contract;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@l b<I> bVar, @l b5<? extends a<I, O>> b5Var) {
        this.launcher = bVar;
        this.contract = b5Var;
    }

    @Override // androidx.view.result.h
    @l
    public a<I, ?> a() {
        return this.contract.getValue();
    }

    @Override // androidx.view.result.h
    public void c(I input, @m e options) {
        this.launcher.b(input, options);
    }

    @Override // androidx.view.result.h
    @k(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void d() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
