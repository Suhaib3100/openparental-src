package permissions.dispatcher.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: KtxPermissionRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB9\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR&\u0010\u0007\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lpermissions/dispatcher/ktx/d;", "Log/f;", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "Lkotlin/k2;", "Lpermissions/dispatcher/ktx/Fun;", "requestPermission", "permissionDenied", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V", "a", "()V", "cancel", "Ljava/lang/ref/WeakReference;", "b", "c", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements og.f {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final WeakReference<ld.a<k2>> requestPermission;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final WeakReference<ld.a<k2>> permissionDenied;

    /* compiled from: KtxPermissionRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpermissions/dispatcher/ktx/d$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Lkotlin/k2;", "Lpermissions/dispatcher/ktx/Fun;", "onPermissionDenied", "requestPermission", "Lpermissions/dispatcher/ktx/d;", "a", "(Lld/a;Lld/a;)Lpermissions/dispatcher/ktx/d;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: permissions.dispatcher.ktx.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final d a(@fg.m ld.a<k2> onPermissionDenied, @fg.l ld.a<k2> requestPermission) {
            l0.p(requestPermission, ProtectedSandApp.s("ꕑ\u0001"));
            return new d(new WeakReference(requestPermission), onPermissionDenied == null ? null : new WeakReference(onPermissionDenied));
        }

        public Companion(w wVar) {
        }
    }

    public d(@fg.l WeakReference<ld.a<k2>> weakReference, @fg.m WeakReference<ld.a<k2>> weakReference2) {
        l0.p(weakReference, ProtectedSandApp.s("ꕒ\u0001"));
        this.requestPermission = weakReference;
        this.permissionDenied = weakReference2;
    }

    @Override // og.f
    public void a() {
        ld.a<k2> aVar = this.requestPermission.get();
        if (aVar == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // og.f
    public void cancel() {
        ld.a<k2> aVar;
        WeakReference<ld.a<k2>> weakReference = this.permissionDenied;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.invoke();
    }
}
