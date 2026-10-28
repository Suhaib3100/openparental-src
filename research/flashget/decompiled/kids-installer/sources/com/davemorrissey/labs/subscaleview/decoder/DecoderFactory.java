package com.davemorrissey.labs.subscaleview.decoder;

import androidx.annotation.o0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public interface DecoderFactory<T> {
    @o0
    T make() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;
}
