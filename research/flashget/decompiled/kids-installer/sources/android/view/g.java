package android.view;

import androidx.annotation.l0;
import androidx.annotation.o0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.java */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f95a;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f96b = new CopyOnWriteArrayList<>();

    public g(boolean z5) {
        this.f95a = z5;
    }

    void a(@o0 a aVar) {
        this.f96b.add(aVar);
    }

    @l0
    public abstract void b();

    @l0
    public final boolean c() {
        return this.f95a;
    }

    @l0
    public final void d() {
        Iterator<a> it = this.f96b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(@o0 a aVar) {
        this.f96b.remove(aVar);
    }

    @l0
    public final void f(boolean z5) {
        this.f95a = z5;
    }
}
