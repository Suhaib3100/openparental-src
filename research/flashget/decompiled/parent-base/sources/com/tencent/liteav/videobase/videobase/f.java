package com.tencent.liteav.videobase.videobase;

import androidx.constraintlayout.core.motion.utils.w;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.tencent.liteav.TXLiteAVCode;
import org.apache.http.HttpStatus;

/* loaded from: classes7.dex */
public enum f {
    f72394a(0),
    f72395b(1),
    f72396c(101),
    f72397d(103),
    f72398e(201),
    f72399f(202),
    f72400g(203),
    f72401h(404),
    f72402i(HttpStatus.SC_METHOD_NOT_ALLOWED),
    f72403j(502),
    f72404k(w.h.f22554j),
    f72405l(804),
    f72406m(805),
    f72407n(1000),
    f72408o(1001),
    f72409p(1002),
    f72410q(1003),
    f72411r(2000),
    f72412s(2001),
    f72413t(2002),
    f72414u(3000),
    f72415v(3001),
    f72416w(3004),
    f72417x(3005),
    f72418y(AuthApiStatusCodes.AUTH_APP_CERT_ERROR),
    f72419z(3007),
    A(3008),
    B(4000),
    C(4001),
    D(4004),
    E(4005),
    F(4006),
    G(4007),
    H(4008),
    I(4009),
    J(5000),
    K(6000),
    L(TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE),
    M(6002);

    private static final f[] N = values();
    private final int value;

    f(int i4) {
        this.value = i4;
    }
}
