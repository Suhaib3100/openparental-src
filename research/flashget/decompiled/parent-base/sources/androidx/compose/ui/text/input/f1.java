package androidx.compose.ui.text.input;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Choreographer f21023b;

    public /* synthetic */ f1(Choreographer choreographer) {
        this.f21023b = choreographer;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g1.e(this.f21023b, runnable);
    }
}
