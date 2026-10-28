package retrofit2;

import java.io.IOException;
import okhttp3.e0;

/* compiled from: Call.java */
/* loaded from: classes5.dex */
public interface b<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    b<T> mo106clone();

    v<T> execute() throws IOException;

    e0 g();

    boolean r();

    boolean t();

    void y0(d<T> dVar);
}
