package androidx.work;

import androidx.annotation.o0;
import androidx.work.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes3.dex */
public final class u extends i0 {

    /* compiled from: OneTimeWorkRequest.java */
    public static final class a extends i0.a<a, u> {
        public a(@o0 Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            this.f35997c.f36349d = OverwritingInputMerger.class.getName();
        }

        @Override // androidx.work.i0.a
        @o0
        a d() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.i0.a
        @o0
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public u c() {
            if (this.f35995a && this.f35997c.f36355j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new u(this);
        }

        @o0
        a s() {
            return this;
        }

        @o0
        public a t(@o0 Class<? extends o> inputMerger) {
            this.f35997c.f36349d = inputMerger.getName();
            return this;
        }
    }

    u(a builder) {
        super(builder.f35996b, builder.f35997c, builder.f35998d);
    }

    @o0
    public static u e(@o0 Class<? extends ListenableWorker> workerClass) {
        return new a(workerClass).b();
    }

    @o0
    public static List<u> f(@o0 List<Class<? extends ListenableWorker>> workerClasses) {
        ArrayList arrayList = new ArrayList(workerClasses.size());
        Iterator<Class<? extends ListenableWorker>> it = workerClasses.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(it.next()).b());
        }
        return arrayList;
    }
}
