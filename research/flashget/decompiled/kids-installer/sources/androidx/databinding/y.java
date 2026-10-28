package androidx.databinding;

import java.util.List;

/* compiled from: ObservableList.java */
/* loaded from: classes.dex */
public interface y<T> extends List<T> {

    /* compiled from: ObservableList.java */
    public static abstract class a<T extends y> {
        public abstract void a(T sender);

        public abstract void f(T sender, int positionStart, int itemCount);

        public abstract void g(T sender, int positionStart, int itemCount);

        public abstract void h(T sender, int fromPosition, int toPosition, int itemCount);

        public abstract void i(T sender, int positionStart, int itemCount);
    }

    void J0(a<? extends y<T>> callback);

    void n(a<? extends y<T>> callback);
}
