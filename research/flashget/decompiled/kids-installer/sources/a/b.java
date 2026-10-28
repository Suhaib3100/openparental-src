package a;

import android.content.Context;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<c> f7a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f8b;

    public void a(@o0 c cVar) {
        if (this.f8b != null) {
            cVar.a(this.f8b);
        }
        this.f7a.add(cVar);
    }

    public void b() {
        this.f8b = null;
    }

    public void c(@o0 Context context) {
        this.f8b = context;
        Iterator<c> it = this.f7a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @q0
    public Context d() {
        return this.f8b;
    }

    public void e(@o0 c cVar) {
        this.f7a.remove(cVar);
    }
}
