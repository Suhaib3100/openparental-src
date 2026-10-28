package com.cby.thirdpartlogin;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import com.cby.thirdpartlogin.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ThirdPardLoginManager.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ;\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/cby/thirdpartlogin/ThirdPardLoginManager;", "Landroidx/lifecycle/b0;", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "Lcom/cby/thirdpartlogin/b;", "thirdPard", "<init>", "(Landroidx/fragment/app/FragmentActivity;[Lcom/cby/thirdpartlogin/b;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;[Lcom/cby/thirdpartlogin/b;)V", "Landroid/app/Activity;", "Lkotlin/k2;", "a", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;[Lcom/cby/thirdpartlogin/b;)V", "Ljava/lang/Class;", "clazz", "h", "(Ljava/lang/Class;)Lcom/cby/thirdpartlogin/b;", "g", "()V", "e", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "d", "(IILandroid/content/Intent;)V", "Landroidx/lifecycle/e0;", "source", "Landroidx/lifecycle/w$a;", "event", "f", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$a;)V", "", "", "b", "Ljava/util/Map;", "mThirdPardMap", "ThirdPartLogin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nThirdPardLoginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPardLoginManager.kt\ncom/cby/thirdpartlogin/ThirdPardLoginManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,83:1\n13309#2:84\n13310#2:86\n1#3:85\n215#4,2:87\n215#4,2:89\n215#4,2:91\n215#4,2:93\n*S KotlinDebug\n*F\n+ 1 ThirdPardLoginManager.kt\ncom/cby/thirdpartlogin/ThirdPardLoginManager\n*L\n32#1:84\n32#1:86\n47#1:87,2\n58#1:89,2\n67#1:91,2\n76#1:93,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ThirdPardLoginManager implements InterfaceC1416b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Map<String, b> mThirdPardMap;

    /* compiled from: ThirdPardLoginManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45009a;

        static {
            int[] iArr = new int[AbstractC1450w.a.values().length];
            try {
                iArr[AbstractC1450w.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1450w.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1450w.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45009a = iArr;
        }
    }

    public ThirdPardLoginManager(@l FragmentActivity fragmentActivity, @l b... bVarArr) {
        l0.p(fragmentActivity, ProtectedSandApp.s("಼"));
        l0.p(bVarArr, ProtectedSandApp.s("\u0cbb"));
        this.mThirdPardMap = new LinkedHashMap();
        fragmentActivity.getLifecycle().a(this);
        b(this, fragmentActivity, null, (b[]) Arrays.copyOf(bVarArr, bVarArr.length), 2, null);
    }

    private final void a(Activity activity, Fragment fragment, b... thirdPard) {
        for (b bVar : thirdPard) {
            Map<String, b> map = this.mThirdPardMap;
            String simpleName = bVar.getClass().getSimpleName();
            l0.o(simpleName, ProtectedSandApp.s("ಽ"));
            map.put(simpleName, bVar);
            if (activity != null) {
                bVar.h(activity);
            }
            if (fragment != null) {
                bVar.f(fragment);
            }
        }
    }

    static /* synthetic */ void b(ThirdPardLoginManager thirdPardLoginManager, Activity activity, Fragment fragment, b[] bVarArr, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            activity = null;
        }
        if ((i4 & 2) != 0) {
            fragment = null;
        }
        thirdPardLoginManager.a(activity, fragment, bVarArr);
    }

    public final void d(int requestCode, int resultCode, @m Intent data) {
        Iterator<Map.Entry<String, b>> it = this.mThirdPardMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a(requestCode, resultCode, data);
        }
    }

    public final void e() {
        for (Map.Entry<String, b> entry : this.mThirdPardMap.entrySet()) {
            if (entry.getValue().j()) {
                b.C0758b.b(entry.getValue(), null, 1, null);
                b.C0758b.a(entry.getValue(), null, 1, null);
            }
        }
    }

    @Override // androidx.view.InterfaceC1416b0
    public void f(@l InterfaceC1423e0 source, @l AbstractC1450w.a event) {
        l0.p(source, ProtectedSandApp.s("ಾ"));
        l0.p(event, ProtectedSandApp.s("ಿ"));
        a4.a.f185a.a(ProtectedSandApp.s("ೀ") + source + ProtectedSandApp.s("ು") + event);
        if (a.f45009a[event.ordinal()] != 3) {
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.mThirdPardMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().k();
        }
    }

    public final void g() {
        for (Map.Entry<String, b> entry : this.mThirdPardMap.entrySet()) {
            if (entry.getValue().j()) {
                b.C0758b.b(entry.getValue(), null, 1, null);
            }
        }
    }

    @m
    public final b h(@l Class<?> clazz) {
        l0.p(clazz, ProtectedSandApp.s("ೂ"));
        return this.mThirdPardMap.get(clazz.getSimpleName());
    }

    public ThirdPardLoginManager(@l Fragment fragment, @l b... bVarArr) {
        l0.p(fragment, ProtectedSandApp.s("\u0cba"));
        l0.p(bVarArr, ProtectedSandApp.s("\u0cbb"));
        this.mThirdPardMap = new LinkedHashMap();
        fragment.getLifecycle().a(this);
        b(this, null, fragment, (b[]) Arrays.copyOf(bVarArr, bVarArr.length), 1, null);
    }
}
