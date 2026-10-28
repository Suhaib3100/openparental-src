package permissions.dispatcher.ktx;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.h1;
import androidx.view.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: PermissionRequestFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0019\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Lpermissions/dispatcher/ktx/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/k2;", "onAttach", "(Landroid/content/Context;)V", "", "n", "()Ljava/lang/Integer;", "b", "I", "o", "()I", "requestCode", "Lpermissions/dispatcher/ktx/i;", "c", "Lpermissions/dispatcher/ktx/i;", "p", "()Lpermissions/dispatcher/ktx/i;", "q", "(Lpermissions/dispatcher/ktx/i;)V", "viewModel", "a", "Lpermissions/dispatcher/ktx/g$a;", "Lpermissions/dispatcher/ktx/g$b;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class g extends Fragment {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int requestCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    protected i viewModel;

    /* compiled from: PermissionRequestFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lpermissions/dispatcher/ktx/g$a;", "Lpermissions/dispatcher/ktx/g;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k2;", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "d", "a", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends g {

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        public static final String f88780e = ProtectedSandApp.s("ꕢ\u0001");

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: PermissionRequestFragment.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpermissions/dispatcher/ktx/g$a$a;", "", "<init>", "()V", "", "", "permissions", "Lpermissions/dispatcher/ktx/g$a;", "a", "([Ljava/lang/String;)Lpermissions/dispatcher/ktx/g$a;", "BUNDLE_PERMISSIONS_KEY", "Ljava/lang/String;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: permissions.dispatcher.ktx.g$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final a a(@fg.l String[] permissions2) {
                l0.p(permissions2, ProtectedSandApp.s("ꕝ\u0001"));
                a aVar = new a();
                Bundle bundle = new Bundle();
                bundle.putStringArray(ProtectedSandApp.s("ꕞ\u0001"), permissions2);
                k2 k2Var = k2.f75408a;
                aVar.setArguments(bundle);
                return aVar;
            }

            public Companion(w wVar) {
            }
        }

        public a() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(@fg.m Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle arguments = getArguments();
            String[] stringArray = arguments == null ? null : arguments.getStringArray(ProtectedSandApp.s("ꕢ\u0001"));
            if (stringArray == null) {
                return;
            }
            requestPermissions(stringArray, getRequestCode());
        }

        @Override // androidx.fragment.app.Fragment
        public void onRequestPermissionsResult(int requestCode, @fg.l String[] permissions2, @fg.l int[] grantResults) {
            l0.p(permissions2, ProtectedSandApp.s("ꕣ\u0001"));
            l0.p(grantResults, ProtectedSandApp.s("ꕤ\u0001"));
            super.onRequestPermissionsResult(requestCode, permissions2, grantResults);
            if (requestCode == getRequestCode()) {
                String arrays = Arrays.toString(kotlin.collections.l.Vu(permissions2));
                l0.o(arrays, ProtectedSandApp.s("ꕥ\u0001"));
                if (og.g.f(Arrays.copyOf(grantResults, grantResults.length))) {
                    p().f(arrays, j.GRANTED);
                } else if (og.g.e(this, (String[]) Arrays.copyOf(permissions2, permissions2.length))) {
                    p().f(arrays, j.DENIED);
                } else {
                    p().f(arrays, j.DENIED_AND_DISABLED);
                }
            }
            n();
        }
    }

    /* compiled from: PermissionRequestFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lpermissions/dispatcher/ktx/g$b;", "Lpermissions/dispatcher/ktx/g;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/k2;", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "d", "Ljava/lang/String;", "action", "e", "a", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends g {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String action;

        /* renamed from: f, reason: collision with root package name */
        @fg.l
        public static final String f88782f = ProtectedSandApp.s("ꕨ\u0001");

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: PermissionRequestFragment.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpermissions/dispatcher/ktx/g$b$a;", "", "<init>", "()V", "", "action", "Lpermissions/dispatcher/ktx/g$b;", "a", "(Ljava/lang/String;)Lpermissions/dispatcher/ktx/g$b;", "BUNDLE_ACTION_KEY", "Ljava/lang/String;", "ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: permissions.dispatcher.ktx.g$b$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final b a(@fg.l String action) {
                l0.p(action, ProtectedSandApp.s("ꕦ\u0001"));
                b bVar = new b();
                Bundle bundle = new Bundle();
                bundle.putString(ProtectedSandApp.s("ꕧ\u0001"), action);
                k2 k2Var = k2.f75408a;
                bVar.setArguments(bundle);
                return bVar;
            }

            public Companion(w wVar) {
            }
        }

        public b() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int requestCode, int resultCode, @fg.m Intent data) {
            if (requestCode == getRequestCode()) {
                boolean canDrawOverlays = Settings.canDrawOverlays(getActivity());
                String s4 = ProtectedSandApp.s("ꕩ\u0001");
                if (canDrawOverlays) {
                    i p4 = p();
                    String str = this.action;
                    if (str == null) {
                        l0.S(s4);
                        throw null;
                    }
                    p4.f(str, j.GRANTED);
                } else {
                    i p5 = p();
                    String str2 = this.action;
                    if (str2 == null) {
                        l0.S(s4);
                        throw null;
                    }
                    p5.f(str2, j.DENIED);
                }
            }
            n();
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(@fg.m Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle arguments = getArguments();
            String string = arguments == null ? null : arguments.getString(ProtectedSandApp.s("ꕨ\u0001"));
            if (string == null) {
                return;
            }
            this.action = string;
            Context context = getContext();
            String packageName = context == null ? null : context.getPackageName();
            if (packageName == null) {
                return;
            }
            Uri parse = Uri.parse(l0.C(ProtectedSandApp.s("ꕪ\u0001"), packageName));
            String str = this.action;
            if (str != null) {
                startActivityForResult(new Intent(str, parse), getRequestCode());
            } else {
                l0.S(ProtectedSandApp.s("ꕩ\u0001"));
                throw null;
            }
        }
    }

    public /* synthetic */ g(w wVar) {
        this();
    }

    @fg.m
    protected final Integer n() {
        androidx.fragment.app.l0 u4;
        androidx.fragment.app.l0 C;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || (u4 = fragmentManager.u()) == null || (C = u4.C(this)) == null) {
            return null;
        }
        return Integer.valueOf(C.s());
    }

    /* renamed from: o, reason: from getter */
    protected final int getRequestCode() {
        return this.requestCode;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@fg.m Context context) {
        super.onAttach(context);
        setRetainInstance(true);
        h1 a5 = new k1(requireActivity()).a(i.class);
        l0.o(a5, ProtectedSandApp.s("ꕟ\u0001"));
        q((i) a5);
    }

    @fg.l
    protected final i p() {
        i iVar = this.viewModel;
        if (iVar != null) {
            return iVar;
        }
        l0.S(ProtectedSandApp.s("ꕠ\u0001"));
        throw null;
    }

    protected final void q(@fg.l i iVar) {
        l0.p(iVar, ProtectedSandApp.s("ꕡ\u0001"));
        this.viewModel = iVar;
    }

    private g() {
        this.requestCode = new Random().nextInt(1000);
    }
}
