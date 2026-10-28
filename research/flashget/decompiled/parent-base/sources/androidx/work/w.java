package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.view.LiveData;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: Operation.java */
/* loaded from: classes3.dex */
public interface w {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f36614a = new b.c();

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0650b f36615b = new b.C0650b();

    /* compiled from: Operation.java */
    public static abstract class b {

        /* compiled from: Operation.java */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f36616a;

            public a(@o0 Throwable exception) {
                this.f36616a = exception;
            }

            @o0
            public Throwable a() {
                return this.f36616a;
            }

            @o0
            public String toString() {
                return String.format("FAILURE (%s)", this.f36616a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.w$b$b, reason: collision with other inner class name */
        public static final class C0650b extends b {
            private C0650b() {
            }

            @o0
            public String toString() {
                return "IN_PROGRESS";
            }

            C0650b(a aVar) {
            }
        }

        /* compiled from: Operation.java */
        public static final class c extends b {
            private c() {
            }

            @o0
            public String toString() {
                return "SUCCESS";
            }
        }

        @c1({c1.a.LIBRARY_GROUP})
        b() {
        }
    }

    @o0
    ListenableFuture<b.c> a();

    @o0
    LiveData<b> getState();
}
