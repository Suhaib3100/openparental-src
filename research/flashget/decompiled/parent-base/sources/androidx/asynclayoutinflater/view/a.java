package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.j0;
import androidx.annotation.l1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.v;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: AsyncLayoutInflater.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2097e = "AsyncLayoutInflater";

    /* renamed from: a, reason: collision with root package name */
    LayoutInflater f2098a;

    /* renamed from: d, reason: collision with root package name */
    private Handler.Callback f2101d = new C0022a();

    /* renamed from: b, reason: collision with root package name */
    Handler f2099b = new Handler(this.f2101d);

    /* renamed from: c, reason: collision with root package name */
    d f2100c = d.b();

    /* compiled from: AsyncLayoutInflater.java */
    /* renamed from: androidx.asynclayoutinflater.view.a$a, reason: collision with other inner class name */
    class C0022a implements Handler.Callback {
        C0022a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.f2107d == null) {
                cVar.f2107d = a.this.f2098a.inflate(cVar.f2106c, cVar.f2105b, false);
            }
            cVar.f2108e.a(cVar.f2107d, cVar.f2106c, cVar.f2105b);
            a.this.f2100c.d(cVar);
            return true;
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    private static class b extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f2103a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            for (String str2 : f2103a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        a f2104a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f2105b;

        /* renamed from: c, reason: collision with root package name */
        int f2106c;

        /* renamed from: d, reason: collision with root package name */
        View f2107d;

        /* renamed from: e, reason: collision with root package name */
        e f2108e;

        c() {
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    private static class d extends Thread {

        /* renamed from: d, reason: collision with root package name */
        private static final d f2109d;

        /* renamed from: b, reason: collision with root package name */
        private ArrayBlockingQueue<c> f2110b = new ArrayBlockingQueue<>(10);

        /* renamed from: c, reason: collision with root package name */
        private v.c<c> f2111c = new v.c<>(10);

        static {
            d dVar = new d();
            f2109d = dVar;
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            return f2109d;
        }

        public void a(c cVar) {
            try {
                this.f2110b.put(cVar);
            } catch (InterruptedException e4) {
                throw new RuntimeException("Failed to enqueue async inflate request", e4);
            }
        }

        public c c() {
            c acquire = this.f2111c.acquire();
            return acquire == null ? new c() : acquire;
        }

        public void d(c cVar) {
            cVar.f2108e = null;
            cVar.f2104a = null;
            cVar.f2105b = null;
            cVar.f2106c = 0;
            cVar.f2107d = null;
            this.f2111c.release(cVar);
        }

        public void e() {
            try {
                c take = this.f2110b.take();
                try {
                    take.f2107d = take.f2104a.f2098a.inflate(take.f2106c, take.f2105b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(take.f2104a.f2099b, 0, take).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    /* compiled from: AsyncLayoutInflater.java */
    public interface e {
        void a(@o0 View view, @j0 int i4, @q0 ViewGroup viewGroup);
    }

    public a(@o0 Context context) {
        this.f2098a = new b(context);
    }

    @l1
    public void a(@j0 int i4, @q0 ViewGroup viewGroup, @o0 e eVar) {
        if (eVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        c c5 = this.f2100c.c();
        c5.f2104a = this;
        c5.f2106c = i4;
        c5.f2105b = viewGroup;
        c5.f2108e = eVar;
        this.f2100c.a(c5);
    }
}
