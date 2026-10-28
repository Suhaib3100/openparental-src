package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;

/* compiled from: NullValue.java */
/* loaded from: classes3.dex */
public enum y2 implements p1.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final p1.d<y2> internalValueMap = new a();
    private final int value;

    /* compiled from: NullValue.java */
    static class a implements p1.d<y2> {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.p1.d
        public y2 a(int i4) {
            return y2.forNumber(i4);
        }

        public y2 b(int i4) {
            return y2.forNumber(i4);
        }
    }

    /* compiled from: NullValue.java */
    private static final class b implements p1.e {

        /* renamed from: a, reason: collision with root package name */
        static final p1.e f29059a = new b();

        private b() {
        }

        @Override // androidx.datastore.preferences.protobuf.p1.e
        public boolean a(int i4) {
            return y2.forNumber(i4) != null;
        }
    }

    y2(int i4) {
        this.value = i4;
    }

    public static y2 forNumber(int i4) {
        if (i4 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static p1.d<y2> internalGetValueMap() {
        return internalValueMap;
    }

    public static p1.e internalGetVerifier() {
        return b.f29059a;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static y2 valueOf(int i4) {
        return forNumber(i4);
    }
}
