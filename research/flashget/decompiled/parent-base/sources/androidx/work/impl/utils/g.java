package androidx.work.impl.utils;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.view.LiveData;
import androidx.view.m0;
import androidx.view.p0;

/* compiled from: LiveDataUtils.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class g {

    /* JADX INFO: Add missing generic type declarations: [In] */
    /* compiled from: LiveDataUtils.java */
    class a<In> implements p0<In> {

        /* renamed from: b, reason: collision with root package name */
        Out f36482b = null;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.taskexecutor.a f36483c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f36484d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i.a f36485e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m0 f36486f;

        /* compiled from: LiveDataUtils.java */
        /* renamed from: androidx.work.impl.utils.g$a$a, reason: collision with other inner class name */
        class RunnableC0646a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f36487b;

            RunnableC0646a(final Object val$input) {
                this.f36487b = val$input;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [Out, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.this.f36484d) {
                    try {
                        ?? apply = a.this.f36485e.apply(this.f36487b);
                        a aVar = a.this;
                        Out out = aVar.f36482b;
                        if (out == 0 && apply != 0) {
                            aVar.f36482b = apply;
                            aVar.f36486f.o(apply);
                        } else if (out != 0 && !out.equals(apply)) {
                            a aVar2 = a.this;
                            aVar2.f36482b = apply;
                            aVar2.f36486f.o(apply);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        a(final androidx.work.impl.utils.taskexecutor.a val$workTaskExecutor, final Object val$lock, final i.a val$mappingMethod, final m0 val$outputLiveData) {
            this.f36483c = val$workTaskExecutor;
            this.f36484d = val$lock;
            this.f36485e = val$mappingMethod;
            this.f36486f = val$outputLiveData;
        }

        @Override // androidx.view.p0
        public void onChanged(@q0 final In input) {
            this.f36483c.b(new RunnableC0646a(input));
        }
    }

    private g() {
    }

    public static <In, Out> LiveData<Out> a(@o0 LiveData<In> inputLiveData, @o0 final i.a<In, Out> mappingMethod, @o0 final androidx.work.impl.utils.taskexecutor.a workTaskExecutor) {
        Object obj = new Object();
        m0 m0Var = new m0();
        m0Var.s(inputLiveData, new a(workTaskExecutor, obj, mappingMethod, m0Var));
        return m0Var;
    }
}
