package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00120\u0011H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/n1;", "Landroidx/compose/runtime/saveable/i;", "saveableStateRegistry", "Lkotlin/Function0;", "Lkotlin/k2;", "onDispose", "<init>", "(Landroidx/compose/runtime/saveable/i;Lld/a;)V", "", "value", "", "a", "(Ljava/lang/Object;)Z", "", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "e", "()Ljava/util/Map;", "valueProvider", "Landroidx/compose/runtime/saveable/i$a;", "c", "(Ljava/lang/String;Lld/a;)Landroidx/compose/runtime/saveable/i$a;", "b", "()V", "Lld/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n1 implements androidx.compose.runtime.saveable.i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20016c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> onDispose;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.runtime.saveable.i f20018b;

    public n1(@fg.l androidx.compose.runtime.saveable.i iVar, @fg.l ld.a<kotlin.k2> aVar) {
        this.onDispose = aVar;
        this.f20018b = iVar;
    }

    @Override // androidx.compose.runtime.saveable.i
    public boolean a(@fg.l Object value) {
        return this.f20018b.a(value);
    }

    public final void b() {
        this.onDispose.invoke();
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.l
    public i.a c(@fg.l String key, @fg.l ld.a<? extends Object> valueProvider) {
        return this.f20018b.c(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.l
    public Map<String, List<Object>> e() {
        return this.f20018b.e();
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.m
    public Object f(@fg.l String key) {
        return this.f20018b.f(key);
    }
}
