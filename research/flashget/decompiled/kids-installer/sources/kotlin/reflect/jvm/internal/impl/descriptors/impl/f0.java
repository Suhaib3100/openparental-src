package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ReceiverParameterDescriptorImpl.java */
/* loaded from: classes6.dex */
public class f0 extends c {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ boolean f24197s = false;

    /* renamed from: q, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f24198q;

    /* renamed from: r, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h f24199r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        super(gVar);
        if (mVar == null) {
            Q(0);
        }
        if (hVar == null) {
            Q(1);
        }
        if (gVar == null) {
            Q(2);
        }
        this.f24198q = mVar;
        this.f24199r = hVar;
    }

    private static /* synthetic */ void Q(int i5) {
        String s5 = (i5 == 3 || i5 == 4) ? ProtectedSandApp.s("至") : ProtectedSandApp.s("臲");
        Object[] objArr = new Object[(i5 == 3 || i5 == 4) ? 2 : 3];
        String s6 = ProtectedSandApp.s("致");
        switch (i5) {
            case 1:
                objArr[0] = ProtectedSandApp.s("臹");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("臸");
                break;
            case 3:
            case 4:
                objArr[0] = s6;
                break;
            case 5:
                objArr[0] = ProtectedSandApp.s("臷");
                break;
            case 6:
                objArr[0] = ProtectedSandApp.s("臶");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("臵");
                break;
        }
        if (i5 == 3) {
            objArr[1] = ProtectedSandApp.s("臻");
        } else if (i5 != 4) {
            objArr[1] = s6;
        } else {
            objArr[1] = ProtectedSandApp.s("臺");
        }
        if (i5 != 3 && i5 != 4) {
            if (i5 == 5) {
                objArr[2] = ProtectedSandApp.s("臾");
            } else if (i5 != 6) {
                objArr[2] = ProtectedSandApp.s("臼");
            } else {
                objArr[2] = ProtectedSandApp.s("臽");
            }
        }
        String format = String.format(s5, objArr);
        if (i5 != 3 && i5 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m
    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.m b() {
        kotlin.reflect.jvm.internal.impl.descriptors.m mVar = this.f24198q;
        if (mVar == null) {
            Q(4);
        }
        return mVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.x0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h getValue() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar = this.f24199r;
        if (hVar == null) {
            Q(3);
        }
        return hVar;
    }
}
