package permissions.dispatcher.ktx;

import androidx.annotation.l0;
import androidx.view.InterfaceC1423e0;
import androidx.view.h1;
import androidx.view.o0;
import androidx.view.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: PermissionRequestViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJl\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0012j\u0002`\u00130\u00112\u0018\u0010\u0015\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0012j\u0002`\u0013\u0018\u00010\u00112\u0018\u0010\u0016\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0012j\u0002`\u0013\u0018\u00010\u0011H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aR2\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u001b0\u00058BX\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lpermissions/dispatcher/ktx/i;", "Landroidx/lifecycle/h1;", "<init>", "()V", "T", "Landroidx/lifecycle/o0;", "Lkotlin/k2;", "d", "(Landroidx/lifecycle/o0;)V", "", "key", "Lpermissions/dispatcher/ktx/j;", "value", "f", "(Ljava/lang/String;Lpermissions/dispatcher/ktx/j;)V", "Landroidx/lifecycle/e0;", "owner", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "Lpermissions/dispatcher/ktx/Fun;", "requiresPermission", "onPermissionDenied", "onNeverAskAgain", "e", "(Landroidx/lifecycle/e0;Ljava/lang/String;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V", "g", "(Landroidx/lifecycle/e0;)V", "", "Lpermissions/dispatcher/ktx/b;", "a", "Landroidx/lifecycle/o0;", "c", "()Landroidx/lifecycle/o0;", "permissionRequestResult", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@l0
/* loaded from: classes9.dex */
public final class i extends h1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0<Map<String, b<j>>> permissionRequestResult = new o0<>();

    /* compiled from: PermissionRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lpermissions/dispatcher/ktx/b;", "Lpermissions/dispatcher/ktx/j;", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 5, 1})
    public static final class a<T> implements p0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88788b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference<ld.a<k2>> f88789c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ WeakReference<ld.a<k2>> f88790d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ WeakReference<ld.a<k2>> f88791e;

        /* compiled from: PermissionRequestViewModel.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: permissions.dispatcher.ktx.i$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1376a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f88792a;

            static {
                int[] iArr = new int[j.values().length];
                iArr[j.GRANTED.ordinal()] = 1;
                iArr[j.DENIED.ordinal()] = 2;
                iArr[j.DENIED_AND_DISABLED.ordinal()] = 3;
                f88792a = iArr;
            }
        }

        public a(String str, WeakReference<ld.a<k2>> weakReference, WeakReference<ld.a<k2>> weakReference2, WeakReference<ld.a<k2>> weakReference3) {
            this.f88788b = str;
            this.f88789c = weakReference;
            this.f88790d = weakReference2;
            this.f88791e = weakReference3;
        }

        @Override // androidx.view.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Map<String, b<j>> map) {
            ld.a<k2> aVar;
            WeakReference<ld.a<k2>> weakReference;
            ld.a<k2> aVar2;
            b<j> bVar = map.get(this.f88788b);
            j a5 = bVar == null ? null : bVar.a();
            int i4 = a5 == null ? -1 : C1376a.f88792a[a5.ordinal()];
            if (i4 == 1) {
                ld.a<k2> aVar3 = this.f88789c.get();
                if (aVar3 == null) {
                    return;
                }
                aVar3.invoke();
                return;
            }
            if (i4 != 2) {
                if (i4 != 3 || (weakReference = this.f88791e) == null || (aVar2 = weakReference.get()) == null) {
                    return;
                }
                aVar2.invoke();
                return;
            }
            WeakReference<ld.a<k2>> weakReference2 = this.f88790d;
            if (weakReference2 == null || (aVar = weakReference2.get()) == null) {
                return;
            }
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0<Map<String, b<j>>> c() {
        if (this.permissionRequestResult.f() == null) {
            this.permissionRequestResult.r(new LinkedHashMap());
        }
        return this.permissionRequestResult;
    }

    private final <T> void d(o0<T> o0Var) {
        o0Var.r(o0Var.f());
    }

    public final void e(@fg.l InterfaceC1423e0 owner, @fg.l String key, @fg.l WeakReference<ld.a<k2>> requiresPermission, @fg.m WeakReference<ld.a<k2>> onPermissionDenied, @fg.m WeakReference<ld.a<k2>> onNeverAskAgain) {
        kotlin.jvm.internal.l0.p(owner, ProtectedSandApp.s("ꕳ\u0001"));
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ꕴ\u0001"));
        kotlin.jvm.internal.l0.p(requiresPermission, ProtectedSandApp.s("ꕵ\u0001"));
        c().k(owner, new a(key, requiresPermission, onPermissionDenied, onNeverAskAgain));
    }

    public final void f(@fg.l String key, @fg.l j value) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ꕴ\u0001"));
        kotlin.jvm.internal.l0.p(value, ProtectedSandApp.s("ꕶ\u0001"));
        Map<String, b<j>> f4 = c().f();
        if (f4 != null) {
            f4.put(key, new b<>(value));
        }
        d(c());
    }

    public final void g(@fg.l InterfaceC1423e0 owner) {
        kotlin.jvm.internal.l0.p(owner, ProtectedSandApp.s("ꕳ\u0001"));
        c().q(owner);
    }
}
