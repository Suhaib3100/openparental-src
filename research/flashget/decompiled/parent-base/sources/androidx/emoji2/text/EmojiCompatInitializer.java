package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.os.p0;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.g;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1436l;
import androidx.view.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public class EmojiCompatInitializer implements androidx.startup.b<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f29262a = 500;

    /* renamed from: b, reason: collision with root package name */
    private static final String f29263b = "EmojiCompatInitializer";

    @x0(19)
    static class a extends g.d {
        protected a(Context context) {
            super(new b(context));
            f(1);
        }
    }

    @x0(19)
    static class b implements g.j {

        /* renamed from: a, reason: collision with root package name */
        private final Context f29266a;

        class a extends g.k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g.k f29267a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f29268b;

            a(g.k kVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f29267a = kVar;
                this.f29268b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.g.k
            public void a(@q0 Throwable th) {
                try {
                    this.f29267a.a(th);
                } finally {
                    this.f29268b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.g.k
            public void b(@o0 q qVar) {
                try {
                    this.f29267a.b(qVar);
                } finally {
                    this.f29268b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f29266a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.g.j
        public void a(@o0 final g.k kVar) {
            final ThreadPoolExecutor c5 = d.c("EmojiCompatInitializer");
            c5.execute(new Runnable() { // from class: androidx.emoji2.text.h
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(kVar, c5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @n1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(@o0 g.k kVar, @o0 ThreadPoolExecutor threadPoolExecutor) {
            try {
                m a5 = e.a(this.f29266a);
                if (a5 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a5.m(threadPoolExecutor);
                a5.f29428a.a(new a(kVar, threadPoolExecutor));
            } catch (Throwable th) {
                kVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p0.b("EmojiCompat.EmojiCompatInitializer.run");
                if (g.q()) {
                    g.c().t();
                }
                Trace.endSection();
            } catch (Throwable th) {
                p0.d();
                throw th;
            }
        }
    }

    @Override // androidx.startup.b
    @o0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(@o0 Context context) {
        g.p(new a(context));
        b(context);
        return Boolean.TRUE;
    }

    @x0(19)
    void b(@o0 Context context) {
        final AbstractC1450w lifecycle = ((InterfaceC1423e0) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new InterfaceC1436l() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.view.InterfaceC1436l
            public void l(@o0 InterfaceC1423e0 interfaceC1423e0) {
                EmojiCompatInitializer.this.c();
                lifecycle.d(this);
            }
        });
    }

    @x0(19)
    void c() {
        d.e().postDelayed(new c(), f29262a);
    }

    @Override // androidx.startup.b
    @o0
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
