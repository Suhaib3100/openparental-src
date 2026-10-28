package permissions.dispatcher.ktx;

import android.R;
import androidx.fragment.app.FragmentActivity;
import androidx.view.h1;
import androidx.view.k1;
import androidx.view.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import permissions.dispatcher.ktx.i;

/* compiled from: PermissionsRequesterImpl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010&\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001d¨\u0006'"}, d2 = {"Lpermissions/dispatcher/ktx/l;", "Lpermissions/dispatcher/ktx/k;", "", "", "permissions", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function1;", "Log/f;", "Lkotlin/k2;", "Lpermissions/dispatcher/ktx/ShowRationaleFun;", "onShowRationale", "Lkotlin/Function0;", "Lpermissions/dispatcher/ktx/Fun;", "onPermissionDenied", "requiresPermission", "onNeverAskAgain", "Lpermissions/dispatcher/ktx/h;", "permissionRequestType", "<init>", "([Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;Lld/l;Lld/a;Lld/a;Lld/a;Lpermissions/dispatcher/ktx/h;)V", "a", "()V", "[Ljava/lang/String;", "b", "Landroidx/fragment/app/FragmentActivity;", "c", "Lld/l;", "d", "Lld/a;", "e", "f", "Lpermissions/dispatcher/ktx/h;", "Lpermissions/dispatcher/ktx/i;", "g", "Lpermissions/dispatcher/ktx/i;", "viewModel", "h", "requestFun", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String[] permissions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final FragmentActivity activity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<og.f, k2> onShowRationale;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.a<k2> onPermissionDenied;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> requiresPermission;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h permissionRequestType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i viewModel;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> requestFun;

    /* compiled from: PermissionsRequesterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    static final class a extends n0 implements ld.a<k2> {
        a() {
            super(0);
        }

        public final void a() {
            l.this.activity.getSupportFragmentManager().u().D(R.id.content, l.this.permissionRequestType.b(l.this.permissions)).s();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.l String[] strArr, @fg.l FragmentActivity fragmentActivity, @fg.m ld.l<? super og.f, k2> lVar, @fg.m ld.a<k2> aVar, @fg.l ld.a<k2> aVar2, @fg.m ld.a<k2> aVar3, @fg.l h hVar) {
        o0 c5;
        l0.p(strArr, ProtectedSandApp.s("ꕺ\u0001"));
        l0.p(fragmentActivity, ProtectedSandApp.s("ꕻ\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("ꕼ\u0001"));
        l0.p(hVar, ProtectedSandApp.s("ꕽ\u0001"));
        this.permissions = strArr;
        this.activity = fragmentActivity;
        this.onShowRationale = lVar;
        this.onPermissionDenied = aVar;
        this.requiresPermission = aVar2;
        this.permissionRequestType = hVar;
        h1 a5 = new k1(fragmentActivity).a(i.class);
        l0.o(a5, ProtectedSandApp.s("ꕾ\u0001"));
        i iVar = (i) a5;
        this.viewModel = iVar;
        this.requestFun = new a();
        String arrays = Arrays.toString(kotlin.collections.l.Vu(strArr));
        l0.o(arrays, ProtectedSandApp.s("ꕿ\u0001"));
        WeakReference weakReference = new WeakReference(aVar2);
        WeakReference weakReference2 = new WeakReference(aVar);
        WeakReference weakReference3 = new WeakReference(aVar3);
        c5 = iVar.c();
        c5.k(fragmentActivity, new i.a(arrays, weakReference, weakReference2, weakReference3));
    }

    @Override // permissions.dispatcher.ktx.k
    public void a() {
        ld.l<og.f, k2> lVar;
        if (this.permissionRequestType.a(this.activity, this.permissions)) {
            this.viewModel.g(this.activity);
            this.requiresPermission.invoke();
            return;
        }
        FragmentActivity fragmentActivity = this.activity;
        String[] strArr = this.permissions;
        if (!og.g.d(fragmentActivity, (String[]) Arrays.copyOf(strArr, strArr.length)) || (lVar = this.onShowRationale) == null) {
            this.requestFun.invoke();
        } else {
            lVar.invoke(d.INSTANCE.a(this.onPermissionDenied, this.requestFun));
        }
    }
}
