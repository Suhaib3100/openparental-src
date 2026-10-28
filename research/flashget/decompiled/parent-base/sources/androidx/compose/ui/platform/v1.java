package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/platform/v1;", "", "Landroidx/compose/ui/platform/l2;", "request", "Lkotlin/Function0;", "Lkotlin/k2;", "onConnectionClosed", "<init>", "(Landroidx/compose/ui/platform/l2;Lld/a;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "a", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "b", "()V", "Landroidx/compose/ui/platform/l2;", "Lld/a;", "c", "Ljava/lang/Object;", "lock", "Landroidx/compose/ui/text/input/j0;", "d", "Landroidx/compose/ui/text/input/j0;", "connection", "", "e", "Z", "disposed", "()Z", "isActive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,157:1\n35#2:158\n35#2:159\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/InputMethodSession\n*L\n129#1:158\n149#1:159\n*E\n"})
/* loaded from: classes.dex */
final class v1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l2 request;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> onConnectionClosed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object lock = new Object();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.input.j0 connection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    public v1(@fg.l l2 l2Var, @fg.l ld.a<kotlin.k2> aVar) {
        this.request = l2Var;
        this.onConnectionClosed = aVar;
    }

    @fg.m
    public final InputConnection a(@fg.l EditorInfo outAttrs) {
        synchronized (this.lock) {
            try {
                if (this.disposed) {
                    return null;
                }
                androidx.compose.ui.text.input.j0 j0Var = this.connection;
                if (j0Var != null) {
                    j0Var.a();
                }
                androidx.compose.ui.text.input.j0 a5 = androidx.compose.ui.text.input.o0.a(this.request.a(outAttrs), this.onConnectionClosed);
                this.connection = a5;
                return a5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                androidx.compose.ui.text.input.j0 j0Var = this.connection;
                if (j0Var != null) {
                    j0Var.a();
                }
                this.connection = null;
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        return !this.disposed;
    }
}
