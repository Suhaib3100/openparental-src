package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* compiled from: TimeSpan.java */
/* loaded from: classes7.dex */
public interface n0<U> {

    /* compiled from: TimeSpan.java */
    public static final class a<U> implements Serializable {
        private static final long serialVersionUID = 1564804888291509484L;
        private final long amount;
        private final U unit;

        private a(long j4, U u4) {
            if (u4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("錥\u0001"));
            }
            if (j4 < 0) {
                throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("錤\u0001"), j4));
            }
            this.amount = j4;
            this.unit = u4;
        }

        public static <U> a<U> c(long j4, U u4) {
            return new a<>(j4, u4);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            if (this.unit == null || this.amount < 0) {
                throw new InvalidObjectException(ProtectedSandApp.s("錦\u0001"));
            }
        }

        public long a() {
            return this.amount;
        }

        public U b() {
            return this.unit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) a.class.cast(obj);
            return this.amount == aVar.amount && this.unit.equals(aVar.unit);
        }

        public int hashCode() {
            int hashCode = this.unit.hashCode() * 29;
            long j4 = this.amount;
            return hashCode + ((int) (j4 ^ (j4 >>> 32)));
        }

        public String toString() {
            return ProtectedSandApp.s("錧\u0001") + this.amount + '{' + this.unit + '}';
        }
    }

    <T extends m0<? super U, T>> T a(T t4);

    <T extends m0<? super U, T>> T b(T t4);

    boolean c();

    boolean contains(U u4);

    boolean d();

    long e(U u4);

    List<a<U>> f();

    boolean isEmpty();
}
