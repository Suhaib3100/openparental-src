package androidx.core.os;

import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Locale;

/* compiled from: LocaleListInterface.java */
/* loaded from: classes.dex */
interface n {
    @g0(from = -1)
    int a(Locale locale);

    String b();

    Object c();

    @q0
    Locale d(@o0 String[] strArr);

    Locale get(int i5);

    boolean isEmpty();

    @g0(from = 0)
    int size();
}
