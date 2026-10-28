package org.apache.commons.lang3.reflect;

import java.lang.reflect.Method;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Method) obj).toString();
    }
}
