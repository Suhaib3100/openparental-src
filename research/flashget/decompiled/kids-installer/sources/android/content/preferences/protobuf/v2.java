package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;

/* compiled from: NullValue.java */
/* loaded from: classes3.dex */
public enum v2 implements o1.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final o1.d<v2> internalValueMap = new o1.d<v2>() { // from class: androidx.datastore.preferences.protobuf.v2.a
        @Override // androidx.datastore.preferences.protobuf.o1.d
        public v2 a(int i5) {
            return v2.forNumber(i5);
        }

        public v2 b(int i5) {
            return v2.forNumber(i5);
        }
    };
    private final int value;

    /* compiled from: NullValue.java */
    private static final class b implements o1.e {

        /* renamed from: a, reason: collision with root package name */
        static final o1.e f7538a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.o1.e
        public boolean a(int i5) {
            return v2.forNumber(i5) != null;
        }
    }

    v2(int i5) {
        this.value = i5;
    }

    public static v2 forNumber(int i5) {
        if (i5 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static o1.d<v2> internalGetValueMap() {
        return internalValueMap;
    }

    public static o1.e internalGetVerifier() {
        return b.f7538a;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static v2 valueOf(int i5) {
        return forNumber(i5);
    }
}
