package androidx.startup;

import android.content.Context;
import androidx.annotation.o0;
import java.util.List;

/* compiled from: Initializer.java */
/* loaded from: classes.dex */
public interface b<T> {
    @o0
    T a(@o0 Context context);

    @o0
    List<Class<? extends b<?>>> dependencies();
}
