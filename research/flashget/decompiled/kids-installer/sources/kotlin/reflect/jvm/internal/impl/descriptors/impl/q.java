package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* loaded from: classes6.dex */
public class q extends c {

    /* renamed from: q, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f24282q;

    /* renamed from: r, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e f24283r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b());
        if (eVar == null) {
            Q(0);
        }
        this.f24282q = eVar;
        this.f24283r = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e(eVar, null);
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 1 || i5 == 2) ? ProtectedSandApp.s("苑") : ProtectedSandApp.s("苐");
        Object[] objArr = new Object[(i5 == 1 || i5 == 2) ? 2 : 3];
        String s6 = ProtectedSandApp.s("苒");
        if (i5 == 1 || i5 == 2) {
            objArr[0] = s6;
        } else if (i5 != 3) {
            objArr[0] = ProtectedSandApp.s("苓");
        } else {
            objArr[0] = ProtectedSandApp.s("苔");
        }
        if (i5 == 1) {
            objArr[1] = ProtectedSandApp.s("苖");
        } else if (i5 != 2) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("苕");
        }
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                objArr[2] = ProtectedSandApp.s("苗");
            } else {
                objArr[2] = ProtectedSandApp.s("苘");
            }
        }
        String format = String.format(s5, objArr);
        if (i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f24282q;
        if (eVar == null) {
            Q(2);
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e eVar = this.f24283r;
        if (eVar == null) {
            Q(1);
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    public String toString() {
        return ProtectedSandApp.s("苙") + this.f24282q.getName() + ProtectedSandApp.s("苚");
    }
}
