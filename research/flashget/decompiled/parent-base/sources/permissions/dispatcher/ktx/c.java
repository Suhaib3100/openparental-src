package permissions.dispatcher.ktx;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import permissions.dispatcher.ktx.h;

/* compiled from: FragmentExtensions.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0085\u0001\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u00022\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00060\tj\u0002`\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0001\"\u00020\u00112\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00060\tj\u0002`\n¢\u0006\u0004\b\u0012\u0010\u0013\u001a[\u0010\u0014\u001a\u00020\u000e*\u00020\u00002\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00060\tj\u0002`\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "", "permissions", "Lkotlin/Function1;", "Log/f;", "Lkotlin/k2;", "Lpermissions/dispatcher/ktx/ShowRationaleFun;", "onShowRationale", "Lkotlin/Function0;", "Lpermissions/dispatcher/ktx/Fun;", "onPermissionDenied", "onNeverAskAgain", "requiresPermission", "Lpermissions/dispatcher/ktx/k;", "c", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lld/l;Lld/a;Lld/a;Lld/a;)Lpermissions/dispatcher/ktx/k;", "Lpermissions/dispatcher/ktx/e;", "a", "(Landroidx/fragment/app/Fragment;[Lpermissions/dispatcher/ktx/e;Lld/l;Lld/a;Lld/a;Lld/a;)Lpermissions/dispatcher/ktx/k;", "g", "(Landroidx/fragment/app/Fragment;Lld/l;Lld/a;Lld/a;)Lpermissions/dispatcher/ktx/k;", "e", "ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class c {
    @fg.l
    public static final k a(@fg.l Fragment fragment, @fg.l e[] eVarArr, @fg.m ld.l<? super og.f, k2> lVar, @fg.m ld.a<k2> aVar, @fg.m ld.a<k2> aVar2, @fg.l ld.a<k2> aVar3) {
        l0.p(fragment, ProtectedSandApp.s("ꕋ\u0001"));
        l0.p(eVarArr, ProtectedSandApp.s("ꕌ\u0001"));
        l0.p(aVar3, ProtectedSandApp.s("ꕍ\u0001"));
        String[] b5 = f.b(eVarArr, 0, 1, null);
        FragmentActivity requireActivity = fragment.requireActivity();
        h.a aVar4 = h.a.f88784a;
        l0.o(requireActivity, ProtectedSandApp.s("ꕎ\u0001"));
        return new l(b5, requireActivity, lVar, aVar, aVar3, aVar2, aVar4);
    }

    @fg.l
    public static final k c(@fg.l Fragment fragment, @fg.l String[] strArr, @fg.m ld.l<? super og.f, k2> lVar, @fg.m ld.a<k2> aVar, @fg.m ld.a<k2> aVar2, @fg.l ld.a<k2> aVar3) {
        l0.p(fragment, ProtectedSandApp.s("ꕋ\u0001"));
        l0.p(strArr, ProtectedSandApp.s("ꕌ\u0001"));
        l0.p(aVar3, ProtectedSandApp.s("ꕍ\u0001"));
        FragmentActivity requireActivity = fragment.requireActivity();
        h.a aVar4 = h.a.f88784a;
        l0.o(requireActivity, ProtectedSandApp.s("ꕎ\u0001"));
        return new l(strArr, requireActivity, lVar, aVar, aVar3, aVar2, aVar4);
    }

    @fg.l
    @SuppressLint({"InlinedApi"})
    public static final k e(@fg.l Fragment fragment, @fg.m ld.l<? super og.f, k2> lVar, @fg.m ld.a<k2> aVar, @fg.l ld.a<k2> aVar2) {
        l0.p(fragment, ProtectedSandApp.s("ꕋ\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("ꕍ\u0001"));
        String[] strArr = {ProtectedSandApp.s("ꕏ\u0001")};
        FragmentActivity requireActivity = fragment.requireActivity();
        h.b bVar = h.b.f88785a;
        l0.o(requireActivity, ProtectedSandApp.s("ꕎ\u0001"));
        return new l(strArr, requireActivity, lVar, aVar, aVar2, null, bVar);
    }

    public static /* synthetic */ k f(Fragment fragment, ld.l lVar, ld.a aVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        return e(fragment, lVar, aVar, aVar2);
    }

    @fg.l
    @SuppressLint({"InlinedApi"})
    public static final k g(@fg.l Fragment fragment, @fg.m ld.l<? super og.f, k2> lVar, @fg.m ld.a<k2> aVar, @fg.l ld.a<k2> aVar2) {
        l0.p(fragment, ProtectedSandApp.s("ꕋ\u0001"));
        l0.p(aVar2, ProtectedSandApp.s("ꕍ\u0001"));
        String[] strArr = {ProtectedSandApp.s("ꕐ\u0001")};
        FragmentActivity requireActivity = fragment.requireActivity();
        h.c cVar = h.c.f88786a;
        l0.o(requireActivity, ProtectedSandApp.s("ꕎ\u0001"));
        return new l(strArr, requireActivity, lVar, aVar, aVar2, null, cVar);
    }

    public static /* synthetic */ k h(Fragment fragment, ld.l lVar, ld.a aVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        return g(fragment, lVar, aVar, aVar2);
    }
}
