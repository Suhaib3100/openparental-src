package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;

/* compiled from: MemberScope.kt */
/* loaded from: classes5.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f25974a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f25975b;

        static {
            d.a aVar = d.f25977c;
            aVar.getClass();
            int i5 = d.f25985k;
            aVar.getClass();
            int i6 = d.f25983i;
            aVar.getClass();
            f25975b = (~(d.f25984j | i6)) & i5;
        }

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return f25975b;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final b f25976a = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
