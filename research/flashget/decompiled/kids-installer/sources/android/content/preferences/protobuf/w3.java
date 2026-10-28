package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;

/* compiled from: Syntax.java */
/* loaded from: classes3.dex */
public enum w3 implements o1.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final o1.d<w3> internalValueMap = new o1.d<w3>() { // from class: androidx.datastore.preferences.protobuf.w3.a
        @Override // androidx.datastore.preferences.protobuf.o1.d
        public w3 a(int i5) {
            return w3.forNumber(i5);
        }

        public w3 b(int i5) {
            return w3.forNumber(i5);
        }
    };
    private final int value;

    /* compiled from: Syntax.java */
    private static final class b implements o1.e {

        /* renamed from: a, reason: collision with root package name */
        static final o1.e f7580a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.o1.e
        public boolean a(int i5) {
            return w3.forNumber(i5) != null;
        }
    }

    w3(int i5) {
        this.value = i5;
    }

    public static w3 forNumber(int i5) {
        if (i5 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i5 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static o1.d<w3> internalGetValueMap() {
        return internalValueMap;
    }

    public static o1.e internalGetVerifier() {
        return b.f7580a;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static w3 valueOf(int i5) {
        return forNumber(i5);
    }
}
