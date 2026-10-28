package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeCapture.java */
@d
/* loaded from: classes6.dex */
abstract class l<T> {
    l() {
    }

    final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        l0.u(genericSuperclass instanceof ParameterizedType, ProtectedSandApp.s("樂"), genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
