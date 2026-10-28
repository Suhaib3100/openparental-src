package androidx.work.impl;

import androidx.annotation.c1;
import androidx.view.LiveData;
import androidx.view.o0;
import androidx.work.w;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: OperationImpl.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class c implements w {

    /* renamed from: c, reason: collision with root package name */
    private final o0<w.b> f36110c = new o0<>();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<w.b.c> f36111d = androidx.work.impl.utils.futures.c.u();

    public c() {
        b(w.f36615b);
    }

    @Override // androidx.work.w
    @androidx.annotation.o0
    public ListenableFuture<w.b.c> a() {
        return this.f36111d;
    }

    public void b(@androidx.annotation.o0 w.b state) {
        this.f36110c.o(state);
        if (state instanceof w.b.c) {
            this.f36111d.p((w.b.c) state);
        } else if (state instanceof w.b.a) {
            this.f36111d.q(((w.b.a) state).a());
        }
    }

    @Override // androidx.work.w
    @androidx.annotation.o0
    public LiveData<w.b> getState() {
        return this.f36110c;
    }
}
