package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.k0;
import com.squareup.picasso.w;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PicassoExecutorService.java */
/* loaded from: classes6.dex */
class y extends ThreadPoolExecutor {

    /* renamed from: b, reason: collision with root package name */
    private static final int f71010b = 3;

    /* compiled from: PicassoExecutorService.java */
    private static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        private final c f71011b;

        a(c cVar) {
            super(cVar, null);
            this.f71011b = cVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            w.f r4 = this.f71011b.r();
            w.f r5 = aVar.f71011b.r();
            return r4 == r5 ? this.f71011b.f70788b - aVar.f71011b.f70788b : r5.ordinal() - r4.ordinal();
        }
    }

    y() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new k0.c());
    }

    private void b(int i4) {
        setCorePoolSize(i4);
        setMaximumPoolSize(i4);
    }

    void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                b(4);
                return;
            } else {
                b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        b(3);
                        break;
                    default:
                        b(3);
                        break;
                }
                return;
        }
        b(2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
