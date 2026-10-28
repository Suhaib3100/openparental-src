package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* loaded from: classes7.dex */
public class q extends c {

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f76125d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e f76126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b());
        if (eVar == null) {
            j0(0);
        }
        this.f76125d = eVar;
        this.f76126e = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e(eVar, null);
    }

    private static /* synthetic */ void j0(int i4) {
        String s4 = (i4 == 1 || i4 == 2) ? ProtectedSandApp.s("涛\u0001") : ProtectedSandApp.s("涚\u0001");
        Object[] objArr = new Object[(i4 == 1 || i4 == 2) ? 2 : 3];
        String s5 = ProtectedSandApp.s("涜\u0001");
        if (i4 == 1 || i4 == 2) {
            objArr[0] = s5;
        } else if (i4 != 3) {
            objArr[0] = ProtectedSandApp.s("涝\u0001");
        } else {
            objArr[0] = ProtectedSandApp.s("涞\u0001");
        }
        if (i4 == 1) {
            objArr[1] = ProtectedSandApp.s("涠\u0001");
        } else if (i4 != 2) {
            objArr[1] = s5;
        } else {
            objArr[1] = ProtectedSandApp.s("涟\u0001");
        }
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                objArr[2] = ProtectedSandApp.s("涡\u0001");
            } else {
                objArr[2] = ProtectedSandApp.s("涢\u0001");
            }
        }
        String format = String.format(s4, objArr);
        if (i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.m c() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.f76125d;
        if (eVar == null) {
            j0(2);
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.e eVar = this.f76126e;
        if (eVar == null) {
            j0(1);
        }
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    public String toString() {
        return ProtectedSandApp.s("涣\u0001") + this.f76125d.getName() + ProtectedSandApp.s("涤\u0001");
    }
}
