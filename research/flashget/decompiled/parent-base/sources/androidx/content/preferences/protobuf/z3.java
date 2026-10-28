package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;

/* compiled from: Syntax.java */
/* loaded from: classes3.dex */
public enum z3 implements p1.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final p1.d<z3> internalValueMap = new a();
    private final int value;

    /* compiled from: Syntax.java */
    static class a implements p1.d<z3> {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.p1.d
        public z3 a(int i4) {
            return z3.forNumber(i4);
        }

        public z3 b(int i4) {
            return z3.forNumber(i4);
        }
    }

    /* compiled from: Syntax.java */
    private static final class b implements p1.e {

        /* renamed from: a, reason: collision with root package name */
        static final p1.e f29131a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public boolean a(int i4) {
            return z3.forNumber(i4) != null;
        }
    }

    z3(int i4) {
        this.value = i4;
    }

    public static z3 forNumber(int i4) {
        if (i4 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i4 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static p1.d<z3> internalGetValueMap() {
        return internalValueMap;
    }

    public static p1.e internalGetVerifier() {
        return b.f29131a;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static z3 valueOf(int i4) {
        return forNumber(i4);
    }
}
