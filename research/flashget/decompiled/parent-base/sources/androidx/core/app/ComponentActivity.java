package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.c1;
import androidx.collection.a3;
import androidx.core.view.i0;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import kotlin.Metadata;

/* compiled from: ComponentActivity.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0015¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010\"\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\"\u0010\u000bR.\u0010$\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0018\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0005R\u001a\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0005R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/e0;", "Landroidx/core/view/i0$a;", "<init>", "()V", "", "", "args", "", "shouldSkipDump", "([Ljava/lang/String;)Z", "Landroidx/core/app/ComponentActivity$a;", "extraData", "Lkotlin/k2;", "putExtraData", "(Landroidx/core/app/ComponentActivity$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "T", "Ljava/lang/Class;", "extraDataClass", "getExtraData", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$a;", "Landroid/view/KeyEvent;", "event", "superDispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "Landroidx/collection/a3;", "extraDataMap", "Landroidx/collection/a3;", "getExtraDataMap$annotations", "Landroidx/lifecycle/g0;", "lifecycleRegistry", "Landroidx/lifecycle/g0;", "getLifecycleRegistry$annotations", "Landroidx/lifecycle/w;", "getLifecycle", "()Landroidx/lifecycle/w;", "lifecycle", "a", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ComponentActivity extends Activity implements InterfaceC1423e0, i0.a {

    @fg.l
    private final a3<Class<? extends a>, a> extraDataMap = new a3<>(0, 1, null);

    @fg.l
    private final androidx.view.g0 lifecycleRegistry = new androidx.view.g0(this);

    /* compiled from: ComponentActivity.kt */
    @kotlin.k(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/app/ComponentActivity$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static class a {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    private final boolean shouldSkipDump(String[] args) {
        if (args == null || args.length == 0) {
            return false;
        }
        String str = args[0];
        switch (str.hashCode()) {
            case -645125871:
                return str.equals("--translation") && Build.VERSION.SDK_INT >= 31;
            case 100470631:
                if (!str.equals("--dump-dumpable")) {
                    return false;
                }
                break;
            case 472614934:
                if (!str.equals("--list-dumpables")) {
                    return false;
                }
                break;
            case 1159329357:
                return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
            case 1455016274:
                return str.equals("--autofill") && Build.VERSION.SDK_INT >= 26;
            default:
                return false;
        }
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@fg.l KeyEvent event) {
        kotlin.jvm.internal.l0.p(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l0.o(decorView, "window.decorView");
        if (androidx.core.view.i0.d(decorView, event)) {
            return true;
        }
        return androidx.core.view.i0.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@fg.l KeyEvent event) {
        kotlin.jvm.internal.l0.p(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.l0.o(decorView, "window.decorView");
        if (androidx.core.view.i0.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @fg.m
    @kotlin.k(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public <T extends a> T getExtraData(@fg.l Class<T> extraDataClass) {
        kotlin.jvm.internal.l0.p(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    @fg.l
    public AbstractC1450w getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(@fg.m Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.view.v0.INSTANCE.d(this);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@fg.l Bundle outState) {
        kotlin.jvm.internal.l0.p(outState, "outState");
        this.lifecycleRegistry.s(AbstractC1450w.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.k(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void putExtraData(@fg.l a extraData) {
        kotlin.jvm.internal.l0.p(extraData, "extraData");
        this.extraDataMap.put(extraData.getClass(), extraData);
    }

    protected final boolean shouldDumpInternalState(@fg.m String[] args) {
        return !shouldSkipDump(args);
    }

    @Override // androidx.core.view.i0.a
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@fg.l KeyEvent event) {
        kotlin.jvm.internal.l0.p(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
