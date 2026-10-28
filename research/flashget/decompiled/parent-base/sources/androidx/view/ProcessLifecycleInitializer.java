package androidx.view;

import android.content.Context;
import androidx.startup.a;
import androidx.startup.b;
import androidx.view.u0;
import fg.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;

/* compiled from: ProcessLifecycleInitializer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/b;", "Landroidx/lifecycle/e0;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Landroidx/lifecycle/e0;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProcessLifecycleInitializer implements b<InterfaceC1423e0> {
    @Override // androidx.startup.b
    @l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC1423e0 create(@l Context context) {
        l0.p(context, "context");
        a e4 = a.e(context);
        l0.o(e4, "getInstance(context)");
        if (!e4.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1414a0.a(context);
        u0.Companion companion = u0.INSTANCE;
        companion.c(context);
        companion.getClass();
        return u0.f30447l;
    }

    @Override // androidx.startup.b
    @l
    public List<Class<? extends b<?>>> dependencies() {
        return j0.f74919b;
    }
}
